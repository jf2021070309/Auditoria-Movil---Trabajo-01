package com.kwad.components.ad.draw.b.c;

import com.kwad.components.ad.draw.view.playend.DrawVideoTailFrame;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.draw.a.a {
    private com.kwad.components.ad.k.b bY;
    private DrawVideoTailFrame cO;
    private k mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.draw.b.c.a.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            if (a.this.bY == null || !a.this.bY.ap()) {
                a.this.aG();
            } else {
                a.this.cO.setVisibility(8);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        this.cO.aP();
        this.cO.setVisibility(0);
    }

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.bY = this.bE.bY;
        this.cO.b(this.bE.mAdTemplate);
        this.cO.setAdBaseFrameLayout(this.bE.mRootContainer);
        this.cO.setApkDownloadHelper(this.bE.mApkDownloadHelper);
        this.cO.setVisibility(8);
        this.cO.setAdInteractionListener(this.bE.bD);
        this.bE.bF.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cO = (DrawVideoTailFrame) findViewById(R.id.ksad_video_tail_frame);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.bE.bF.a(this.mVideoPlayStateListener);
        this.cO.release();
    }
}
