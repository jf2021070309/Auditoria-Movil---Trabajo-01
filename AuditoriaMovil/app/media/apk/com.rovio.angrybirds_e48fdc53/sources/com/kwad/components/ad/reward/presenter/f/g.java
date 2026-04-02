package com.kwad.components.ad.reward.presenter.f;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.sdk.R;
import com.kwad.sdk.components.l;
import com.kwad.sdk.utils.be;
/* loaded from: classes.dex */
public final class g extends d implements RewardActionBarControl.d {
    private FrameLayout lv;
    private int wO = 0;
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.f.g.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            g.this.hide();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void hide() {
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new com.kwad.components.ad.reward.c.f(new com.kwad.components.ad.reward.c.d() { // from class: com.kwad.components.ad.reward.presenter.f.g.2
            @Override // com.kwad.components.ad.reward.c.d
            public final void a(com.kwad.components.ad.reward.c.b bVar2) {
                com.kwad.sdk.core.e.c.d("TkRewardActionBarPresenter", "onUpdateExtraReward : " + bVar2.hb());
                g.this.a(bVar2);
            }
        }));
        lVar.c(new com.kwad.components.core.webview.jshandler.f(new com.kwad.components.core.webview.jshandler.j() { // from class: com.kwad.components.ad.reward.presenter.f.g.3
            @Override // com.kwad.components.core.webview.jshandler.j
            public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
                if (TextUtils.equals(str, "getExtraReward")) {
                    fVar.a(com.kwad.components.ad.reward.c.a.gY().gZ());
                    com.kwad.components.ad.reward.c.a.gY().a(fVar);
                }
            }
        }));
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (ce()) {
            this.wO = this.lv.getVisibility();
            getRootView().findViewById(R.id.ksad_video_play_bar_h5).setVisibility(8);
            this.qB.b(this.mPlayEndPageListener);
            this.qB.pc.a(this);
        }
    }

    @Override // com.kwad.components.core.webview.b.i
    public final void b(w.a aVar) {
        float aJ = com.kwad.sdk.d.a.a.aJ(getContext());
        aVar.width = (int) ((be.getScreenWidth(getContext()) / aJ) + 0.5f);
        aVar.height = (int) ((be.getScreenHeight(getContext()) / aJ) + 0.5f);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.components.core.webview.b.i
    public final void cd() {
        super.cd();
        this.lv.setVisibility(8);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d
    protected final boolean ce() {
        return com.kwad.components.ad.reward.j.d(this.qB) && !this.qB.oZ.jT();
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.d
    public final void f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
        this.lv.setVisibility(0);
        RewardActionBarControl.a(aVar, this.lv, RewardActionBarControl.ShowActionBarResult.TK);
    }

    @Override // com.kwad.components.core.webview.b.i
    public final FrameLayout getTKContainer() {
        return this.lv;
    }

    @Override // com.kwad.components.core.webview.b.i
    public final String getTkTemplateId() {
        return com.kwad.components.core.webview.b.j.b("ksad-video-bottom-card-v2", this.qB.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.lv = (FrameLayout) findViewById(R.id.ksad_js_bottom);
    }

    @Override // com.kwad.components.ad.reward.presenter.f.d, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (ce()) {
            this.qB.c(this.mPlayEndPageListener);
            this.lv.setVisibility(this.wO);
            this.qB.pc.a((RewardActionBarControl.d) null);
        }
    }
}
