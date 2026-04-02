package com.amazon.aps.iva.fp;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.ve0.k0;
import com.amazon.aps.iva.ve0.u0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenMatureFlowViewModel.kt */
/* loaded from: classes2.dex */
public interface d {
    u0<Boolean> getMatureFlowProcessing();

    k0<g<PlayableAsset>> getMatureFlowStatus();

    void onEnableMatureContent(PlayableAsset playableAsset);
}
