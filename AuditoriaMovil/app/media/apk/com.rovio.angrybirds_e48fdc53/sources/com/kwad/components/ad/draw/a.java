package com.kwad.components.ad.draw;

import android.content.Context;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.components.d implements com.kwad.components.ad.b.b {
    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return com.kwad.components.ad.b.b.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.ad.b.b
    public final void loadDrawAd(KsScene ksScene, KsLoadManager.DrawAdListener drawAdListener) {
        d.loadDrawAd(ksScene, drawAdListener);
    }
}
