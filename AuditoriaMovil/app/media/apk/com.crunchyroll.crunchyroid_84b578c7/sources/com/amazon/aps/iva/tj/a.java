package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ek.a> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ek.a invoke() {
        ExoplayerComponent.a aVar = this.h.j;
        if (aVar != null) {
            com.amazon.aps.iva.yb0.j.f(aVar.f, "config");
            return new com.amazon.aps.iva.ek.d(new com.amazon.aps.iva.a6.i(new com.amazon.aps.iva.t6.f(), 50000, 50000, 2500, 5000));
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
