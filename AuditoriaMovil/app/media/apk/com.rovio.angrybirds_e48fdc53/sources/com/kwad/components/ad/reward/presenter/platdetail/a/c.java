package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener {
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private ImageView vo;
    private TextView vp;
    private boolean vq = false;
    private View vr = null;
    private long vs = -1;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.c.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", c.this.qB.mAdTemplate).equals(str)) {
                c.this.bV();
            }
        }
    };
    private final l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.c.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            if (c.this.vs >= 0) {
                if (j2 > Math.min(Math.min(c.this.vs, com.kwad.sdk.core.response.b.a.Y(c.this.mAdInfo)), j)) {
                    c.this.iw();
                }
            }
        }
    };
    private final com.kwad.components.ad.reward.e.e gP = new com.kwad.components.ad.reward.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.c.3
        @Override // com.kwad.components.ad.reward.e.e
        public final void bZ() {
            c.a(c.this, true);
            c.this.iw();
        }
    };

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.vq = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        View view;
        int i;
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.qB.oZ.a(this.mVideoPlayStateListener);
        this.qB.pj.add(this.gP);
        long X = com.kwad.sdk.core.response.b.a.X(this.mAdInfo);
        this.vs = X;
        if (X == 0) {
            view = this.vr;
            i = 0;
        } else {
            view = this.vr;
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iw() {
        if (this.vr.getVisibility() == 0) {
            return;
        }
        this.vr.setAlpha(0.0f);
        this.vr.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.c.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.this.vr.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.start();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vr) {
            com.kwad.components.ad.reward.presenter.e.a(this.qB, this.vq);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        ImageView imageView;
        int i;
        View view;
        super.onCreate();
        this.vo = (ImageView) findViewById(R.id.ksad_detail_close_btn);
        this.vp = (TextView) findViewById(R.id.ksad_top_toolbar_close_tip);
        if (TextUtils.isEmpty(com.kwad.components.ad.reward.a.b.gF())) {
            if (com.kwad.components.ad.reward.a.b.gE() == 0) {
                imageView = this.vo;
                i = R.drawable.ksad_page_close;
            } else {
                imageView = this.vo;
                i = R.drawable.ksad_video_skip_icon;
            }
            imageView.setImageResource(i);
            view = this.vo;
        } else {
            this.vp.setText(com.kwad.components.ad.reward.a.b.gF());
            view = this.vp;
        }
        this.vr = view;
        this.vr.setOnClickListener(this);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.qB.pj.remove(this.gP);
        this.vr.setVisibility(8);
    }
}
