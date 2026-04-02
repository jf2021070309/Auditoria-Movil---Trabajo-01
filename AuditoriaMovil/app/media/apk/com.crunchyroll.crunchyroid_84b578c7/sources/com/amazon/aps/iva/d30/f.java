package com.amazon.aps.iva.d30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CrPlusSubscriptionProductsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl$launchDowngradeFlow$1", f = "CrPlusSubscriptionProductsViewModel.kt", l = {127, 131}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public com.amazon.aps.iva.fs.b h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ com.amazon.aps.iva.fs.b n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, String str2, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.k = eVar;
        this.l = str;
        this.m = str2;
        this.n = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.k, this.l, this.m, this.n, dVar);
        fVar.j = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        Throwable a;
        e eVar;
        com.amazon.aps.iva.fs.b bVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        e eVar2 = this.k;
        try {
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    H = (com.amazon.aps.iva.wh.a) obj;
                    a = com.amazon.aps.iva.kb0.k.a(H);
                    if (a != null && !(a instanceof com.amazon.aps.iva.b30.q)) {
                        eVar2.i.d(a);
                    }
                    eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.h;
            eVar = (e) this.j;
            x.i0(obj);
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.j;
            String str = this.l;
            String str2 = this.m;
            com.amazon.aps.iva.fs.b bVar2 = this.n;
            com.amazon.aps.iva.rs.k kVar = eVar2.d;
            this.j = eVar2;
            this.h = bVar2;
            this.i = 1;
            obj = kVar.a(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            eVar = eVar2;
            bVar = bVar2;
        }
        this.j = null;
        this.h = null;
        this.i = 2;
        obj = e.O8(eVar, (com.amazon.aps.iva.rs.p) obj, bVar, this);
        if (obj == aVar) {
            return aVar;
        }
        H = (com.amazon.aps.iva.wh.a) obj;
        a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            eVar2.i.d(a);
        }
        eVar2.j.k(com.amazon.aps.iva.ez.h.e(H));
        return q.a;
    }
}
