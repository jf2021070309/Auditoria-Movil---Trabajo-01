package com.amazon.aps.iva.tj;

import android.view.ViewGroup;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: ExoplayerComponent.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public k(com.amazon.aps.iva.fj.f fVar) {
        super(0, fVar, ExoplayerComponent.class, "onClearPlaylist", "onClearPlaylist()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        ViewGroup adViewGroup;
        ExoplayerComponent exoplayerComponent = (ExoplayerComponent) this.receiver;
        com.amazon.aps.iva.rj.b bVar = exoplayerComponent.r;
        if (bVar != null) {
            androidx.media3.ui.d dVar = bVar.l;
            if (dVar != null && (adViewGroup = dVar.getAdViewGroup()) != null) {
                adViewGroup.removeAllViews();
            }
            defpackage.i.C(exoplayerComponent.A, q.h);
            defpackage.i.C(exoplayerComponent.B, r.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("adsHelper");
        throw null;
    }
}
