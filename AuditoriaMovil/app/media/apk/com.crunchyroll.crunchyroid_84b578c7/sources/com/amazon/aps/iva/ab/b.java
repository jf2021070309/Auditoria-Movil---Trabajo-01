package com.amazon.aps.iva.ab;

import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class b implements g {
    public final /* synthetic */ com.amazon.aps.iva.se0.t<h> a;

    public b(com.amazon.aps.iva.se0.u uVar) {
        this.a = uVar;
    }

    public final void a(com.android.billingclient.api.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.e(cVar, "billingResult");
        this.a.G(new h(cVar, arrayList));
    }
}
