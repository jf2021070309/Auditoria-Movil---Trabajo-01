package com.google.net.cronet.okhttptransport;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RequestResponseConverter {
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final String CONTENT_TYPE_HEADER_DEFAULT_VALUE = "application/octet-stream";
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    private final CronetEngine cronetEngine;
    private final RedirectStrategy redirectStrategy;
    private final RequestBodyConverter requestBodyConverter;
    private final ResponseConverter responseConverter;
    private final Executor uploadDataProviderExecutor;

    /* loaded from: classes4.dex */
    public static final class CronetRequestAndOkHttpResponse {
        private final UrlRequest request;
        private final ResponseSupplier responseSupplier;

        public CronetRequestAndOkHttpResponse(UrlRequest urlRequest, ResponseSupplier responseSupplier) {
            this.request = urlRequest;
            this.responseSupplier = responseSupplier;
        }

        public UrlRequest getRequest() {
            return this.request;
        }

        public Response getResponse() throws IOException {
            return this.responseSupplier.getResponse();
        }

        public ListenableFuture<Response> getResponseAsync() {
            return this.responseSupplier.getResponseFuture();
        }
    }

    /* loaded from: classes4.dex */
    public interface ResponseSupplier {
        Response getResponse() throws IOException;

        ListenableFuture<Response> getResponseFuture();
    }

    public RequestResponseConverter(CronetEngine cronetEngine, Executor executor, RequestBodyConverter requestBodyConverter, ResponseConverter responseConverter, RedirectStrategy redirectStrategy) {
        this.cronetEngine = cronetEngine;
        this.uploadDataProviderExecutor = executor;
        this.requestBodyConverter = requestBodyConverter;
        this.responseConverter = responseConverter;
        this.redirectStrategy = redirectStrategy;
    }

    private ResponseSupplier createResponseSupplier(final Request request, final OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return new ResponseSupplier() { // from class: com.google.net.cronet.okhttptransport.RequestResponseConverter.1
            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public Response getResponse() throws IOException {
                return RequestResponseConverter.this.responseConverter.lambda$toResponseAsync$0(request, okHttpBridgeRequestCallback);
            }

            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public ListenableFuture<Response> getResponseFuture() {
                return RequestResponseConverter.this.responseConverter.toResponseAsync(request, okHttpBridgeRequestCallback);
            }
        };
    }

    public CronetRequestAndOkHttpResponse convert(Request request, int i, int i2) throws IOException {
        OkHttpBridgeRequestCallback okHttpBridgeRequestCallback = new OkHttpBridgeRequestCallback(i, this.redirectStrategy);
        UrlRequest.Builder allowDirectExecutor = this.cronetEngine.newUrlRequestBuilder(request.url().toString(), okHttpBridgeRequestCallback, MoreExecutors.directExecutor()).allowDirectExecutor();
        allowDirectExecutor.setHttpMethod(request.method());
        for (int i3 = 0; i3 < request.headers().size(); i3++) {
            allowDirectExecutor.addHeader(request.headers().name(i3), request.headers().value(i3));
        }
        RequestBody body = request.body();
        if (body != null) {
            if (request.header("Content-Length") == null && body.contentLength() != -1) {
                allowDirectExecutor.addHeader("Content-Length", String.valueOf(body.contentLength()));
            }
            if (body.contentLength() != 0) {
                if (request.header("Content-Type") == null && body.contentType() != null) {
                    allowDirectExecutor.addHeader("Content-Type", body.contentType().toString());
                } else {
                    allowDirectExecutor.addHeader("Content-Type", CONTENT_TYPE_HEADER_DEFAULT_VALUE);
                }
                allowDirectExecutor.setUploadDataProvider(this.requestBodyConverter.convertRequestBody(body, i2), this.uploadDataProviderExecutor);
            }
        }
        return new CronetRequestAndOkHttpResponse(allowDirectExecutor.build(), createResponseSupplier(request, okHttpBridgeRequestCallback));
    }
}
