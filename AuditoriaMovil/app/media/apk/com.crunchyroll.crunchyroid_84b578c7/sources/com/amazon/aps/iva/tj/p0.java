package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ok.b> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ok.b invoke() {
        ExoplayerComponent exoplayerComponent = this.h;
        ExoplayerComponent.a aVar = exoplayerComponent.j;
        if (aVar != null) {
            if (aVar.g) {
                com.amazon.aps.iva.ok.f p = exoplayerComponent.p();
                com.amazon.aps.iva.se0.g0 g0Var = exoplayerComponent.d;
                com.amazon.aps.iva.yb0.j.f(g0Var, "coroutineScope");
                com.amazon.aps.iva.gk.b bVar = exoplayerComponent.L;
                com.amazon.aps.iva.yb0.j.f(bVar, "captionsController");
                com.amazon.aps.iva.yb0.j.f(p, "subtitlesController");
                v0 v0Var = exoplayerComponent.C;
                com.amazon.aps.iva.yb0.j.f(v0Var, "settingsState");
                v0 v0Var2 = exoplayerComponent.k;
                com.amazon.aps.iva.yb0.j.f(v0Var2, "playerState");
                return new com.amazon.aps.iva.ok.e(g0Var, bVar, p, v0Var, v0Var2);
            }
            return new com.amazon.aps.iva.ok.a();
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
