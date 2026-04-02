package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, String, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.q5.l0 h;
    public final /* synthetic */ ExoplayerComponent i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.q5.l0 l0Var, ExoplayerComponent exoplayerComponent) {
        super(2);
        this.h = l0Var;
        this.i = exoplayerComponent;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(Integer num, String str) {
        this.h.stop();
        ExoplayerComponent exoplayerComponent = this.i;
        exoplayerComponent.m().b(new com.amazon.aps.iva.dk.e(num, str, ((com.amazon.aps.iva.nk.j) exoplayerComponent.k.getValue()).v));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
