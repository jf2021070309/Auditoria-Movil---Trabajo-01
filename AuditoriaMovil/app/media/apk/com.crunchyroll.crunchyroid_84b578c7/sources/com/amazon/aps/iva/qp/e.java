package com.amazon.aps.iva.qp;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* compiled from: GzipRequestInterceptor.kt */
/* loaded from: classes2.dex */
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        j.f(chain, "chain");
        Request request = chain.request();
        j.e(request, "chain.request()");
        RequestBody body = request.body();
        if (body != null && request.header(HttpHeaders.CONTENT_ENCODING) == null) {
            try {
                request = request.newBuilder().header(HttpHeaders.CONTENT_ENCODING, "gzip").method(request.method(), new d(body)).build();
            } catch (Exception e) {
                l1.M(com.amazon.aps.iva.dq.c.a, "Unable to gzip request body", e, 4);
            }
            Response proceed = chain.proceed(request);
            j.e(proceed, "{\n            val compre…pressedRequest)\n        }");
            return proceed;
        }
        Response proceed2 = chain.proceed(request);
        j.e(proceed2, "{\n            chain.proc…riginalRequest)\n        }");
        return proceed2;
    }
}
