package com.amazon.aps.iva.hl;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: RestrictionOverlayProvider.kt */
/* loaded from: classes2.dex */
public final class d0 implements com.amazon.aps.iva.af.a {
    public final /* synthetic */ k0 b;

    public d0(k0 k0Var) {
        this.b = k0Var;
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastMetadataUpdated(PlayableAsset playableAsset, long j) {
        k0 k0Var = this.b;
        if (k0Var.d.isTryingToCast() && playableAsset != null) {
            k0Var.e.setValue(k0Var.c.b(playableAsset));
            k0Var.f.setValue(playableAsset.getThumbnails());
        }
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStarted() {
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStarting() {
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onCastSessionStopped(Long l) {
    }

    @Override // com.amazon.aps.iva.af.a
    public final void onConnectedToCast(com.amazon.aps.iva.ye.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "session");
    }
}
