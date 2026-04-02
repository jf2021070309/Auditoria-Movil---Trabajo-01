package com.kwad.components.ad.draw.b;

import android.widget.TextView;
import com.kwad.components.core.video.k;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ag;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.draw.a.a {
    private TextView cp;
    private k mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.draw.b.d.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            d.this.cp.setVisibility(0);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            d.this.cp.setVisibility(8);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            d.this.cp.setVisibility(8);
        }
    };

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        TextView textView;
        int i;
        super.ah();
        if (ag.isNetworkConnected(getContext())) {
            textView = this.cp;
            i = 8;
        } else {
            textView = this.cp;
            i = 0;
        }
        textView.setVisibility(i);
        this.bE.bF.b(this.mVideoPlayStateListener);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cp = (TextView) findViewById(R.id.ksad_video_fail_tip);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.bE.bF.a(this.mVideoPlayStateListener);
    }
}
