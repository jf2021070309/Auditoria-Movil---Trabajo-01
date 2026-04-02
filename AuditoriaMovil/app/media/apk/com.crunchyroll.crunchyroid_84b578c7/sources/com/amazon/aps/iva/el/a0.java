package com.amazon.aps.iva.el;

import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, p0> {
    public final /* synthetic */ InternalPlayerViewLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(InternalPlayerViewLayout internalPlayerViewLayout) {
        super(1);
        this.h = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final p0 invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            return new p0(hVar, new z(this.h));
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
