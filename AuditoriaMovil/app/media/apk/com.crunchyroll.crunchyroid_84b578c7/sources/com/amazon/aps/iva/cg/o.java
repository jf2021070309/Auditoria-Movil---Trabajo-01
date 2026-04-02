package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareDataForUpgradeMenu$1", f = "DeepLinkDataManager.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ i j;
    public final /* synthetic */ p.o k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, p.o oVar, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(2, dVar);
        this.j = iVar;
        this.k = oVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        o oVar = new o(this.j, this.k, dVar);
        oVar.i = obj;
        return oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        i iVar = this.j;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                f fVar = iVar.a;
                this.h = 1;
                obj = fVar.getUserSubscription(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            H = (SubscriptionProductWrapper) obj;
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        boolean z = !(H instanceof k.a);
        p.o oVar = this.k;
        if (z) {
            SubscriptionProductWrapper subscriptionProductWrapper = (SubscriptionProductWrapper) H;
            if (subscriptionProductWrapper != null && !iVar.c.invoke(subscriptionProductWrapper.getProduct().getSku()).booleanValue()) {
                iVar.c(new p.e(oVar.b, null));
            } else {
                iVar.c(oVar);
            }
        }
        if (com.amazon.aps.iva.kb0.k.a(H) != null) {
            iVar.c(oVar);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
