package com.kwad.components.ad.reward.presenter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.sdk.R;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class u extends a {
    private DetailVideoView tB;
    private ViewGroup tC;
    private FrameLayout tD;
    private ImageView tE;
    private ViewGroup.LayoutParams tF = null;
    private com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.u.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            u.this.tB.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.u.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    u.this.tB.setVisibility(0);
                }
            }, 200L);
        }
    };

    private void N(int i) {
        this.tD.addView(com.kwad.sdk.m.l.a(getContext(), i, this.tD, false), -1, -1);
    }

    private void hU() {
        DevelopMangerComponents developMangerComponents = (DevelopMangerComponents) com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
    }

    private void hV() {
        int i;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        getContext();
        boolean z = !ai.IK();
        boolean bv = com.kwad.sdk.core.response.b.a.bv(ck);
        boolean z2 = com.kwad.sdk.core.response.b.a.co(ck) && com.kwad.components.ad.reward.a.b.gR();
        boolean z3 = com.kwad.components.ad.reward.j.t(this.qB.mAdTemplate) || com.kwad.components.ad.reward.j.u(this.qB.mAdTemplate) || bv || z2;
        if (!z || !z3) {
            this.tC.setVisibility(8);
            return;
        }
        this.tC.setVisibility(z2 ? 4 : 0);
        if (bv) {
            this.tE.setVisibility(8);
            i = R.layout.ksad_playable_end_info;
        } else {
            i = R.layout.ksad_activity_apk_info_landscape;
        }
        N(i);
        if (!com.kwad.sdk.core.response.b.a.aR(ck)) {
            this.tB.updateTextureViewGravity(17);
        } else {
            this.tB.updateTextureViewGravity(21);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        hU();
        ViewGroup.LayoutParams layoutParams = this.tB.getLayoutParams();
        if (layoutParams != null) {
            this.tF = new ViewGroup.LayoutParams(layoutParams);
        }
        this.qB.oZ.a(this.mVideoPlayStateListener);
        hV();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.tB = (DetailVideoView) findViewById(R.id.ksad_video_player);
        this.tC = (ViewGroup) findViewById(R.id.ksad_play_right_area);
        this.tE = (ImageView) findViewById(R.id.ksad_play_right_area_bg_img);
        this.tD = (FrameLayout) findViewById(R.id.ksad_play_right_area_container);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        DetailVideoView detailVideoView;
        super.onUnbind();
        this.qB.oZ.b(this.mVideoPlayStateListener);
        if (this.tF == null || (detailVideoView = this.tB) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = detailVideoView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.tF.width;
            layoutParams.height = this.tF.height;
            this.tB.setLayoutParams(layoutParams);
        }
        DetailVideoView detailVideoView2 = this.tB;
        if (detailVideoView2 != null) {
            detailVideoView2.setVisibility(4);
        }
        this.tF = null;
    }
}
