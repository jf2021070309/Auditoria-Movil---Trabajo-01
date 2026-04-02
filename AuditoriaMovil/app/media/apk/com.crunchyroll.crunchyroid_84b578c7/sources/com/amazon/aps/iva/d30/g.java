package com.amazon.aps.iva.d30;
/* compiled from: CrPlusSubscriptionProductsViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.viewmodel.CrPlusSubscriptionProductsViewModelImpl", f = "CrPlusSubscriptionProductsViewModel.kt", l = {168}, m = "loadSubscriptionProducts")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.c {
    public e h;
    public e i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(dVar);
        this.k = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return e.N8(this.k, this);
    }
}
