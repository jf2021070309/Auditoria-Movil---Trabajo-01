package com.amazon.aps.iva.b30;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: SubscriptionProductSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.SubscriptionProductSynchronizerImpl$1", f = "SubscriptionProductSynchronizer.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.wh.d h;
    public int i;
    public final /* synthetic */ l j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.wh.d dVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    dVar = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                l lVar = this.j;
                com.amazon.aps.iva.wh.d dVar2 = lVar.b;
                e eVar = lVar.a;
                this.h = dVar2;
                this.i = 1;
                obj = eVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                Product product = (Product) obj2;
                com.amazon.aps.iva.a30.a[] values = com.amazon.aps.iva.a30.a.values();
                ArrayList arrayList2 = new ArrayList(values.length);
                for (com.amazon.aps.iva.a30.a aVar2 : values) {
                    arrayList2.add(aVar2.getSku());
                }
                if (arrayList2.contains(product.getSku())) {
                    arrayList.add(obj2);
                }
            }
            dVar.d(arrayList);
        } catch (IOException unused) {
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
