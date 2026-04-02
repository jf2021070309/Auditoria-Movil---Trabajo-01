package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.bk.a> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.bk.a invoke() {
        int i = com.amazon.aps.iva.bk.a.a;
        com.amazon.aps.iva.rj.b bVar = this.h.r;
        if (bVar != null) {
            return new com.amazon.aps.iva.bk.b(bVar);
        }
        com.amazon.aps.iva.yb0.j.m("adsHelper");
        throw null;
    }
}
