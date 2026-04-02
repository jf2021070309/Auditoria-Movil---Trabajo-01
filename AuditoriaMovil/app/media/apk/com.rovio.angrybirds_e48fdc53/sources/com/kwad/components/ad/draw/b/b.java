package com.kwad.components.ad.draw.b;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.draw.a.a {
    private ImageView ca;
    private com.kwad.sdk.core.response.model.b cb;
    private k mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.draw.b.b.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            super.onMediaPlaying();
            if (b.this.ca.getVisibility() == 0) {
                b.this.ca.setVisibility(8);
            }
        }
    };
    private Runnable cc = new Runnable() { // from class: com.kwad.components.ad.draw.b.b.2
        @Override // java.lang.Runnable
        public final void run() {
            int width = b.this.getRootView().getWidth();
            ViewGroup.LayoutParams layoutParams = b.this.ca.getLayoutParams();
            int width2 = b.this.cb.getWidth();
            int height = b.this.cb.getHeight();
            if (width2 == 0 || height == 0 || height > width2) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                b.this.ca.setLayoutParams(layoutParams);
            } else {
                layoutParams.width = width;
                layoutParams.height = (int) ((height / (width2 * 1.0f)) * width);
                b.this.ca.setLayoutParams(layoutParams);
                b.this.ca.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            b.this.ca.setImageDrawable(null);
            KSImageLoader.loadImage(b.this.ca, b.this.cb.getUrl(), b.this.bE.mAdTemplate);
        }
    };

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.response.model.b bi = com.kwad.sdk.core.response.b.a.bi(com.kwad.sdk.core.response.b.d.ck(this.bE.mAdTemplate));
        this.cb = bi;
        if (TextUtils.isEmpty(bi.getUrl())) {
            return;
        }
        getRootView().post(this.cc);
        this.ca.setVisibility(0);
        this.bE.bF.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ca = (ImageView) findViewById(R.id.ksad_video_first_frame);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        getRootView().removeCallbacks(this.cc);
        this.bE.bF.a(this.mVideoPlayStateListener);
    }
}
