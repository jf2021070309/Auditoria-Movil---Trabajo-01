package com.amazon.aps.iva.rs;

import com.android.billingclient.api.Purchase;
import java.util.List;
/* compiled from: BillingExtensions.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.ab.k {
    public final /* synthetic */ com.amazon.aps.iva.ob0.d<List<? extends Purchase>> a;

    public j(com.amazon.aps.iva.ob0.i iVar) {
        this.a = iVar;
    }

    @Override // com.amazon.aps.iva.ab.k
    public final void a(com.android.billingclient.api.c cVar, List<Purchase> list) {
        com.amazon.aps.iva.yb0.j.f(cVar, "result");
        com.amazon.aps.iva.yb0.j.f(list, "purchases");
        if (cVar.a == 0) {
            this.a.resumeWith(list);
            return;
        }
        throw new h(i.d(cVar));
    }
}
