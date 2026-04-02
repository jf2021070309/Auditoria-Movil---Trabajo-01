package com.kwad.components.ad.f.b;

import android.text.TextUtils;
import android.widget.ImageView;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.f.a.a {
    private ImageView ca;
    private com.kwad.sdk.core.response.model.b cb;
    private Runnable cc = new Runnable() { // from class: com.kwad.components.ad.f.b.b.2
        @Override // java.lang.Runnable
        public final void run() {
            com.kwad.sdk.d.a.a.d(b.this.ca, b.this.cb.getWidth(), b.this.cb.getHeight());
            b.this.ca.setImageDrawable(null);
            KSImageLoader.loadImage(b.this.ca, b.this.cb.getUrl(), b.this.mZ.mAdTemplate);
        }
    };

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.response.model.b bi = com.kwad.sdk.core.response.b.a.bi(com.kwad.sdk.core.response.b.d.ck(this.mZ.mAdTemplate));
        this.cb = bi;
        if (TextUtils.isEmpty(bi.getUrl())) {
            return;
        }
        getRootView().post(this.cc);
        this.ca.setVisibility(0);
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.b.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                super.onMediaPlaying();
                if (b.this.ca.getVisibility() == 0) {
                    b.this.ca.setVisibility(8);
                }
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ca = (ImageView) findViewById(R.id.ksad_video_first_frame);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        getRootView().removeCallbacks(this.cc);
    }
}
