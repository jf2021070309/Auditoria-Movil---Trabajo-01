package com.vungle.warren.network;

import android.util.Log;
import com.vungle.warren.network.converters.Converter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call<T> {
    private static final String TAG = OkHttpCall.class.getSimpleName();
    private final Converter<ResponseBody, T> converter;
    private okhttp3.Call rawCall;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(okhttp3.Call call, Converter<ResponseBody, T> converter) {
        this.rawCall = call;
        this.converter = converter;
    }

    @Override // com.vungle.warren.network.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call call;
        synchronized (this) {
            call = this.rawCall;
        }
        return parseResponse(call.execute(), this.converter);
    }

    @Override // com.vungle.warren.network.Call
    public void enqueue(final Callback<T> callback) {
        this.rawCall.enqueue(new okhttp3.Callback() { // from class: com.vungle.warren.network.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response, OkHttpCall.this.converter));
                    } catch (Throwable th) {
                        Log.w(OkHttpCall.TAG, "Error on excuting callback", th);
                    }
                } catch (Throwable th2) {
                    callFailure(th2);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException iOException) {
                callFailure(iOException);
            }

            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    Log.w(OkHttpCall.TAG, "Error on executing callback", th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<T> parseResponse(okhttp3.Response response, Converter<ResponseBody, T> converter) throws IOException {
        ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                Buffer buffer = new Buffer();
                body.source().readAll(buffer);
                return Response.error(ResponseBody.create(body.contentType(), body.contentLength(), buffer), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.success(null, build);
        } else {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
            try {
                return Response.success(converter.convert(exceptionCatchingResponseBody), build);
            } catch (RuntimeException e) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        IOException thrownException;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return Okio.buffer(new ForwardingSource(this.delegate.source()) { // from class: com.vungle.warren.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }
}
