package com.amazon.aps.iva.sz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SubscriptionVerifyInteractor.kt */
@e(c = "com.ellation.crunchyroll.presentation.billing.SubscriptionVerifyInteractorImpl$verifyPurchase$2$1$1$1", f = "SubscriptionVerifyInteractor.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<g0, d<? super q>, Object> {
    public int h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new a(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
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
            l lVar = this.i.e;
            this.h = 1;
            if (lVar.b(this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
