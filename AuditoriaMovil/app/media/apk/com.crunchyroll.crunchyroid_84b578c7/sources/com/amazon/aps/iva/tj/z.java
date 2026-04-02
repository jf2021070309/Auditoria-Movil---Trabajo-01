package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        com.amazon.aps.iva.a6.m0 m0Var = this.h.p;
        if (m0Var != null) {
            m0Var.g();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
