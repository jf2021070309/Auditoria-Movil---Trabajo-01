package com.amazon.aps.iva.d30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse;
/* compiled from: CrPlusSubscriptionProductsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl$verifyPurchase$result$1", f = "CrPlusSubscriptionProductsViewModel.kt", l = {192}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super VerifyPurchaseResponse>, Object> {
    public int h;
    public final /* synthetic */ e i;
    public final /* synthetic */ com.amazon.aps.iva.rs.p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, com.amazon.aps.iva.rs.p pVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = eVar;
        this.j = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super VerifyPurchaseResponse> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
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
            com.amazon.aps.iva.f20.h hVar = this.i.e;
            this.h = 1;
            obj = hVar.A1(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
