package com.kwad.components.ad.f.a;

import com.kwad.components.ad.f.d;
import com.kwad.components.core.e.d.c;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.core.view.AdBasePvFrameLayout;
/* loaded from: classes.dex */
public final class b extends com.kwad.sdk.mvp.a {
    public c mApkDownloadHelper;
    public KsNativeAd.VideoPlayListener mD;
    public d.a mI;
    public AdBasePvFrameLayout mU;
    public com.kwad.components.ad.f.c.a na;

    @Override // com.kwad.sdk.mvp.a
    public final void release() {
        c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.clear();
        }
        this.na.release();
    }
}
