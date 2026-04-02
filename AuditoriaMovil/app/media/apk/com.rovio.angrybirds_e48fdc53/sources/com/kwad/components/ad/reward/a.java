package com.kwad.components.ad.reward;

import android.content.Context;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.components.d implements com.kwad.components.ad.b.g {
    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return com.kwad.components.ad.b.g.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.ad.b.g
    public final void loadRewardVideoAd(KsScene ksScene, KsLoadManager.RewardVideoAdListener rewardVideoAdListener) {
        e.loadRewardVideoAd(ksScene, rewardVideoAdListener);
    }

    @Override // com.kwad.components.ad.b.g
    public final void notifyRewardVerify() {
        c.fv().notifyRewardVerify();
    }
}
