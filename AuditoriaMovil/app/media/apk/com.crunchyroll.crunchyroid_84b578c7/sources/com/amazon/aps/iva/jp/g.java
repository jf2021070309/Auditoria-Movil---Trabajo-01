package com.amazon.aps.iva.jp;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.sq.h;
import com.amazon.aps.iva.yb0.j;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: DatadogInterceptor.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.kr.d {
    public final com.amazon.aps.iva.sq.g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, com.amazon.aps.iva.kr.b bVar, com.amazon.aps.iva.l9.a aVar, com.amazon.aps.iva.sq.g gVar, com.amazon.aps.iva.zp.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        super(list, bVar, aVar, aVar2, aVar3);
        j.f(aVar, "firstPartyHostDetector");
        j.f(aVar3, "localTracerFactory");
        this.j = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map] */
    @Override // com.amazon.aps.iva.kr.d
    public final void b(Request request, com.amazon.aps.iva.fb0.b bVar, Response response, Throwable th) {
        IllegalStateException illegalStateException;
        com.amazon.aps.iva.sq.h a;
        a0 U;
        Long l;
        long contentLength;
        if (bVar != null) {
            this.c.b(request, bVar);
        }
        if (com.amazon.aps.iva.tq.c.f.d()) {
            a0 a0Var = a0.b;
            com.amazon.aps.iva.sq.g gVar = this.j;
            if (response != null) {
                String w = i.w(request);
                int code = response.code();
                String header = response.header(HttpHeaders.CONTENT_TYPE);
                if (header == null) {
                    a = com.amazon.aps.iva.sq.h.NATIVE;
                } else {
                    com.amazon.aps.iva.sq.h.Companion.getClass();
                    a = h.a.a(header);
                }
                com.amazon.aps.iva.sq.h hVar = a;
                if (bVar == null) {
                    U = a0Var;
                } else {
                    U = i0.U(new com.amazon.aps.iva.kb0.j("_dd.trace_id", bVar.c().a()), new com.amazon.aps.iva.kb0.j("_dd.span_id", bVar.c().b()));
                }
                com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
                Integer valueOf = Integer.valueOf(code);
                try {
                    contentLength = response.peekBody(33554432L).contentLength();
                } catch (IOException e) {
                    com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.a, "Unable to peek response body", e, 4);
                }
                if (contentLength != 0) {
                    l = Long.valueOf(contentLength);
                    gVar.e(request);
                    fVar.c(w, valueOf, l, hVar, i0.W(U, a0Var));
                    return;
                }
                l = null;
                gVar.e(request);
                fVar.c(w, valueOf, l, hVar, i0.W(U, a0Var));
                return;
            }
            if (th == null) {
                illegalStateException = new IllegalStateException("The request ended with no response nor any exception.");
            } else {
                illegalStateException = th;
            }
            String w2 = i.w(request);
            String method = request.method();
            String httpUrl = request.url().toString();
            j.e(httpUrl, "request.url().toString()");
            com.amazon.aps.iva.sq.f fVar2 = com.amazon.aps.iva.sq.c.c;
            String format = String.format(Locale.US, "OkHttp request error %s %s", Arrays.copyOf(new Object[]{method, httpUrl}, 2));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.sq.e eVar = com.amazon.aps.iva.sq.e.NETWORK;
            gVar.e(request);
            fVar2.o(w2, format, eVar, illegalStateException, a0Var);
        }
    }

    @Override // com.amazon.aps.iva.kr.d, okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        j.f(chain, "chain");
        if (com.amazon.aps.iva.tq.c.f.d()) {
            Request request = chain.request();
            String httpUrl = request.url().toString();
            j.e(httpUrl, "request.url().toString()");
            String method = request.method();
            String w = i.w(request);
            com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
            j.e(method, FirebaseAnalytics.Param.METHOD);
            fVar.a(w, method, httpUrl, a0.b);
        } else {
            com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "You set up a DatadogInterceptor, but RUM features are disabled.Make sure you initialized the Datadog SDK with a valid Application Id, and that RUM features are enabled.", null, 6);
        }
        return super.intercept(chain);
    }
}
