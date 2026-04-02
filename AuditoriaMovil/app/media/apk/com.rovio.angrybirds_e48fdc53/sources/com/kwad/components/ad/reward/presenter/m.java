package com.kwad.components.ad.reward.presenter;

import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class m extends a {
    private com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.m.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            m.this.hG();
        }
    };
    private final com.kwad.components.ad.reward.e.k gf = new com.kwad.components.ad.reward.e.k() { // from class: com.kwad.components.ad.reward.presenter.m.3
        @Override // com.kwad.components.ad.reward.e.k
        public final void a(com.kwad.components.core.webview.b.b.q qVar) {
            if (qVar == null || qVar.type != 1) {
                return;
            }
            m.this.qB.oZ.release();
            m.this.qB.fT();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void hG() {
        if (com.kwad.components.core.t.h.d(this.qB.mAdTemplate, this.qB.ps)) {
            com.kwad.components.core.t.h.f(this.qB.mContext, this.qB.mAdTemplate);
        }
        if (h.A(this.qB) || com.kwad.components.core.t.h.d(this.qB.mAdTemplate, this.qB.ps)) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.qB.fT();
                }
            }, 200L);
        } else {
            this.qB.fT();
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.oZ.a(this.mVideoPlayStateListener);
        com.kwad.components.ad.reward.d.fy().a(this.gf);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        com.kwad.components.ad.reward.d.fy().b(this.gf);
    }
}
