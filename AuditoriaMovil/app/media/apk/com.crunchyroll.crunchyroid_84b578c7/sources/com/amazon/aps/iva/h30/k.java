package com.amazon.aps.iva.h30;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.externalparteners.model.PurchasePaymentState;
/* compiled from: BentoCheckoutSuccessViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends f0 implements j {
    public final String b;
    public final com.amazon.aps.iva.k50.b c;
    public final l d;
    public final l0 e = t.g(0, 0, null, 7);

    /* compiled from: BentoCheckoutSuccessViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.success.bento.BentoCheckoutSuccessViewModelImpl$onMaybeLaterCtaClick$1", f = "BentoCheckoutSuccessViewModel.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
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
                l0 l0Var = k.this.e;
                q qVar = q.a;
                this.h = 1;
                if (l0Var.a(qVar, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.success.bento.BentoCheckoutSuccessViewModelImpl$onPrimaryButtonClick$1", f = "BentoCheckoutSuccessViewModel.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
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
                l0 l0Var = k.this.e;
                q qVar = q.a;
                this.h = 1;
                if (l0Var.a(qVar, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public k(com.amazon.aps.iva.wh.a aVar, com.amazon.aps.iva.js.l0 l0Var, String str, com.amazon.aps.iva.k50.c cVar, m mVar) {
        this.b = str;
        this.c = cVar;
        this.d = mVar;
        mVar.c();
        com.amazon.aps.iva.rs.p pVar = aVar.b;
        com.amazon.aps.iva.js.l0 l0Var2 = aVar.f == PurchasePaymentState.FREE_TRIAL ? com.amazon.aps.iva.js.l0.FREE_TRIAL : l0Var;
        String str2 = aVar.c;
        String str3 = aVar.d;
        com.amazon.aps.iva.rs.m mVar2 = aVar.e;
        mVar.b(pVar, l0Var2, str2, str3, mVar2 != null ? com.amazon.aps.iva.b30.d.c(mVar2) : null, com.amazon.aps.iva.js.i.CR_VOD_GAMEVAULT);
    }

    @Override // com.amazon.aps.iva.h30.j
    public final void D8(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.d.a(bVar, com.amazon.aps.iva.js.c.LATER);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.h30.j
    public final void k1(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.d.a(bVar, com.amazon.aps.iva.js.c.CONTINUE);
        String str = this.b;
        if (str != null) {
            this.c.r1(str);
        }
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(null), 3);
    }
}
