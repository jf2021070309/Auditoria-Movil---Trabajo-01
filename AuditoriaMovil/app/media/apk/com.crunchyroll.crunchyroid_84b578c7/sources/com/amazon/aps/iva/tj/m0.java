package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class m0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Long> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Long invoke() {
        long j;
        com.amazon.aps.iva.a6.m0 m0Var = this.h.p;
        if (m0Var != null) {
            j = m0Var.a();
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
