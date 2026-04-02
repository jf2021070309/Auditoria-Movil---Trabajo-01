package com.kwad.components.ad.reward.presenter.d.a;

import android.widget.FrameLayout;
import com.kwad.components.ad.k.b;
import com.kwad.components.ad.reward.e.j;
import com.kwad.components.ad.reward.l;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements b.a {
    private com.kwad.components.ad.k.b bY;
    private FrameLayout cQ;
    private DetailVideoView mDetailVideoView;
    private int th = Integer.MIN_VALUE;
    private final j mRewardVerifyListener = new j() { // from class: com.kwad.components.ad.reward.presenter.d.a.c.1
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (c.this.bY == null || !com.kwad.components.ad.reward.j.v(c.this.qB.mAdTemplate)) {
                return;
            }
            c.this.bY.ah(true);
        }
    };
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.d.a.c.2
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            c.this.qB.mAdOpenInteractionListener.bF();
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.qB.mAdTemplate;
        l lVar = this.qB.pd;
        this.bY = lVar;
        if (lVar == null) {
            return;
        }
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.bY.a(this.cH);
        this.bY.a(this.cQ, this.qB.mRootContainer, adTemplate, this.qB.mApkDownloadHelper, this.qB.mScreenOrientation);
        this.bY.a((b.InterfaceC0162b) null);
        com.kwad.components.ad.k.b bVar = this.bY;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // com.kwad.components.ad.k.b.a
    public final void iI() {
        hy();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cQ = (FrameLayout) findViewById(R.id.ksad_web_card_container);
        this.mDetailVideoView = (DetailVideoView) findViewById(R.id.ksad_video_player);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        int i;
        super.onUnbind();
        com.kwad.components.ad.k.b bVar = this.bY;
        if (bVar != null) {
            bVar.lZ();
            this.bY.lM();
        }
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
        DetailVideoView detailVideoView = this.mDetailVideoView;
        if (detailVideoView == null || (i = this.th) == Integer.MIN_VALUE) {
            return;
        }
        com.kwad.sdk.d.a.a.n(detailVideoView, i);
    }
}
