package com.amazon.aps.iva.s20;
/* compiled from: UpgradeViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeViewModelImpl", f = "UpgradeViewModel.kt", l = {155}, m = "getActiveSubscriptionProductWrapper")
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ z i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(dVar);
        this.i = zVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return z.N8(this.i, this);
    }
}
