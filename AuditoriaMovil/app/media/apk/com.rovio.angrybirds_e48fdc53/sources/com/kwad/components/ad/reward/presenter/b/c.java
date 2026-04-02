package com.kwad.components.ad.reward.presenter.b;

import android.view.View;
import com.kwad.components.ad.reward.m.o;
import com.kwad.components.ad.reward.m.r;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private RewardActionBarControl pc;
    private l sw = new l() { // from class: com.kwad.components.ad.reward.presenter.b.c.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            c.this.hE();
        }
    };
    private o tU;

    /* JADX INFO: Access modifiers changed from: private */
    public void hE() {
        this.pc.P(false);
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(RewardActionBarControl.ShowActionBarResult showActionBarResult, View view) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.pc = this.qB.pc;
        this.qB.oZ.a(this.sw);
        AdTemplate adTemplate = this.qB.mAdTemplate;
        AdInfo ck = d.ck(adTemplate);
        if (com.kwad.sdk.core.response.b.a.cw(ck)) {
            if (this.tU == null) {
                this.tU = new o(this.qB);
            }
            this.tU.a(this.qB.mRootContainer, com.kwad.sdk.core.response.b.a.aX(ck));
            this.tU.b(r.E(adTemplate));
            findViewById(R.id.ksad_reward_origin_live_root).setVisibility(8);
        }
        this.qB.pc.a(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.sw);
        this.qB.pc.b(this);
        o oVar = this.tU;
        if (oVar != null) {
            oVar.onUnbind();
        }
    }
}
