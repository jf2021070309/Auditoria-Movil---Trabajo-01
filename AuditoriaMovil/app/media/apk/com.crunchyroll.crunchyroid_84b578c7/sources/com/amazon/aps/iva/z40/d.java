package com.amazon.aps.iva.z40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.z40.a;
/* compiled from: InactiveClientMonitor.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<q, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.C0912a c0912a) {
        super(1);
        this.h = c0912a;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(q qVar) {
        j.f(qVar, "it");
        this.h.invoke();
        return q.a;
    }
}
