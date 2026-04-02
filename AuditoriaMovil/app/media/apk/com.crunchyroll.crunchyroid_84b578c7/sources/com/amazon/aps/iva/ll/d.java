package com.amazon.aps.iva.ll;
/* compiled from: PlayerSettingsListViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, f> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            com.amazon.aps.iva.gj.a c = hVar.c();
            com.amazon.aps.iva.cj.k kVar = com.amazon.aps.iva.cj.n.d;
            if (kVar != null) {
                return new f(c, kVar.a().getCastStateProvider());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
