package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ck.b> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ck.b invoke() {
        ExoplayerComponent exoplayerComponent = this.h;
        com.amazon.aps.iva.ck.f fVar = (com.amazon.aps.iva.ck.f) exoplayerComponent.H.getValue();
        com.amazon.aps.iva.ck.d m = exoplayerComponent.m();
        y yVar = new y(exoplayerComponent);
        ExoplayerComponent.a aVar = exoplayerComponent.j;
        if (aVar != null) {
            com.amazon.aps.iva.ck.g gVar = aVar.c;
            z zVar = new z(exoplayerComponent);
            com.amazon.aps.iva.yb0.j.f(fVar, "loadErrorHandler");
            com.amazon.aps.iva.yb0.j.f(m, "errorHandler");
            com.amazon.aps.iva.yb0.j.f(gVar, "retrySkipper");
            v0 v0Var = exoplayerComponent.k;
            com.amazon.aps.iva.yb0.j.f(v0Var, "playerState");
            return new com.amazon.aps.iva.ck.c(fVar, m, yVar, gVar, v0Var, zVar);
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
