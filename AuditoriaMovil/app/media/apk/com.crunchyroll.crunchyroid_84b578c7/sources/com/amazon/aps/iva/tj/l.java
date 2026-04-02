package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ck.f> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ck.f invoke() {
        com.amazon.aps.iva.t6.j iVar;
        ExoplayerComponent.a aVar = this.h.j;
        if (aVar != null) {
            boolean z = aVar.b;
            com.amazon.aps.iva.ck.g gVar = aVar.c;
            com.amazon.aps.iva.yb0.j.f(gVar, "retrySkipper");
            if (z) {
                iVar = new com.amazon.aps.iva.ck.a(new com.amazon.aps.iva.t6.i(), gVar);
            } else {
                iVar = new com.amazon.aps.iva.t6.i();
            }
            return new com.amazon.aps.iva.ck.f(iVar);
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
