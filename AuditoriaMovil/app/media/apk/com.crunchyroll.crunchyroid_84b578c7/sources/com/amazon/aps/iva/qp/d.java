package com.amazon.aps.iva.qp;

import com.amazon.aps.iva.ef0.g;
import com.amazon.aps.iva.ef0.n;
import com.amazon.aps.iva.ef0.r;
import com.amazon.aps.iva.ef0.w;
import com.amazon.aps.iva.yb0.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* compiled from: GzipRequestInterceptor.kt */
/* loaded from: classes2.dex */
public final class d extends RequestBody {
    public final /* synthetic */ RequestBody a;

    public d(RequestBody requestBody) {
        this.a = requestBody;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(g gVar) {
        j.f(gVar, "sink");
        w a = r.a(new n(gVar));
        this.a.writeTo(a);
        a.close();
    }
}
