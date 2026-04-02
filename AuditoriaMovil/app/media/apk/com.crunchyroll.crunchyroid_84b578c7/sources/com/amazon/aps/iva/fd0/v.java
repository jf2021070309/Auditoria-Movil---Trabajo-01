package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.s1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes4.dex */
public final class v extends a<com.amazon.aps.iva.pc0.c> {
    public final com.amazon.aps.iva.pc0.a a;
    public final boolean b;
    public final com.amazon.aps.iva.la0.c c;
    public final com.amazon.aps.iva.xc0.c d;
    public final boolean e;

    public /* synthetic */ v(com.amazon.aps.iva.pc0.a aVar, boolean z, com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.xc0.c cVar2) {
        this(aVar, z, cVar, cVar2, false);
    }

    public final com.amazon.aps.iva.xc0.e e() {
        return ((com.amazon.aps.iva.ad0.c) this.c.a).q;
    }

    public final com.amazon.aps.iva.nd0.d f(m0 m0Var) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.ge0.h hVar = s1.a;
        com.amazon.aps.iva.oc0.h k = m0Var.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) k;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        return com.amazon.aps.iva.qd0.i.g(eVar);
    }

    public v(com.amazon.aps.iva.pc0.a aVar, boolean z, com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.xc0.c cVar2, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(cVar, "containerContext");
        com.amazon.aps.iva.yb0.j.f(cVar2, "containerApplicabilityType");
        this.a = aVar;
        this.b = z;
        this.c = cVar;
        this.d = cVar2;
        this.e = z2;
    }
}
