package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.ef0.d0;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.e0;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class OkHttpBridgeRequestCallback extends UrlRequest.Callback {
    private static final int CRONET_BYTE_BUFFER_CAPACITY = 32768;
    private final long readTimeoutMillis;
    private final RedirectStrategy redirectStrategy;
    private volatile UrlRequest request;
    private final SettableFuture<d0> bodySourceFuture = SettableFuture.create();
    private final AtomicBoolean finished = new AtomicBoolean(false);
    private final AtomicBoolean canceled = new AtomicBoolean(false);
    private final BlockingQueue<CallbackResult> callbackResults = new ArrayBlockingQueue(2);
    private final SettableFuture<UrlResponseInfo> headersFuture = SettableFuture.create();

    /* renamed from: com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep;

        static {
            int[] iArr = new int[CallbackStep.values().length];
            $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep = iArr;
            try {
                iArr[CallbackStep.ON_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_READ_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class CallbackResult {
        private final ByteBuffer buffer;
        private final CallbackStep callbackStep;
        private final CronetException exception;

        public /* synthetic */ CallbackResult(CallbackStep callbackStep, ByteBuffer byteBuffer, CronetException cronetException, AnonymousClass1 anonymousClass1) {
            this(callbackStep, byteBuffer, cronetException);
        }

        private CallbackResult(CallbackStep callbackStep, ByteBuffer byteBuffer, CronetException cronetException) {
            this.callbackStep = callbackStep;
            this.buffer = byteBuffer;
            this.exception = cronetException;
        }
    }

    /* loaded from: classes4.dex */
    public enum CallbackStep {
        ON_READ_COMPLETED,
        ON_SUCCESS,
        ON_FAILED,
        ON_CANCELED
    }

    public OkHttpBridgeRequestCallback(long j, RedirectStrategy redirectStrategy) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        Preconditions.checkArgument(i >= 0);
        if (i == 0) {
            this.readTimeoutMillis = 2147483647L;
        } else {
            this.readTimeoutMillis = j;
        }
        this.redirectStrategy = redirectStrategy;
    }

    public ListenableFuture<d0> getBodySource() {
        return this.bodySourceFuture;
    }

    public ListenableFuture<UrlResponseInfo> getUrlResponseInfo() {
        return this.headersFuture;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.canceled.set(true);
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_CANCELED, null, null, null));
        IOException iOException = new IOException("The request was canceled!");
        this.headersFuture.setException(iOException);
        this.bodySourceFuture.setException(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.headersFuture.setException(cronetException) && this.bodySourceFuture.setException(cronetException)) {
            return;
        }
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_FAILED, null, cronetException, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_READ_COMPLETED, byteBuffer, null, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (!this.redirectStrategy.followRedirects()) {
            Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
            Preconditions.checkState(this.bodySourceFuture.set(new e()));
            urlRequest.cancel();
        } else if (urlResponseInfo.getUrlChain().size() <= this.redirectStrategy.numberOfRedirectsToFollow()) {
            urlRequest.followRedirect();
        } else {
            urlRequest.cancel();
            ProtocolException protocolException = new ProtocolException("Too many follow-up requests: " + (this.redirectStrategy.numberOfRedirectsToFollow() + 1));
            this.headersFuture.setException(protocolException);
            this.bodySourceFuture.setException(protocolException);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.request = urlRequest;
        Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
        Preconditions.checkState(this.bodySourceFuture.set(new CronetBodySource(this, null)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_SUCCESS, null, null, null));
    }

    /* loaded from: classes4.dex */
    public class CronetBodySource implements d0 {
        private ByteBuffer buffer;
        private volatile boolean closed;

        private CronetBodySource() {
            this.buffer = ByteBuffer.allocateDirect(OkHttpBridgeRequestCallback.CRONET_BYTE_BUFFER_CAPACITY);
            this.closed = false;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (!OkHttpBridgeRequestCallback.this.finished.get()) {
                OkHttpBridgeRequestCallback.this.request.cancel();
            }
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public long read(e eVar, long j) throws IOException {
            boolean z;
            CallbackResult callbackResult;
            if (!OkHttpBridgeRequestCallback.this.canceled.get()) {
                boolean z2 = false;
                if (eVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "sink == null");
                if (j >= 0) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "byteCount < 0: %s", j);
                Preconditions.checkState(!this.closed, "closed");
                if (OkHttpBridgeRequestCallback.this.finished.get()) {
                    return -1L;
                }
                if (j < this.buffer.limit()) {
                    this.buffer.limit((int) j);
                }
                OkHttpBridgeRequestCallback.this.request.read(this.buffer);
                try {
                    callbackResult = (CallbackResult) OkHttpBridgeRequestCallback.this.callbackResults.poll(OkHttpBridgeRequestCallback.this.readTimeoutMillis, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    callbackResult = null;
                }
                if (callbackResult != null) {
                    int i = AnonymousClass1.$SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[callbackResult.callbackStep.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    callbackResult.buffer.flip();
                                    int write = eVar.write(callbackResult.buffer);
                                    callbackResult.buffer.clear();
                                    return write;
                                }
                                throw new AssertionError("The switch block above is exhaustive!");
                            }
                            this.buffer = null;
                            throw new IOException("The request was canceled!");
                        }
                        OkHttpBridgeRequestCallback.this.finished.set(true);
                        this.buffer = null;
                        return -1L;
                    }
                    OkHttpBridgeRequestCallback.this.finished.set(true);
                    this.buffer = null;
                    throw new IOException(callbackResult.exception);
                }
                OkHttpBridgeRequestCallback.this.request.cancel();
                throw new CronetTimeoutException();
            }
            throw new IOException("The request was canceled!");
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public e0 timeout() {
            return e0.NONE;
        }

        public /* synthetic */ CronetBodySource(OkHttpBridgeRequestCallback okHttpBridgeRequestCallback, AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
