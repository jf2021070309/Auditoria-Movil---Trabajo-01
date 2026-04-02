package com.amazon.aps.iva.ll;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.nl.u;
import com.amazon.aps.iva.ql.a;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: PlayerSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, q> {
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ androidx.fragment.app.h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fragment fragment, androidx.fragment.app.h hVar) {
        super(1);
        this.h = fragment;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.sl.a kVar;
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.ql.g gVar = com.amazon.aps.iva.ql.g.g;
        if (gVar != null) {
            com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
            if (hVar != null) {
                if (hVar.c() != null) {
                    com.amazon.aps.iva.cj.h hVar2 = com.amazon.aps.iva.cj.n.e;
                    if (hVar2 != null) {
                        v0 state = hVar2.getState();
                        com.amazon.aps.iva.yb0.j.f(state, "playerState");
                        kVar = new com.amazon.aps.iva.sl.f(state);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("player");
                        throw null;
                    }
                } else {
                    kVar = new com.amazon.aps.iva.a0.k();
                }
                Fragment fragment = this.h;
                com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
                androidx.fragment.app.h requireActivity = fragment.requireActivity();
                com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
                com.amazon.aps.iva.wl.o oVar = (com.amazon.aps.iva.wl.o) com.amazon.aps.iva.ez.l.a(requireActivity, com.amazon.aps.iva.wl.q.class, new com.amazon.aps.iva.wl.n(fragment));
                androidx.fragment.app.h hVar3 = this.i;
                com.amazon.aps.iva.yb0.j.f(hVar3, "activity");
                com.amazon.aps.iva.nl.q qVar = (com.amazon.aps.iva.nl.q) com.amazon.aps.iva.ez.l.a(hVar3, u.class, new com.amazon.aps.iva.nl.p(hVar3));
                com.amazon.aps.iva.ql.b a = a.C0647a.a();
                com.amazon.aps.iva.cj.k kVar2 = com.amazon.aps.iva.cj.n.d;
                if (kVar2 != null) {
                    com.amazon.aps.iva.ye.h preferencesChromecastMessenger = kVar2.a().getPreferencesChromecastMessenger();
                    com.amazon.aps.iva.yb0.j.f(preferencesChromecastMessenger, "chromecastMessage");
                    return new q(gVar, kVar, oVar, qVar, a, new com.amazon.aps.iva.pl.c(preferencesChromecastMessenger));
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("player");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
