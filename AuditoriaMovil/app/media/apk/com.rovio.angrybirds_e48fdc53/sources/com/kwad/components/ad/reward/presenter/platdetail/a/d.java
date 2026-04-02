package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.view.View;
import android.widget.ImageView;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.h;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private ImageView gI;
    private h.a gJ = new h.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.1
        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeOccupied() {
            if (d.this.gI == null || com.kwad.components.ad.reward.a.b.gH()) {
                return;
            }
            d.this.gI.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.gI.setSelected(false);
                    d.this.qB.oZ.setAudioEnabled(false, false);
                }
            });
        }

        @Override // com.kwad.sdk.utils.h.a
        public final void onAudioBeReleased() {
        }
    };
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.d.2
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", d.this.qB.mAdTemplate).equals(str)) {
                d.this.bV();
            }
        }
    };
    private AdTemplate mAdTemplate;
    private ImageView vu;

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.gI.setVisibility(com.kwad.components.ad.reward.j.v(adTemplate) ? 8 : 0);
        this.vu.setVisibility(com.kwad.components.ad.reward.j.v(this.mAdTemplate) ? 0 : 8);
        KsVideoPlayConfig ksVideoPlayConfig = this.qB.mVideoPlayConfig;
        boolean z = true;
        if (!this.qB.oY && com.kwad.components.core.t.a.ak(getContext()).qj()) {
            this.vu.setSelected(true);
            this.qB.c(false, false);
            z = false;
        } else if (ksVideoPlayConfig != null) {
            z = ksVideoPlayConfig.isVideoSoundEnable();
            this.vu.setSelected(ksVideoPlayConfig.isVideoSoundEnable());
            this.qB.c(ksVideoPlayConfig.isVideoSoundEnable(), ksVideoPlayConfig.isVideoSoundEnable());
        } else {
            this.vu.setSelected(true);
            this.qB.c(true, true);
        }
        this.gI.setSelected(z);
        this.qB.oZ.setAudioEnabled(z, false);
        this.qB.oZ.a(this.gJ);
    }

    private void ix() {
        this.gI.setOnClickListener(this);
        this.vu.setOnClickListener(this);
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else if (!hz()) {
            bV();
        } else {
            this.gI.setVisibility(8);
            this.vu.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.gI) {
            this.qB.oZ.setAudioEnabled(!this.gI.isSelected(), true);
            ImageView imageView = this.gI;
            imageView.setSelected(!imageView.isSelected());
        } else if (view == this.vu) {
            this.qB.oZ.setAudioEnabled(!this.vu.isSelected(), true);
            ImageView imageView2 = this.vu;
            imageView2.setSelected(!imageView2.isSelected());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.gI = (ImageView) findViewById(R.id.ksad_video_sound_switch);
        this.vu = (ImageView) findViewById(R.id.ksad_reward_deep_task_sound_switch);
        ix();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.oZ.b(this.gJ);
    }
}
