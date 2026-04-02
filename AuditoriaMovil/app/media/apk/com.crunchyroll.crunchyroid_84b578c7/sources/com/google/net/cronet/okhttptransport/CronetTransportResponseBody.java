package com.google.net.cronet.okhttptransport;

import com.amazon.aps.iva.ef0.h;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes4.dex */
abstract class CronetTransportResponseBody extends ResponseBody {
    private final ResponseBody delegate;

    public CronetTransportResponseBody(ResponseBody responseBody) {
        this.delegate = responseBody;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
        customCloseHook();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.delegate.contentType();
    }

    public abstract void customCloseHook();

    @Override // okhttp3.ResponseBody
    public final h source() {
        return this.delegate.source();
    }
}
