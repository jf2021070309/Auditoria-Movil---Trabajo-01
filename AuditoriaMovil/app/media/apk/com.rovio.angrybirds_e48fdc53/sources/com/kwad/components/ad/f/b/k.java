package com.kwad.components.ad.f.b;

import android.widget.ProgressBar;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class k extends com.kwad.components.ad.f.a.a {
    private ProgressBar ny;

    /* JADX INFO: Access modifiers changed from: private */
    public void G(int i) {
        this.ny.setProgress(i);
        if (this.ny.getVisibility() == 0) {
            return;
        }
        this.ny.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eV() {
        if (this.ny.getVisibility() != 0) {
            return;
        }
        this.ny.setVisibility(8);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.ny.setProgress(0);
        this.ny.setVisibility(8);
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.k.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                k.this.eV();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                k.this.eV();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j, long j2) {
                k.this.G(j != 0 ? (int) ((((float) j2) * 100.0f) / ((float) j)) : 0);
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ny = (ProgressBar) findViewById(R.id.ksad_video_progress);
    }
}
