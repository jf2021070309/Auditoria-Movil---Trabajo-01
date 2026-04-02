package com.amazon.aps.iva.ft;

import com.amazon.aps.iva.es.s;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.ks.i;
import com.amazon.aps.iva.ks.u;
import com.amazon.aps.iva.xx.d;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BentoInfoAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;

    public b(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2) {
        j.f(aVar2, "screen");
        this.a = aVar2;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.ft.a
    public final void E(d dVar, com.amazon.aps.iva.jt.a aVar) {
        j.f(dVar, "cardUiModel");
        j.f(aVar, "feedAnalyticsData");
        this.b.e(new s(this.a, new i(null, null, dVar.g), new e(null, p.GAME, null, null, dVar.b, null, null, null, 481), aVar.b, aVar.c, null, null, null, com.amazon.aps.iva.js.i.CR_VOD_GAMEVAULT, 480));
    }

    @Override // com.amazon.aps.iva.ft.a
    public final void F(com.amazon.aps.iva.fs.b bVar) {
        this.b.e(new z(a.C0456a.c(this.a, bVar), new u(l0.UPGRADE), (g) null, com.amazon.aps.iva.js.i.CR_VOD_GAMEVAULT, 12));
    }

    @Override // com.amazon.aps.iva.ft.a
    public final void G(com.amazon.aps.iva.fs.b bVar) {
        this.b.e(new z(a.C0456a.c(this.a, bVar), new u(l0.SUBSCRIPTION), (g) null, com.amazon.aps.iva.js.i.CR_VOD_GAMEVAULT, 12));
    }
}
