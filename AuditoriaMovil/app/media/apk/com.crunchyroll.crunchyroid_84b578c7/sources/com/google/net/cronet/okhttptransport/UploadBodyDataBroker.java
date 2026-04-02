package com.google.net.cronet.okhttptransport;

import android.util.Pair;
import com.amazon.aps.iva.ef0.b0;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.e0;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UploadBodyDataBroker implements b0 {
    private final BlockingQueue<Pair<ByteBuffer, SettableFuture<ReadResult>>> pendingRead = new ArrayBlockingQueue(1);
    private final AtomicBoolean isClosed = new AtomicBoolean();
    private final AtomicReference<Throwable> backgroundReadThrowable = new AtomicReference<>();

    /* loaded from: classes4.dex */
    public enum ReadResult {
        SUCCESS,
        END_OF_BODY
    }

    private Pair<ByteBuffer, SettableFuture<ReadResult>> getPendingCronetRead() throws IOException {
        try {
            return this.pendingRead.take();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
    }

    public Future<ReadResult> enqueueBodyRead(ByteBuffer byteBuffer) {
        Throwable th = this.backgroundReadThrowable.get();
        if (th != null) {
            return Futures.immediateFailedFuture(th);
        }
        SettableFuture create = SettableFuture.create();
        this.pendingRead.add(Pair.create(byteBuffer, create));
        Throwable th2 = this.backgroundReadThrowable.get();
        if (th2 != null) {
            create.setException(th2);
        }
        return create;
    }

    public void handleEndOfStreamSignal() throws IOException {
        if (!this.isClosed.getAndSet(true)) {
            ((SettableFuture) getPendingCronetRead().second).set(ReadResult.END_OF_BODY);
            return;
        }
        throw new IllegalStateException("Already closed");
    }

    public void setBackgroundReadError(Throwable th) {
        this.backgroundReadThrowable.set(th);
        Pair<ByteBuffer, SettableFuture<ReadResult>> poll = this.pendingRead.poll();
        if (poll != null) {
            ((SettableFuture) poll.second).setException(th);
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public e0 timeout() {
        return e0.NONE;
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public void write(e eVar, long j) throws IOException {
        Preconditions.checkState(!this.isClosed.get());
        while (j != 0) {
            Pair<ByteBuffer, SettableFuture<ReadResult>> pendingCronetRead = getPendingCronetRead();
            ByteBuffer byteBuffer = (ByteBuffer) pendingCronetRead.first;
            SettableFuture settableFuture = (SettableFuture) pendingCronetRead.second;
            int limit = byteBuffer.limit();
            byteBuffer.limit((int) Math.min(limit, j));
            try {
                long read = eVar.read(byteBuffer);
                if (read != -1) {
                    j -= read;
                    byteBuffer.limit(limit);
                    settableFuture.set(ReadResult.SUCCESS);
                } else {
                    IOException iOException = new IOException("The source has been exhausted but we expected more!");
                    settableFuture.setException(iOException);
                    throw iOException;
                }
            } catch (IOException e) {
                settableFuture.setException(e);
                throw e;
            }
        }
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public void flush() {
    }
}
