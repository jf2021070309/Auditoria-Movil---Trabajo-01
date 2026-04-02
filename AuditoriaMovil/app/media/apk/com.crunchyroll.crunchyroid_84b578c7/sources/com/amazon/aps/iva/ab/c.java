package com.amazon.aps.iva.ab;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.List;
/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class c implements i {
    public final /* synthetic */ com.amazon.aps.iva.se0.t<j> a;

    public c(com.amazon.aps.iva.se0.u uVar) {
        this.a = uVar;
    }

    public final void a(com.android.billingclient.api.c cVar, List<PurchaseHistoryRecord> list) {
        com.amazon.aps.iva.yb0.j.e(cVar, "billingResult");
        this.a.G(new j(cVar, list));
    }
}
