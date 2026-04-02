package com.kwad.components.ad.f.b;

import android.view.View;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class i extends com.kwad.components.ad.f.a.a implements View.OnClickListener {
    private DetailVideoView mDetailVideoView;

    private void eT() {
        com.kwad.components.core.e.d.a.a(new a.C0197a(this.mDetailVideoView.getContext()).S(this.mZ.mAdTemplate).b(this.mZ.mApkDownloadHelper).a(new a.b() { // from class: com.kwad.components.ad.f.b.i.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                com.kwad.sdk.core.report.a.a(i.this.mZ.mAdTemplate, 2, i.this.mZ.mU.getTouchCoords());
            }
        }));
    }

    private void notifyAdClick() {
        this.mZ.mI.l(this.mDetailVideoView);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.i.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                super.onMediaPlayStart();
                i.this.mDetailVideoView.setOnClickListener(i.this);
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.mDetailVideoView) {
            eT();
            notifyAdClick();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.mDetailVideoView = (DetailVideoView) findViewById(R.id.ksad_video_player);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.mDetailVideoView.setOnClickListener(null);
    }
}
