package com.segment.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import com.amazon.aps.iva.c80.a;
import com.segment.analytics.Client;
import com.segment.analytics.PayloadQueue;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.Utils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Hex;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SegmentIntegration extends Integration<Void> {
    static final int MAX_BATCH_SIZE = 475000;
    static final int MAX_PAYLOAD_SIZE = 32000;
    static final int MAX_QUEUE_SIZE = 1000;
    static final String SEGMENT_KEY = "Segment.io";
    private static final String SEGMENT_THREAD_NAME = "Segment-SegmentDispatcher";
    private final String apiHost;
    private final Map<String, Boolean> bundledIntegrations;
    private final Cartographer cartographer;
    private final Client client;
    private final Context context;
    private final Crypto crypto;
    final Object flushLock = new Object();
    private final int flushQueueSize;
    private final ScheduledExecutorService flushScheduler;
    private final Handler handler;
    private final Logger logger;
    private final ExecutorService networkExecutor;
    private final PayloadQueue payloadQueue;
    private final HandlerThread segmentThread;
    private final Stats stats;
    static final Integration.Factory FACTORY = new Integration.Factory() { // from class: com.segment.analytics.SegmentIntegration.1
        @Override // com.segment.analytics.integrations.Integration.Factory
        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            return SegmentIntegration.create(analytics.getApplication(), analytics.client, analytics.cartographer, analytics.networkExecutor, analytics.stats, Collections.unmodifiableMap(analytics.bundledIntegrations), analytics.tag, analytics.flushIntervalInMillis, analytics.flushQueueSize, analytics.getLogger(), analytics.crypto, valueMap);
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public String key() {
            return SegmentIntegration.SEGMENT_KEY;
        }
    };
    static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    /* loaded from: classes4.dex */
    public static class BatchPayloadWriter implements Closeable {
        private final BufferedWriter bufferedWriter;
        private final JsonWriter jsonWriter;
        private boolean needsComma = false;

        public BatchPayloadWriter(OutputStream outputStream) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            this.bufferedWriter = bufferedWriter;
            this.jsonWriter = new JsonWriter(bufferedWriter);
        }

        public BatchPayloadWriter beginBatchArray() throws IOException {
            this.jsonWriter.name("batch").beginArray();
            this.needsComma = false;
            return this;
        }

        public BatchPayloadWriter beginObject() throws IOException {
            this.jsonWriter.beginObject();
            return this;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.jsonWriter.close();
        }

        public BatchPayloadWriter emitPayloadObject(String str) throws IOException {
            if (this.needsComma) {
                this.bufferedWriter.write(44);
            } else {
                this.needsComma = true;
            }
            this.bufferedWriter.write(str);
            return this;
        }

        public BatchPayloadWriter endBatchArray() throws IOException {
            if (this.needsComma) {
                this.jsonWriter.endArray();
                return this;
            }
            throw new IOException("At least one payload must be provided.");
        }

        public BatchPayloadWriter endObject(String str) throws IOException {
            this.jsonWriter.name("sentAt").value(Utils.toISO8601Date(new Date())).name("writeKey").value(str).endObject();
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static class PayloadWriter implements PayloadQueue.ElementVisitor {
        final Crypto crypto;
        int payloadCount;
        int size;
        final BatchPayloadWriter writer;

        public PayloadWriter(BatchPayloadWriter batchPayloadWriter, Crypto crypto) {
            this.writer = batchPayloadWriter;
            this.crypto = crypto;
        }

        @Override // com.segment.analytics.PayloadQueue.ElementVisitor
        public boolean read(InputStream inputStream, int i) throws IOException {
            InputStream decrypt = this.crypto.decrypt(inputStream);
            int i2 = this.size + i;
            if (i2 > SegmentIntegration.MAX_BATCH_SIZE) {
                return false;
            }
            this.size = i2;
            byte[] bArr = new byte[i];
            decrypt.read(bArr, 0, i);
            this.writer.emitPayloadObject(new String(bArr, SegmentIntegration.UTF_8).trim());
            this.payloadCount++;
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static class SegmentDispatcherHandler extends Handler {
        static final int REQUEST_ENQUEUE = 0;
        static final int REQUEST_FLUSH = 1;
        private final SegmentIntegration segmentIntegration;

        public SegmentDispatcherHandler(Looper looper, SegmentIntegration segmentIntegration) {
            super(looper);
            this.segmentIntegration = segmentIntegration;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    this.segmentIntegration.submitFlush();
                    return;
                }
                throw new AssertionError("Unknown dispatcher message: " + message.what);
            }
            this.segmentIntegration.performEnqueue((BasePayload) message.obj);
        }
    }

    public SegmentIntegration(Context context, Client client, Cartographer cartographer, ExecutorService executorService, PayloadQueue payloadQueue, Stats stats, Map<String, Boolean> map, long j, int i, Logger logger, Crypto crypto, String str) {
        long j2;
        this.context = context;
        this.client = client;
        this.networkExecutor = executorService;
        this.payloadQueue = payloadQueue;
        this.stats = stats;
        this.logger = logger;
        this.bundledIntegrations = map;
        this.cartographer = cartographer;
        this.flushQueueSize = i;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new Utils.AnalyticsThreadFactory());
        this.flushScheduler = newScheduledThreadPool;
        this.crypto = crypto;
        this.apiHost = str;
        HandlerThread handlerThread = new HandlerThread(SEGMENT_THREAD_NAME, 10);
        this.segmentThread = handlerThread;
        handlerThread.start();
        this.handler = new SegmentDispatcherHandler(handlerThread.getLooper(), this);
        if (payloadQueue.size() >= i) {
            j2 = 0;
        } else {
            j2 = j;
        }
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.segment.analytics.SegmentIntegration.2
            @Override // java.lang.Runnable
            public void run() {
                SegmentIntegration.this.flush();
            }
        }, j2, j, TimeUnit.MILLISECONDS);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x001f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static synchronized com.segment.analytics.SegmentIntegration create(android.content.Context r17, com.segment.analytics.Client r18, com.segment.analytics.Cartographer r19, java.util.concurrent.ExecutorService r20, com.segment.analytics.Stats r21, java.util.Map<java.lang.String, java.lang.Boolean> r22, java.lang.String r23, long r24, int r26, com.segment.analytics.integrations.Logger r27, com.segment.analytics.Crypto r28, com.segment.analytics.ValueMap r29) {
        /*
            java.lang.Class<com.segment.analytics.SegmentIntegration> r1 = com.segment.analytics.SegmentIntegration.class
            monitor-enter(r1)
            r2 = 0
            java.lang.String r0 = "segment-disk-queue"
            r4 = r17
            java.io.File r0 = r4.getDir(r0, r2)     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L1d
            r3 = r23
            com.segment.analytics.QueueFile r0 = createQueueFile(r0, r3)     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L1d
            com.segment.analytics.PayloadQueue$PersistentQueue r3 = new com.segment.analytics.PayloadQueue$PersistentQueue     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L1d
            r3.<init>(r0)     // Catch: java.io.IOException -> L1b java.lang.Throwable -> L1d
            r14 = r27
            r8 = r3
            goto L31
        L1b:
            r0 = move-exception
            goto L22
        L1d:
            r0 = move-exception
            goto L55
        L1f:
            r0 = move-exception
            r4 = r17
        L22:
            java.lang.String r3 = "Could not create disk queue. Falling back to memory queue."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
            r14 = r27
            r14.error(r0, r3, r2)     // Catch: java.lang.Throwable -> L1d
            com.segment.analytics.PayloadQueue$MemoryQueue r0 = new com.segment.analytics.PayloadQueue$MemoryQueue     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r8 = r0
        L31:
            java.lang.String r0 = "apiHost"
            r2 = r29
            java.lang.String r16 = r2.getString(r0)     // Catch: java.lang.Throwable -> L1d
            com.segment.analytics.SegmentIntegration r0 = new com.segment.analytics.SegmentIntegration     // Catch: java.lang.Throwable -> L1d
            r3 = r0
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r21
            r10 = r22
            r11 = r24
            r13 = r26
            r14 = r27
            r15 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return r0
        L55:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.SegmentIntegration.create(android.content.Context, com.segment.analytics.Client, com.segment.analytics.Cartographer, java.util.concurrent.ExecutorService, com.segment.analytics.Stats, java.util.Map, java.lang.String, long, int, com.segment.analytics.integrations.Logger, com.segment.analytics.Crypto, com.segment.analytics.ValueMap):com.segment.analytics.SegmentIntegration");
    }

    public static QueueFile createQueueFile(File file, String str) throws IOException {
        Utils.createDirectory(file);
        File file2 = new File(file, str);
        try {
            return new QueueFile(file2);
        } catch (IOException unused) {
            if (file2.delete()) {
                return new QueueFile(file2);
            }
            throw new IOException("Could not create queue file (" + str + ") in " + file + ".");
        }
    }

    private void dispatchEnqueue(BasePayload basePayload) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(0, basePayload));
    }

    private boolean shouldFlush() {
        if (this.payloadQueue.size() > 0 && Utils.isConnected(this.context)) {
            return true;
        }
        return false;
    }

    @Override // com.segment.analytics.integrations.Integration
    public void alias(AliasPayload aliasPayload) {
        dispatchEnqueue(aliasPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void flush() {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1));
    }

    @Override // com.segment.analytics.integrations.Integration
    public void group(GroupPayload groupPayload) {
        dispatchEnqueue(groupPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void identify(IdentifyPayload identifyPayload) {
        dispatchEnqueue(identifyPayload);
    }

    public void performEnqueue(BasePayload basePayload) {
        ValueMap integrations = basePayload.integrations();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.bundledIntegrations.size() + integrations.size());
        linkedHashMap.putAll(integrations);
        linkedHashMap.putAll(this.bundledIntegrations);
        linkedHashMap.remove(SEGMENT_KEY);
        ValueMap valueMap = new ValueMap();
        valueMap.putAll(basePayload);
        valueMap.put("integrations", (Object) linkedHashMap);
        if (this.payloadQueue.size() >= MAX_QUEUE_SIZE) {
            synchronized (this.flushLock) {
                if (this.payloadQueue.size() >= MAX_QUEUE_SIZE) {
                    this.logger.info("Queue is at max capacity (%s), removing oldest payload.", Integer.valueOf(this.payloadQueue.size()));
                    try {
                        this.payloadQueue.remove(1);
                    } catch (IOException e) {
                        this.logger.error(e, "Unable to remove oldest payload from queue.", new Object[0]);
                        return;
                    }
                }
            }
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.cartographer.toJson(valueMap, new OutputStreamWriter(this.crypto.encrypt(byteArrayOutputStream)));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray != null && byteArray.length != 0 && byteArray.length <= MAX_PAYLOAD_SIZE) {
                this.payloadQueue.add(byteArray);
                this.logger.verbose("Enqueued %s payload. %s elements in the queue.", basePayload, Integer.valueOf(this.payloadQueue.size()));
                if (this.payloadQueue.size() >= this.flushQueueSize) {
                    submitFlush();
                    return;
                }
                return;
            }
            throw new IOException("Could not serialize payload " + valueMap);
        } catch (IOException e2) {
            this.logger.error(e2, "Could not add payload %s to queue: %s.", valueMap, this.payloadQueue);
        }
    }

    public void performFlush() {
        Client.HTTPException e;
        int i;
        if (!shouldFlush()) {
            return;
        }
        this.logger.verbose("Uploading payloads in queue to Segment.", new Object[0]);
        Client.Connection connection = null;
        try {
            try {
                try {
                    connection = this.client.upload(this.apiHost);
                    BatchPayloadWriter beginBatchArray = new BatchPayloadWriter(connection.os).beginObject().beginBatchArray();
                    PayloadWriter payloadWriter = new PayloadWriter(beginBatchArray, this.crypto);
                    this.payloadQueue.forEach(payloadWriter);
                    beginBatchArray.endBatchArray().endObject(this.client.writeKey).close();
                    i = payloadWriter.payloadCount;
                    try {
                        connection.close();
                        Utils.closeQuietly(connection);
                        try {
                            this.payloadQueue.remove(i);
                            this.logger.verbose("Uploaded %s payloads. %s remain in the queue.", Integer.valueOf(i), Integer.valueOf(this.payloadQueue.size()));
                            this.stats.dispatchFlush(i);
                            if (this.payloadQueue.size() > 0) {
                                performFlush();
                            }
                        } catch (IOException e2) {
                            this.logger.error(e2, a.d("Unable to remove ", i, " payload(s) from queue."), new Object[0]);
                        }
                    } catch (Client.HTTPException e3) {
                        e = e3;
                        if (e.is4xx() && e.responseCode != 429) {
                            this.logger.error(e, "Payloads were rejected by server. Marked for removal.", new Object[0]);
                            try {
                                this.payloadQueue.remove(i);
                            } catch (IOException unused) {
                                this.logger.error(e, "Unable to remove " + i + " payload(s) from queue.", new Object[0]);
                            }
                            Utils.closeQuietly(connection);
                            return;
                        }
                        this.logger.error(e, "Error while uploading payloads", new Object[0]);
                        Utils.closeQuietly(connection);
                    }
                } catch (Throwable th) {
                    Utils.closeQuietly(connection);
                    throw th;
                }
            } catch (IOException e4) {
                this.logger.error(e4, "Error while uploading payloads", new Object[0]);
                Utils.closeQuietly(connection);
            }
        } catch (Client.HTTPException e5) {
            e = e5;
            i = 0;
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public void screen(ScreenPayload screenPayload) {
        dispatchEnqueue(screenPayload);
    }

    public void shutdown() {
        this.flushScheduler.shutdownNow();
        this.segmentThread.quit();
        Utils.closeQuietly(this.payloadQueue);
    }

    public void submitFlush() {
        if (!shouldFlush()) {
            return;
        }
        if (this.networkExecutor.isShutdown()) {
            this.logger.info("A call to flush() was made after shutdown() has been called.  In-flight events may not be uploaded right away.", new Object[0]);
        } else {
            this.networkExecutor.submit(new Runnable() { // from class: com.segment.analytics.SegmentIntegration.3
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (SegmentIntegration.this.flushLock) {
                        SegmentIntegration.this.performFlush();
                    }
                }
            });
        }
    }

    @Override // com.segment.analytics.integrations.Integration
    public void track(TrackPayload trackPayload) {
        dispatchEnqueue(trackPayload);
    }
}
