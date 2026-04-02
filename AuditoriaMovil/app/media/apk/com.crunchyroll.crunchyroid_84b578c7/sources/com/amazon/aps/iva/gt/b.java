package com.amazon.aps.iva.gt;

import com.amazon.aps.iva.es.s;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.u;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BentoUpsellAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;

    @Override // com.amazon.aps.iva.gt.a
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new z(a.C0456a.c(com.amazon.aps.iva.ls.a.ARCADE_UPSELL_MODAL, bVar), new u(l0.SUBSCRIPTION), (com.amazon.aps.iva.ks.g) null, i.CR_VOD_GAMEVAULT, 12));
    }

    @Override // com.amazon.aps.iva.gt.a
    public final void b(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar) {
        j.f(aVar, "screen");
        this.a.e(new s(a.C0456a.c(aVar, bVar), i.CR_VOD_GAMEVAULT));
    }

    @Override // com.amazon.aps.iva.gt.a
    public final void c(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new z(a.C0456a.c(com.amazon.aps.iva.ls.a.ARCADE_UPGRADE_MODAL, bVar), new u(l0.UPGRADE), (com.amazon.aps.iva.ks.g) null, i.CR_VOD_GAMEVAULT, 12));
    }

    @Override // com.amazon.aps.iva.gt.a
    public final void d(l0 l0Var) {
        j.f(l0Var, "upsellType");
        this.a.c(i.d.r(com.amazon.aps.iva.ls.a.UPSELL_MODAL, 0.0f, null, null, null, new u(l0Var)));
    }
}
