package com.kwad.components.ad.reward.presenter;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.kwad.components.ad.reward.m.n;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class d extends a {
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;

    public d(AdTemplate adTemplate, AdInfo adInfo, ViewGroup viewGroup) {
        this.mAdInfo = adInfo;
        this.mAdTemplate = adTemplate;
        if (com.kwad.components.ad.reward.a.b.i(adInfo)) {
            final com.kwad.components.ad.reward.b.c cVar = new com.kwad.components.ad.reward.b.c();
            a(cVar);
            ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.ksad_reward_order_card);
            a(new com.kwad.components.ad.reward.presenter.platdetail.actionbar.e((ViewGroup) (viewStub != null ? viewStub.inflate() : viewGroup.findViewById(R.id.ksad_reward_order_root)), new n.a() { // from class: com.kwad.components.ad.reward.presenter.d.1
                @Override // com.kwad.components.ad.reward.m.n.a
                public final void hD() {
                    cVar.showDialog();
                }
            }));
        } else if (com.kwad.sdk.core.response.b.a.bM(adInfo) == 1) {
            ViewStub viewStub2 = (ViewStub) viewGroup.findViewById(R.id.ksad_reward_jinniu_card);
            a(new com.kwad.components.ad.reward.presenter.platdetail.actionbar.d((ViewGroup) (viewStub2 != null ? viewStub2.inflate() : viewGroup.findViewById(R.id.ksad_reward_jinniu_root))));
        }
    }
}
