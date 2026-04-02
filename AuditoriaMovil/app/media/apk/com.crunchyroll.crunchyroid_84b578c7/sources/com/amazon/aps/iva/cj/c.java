package com.amazon.aps.iva.cj;

import android.content.Context;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.se0.r0;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* compiled from: AdvertisingInfoProvider.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public com.amazon.aps.iva.cj.a a;

    /* compiled from: AdvertisingInfoProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.AdvertisingInfoProviderImpl$1", f = "AdvertisingInfoProvider.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ Context j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = context;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.h;
            c cVar = c.this;
            Context context = this.j;
            try {
                String id = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                if (id == null) {
                    id = "00000000-0000-0000-0000-000000000000";
                }
                com.amazon.aps.iva.cj.a aVar2 = new com.amazon.aps.iva.cj.a(id, com.amazon.aps.iva.aq.k.n(context).b);
                cVar.getClass();
                cVar.a = aVar2;
                H = com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                H = com.amazon.aps.iva.ab.x.H(th);
            }
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            Throwable a = com.amazon.aps.iva.kb0.k.a(H);
            if (a != null) {
                c0515a.b(a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c(Context context, com.amazon.aps.iva.se0.g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = new com.amazon.aps.iva.cj.a("00000000-0000-0000-0000-000000000000", com.amazon.aps.iva.aq.k.n(context).b);
        com.amazon.aps.iva.se0.i.d(g0Var, r0.b, null, new a(context, null), 2);
    }

    @Override // com.amazon.aps.iva.cj.b
    public final com.amazon.aps.iva.cj.a a() {
        return this.a;
    }
}
