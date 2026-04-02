package com.kwad.components.ad.fullscreen.c.a;

import android.view.View;
import android.widget.ImageView;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.utils.h;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private ImageView gI;
    private h.a gJ = new h.a() { // from class: com.kwad.components.ad.fullscreen.c.a.c.1
        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeOccupied() {
            if (c.this.gI == null || com.kwad.components.ad.reward.a.b.gH()) {
                return;
            }
            c.this.gI.post(new Runnable() { // from class: com.kwad.components.ad.fullscreen.c.a.c.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.gI.setSelected(false);
                    c.this.qB.oZ.setAudioEnabled(false, false);
                }
            });
        }

        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeReleased() {
        }
    };
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.fullscreen.c.a.c.2
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", c.this.qB.mAdTemplate).equals(str)) {
                c.this.bV();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        ImageView imageView;
        boolean z = false;
        this.gI.setVisibility(0);
        KsVideoPlayConfig ksVideoPlayConfig = this.qB.mVideoPlayConfig;
        if (!this.qB.oY && com.kwad.components.core.t.a.ak(getContext()).qj()) {
            imageView = this.gI;
        } else if (ksVideoPlayConfig != null) {
            this.gI.setSelected(ksVideoPlayConfig.isVideoSoundEnable());
            this.qB.c(ksVideoPlayConfig.isVideoSoundEnable(), ksVideoPlayConfig.isVideoSoundEnable());
            this.qB.oZ.a(this.gJ);
        } else {
            imageView = this.gI;
            z = true;
        }
        imageView.setSelected(z);
        this.qB.c(z, z);
        this.qB.oZ.a(this.gJ);
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.c(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.gI) {
            this.qB.oZ.setAudioEnabled(!this.gI.isSelected(), true);
            ImageView imageView = this.gI;
            imageView.setSelected(!imageView.isSelected());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        ImageView imageView = (ImageView) findViewById(R.id.ksad_video_sound_switch);
        this.gI = imageView;
        imageView.setOnClickListener(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.oZ.b(this.gJ);
    }
}
