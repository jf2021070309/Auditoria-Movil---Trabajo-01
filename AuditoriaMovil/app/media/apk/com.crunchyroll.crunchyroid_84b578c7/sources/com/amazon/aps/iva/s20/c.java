package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.es.s0;
import com.amazon.aps.iva.js.f;
import com.amazon.aps.iva.ks.a;
/* compiled from: UpgradeAnalytics.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final com.amazon.aps.iva.ls.a b;
    public final com.amazon.aps.iva.vw.a c;

    public c(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.s20.b
    public final void a(com.amazon.aps.iva.fs.b bVar, String str, String str2, f.c cVar, com.amazon.aps.iva.js.i iVar, com.amazon.aps.iva.js.q qVar, com.amazon.aps.iva.ks.j jVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "ctaType");
        com.amazon.aps.iva.yb0.j.f(iVar, "eventSourceProperty");
        com.amazon.aps.iva.ks.s sVar = new com.amazon.aps.iva.ks.s(str, str2);
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.b, bVar);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.a.e(new s0(sVar, c, cVar, jVar, qVar, gVar, iVar));
    }
}
