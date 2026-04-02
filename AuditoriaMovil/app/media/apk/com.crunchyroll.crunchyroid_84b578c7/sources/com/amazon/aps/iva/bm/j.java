package com.amazon.aps.iva.bm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.ve0.z;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import java.util.List;
/* compiled from: SelectedProfileCachingStrategy.kt */
/* loaded from: classes2.dex */
public final class j implements u0, g0<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.em.a>> {
    public final com.amazon.aps.iva.se0.g0 b;
    public final com.amazon.aps.iva.am.g c;
    public final com.amazon.aps.iva.am.b d;
    public final com.amazon.aps.iva.ve0.f<List<com.amazon.aps.iva.em.a>> e;
    public final RefreshTokenMonitor f;
    public final /* synthetic */ v0 g;

    public j(com.amazon.aps.iva.xe0.d dVar, com.amazon.aps.iva.am.h hVar, com.amazon.aps.iva.am.c cVar, com.amazon.aps.iva.zl.a aVar, RefreshTokenMonitor refreshTokenMonitor) {
        com.amazon.aps.iva.yb0.j.f(refreshTokenMonitor, "tokenMonitor");
        this.b = dVar;
        this.c = hVar;
        this.d = cVar;
        this.e = aVar;
        this.f = refreshTokenMonitor;
        this.g = x.e(new g.b(null));
        com.amazon.aps.iva.se0.i.d(dVar, null, null, new i(this, null), 3);
        com.amazon.aps.iva.dg.b.A(dVar, new a0(aVar, new f(this, null)));
        com.amazon.aps.iva.dg.b.A(dVar, new a0(com.amazon.aps.iva.dg.b.m(new z(new g(refreshTokenMonitor.getRefreshTokenState()))), new h(this, null)));
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(Object obj, com.amazon.aps.iva.ob0.d dVar) {
        this.g.setValue((com.amazon.aps.iva.ez.g) obj);
        return q.a;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(Object obj) {
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) obj;
        com.amazon.aps.iva.yb0.j.f(gVar, "value");
        this.g.setValue(gVar);
        return true;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.ez.g<com.amazon.aps.iva.em.a>> gVar, com.amazon.aps.iva.ob0.d<?> dVar) {
        return this.g.c(gVar, dVar);
    }

    @Override // com.amazon.aps.iva.ve0.g0
    /* renamed from: d */
    public final void setValue(com.amazon.aps.iva.ez.g<com.amazon.aps.iva.em.a> gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "<set-?>");
        this.g.setValue(gVar);
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final u0<Integer> f() {
        return this.g.f();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        this.g.g();
        throw null;
    }

    @Override // com.amazon.aps.iva.ve0.u0, com.amazon.aps.iva.ve0.g0
    public final Object getValue() {
        return (com.amazon.aps.iva.ez.g) this.g.getValue();
    }
}
