package com.kwad.components.ad.fullscreen.c.a;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private ImageView gM;
    private TextView gN;
    private AdTemplate mAdTemplate;
    private View gO = null;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.fullscreen.c.a.d.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", d.this.qB.mAdTemplate).equals(str)) {
                d.this.bV();
            }
        }
    };
    private com.kwad.components.ad.reward.e.e gP = new com.kwad.components.ad.reward.e.e() { // from class: com.kwad.components.ad.fullscreen.c.a.d.2
        @Override // com.kwad.components.ad.reward.e.e
        public final void bZ() {
            d.this.bY();
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.fullscreen.c.a.d.3
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            d.this.f(j2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        this.mAdTemplate = this.qB.mAdTemplate;
        this.qB.oZ.a(this.mVideoPlayStateListener);
        this.qB.pj.add(this.gP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bY() {
        if (this.gO.getVisibility() == 0) {
            return;
        }
        this.gO.setAlpha(0.0f);
        this.gO.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.fullscreen.c.a.d.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d.this.gO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.start();
        this.gO.setOnClickListener(this);
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

    public final void f(long j) {
        if (j >= com.kwad.sdk.core.response.b.a.ad(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) {
            bY();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.gO) {
            com.kwad.components.ad.reward.presenter.e.a(this.qB, false);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        ImageView imageView;
        int i;
        View view;
        super.onCreate();
        this.gM = (ImageView) findViewById(R.id.ksad_skip_icon);
        this.gN = (TextView) findViewById(R.id.ksad_top_toolbar_close_tip);
        if (TextUtils.isEmpty(com.kwad.components.ad.fullscreen.a.b.bH())) {
            if (com.kwad.components.ad.fullscreen.a.b.bG() == 0) {
                imageView = this.gM;
                i = R.drawable.ksad_page_close;
            } else {
                imageView = this.gM;
                i = R.drawable.ksad_video_skip_icon;
            }
            imageView.setImageResource(i);
            this.gN.setVisibility(8);
            view = this.gM;
        } else {
            this.gN.setText(com.kwad.components.ad.fullscreen.a.b.bH());
            this.gM.setVisibility(8);
            view = this.gN;
        }
        this.gO = view;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.pj.remove(this.gP);
        this.qB.oZ.b(this.mVideoPlayStateListener);
    }
}
