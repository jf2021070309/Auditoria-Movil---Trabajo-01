package com.amazon.aps.iva.cj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: PlayerImpl.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.uj.a> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(0);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.uj.a invoke() {
        s sVar = this.h;
        if (com.amazon.aps.iva.yb0.j.a(sVar.q.d(), Boolean.TRUE)) {
            ExoplayerComponent exoplayerComponent = sVar.k;
            com.amazon.aps.iva.yb0.j.c(exoplayerComponent);
            return exoplayerComponent.l();
        }
        return com.amazon.aps.iva.hj.b.a;
    }
}
