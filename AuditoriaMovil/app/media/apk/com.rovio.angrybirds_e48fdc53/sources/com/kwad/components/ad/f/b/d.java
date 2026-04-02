package com.kwad.components.ad.f.b;

import android.view.View;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ag;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.f.a.a {
    private View nj;

    /* JADX INFO: Access modifiers changed from: private */
    public void eQ() {
        if (this.nj.getVisibility() != 0) {
            return;
        }
        this.nj.setVisibility(8);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (ag.isNetworkConnected(this.nj.getContext())) {
            this.nj.setVisibility(8);
            return;
        }
        this.nj.setVisibility(0);
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.d.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                super.onMediaPlayStart();
                d.this.eQ();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                super.onMediaPlaying();
                d.this.eQ();
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.nj = findViewById(R.id.ksad_video_network_unavailable);
    }
}
