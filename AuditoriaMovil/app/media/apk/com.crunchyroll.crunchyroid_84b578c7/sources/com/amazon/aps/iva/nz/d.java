package com.amazon.aps.iva.nz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: PlayheadsInterceptor.kt */
/* loaded from: classes2.dex */
public final class d implements Interceptor {
    public final com.amazon.aps.iva.xb0.a<e> b;

    /* compiled from: PlayheadsInterceptor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.playheads.PlayheadsInterceptor$intercept$1", f = "PlayheadsInterceptor.kt", l = {21}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                if (d.this.b.invoke().a(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(com.amazon.aps.iva.xb0.a<? extends e> aVar) {
        this.b = aVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z;
        j.f(chain, "chain");
        Request request = chain.request();
        if (request.header("upload_offline_playheads") != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new a(null));
        }
        return chain.proceed(request.newBuilder().removeHeader("upload_offline_playheads").build());
    }
}
