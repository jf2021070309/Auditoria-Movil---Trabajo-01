package com.amazon.aps.iva.b30;
/* compiled from: SubscriptionProductInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.subscription.SubscriptionProductInteractorImpl", f = "SubscriptionProductInteractor.kt", l = {22}, m = "loadProducts")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ g i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(this);
    }
}
