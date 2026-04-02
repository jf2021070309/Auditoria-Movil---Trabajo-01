package com.kwad.components.ad.reward.presenter;

import com.kwad.components.core.i.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends a implements a.InterfaceC0202a {
    private AdTemplate mAdTemplate;

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mAdTemplate = this.qB.mAdTemplate;
        boolean AW = com.kwad.sdk.core.d.a.AW();
        com.kwad.sdk.core.e.c.d("RewardInnerAdLoadPresenter", "onBind localCheckResult: " + AW);
        if (this.mAdTemplate.mAdScene == null || !AW) {
            return;
        }
        com.kwad.components.core.i.a.a(this.mAdTemplate.mAdScene, this);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void c(List<com.kwad.components.core.i.c> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.kwad.sdk.core.e.c.d("RewardInnerAdLoadPresenter", "onInnerAdLoad: " + list.size());
        AdTemplate adTemplate = list.get(0).getAdTemplate();
        boolean bj = com.kwad.sdk.core.response.b.b.bj(adTemplate);
        List<a.InterfaceC0202a> ga = this.qB.ga();
        if (bj) {
            com.kwad.sdk.core.d.a.f(com.kwad.sdk.core.response.b.b.bg(adTemplate), com.kwad.sdk.core.response.b.b.bh(adTemplate));
            if (ga != null) {
                for (a.InterfaceC0202a interfaceC0202a : ga) {
                    interfaceC0202a.c(list);
                }
            }
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onError(int i, String str) {
        List<a.InterfaceC0202a> ga = this.qB.ga();
        if (ga != null) {
            for (a.InterfaceC0202a interfaceC0202a : ga) {
                interfaceC0202a.onError(i, str);
            }
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onRequestResult(int i) {
        List<a.InterfaceC0202a> ga = this.qB.ga();
        if (ga != null) {
            for (a.InterfaceC0202a interfaceC0202a : ga) {
                interfaceC0202a.onRequestResult(i);
            }
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
