package com.kwad.components.ad.reward.presenter.d;

import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.presenter.d.a.c;
import com.kwad.components.ad.reward.presenter.r;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a {
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends com.kwad.components.ad.reward.presenter.b {
        public a(AdInfo adInfo) {
            super(adInfo);
        }

        @Override // com.kwad.components.ad.reward.presenter.b
        public final int hA() {
            return R.id.ksad_blur_end_cover;
        }

        @Override // com.kwad.components.ad.reward.presenter.b
        public final int hB() {
            return 8;
        }
    }

    public b(AdTemplate adTemplate, boolean z) {
        this.mAdTemplate = adTemplate;
        this.mAdInfo = d.ck(adTemplate);
        if (z) {
            iA();
        } else {
            iB();
        }
    }

    private void iA() {
        if (j.g(this.mAdInfo)) {
            a(new r());
        }
        a(new com.kwad.components.ad.reward.presenter.d.a.b());
        if (com.kwad.sdk.core.response.b.b.bo(this.mAdTemplate)) {
            a(new c());
        }
        a(new a(this.mAdInfo));
        if (com.kwad.components.ad.reward.a.b.k(this.mAdInfo) || !com.kwad.sdk.core.response.b.a.ak(this.mAdInfo)) {
            return;
        }
        a(new com.kwad.components.ad.reward.presenter.d.a.a());
    }

    private void iB() {
        a(new com.kwad.components.ad.reward.presenter.d.a.b());
        if (com.kwad.sdk.core.response.b.b.bo(this.mAdTemplate)) {
            a(new c());
        }
        if (com.kwad.sdk.core.response.b.a.am(this.mAdInfo)) {
            a(new com.kwad.components.ad.reward.presenter.d.a.a());
        }
    }
}
