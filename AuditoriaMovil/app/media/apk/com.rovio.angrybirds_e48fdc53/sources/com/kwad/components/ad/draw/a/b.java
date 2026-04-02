package com.kwad.components.ad.draw.a;

import com.kwad.components.core.e.d.c;
import com.kwad.sdk.api.KsDrawAd;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
/* loaded from: classes.dex */
public final class b extends com.kwad.sdk.mvp.a {
    public KsDrawAd.AdInteractionListener bD;
    public com.kwad.components.ad.draw.c.a bF;
    public com.kwad.components.ad.draw.b.b.a bX;
    public com.kwad.components.ad.k.b bY;
    public c mApkDownloadHelper;
    public AdBaseFrameLayout mRootContainer;

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.clear();
        }
        this.bF.release();
    }
}
