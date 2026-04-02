package com.amazon.aps.iva.el;

import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jl.g> {
    public final /* synthetic */ InternalPlayerViewLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InternalPlayerViewLayout internalPlayerViewLayout) {
        super(0);
        this.h = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.jl.g invoke() {
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            com.amazon.aps.iva.jl.a k = hVar.k();
            InternalPlayerViewLayout internalPlayerViewLayout = this.h;
            com.amazon.aps.iva.yb0.j.f(internalPlayerViewLayout, "view");
            com.amazon.aps.iva.yb0.j.f(k, "dataProvider");
            return new com.amazon.aps.iva.jl.i(internalPlayerViewLayout, k);
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
