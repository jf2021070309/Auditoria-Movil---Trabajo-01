package com.amazon.aps.iva.rs;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.rs.g;
/* compiled from: BillingClientLifecycleWrapper.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ab.d {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.ab.d
    public final void a(com.android.billingclient.api.c cVar) {
        g gVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "billingResult");
        v<g> vVar = this.a.c;
        int i = cVar.a;
        if (i != 0) {
            if (i != 3) {
                gVar = new g.e(i.d(cVar));
            } else {
                gVar = new g.d(i.d(cVar));
            }
        } else {
            gVar = g.a.a;
        }
        vVar.i(gVar);
    }

    @Override // com.amazon.aps.iva.ab.d
    public final void b() {
        this.a.c.i(g.c.a);
    }
}
