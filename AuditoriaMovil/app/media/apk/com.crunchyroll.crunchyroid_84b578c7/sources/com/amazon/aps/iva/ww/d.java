package com.amazon.aps.iva.ww;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.error.HttpException;
import com.ellation.crunchyroll.api.etp.error.ServerException;
import com.ellation.crunchyroll.api.etp.error.TooManyRequestsException;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ExponentialBackoffInterceptor.kt */
/* loaded from: classes2.dex */
public final class d implements Interceptor {
    public final c b = new c();

    /* compiled from: ExponentialBackoffInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Response> {
        public final /* synthetic */ Interceptor.Chain h;
        public final /* synthetic */ d0<Request.Builder> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Interceptor.Chain chain, d0<Request.Builder> d0Var) {
            super(0);
            this.h = chain;
            this.i = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Response invoke() {
            return this.h.proceed(this.i.b.build());
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [okhttp3.Request$Builder, T] */
    /* JADX WARN: Type inference failed for: r2v0, types: [okhttp3.Request$Builder, T] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z;
        g putIfAbsent;
        j.f(chain, "chain");
        Request request = chain.request();
        d0 d0Var = new d0();
        d0Var.b = request.newBuilder();
        if (request.header("exclude_from_retry_with_exponential_backoff") != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ?? removeHeader = ((Request.Builder) d0Var.b).removeHeader("exclude_from_retry_with_exponential_backoff");
            d0Var.b = removeHeader;
            return chain.proceed(removeHeader.build());
        } else if (j.a(request.method(), "GET")) {
            String str = (String) x.t0(request.url().pathSegments());
            a aVar = new a(chain, d0Var);
            c cVar = this.b;
            cVar.getClass();
            j.f(str, "serviceName");
            ConcurrentHashMap<String, g> concurrentHashMap = cVar.c;
            g gVar = concurrentHashMap.get(str);
            if (gVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (gVar = cVar.b.invoke()))) != null) {
                gVar = putIfAbsent;
            }
            g gVar2 = gVar;
            cVar.a.invoke(Long.valueOf(gVar2.c()));
            try {
                Response invoke = aVar.invoke();
                gVar2.a();
                return invoke;
            } catch (HttpException e) {
                if ((e instanceof ServerException) || (e instanceof TooManyRequestsException)) {
                    gVar2.b();
                }
                throw e;
            }
        } else {
            return chain.proceed(((Request.Builder) d0Var.b).build());
        }
    }
}
