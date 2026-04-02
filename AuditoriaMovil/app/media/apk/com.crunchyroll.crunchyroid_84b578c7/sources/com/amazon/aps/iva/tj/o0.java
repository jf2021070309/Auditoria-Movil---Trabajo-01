package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ok.f> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ok.f invoke() {
        ExoplayerComponent exoplayerComponent = this.h;
        com.amazon.aps.iva.se0.g0 g0Var = exoplayerComponent.d;
        m0 m0Var = new m0(exoplayerComponent);
        ExoplayerComponent.a aVar = exoplayerComponent.j;
        if (aVar != null) {
            int i = aVar.h;
            int i2 = aVar.i;
            n0 n0Var = new n0(exoplayerComponent);
            com.amazon.aps.iva.yb0.j.f(g0Var, "coroutineScope");
            return new com.amazon.aps.iva.ok.g(g0Var, m0Var, i, i2, n0Var);
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
