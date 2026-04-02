package com.amazon.aps.iva.wl;

import androidx.fragment.app.Fragment;
/* compiled from: SubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, q> {
    public final /* synthetic */ Fragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fragment fragment) {
        super(1);
        this.h = fragment;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        Fragment fragment = this.h;
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        androidx.fragment.app.h requireActivity = fragment.requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
        com.amazon.aps.iva.xl.i iVar = (com.amazon.aps.iva.xl.i) com.amazon.aps.iva.ez.l.a(requireActivity, com.amazon.aps.iva.xl.k.class, new com.amazon.aps.iva.xl.h(fragment));
        androidx.fragment.app.h requireActivity2 = fragment.requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
        f fVar = (f) com.amazon.aps.iva.ez.l.a(requireActivity2, h.class, new e(requireActivity2));
        com.amazon.aps.iva.cj.k kVar = com.amazon.aps.iva.cj.n.d;
        if (kVar != null) {
            return new q(iVar, fVar, kVar.a().getCastStateProvider());
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
