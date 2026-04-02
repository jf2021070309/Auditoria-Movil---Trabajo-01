package com.amazon.aps.iva.f30;

import com.amazon.aps.iva.wy.j;
/* compiled from: OfflineAccessCrPlusSubscriptionButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        super(bVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.b.invoke().booleanValue()) {
            getView().B3();
        } else {
            getView().vh();
        }
    }
}
