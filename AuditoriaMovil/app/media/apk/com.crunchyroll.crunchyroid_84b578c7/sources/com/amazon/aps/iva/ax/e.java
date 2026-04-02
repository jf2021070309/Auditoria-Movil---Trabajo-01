package com.amazon.aps.iva.ax;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CastFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e implements ChromecastMaturePreferenceInteractor, com.amazon.aps.iva.d20.a {
    public final /* synthetic */ com.amazon.aps.iva.d20.a b;

    public e(f fVar) {
        this.b = fVar.k;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
        this.b.cancelRunningApiCalls();
    }

    @Override // com.ellation.crunchyroll.cast.expanded.ChromecastMaturePreferenceInteractor, com.amazon.aps.iva.d20.a
    public final Object enableMatureContent(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return this.b.enableMatureContent(playableAsset, dVar);
    }

    @Override // com.amazon.aps.iva.d20.a
    public final void k0(PlayableAsset playableAsset, com.amazon.aps.iva.d20.e eVar, com.amazon.aps.iva.d20.f fVar, com.amazon.aps.iva.d20.g gVar) {
        j.f(playableAsset, "asset");
        this.b.k0(playableAsset, eVar, fVar, gVar);
    }
}
