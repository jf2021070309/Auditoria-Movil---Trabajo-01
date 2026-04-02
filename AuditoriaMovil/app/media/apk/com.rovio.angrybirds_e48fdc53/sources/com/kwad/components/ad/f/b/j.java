package com.kwad.components.ad.f.b;

import android.view.View;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class j extends com.kwad.components.ad.f.a.a {
    private View nw;

    /* JADX INFO: Access modifiers changed from: private */
    public void eU() {
        if (this.nw.getVisibility() == 0) {
            return;
        }
        this.nw.setVisibility(0);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.nw.setVisibility(8);
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.j.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayError(int i, int i2) {
                j.this.eU();
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.nw = findViewById(R.id.ksad_video_error_container);
    }
}
