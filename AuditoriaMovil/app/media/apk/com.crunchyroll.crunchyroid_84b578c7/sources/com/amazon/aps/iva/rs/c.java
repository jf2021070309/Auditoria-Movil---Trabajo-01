package com.amazon.aps.iva.rs;
/* compiled from: BillingClientLifecycleWrapper.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingClientLifecycle", f = "BillingClientLifecycleWrapper.kt", l = {204, 206}, m = "findUnverifiedBillingPurchase")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.c {
    public Object h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
        super(dVar2);
        this.k = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
