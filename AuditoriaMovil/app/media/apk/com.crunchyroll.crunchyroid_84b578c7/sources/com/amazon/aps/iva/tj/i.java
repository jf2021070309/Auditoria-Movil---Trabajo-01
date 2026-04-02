package com.amazon.aps.iva.tj;

import android.view.ViewGroup;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public i(com.amazon.aps.iva.fj.f fVar) {
        super(0, fVar, ExoplayerComponent.class, "onSkipNext", "onSkipNext()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        ViewGroup adViewGroup;
        ExoplayerComponent exoplayerComponent = (ExoplayerComponent) this.receiver;
        ExoplayerComponent.a aVar = exoplayerComponent.j;
        if (aVar != null) {
            boolean z = aVar.a.f;
            com.amazon.aps.iva.rj.b bVar = exoplayerComponent.r;
            if (bVar != null) {
                androidx.media3.ui.d dVar = bVar.l;
                if (dVar != null && (adViewGroup = dVar.getAdViewGroup()) != null) {
                    adViewGroup.removeAllViews();
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("adsHelper");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("playerConfig");
        throw null;
    }
}
