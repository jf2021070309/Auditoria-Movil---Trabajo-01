package com.amazon.aps.iva.tj;

import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public j(com.amazon.aps.iva.fj.f fVar) {
        super(0, fVar, ExoplayerComponent.class, "onSkippedNext", "onSkippedNext()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        ExoplayerComponent exoplayerComponent = (ExoplayerComponent) this.receiver;
        com.amazon.aps.iva.b8.q qVar = exoplayerComponent.m;
        if (qVar != null) {
            if (qVar.a().h() == 1) {
                com.amazon.aps.iva.b8.q qVar2 = exoplayerComponent.m;
                if (qVar2 != null) {
                    exoplayerComponent.r(qVar2.a().K0());
                } else {
                    com.amazon.aps.iva.yb0.j.m("mediaSession");
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("mediaSession");
        throw null;
    }
}
