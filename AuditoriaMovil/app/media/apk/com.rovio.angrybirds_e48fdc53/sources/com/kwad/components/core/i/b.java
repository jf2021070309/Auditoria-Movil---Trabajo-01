package com.kwad.components.core.i;

import com.kwad.sdk.api.KsInnerAd;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
final class b implements KsInnerAd {
    private final int KX;
    private final AdTemplate mAdTemplate;

    public b(AdTemplate adTemplate, int i) {
        this.mAdTemplate = adTemplate;
        this.KX = i;
    }

    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.KsInnerAd
    public final int getType() {
        return this.KX;
    }
}
