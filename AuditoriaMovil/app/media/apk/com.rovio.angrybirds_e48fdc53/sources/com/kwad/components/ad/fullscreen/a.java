package com.kwad.components.ad.fullscreen;

import android.content.Context;
import com.kwad.components.ad.b.g;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.components.d implements com.kwad.components.ad.b.d {
    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return com.kwad.components.ad.b.d.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.ad.b.d
    public final void loadFullScreenVideoAd(KsScene ksScene, KsLoadManager.FullScreenVideoAdListener fullScreenVideoAdListener) {
        d.loadFullScreenVideoAd(ksScene, fullScreenVideoAdListener);
    }

    @Override // com.kwad.sdk.components.d, com.kwad.sdk.components.a
    public final int priority() {
        com.kwad.sdk.components.a f = com.kwad.sdk.components.c.f(g.class);
        if (f != null) {
            return f.priority() + 1;
        }
        return 1;
    }
}
