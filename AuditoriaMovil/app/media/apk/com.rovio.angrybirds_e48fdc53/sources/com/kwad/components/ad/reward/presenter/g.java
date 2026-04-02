package com.kwad.components.ad.reward.presenter;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class g extends a implements com.kwad.sdk.b.a {
    private AdInfo mAdInfo;

    @Override // com.kwad.sdk.b.a
    public final void S(String str) {
        if (TextUtils.equals(com.kwad.sdk.core.response.b.a.aq(this.mAdInfo), str)) {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
            if (com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.sdk.core.response.b.a.aF(ck) == 1) {
                return;
            }
            if (this.qB.mAdOpenInteractionListener != null) {
                this.qB.mAdOpenInteractionListener.onRewardVerify();
            }
            this.qB.oZ.pause();
            this.qB.fT();
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        com.kwad.sdk.b.b.yy().a(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.b.b.yy().b(this);
    }
}
