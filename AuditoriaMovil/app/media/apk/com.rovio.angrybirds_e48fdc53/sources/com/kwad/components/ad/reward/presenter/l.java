package com.kwad.components.ad.reward.presenter;

import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class l extends a {
    private long gB;
    private com.kwad.components.ad.reward.e.b mAdOpenInteractionListener;
    private com.kwad.components.core.video.l sv;
    private com.kwad.components.core.video.l sw = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.l.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            if (l.this.qB.pn && l.this.qB.ps) {
                l.this.mAdOpenInteractionListener.onVideoSkipToEnd(l.this.gB);
            } else {
                l.this.qB.pK = true;
                l.this.mAdOpenInteractionListener.onVideoPlayEnd();
            }
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(l.this.qB.mAdTemplate);
            if (com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.sdk.core.response.b.a.aF(ck) == 1) {
                return;
            }
            e.v(l.this.qB);
            if (l.this.qB.pK) {
                com.kwad.components.ad.reward.m.m(l.this.qB);
            }
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            l.this.qB.pJ = j2;
            if (l.this.qB.ps) {
                return;
            }
            l.this.gB = j2;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            l.this.mAdOpenInteractionListener.onVideoPlayStart();
            l.this.qB.pK = false;
        }
    };
    private final com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.l.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            if (l.this.qB.ps) {
                l.this.mAdOpenInteractionListener.onVideoSkipToEnd(l.this.gB);
            } else {
                l.this.mAdOpenInteractionListener.onVideoPlayEnd();
            }
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(l.this.qB.mAdTemplate);
            if (com.kwad.sdk.core.response.b.a.aG(ck) && com.kwad.sdk.core.response.b.a.aF(ck) == 1) {
                return;
            }
            e.v(l.this.qB);
            if (l.this.qB.pK) {
                com.kwad.components.ad.reward.m.m(l.this.qB);
            }
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            l.this.mAdOpenInteractionListener.onVideoPlayError(i, i2);
            l.this.hy();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            l.this.qB.pJ = j2;
            l.this.qB.pK = j - j2 < 800;
            if (l.this.qB.ps) {
                return;
            }
            l.this.gB = j2;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            l.this.mAdOpenInteractionListener.onVideoPlayStart();
        }
    };

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.pJ = 0L;
        this.qB.pK = false;
        this.mAdOpenInteractionListener = this.qB.mAdOpenInteractionListener;
        this.sv = this.qB.oZ.jT() ? this.sw : this.mVideoPlayStateListener;
        this.qB.oZ.a(this.sv);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.oZ.b(this.sv);
    }
}
