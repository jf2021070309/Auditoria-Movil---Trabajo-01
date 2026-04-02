package com.kwad.components.ad.f.b;

import android.widget.ImageView;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
/* loaded from: classes.dex */
public final class g extends com.kwad.components.ad.f.a.a {
    private ImageView nq;

    /* JADX INFO: Access modifiers changed from: private */
    public void eS() {
        KSImageLoader.loadImage(this.nq, com.kwad.sdk.core.response.b.a.P(com.kwad.sdk.core.response.b.d.ck(this.mZ.mAdTemplate)), this.mZ.mAdTemplate);
        this.nq.setVisibility(0);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.g.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                g.this.eS();
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
        this.nq.setVisibility(8);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.nq = (ImageView) findViewById(R.id.ksad_video_cover_image);
    }
}
