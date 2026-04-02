package com.amazon.aps.iva.b30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g30.c;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.externalparteners.model.VerifyPurchaseResponse;
/* compiled from: UnverifiedPurchaseMonitor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.UnverifiedPurchaseMonitorImpl$verifyPurchase$2", f = "UnverifiedPurchaseMonitor.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wh.a>, Object> {
    public int h;
    public final /* synthetic */ m i;
    public final /* synthetic */ com.amazon.aps.iva.rs.p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, com.amazon.aps.iva.rs.p pVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(2, dVar);
        this.i = mVar;
        this.j = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new o(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wh.a> dVar) {
        return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object A1;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        m mVar = this.i;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
                A1 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            com.amazon.aps.iva.f20.h hVar = mVar.c;
            this.h = 1;
            A1 = hVar.A1(this.j, this);
            if (A1 == aVar) {
                return aVar;
            }
        }
        VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) A1;
        c.a.a(mVar.d, this.j, l0.ASYNC, verifyPurchaseResponse.getPromotionCode(), verifyPurchaseResponse.getPromotionType(), null, 48);
        return new com.amazon.aps.iva.wh.a(this.j, verifyPurchaseResponse.getPromotionCode(), verifyPurchaseResponse.getPromotionType(), null, verifyPurchaseResponse.getPaymentState());
    }
}
