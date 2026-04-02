package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.ef0.w;
import com.amazon.aps.iva.j0.j0;
import com.google.common.base.Verify;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.net.cronet.okhttptransport.RequestBodyConverterImpl;
import com.google.net.cronet.okhttptransport.UploadBodyDataBroker;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RequestBodyConverterImpl implements RequestBodyConverter {
    private static final long IN_MEMORY_BODY_LENGTH_THRESHOLD_BYTES = 1048576;
    private final InMemoryRequestBodyConverter inMemoryRequestBodyConverter;
    private final StreamingRequestBodyConverter streamingRequestBodyConverter;

    /* renamed from: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult;

        static {
            int[] iArr = new int[UploadBodyDataBroker.ReadResult.values().length];
            $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult = iArr;
            try {
                iArr[UploadBodyDataBroker.ReadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[UploadBodyDataBroker.ReadResult.END_OF_BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class InMemoryRequestBodyConverter implements RequestBodyConverter {
        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public UploadDataProvider convertRequestBody(final RequestBody requestBody, int i) throws IOException {
            final long contentLength = requestBody.contentLength();
            if (contentLength >= 0 && contentLength <= RequestBodyConverterImpl.IN_MEMORY_BODY_LENGTH_THRESHOLD_BYTES) {
                return new UploadDataProvider() { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter.1
                    private volatile boolean isMaterialized = false;
                    private final e materializedBody = new e();

                    @Override // org.chromium.net.UploadDataProvider
                    public long getLength() {
                        return contentLength;
                    }

                    @Override // org.chromium.net.UploadDataProvider
                    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                        if (!this.isMaterialized) {
                            requestBody.writeTo(this.materializedBody);
                            this.materializedBody.getClass();
                            this.isMaterialized = true;
                            long length = getLength();
                            long j = this.materializedBody.c;
                            if (j != length) {
                                throw new IOException("Expected " + length + " bytes but got " + j);
                            }
                        }
                        if (this.materializedBody.read(byteBuffer) != -1) {
                            uploadDataSink.onReadSucceeded(false);
                            return;
                        }
                        throw new IllegalStateException("The source has been exhausted but we expected more!");
                    }

                    @Override // org.chromium.net.UploadDataProvider
                    public void rewind(UploadDataSink uploadDataSink) {
                        uploadDataSink.onRewindError(new UnsupportedOperationException());
                    }
                };
            }
            throw new IOException(j0.f("Expected definite length less than 1048576but got ", contentLength));
        }
    }

    /* loaded from: classes4.dex */
    public static final class StreamingRequestBodyConverter implements RequestBodyConverter {
        private final ExecutorService readerExecutor;

        /* loaded from: classes4.dex */
        public static class StreamingUploadDataProvider extends UploadDataProvider {
            private final UploadBodyDataBroker broker;
            private final RequestBody okHttpRequestBody;
            private final ListeningExecutorService readTaskExecutor;
            private ListenableFuture<?> readTaskFuture;
            private long totalBytesReadFromOkHttp;
            private final long writeTimeoutMillis;

            public /* synthetic */ StreamingUploadDataProvider(RequestBody requestBody, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j, AnonymousClass1 anonymousClass1) {
                this(requestBody, uploadBodyDataBroker, executorService, j);
            }

            private void ensureReadTaskStarted() {
                if (this.readTaskFuture == null) {
                    ListenableFuture<?> submit = this.readTaskExecutor.submit(new Callable() { // from class: com.google.net.cronet.okhttptransport.a
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Void lambda$ensureReadTaskStarted$0;
                            lambda$ensureReadTaskStarted$0 = RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider.this.lambda$ensureReadTaskStarted$0();
                            return lambda$ensureReadTaskStarted$0;
                        }
                    });
                    this.readTaskFuture = submit;
                    Futures.addCallback(submit, new FutureCallback<Object>() { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider.1
                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onFailure(Throwable th) {
                            StreamingUploadDataProvider.this.broker.setBackgroundReadError(th);
                        }

                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onSuccess(Object obj) {
                        }
                    }, MoreExecutors.directExecutor());
                }
            }

            private void handleLastBodyRead(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException, TimeoutException, ExecutionException {
                boolean z;
                int position = byteBuffer.position();
                byteBuffer.position(0);
                if (readFromOkHttp(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY)) {
                    if (byteBuffer.position() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Verify.verify(z, "END_OF_BODY reads shouldn't write anything to the buffer", new Object[0]);
                    byteBuffer.position(position);
                    uploadDataSink.onReadSucceeded(false);
                    return;
                }
                throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Void lambda$ensureReadTaskStarted$0() throws Exception {
                w a = r.a(this.broker);
                this.okHttpRequestBody.writeTo(a);
                a.flush();
                this.broker.handleEndOfStreamSignal();
                return null;
            }

            private static IOException prepareBodyTooLongException(long j, long j2) {
                return new IOException("Expected " + j + " bytes but got at least " + j2);
            }

            private UploadBodyDataBroker.ReadResult readFromOkHttp(ByteBuffer byteBuffer) throws TimeoutException, ExecutionException {
                int position = byteBuffer.position();
                UploadBodyDataBroker.ReadResult readResult = (UploadBodyDataBroker.ReadResult) Uninterruptibles.getUninterruptibly(this.broker.enqueueBodyRead(byteBuffer), this.writeTimeoutMillis, TimeUnit.MILLISECONDS);
                this.totalBytesReadFromOkHttp += byteBuffer.position() - position;
                return readResult;
            }

            private void readKnownBodyLength(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                try {
                    UploadBodyDataBroker.ReadResult readFromOkHttp = readFromOkHttp(byteBuffer);
                    if (this.totalBytesReadFromOkHttp <= getLength()) {
                        if (this.totalBytesReadFromOkHttp < getLength()) {
                            int i = AnonymousClass1.$SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[readFromOkHttp.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    throw new IOException("The source has been exhausted but we expected more data!");
                                }
                                return;
                            }
                            uploadDataSink.onReadSucceeded(false);
                            return;
                        }
                        handleLastBodyRead(uploadDataSink, byteBuffer);
                        return;
                    }
                    throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
                } catch (ExecutionException | TimeoutException e) {
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            private void readUnknownBodyLength(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
                try {
                    uploadDataSink.onReadSucceeded(readFromOkHttp(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY));
                } catch (ExecutionException | TimeoutException e) {
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() throws IOException {
                return this.okHttpRequestBody.contentLength();
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                ensureReadTaskStarted();
                if (getLength() == -1) {
                    readUnknownBodyLength(uploadDataSink, byteBuffer);
                } else {
                    readKnownBodyLength(uploadDataSink, byteBuffer);
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
            }

            private StreamingUploadDataProvider(RequestBody requestBody, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j) {
                this.okHttpRequestBody = requestBody;
                this.broker = uploadBodyDataBroker;
                if (executorService instanceof ListeningExecutorService) {
                    this.readTaskExecutor = (ListeningExecutorService) executorService;
                } else {
                    this.readTaskExecutor = MoreExecutors.listeningDecorator(executorService);
                }
                this.writeTimeoutMillis = j == 0 ? 2147483647L : j;
            }
        }

        public StreamingRequestBodyConverter(ExecutorService executorService) {
            this.readerExecutor = executorService;
        }

        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public UploadDataProvider convertRequestBody(RequestBody requestBody, int i) {
            return new StreamingUploadDataProvider(requestBody, new UploadBodyDataBroker(), this.readerExecutor, i, null);
        }
    }

    public RequestBodyConverterImpl(InMemoryRequestBodyConverter inMemoryRequestBodyConverter, StreamingRequestBodyConverter streamingRequestBodyConverter) {
        this.inMemoryRequestBodyConverter = inMemoryRequestBodyConverter;
        this.streamingRequestBodyConverter = streamingRequestBodyConverter;
    }

    public static RequestBodyConverterImpl create(ExecutorService executorService) {
        return new RequestBodyConverterImpl(new InMemoryRequestBodyConverter(), new StreamingRequestBodyConverter(executorService));
    }

    @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
    public UploadDataProvider convertRequestBody(RequestBody requestBody, int i) throws IOException {
        long contentLength = requestBody.contentLength();
        if (contentLength != -1 && contentLength <= IN_MEMORY_BODY_LENGTH_THRESHOLD_BYTES) {
            return this.inMemoryRequestBodyConverter.convertRequestBody(requestBody, i);
        }
        return this.streamingRequestBodyConverter.convertRequestBody(requestBody, i);
    }
}
