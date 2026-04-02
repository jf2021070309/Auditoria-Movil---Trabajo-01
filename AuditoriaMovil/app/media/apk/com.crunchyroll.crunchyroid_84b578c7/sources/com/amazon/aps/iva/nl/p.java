package com.amazon.aps.iva.nl;
/* compiled from: AudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, u> {
    public final /* synthetic */ androidx.fragment.app.h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.fragment.app.h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final u invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.ol.f fVar;
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.p pVar2 = com.amazon.aps.iva.cj.n.f;
        if (pVar2 != null) {
            com.amazon.aps.iva.tl.b b = pVar2.b();
            com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
            if (hVar != null) {
                com.amazon.aps.iva.gj.a c = hVar.c();
                androidx.fragment.app.h hVar2 = this.h;
                if (c != null) {
                    com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
                    fVar = (com.amazon.aps.iva.ol.f) com.amazon.aps.iva.ez.l.a(hVar2, com.amazon.aps.iva.ol.j.class, new com.amazon.aps.iva.ol.e(hVar2));
                } else {
                    fVar = null;
                }
                com.amazon.aps.iva.yb0.j.f(hVar2, "activity");
                q qVar = (q) com.amazon.aps.iva.ez.l.a(hVar2, com.amazon.aps.iva.ol.c.class, new com.amazon.aps.iva.ol.b(hVar2));
                com.amazon.aps.iva.cj.k kVar = com.amazon.aps.iva.cj.n.d;
                if (kVar != null) {
                    return new u(b, fVar, qVar, kVar.a().getCastStateProvider());
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("player");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("feature");
        throw null;
    }
}
