package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.ve0.v0;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ck.d> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ck.d invoke() {
        ExoplayerComponent exoplayerComponent = this.h;
        v0 v0Var = exoplayerComponent.k;
        com.amazon.aps.iva.oj.a i = exoplayerComponent.i();
        com.amazon.aps.iva.ck.f fVar = (com.amazon.aps.iva.ck.f) exoplayerComponent.H.getValue();
        com.amazon.aps.iva.yb0.j.f(v0Var, "playerState");
        com.amazon.aps.iva.yb0.j.f(fVar, "loadErrorHandler");
        return new com.amazon.aps.iva.ck.e(v0Var, i, fVar);
    }
}
