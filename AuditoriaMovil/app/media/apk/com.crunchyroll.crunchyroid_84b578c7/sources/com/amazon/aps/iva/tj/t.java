package com.amazon.aps.iva.tj;

import com.amazon.aps.iva.pj.d;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
    public final /* synthetic */ ExoplayerComponent h;
    public final /* synthetic */ d.h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ExoplayerComponent exoplayerComponent, d.h hVar) {
        super(1);
        this.h = exoplayerComponent;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
        com.amazon.aps.iva.nk.j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
        if (((com.amazon.aps.iva.nk.j) ((com.amazon.aps.iva.ve0.i0) this.h.o()).getValue()).g != com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE) {
            jVar2.n = com.amazon.aps.iva.hc.m.i();
        }
        com.amazon.aps.iva.kk.c cVar = jVar2.h;
        d.h hVar = this.i;
        return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, com.amazon.aps.iva.kk.c.a(cVar, null, hVar.c, hVar.a, hVar.e, hVar.f, 0L, 268189695), 0, null, null, null, null, null, null, hVar.g, null, false, hVar.h, hVar.n, 917375);
    }
}
