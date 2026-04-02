package com.amazon.aps.iva.rs;
/* compiled from: BillingClientLifecycleWrapper.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.billing.BillingClientLifecycle", f = "BillingClientLifecycleWrapper.kt", l = {149, 151, 161, 165}, m = "launchBillingFlow")
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qb0.c {
    public d h;
    public Object i;
    public Object j;
    public Object k;
    public com.android.billingclient.api.d l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, com.amazon.aps.iva.ob0.d<? super e> dVar2) {
        super(dVar2);
        this.o = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.h(null, null, null, 0, this);
    }
}
