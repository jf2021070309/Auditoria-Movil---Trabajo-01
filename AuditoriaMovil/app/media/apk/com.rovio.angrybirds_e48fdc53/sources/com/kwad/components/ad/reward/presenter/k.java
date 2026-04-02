package com.kwad.components.ad.reward.presenter;

import android.view.View;
import com.kwad.components.ad.reward.m.g;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
/* loaded from: classes.dex */
public final class k extends a implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
    private RewardActionBarControl pc;
    private com.kwad.components.ad.reward.m.g sq;
    private KsLogoView ss;
    private com.kwad.components.ad.reward.m.l st;
    private boolean sr = false;
    private com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.k.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            k.this.hE();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void hE() {
        if (this.sr) {
            return;
        }
        com.kwad.components.ad.reward.m.g gVar = this.sq;
        if (gVar == null) {
            this.pc.P(false);
        } else {
            gVar.a(new g.a() { // from class: com.kwad.components.ad.reward.presenter.k.2
                @Override // com.kwad.components.ad.reward.m.g.a
                public final void hF() {
                    k.this.pc.P(true);
                }
            }, 500L);
        }
        this.sr = true;
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
    public final void a(RewardActionBarControl.ShowActionBarResult showActionBarResult, View view) {
        com.kwad.components.ad.reward.m.l lVar = this.st;
        if (lVar != null) {
            lVar.kg();
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.pc = this.qB.pc;
        this.qB.oZ.a(this.mVideoPlayStateListener);
        AdTemplate adTemplate = this.qB.mAdTemplate;
        boolean z = com.kwad.sdk.core.response.b.b.bP(adTemplate).displayWeakCard;
        this.qB.A(z);
        if (z) {
            if (this.sq == null) {
                this.sq = new com.kwad.components.ad.reward.m.g(this.qB);
            }
            this.sq.f((AdBaseFrameLayout) findViewById(R.id.ksad_root_container));
            this.sq.b(com.kwad.components.ad.reward.m.r.E(adTemplate));
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (com.kwad.sdk.core.response.b.a.aR(adTemplate)) {
            if (this.st == null) {
                this.st = new com.kwad.components.ad.reward.m.l(this.qB);
            }
            this.st.h(this.qB.mRootContainer);
            this.st.b(com.kwad.components.ad.reward.m.r.E(adTemplate));
            com.kwad.components.ad.reward.presenter.platdetail.actionbar.d.a(getContext(), ck, this.ss, R.dimen.ksad_live_subscribe_card_logo_margin_bottom, false);
        }
        this.qB.pc.a(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ss = (KsLogoView) findViewById(R.id.ksad_ad_label_play_bar);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.qB.pc.b(this);
        com.kwad.components.ad.reward.m.l lVar = this.st;
        if (lVar != null) {
            lVar.onUnbind();
        }
    }
}
