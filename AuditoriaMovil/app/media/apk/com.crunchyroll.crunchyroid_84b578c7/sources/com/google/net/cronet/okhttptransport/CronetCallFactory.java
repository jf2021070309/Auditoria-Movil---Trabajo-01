package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.ef0.c;
import com.amazon.aps.iva.ef0.e0;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.net.cronet.okhttptransport.RequestResponseConverter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import org.chromium.net.CronetEngine;
/* loaded from: classes4.dex */
public final class CronetCallFactory implements Call.Factory {
    private static final String TAG = "CronetCallFactory";
    private final int callTimeoutMillis;
    private final RequestResponseConverter converter;
    private final int readTimeoutMillis;
    private final ExecutorService responseCallbackExecutor;
    private final int writeTimeoutMillis;

    /* loaded from: classes4.dex */
    public static final class Builder extends RequestResponseConverterBasedBuilder<Builder, CronetCallFactory> {
        private static final int DEFAULT_READ_WRITE_TIMEOUT_MILLIS = 10000;
        private int callTimeoutMillis;
        private ExecutorService callbackExecutorService;
        private int readTimeoutMillis;
        private int writeTimeoutMillis;

        public Builder(CronetEngine cronetEngine) {
            super(cronetEngine, Builder.class);
            this.readTimeoutMillis = DEFAULT_READ_WRITE_TIMEOUT_MILLIS;
            this.writeTimeoutMillis = DEFAULT_READ_WRITE_TIMEOUT_MILLIS;
            this.callTimeoutMillis = 0;
            this.callbackExecutorService = null;
        }

        public Builder setCallTimeoutMillis(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Call timeout mustn't be negative!");
            this.callTimeoutMillis = i;
            return this;
        }

        public Builder setCallbackExecutorService(ExecutorService executorService) {
            Preconditions.checkNotNull(executorService);
            this.callbackExecutorService = executorService;
            return this;
        }

        public Builder setReadTimeoutMillis(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Read timeout mustn't be negative!");
            this.readTimeoutMillis = i;
            return this;
        }

        public Builder setWriteTimeoutMillis(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Write timeout mustn't be negative!");
            this.writeTimeoutMillis = i;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public CronetCallFactory build(RequestResponseConverter requestResponseConverter) {
            ExecutorService executorService = this.callbackExecutorService;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool();
            }
            return new CronetCallFactory(requestResponseConverter, executorService, this.readTimeoutMillis, this.writeTimeoutMillis, this.callTimeoutMillis);
        }
    }

    /* loaded from: classes4.dex */
    public static class CronetCall implements Call {
        private final AtomicBoolean canceled;
        private final AtomicReference<RequestResponseConverter.CronetRequestAndOkHttpResponse> convertedRequestAndResponse;
        private final RequestResponseConverter converter;
        private final AtomicBoolean executed;
        private final CronetCallFactory motherFactory;
        private final Request okHttpRequest;
        private final ExecutorService responseCallbackExecutor;
        private final c timeout;

        private void evaluateExecutionPreconditions() throws IOException {
            if (!this.canceled.get()) {
                Preconditions.checkState(!this.executed.getAndSet(true), "Already Executed");
                return;
            }
            throw new IOException("Can't execute canceled requests");
        }

