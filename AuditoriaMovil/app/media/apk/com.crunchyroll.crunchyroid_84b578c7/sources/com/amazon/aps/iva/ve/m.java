package com.amazon.aps.iva.ve;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: UserBillingStatusSynchronizerImpl.kt */
/* loaded from: classes.dex */
public final class m implements l, com.amazon.aps.iva.ys.d {
    public final j b;
    public final e c;
    public final g0 d;

    /* compiled from: UserBillingStatusSynchronizerImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.billingnotifications.status.UserBillingStatusSynchronizerImpl$onAppResume$1", f = "UserBillingStatusSynchronizerImpl.kt", l = {26}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                j jVar = m.this.b;
                this.h = 1;
                if (jVar.a(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public m(k kVar, d dVar, com.ellation.crunchyroll.application.d dVar2) {
        d1 d1Var = d1.b;
        com.amazon.aps.iva.yb0.j.f(dVar2, "appLifecycle");
        this.b = kVar;
        this.c = dVar;
        this.d = d1Var;
        dVar2.Lf(this);
    }

    @Override // com.amazon.aps.iva.ve.l
    public final void a() {
        this.c.clear();
    }

    @Override // com.amazon.aps.iva.ve.l
    public final Object b(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object a2 = this.b.a(dVar);
        if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        if (z) {
            com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(null), 3);
        }
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
