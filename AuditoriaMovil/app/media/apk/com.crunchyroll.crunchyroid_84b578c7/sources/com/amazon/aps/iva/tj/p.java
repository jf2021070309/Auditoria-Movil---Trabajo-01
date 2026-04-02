package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.ve0.u0;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.lk.a> {
    public final /* synthetic */ ExoplayerComponent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ExoplayerComponent exoplayerComponent) {
        super(0);
        this.h = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.lk.a invoke() {
        ExoplayerComponent exoplayerComponent = this.h;
        ExoplayerComponent.a aVar = exoplayerComponent.j;
        if (aVar != null) {
            com.amazon.aps.iva.mk.a aVar2 = aVar.e;
            u0<com.amazon.aps.iva.nk.j> o = exoplayerComponent.o();
            if (aVar2 == null) {
                return com.amazon.aps.iva.lk.g.a;
            }
            return new com.amazon.aps.iva.lk.b(aVar2, (com.amazon.aps.iva.ve0.i0) o);
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