        private void startRequestIfNotCanceled() {
            boolean z;
            RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse = this.convertedRequestAndResponse.get();
            if (cronetRequestAndOkHttpResponse != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "convertedRequestAndResponse must be set!");
            if (this.canceled.get()) {
                cronetRequestAndOkHttpResponse.getRequest().cancel();
            } else {
                cronetRequestAndOkHttpResponse.getRequest().start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String toLoggableString() {
            return "call to " + request().url().redact();
        }

        @Override // okhttp3.Call
        public void cancel() {
            RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse;
            if (!this.canceled.getAndSet(true) && (cronetRequestAndOkHttpResponse = this.convertedRequestAndResponse.get()) != null) {
                cronetRequestAndOkHttpResponse.getRequest().cancel();
            }
        }

        @Override // okhttp3.Call
        public void enqueue(final Callback callback) {
            try {
                this.timeout.enter();
                evaluateExecutionPreconditions();
                RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(request(), this.motherFactory.readTimeoutMillis, this.motherFactory.writeTimeoutMillis);
                this.convertedRequestAndResponse.set(convert);
                Futures.addCallback(convert.getResponseAsync(), new FutureCallback<Response>() { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.2
                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onFailure(Throwable th) {
                        if (th instanceof IOException) {
                            callback.onFailure(this, (IOException) th);
                        } else {
                            callback.onFailure(this, new IOException(th));
                        }
                    }

                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onSuccess(Response response) {
                        try {
                            Callback callback2 = callback;
                            CronetCall cronetCall = this;
                            callback2.onResponse(cronetCall, CronetCallFactory.toCronetCallFactoryResponse(cronetCall, response));
                        } catch (IOException unused) {
                            CronetCall.this.toLoggableString();
                        }
                    }
                }, this.responseCallbackExecutor);
                startRequestIfNotCanceled();
            } catch (IOException e) {
                this.timeout.exit();
                callback.onFailure(this, e);
            }
        }

        @Override // okhttp3.Call
        public Response execute() throws IOException {
            evaluateExecutionPreconditions();
            try {
                this.timeout.enter();
                RequestResponseConverter.CronetRequestAndOkHttpResponse convert = this.converter.convert(request(), this.motherFactory.readTimeoutMillis, this.motherFactory.writeTimeoutMillis);
                this.convertedRequestAndResponse.set(convert);
                startRequestIfNotCanceled();
                return CronetCallFactory.toCronetCallFactoryResponse(this, convert.getResponse());
            } catch (IOException | RuntimeException e) {
                this.timeout.exit();
                throw e;
            }
        }

        @Override // okhttp3.Call
        public boolean isCanceled() {
            return this.canceled.get();
        }

        @Override // okhttp3.Call
        public boolean isExecuted() {
            return this.executed.get();
        }

        @Override // okhttp3.Call
        public Request request() {
            return this.okHttpRequest;
        }

        @Override // okhttp3.Call
        public e0 timeout() {
            return this.timeout;
        }

        private CronetCall(Request request, CronetCallFactory cronetCallFactory, RequestResponseConverter requestResponseConverter, ExecutorService executorService) {
            this.executed = new AtomicBoolean();
            this.canceled = new AtomicBoolean();
            this.convertedRequestAndResponse = new AtomicReference<>();
            this.okHttpRequest = request;
            this.motherFactory = cronetCallFactory;
            this.converter = requestResponseConverter;
            this.responseCallbackExecutor = executorService;
            c cVar = new c() { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.1
                @Override // com.amazon.aps.iva.ef0.c
                public void timedOut() {
                    CronetCall.this.cancel();
                }
            };
            this.timeout = cVar;
            cVar.timeout(cronetCallFactory.callTimeoutMillis, TimeUnit.MILLISECONDS);
        }

        @Override // okhttp3.Call
        public Call clone() {
            return this.motherFactory.newCall(request());
        }
    }

    public static Builder newBuilder(CronetEngine cronetEngine) {
        return new Builder(cronetEngine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Response toCronetCallFactoryResponse(final CronetCall cronetCall, Response response) {
        Preconditions.checkNotNull(response.body());
        return response.newBuilder().body(new CronetTransportResponseBody(response.body()) { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.1
            @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
            public void customCloseHook() {
                cronetCall.timeout.exit();
            }
        }).build();
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        return new CronetCall(request, this, this.converter, this.responseCallbackExecutor);
    }

    private CronetCallFactory(RequestResponseConverter requestResponseConverter, ExecutorService executorService, int i, int i2, int i3) {
        Preconditions.checkArgument(i >= 0, "Read timeout mustn't be negative!");
        Preconditions.checkArgument(i2 >= 0, "Write timeout mustn't be negative!");
        Preconditions.checkArgument(i3 >= 0, "Call timeout mustn't be negative!");
        this.converter = requestResponseConverter;
        this.responseCallbackExecutor = executorService;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.callTimeoutMillis = i3;
    }
}
