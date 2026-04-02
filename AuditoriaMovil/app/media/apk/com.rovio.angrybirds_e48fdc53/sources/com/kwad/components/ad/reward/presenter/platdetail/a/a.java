package com.kwad.components.ad.reward.presenter.platdetail.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.n;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.bn;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener, bn.a {
    private static final String[] vk = {"%ss后获得奖励1", "已获得奖励1/2", "已获得全部奖励"};
    private boolean gA;
    private long gB;
    private TextView gx;
    private bn gz;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private TextView vg;
    private ImageView vh;
    private View vi;
    private boolean vj = false;
    private boolean vl = false;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", a.this.qB.mAdTemplate).equals(str)) {
                a.this.bV();
            }
        }
    };
    private final l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayEnd() {
            super.onLivePlayEnd();
            if (a.this.gA) {
                return;
            }
            a.this.gz.sendEmptyMessageDelayed(1, 500L);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            long a = com.kwad.components.ad.reward.j.a(j, a.this.mAdInfo);
            a.this.gB = j2;
            a.this.a(a, j2);
        }
    };
    private final com.kwad.components.ad.reward.e.j mRewardVerifyListener = new com.kwad.components.ad.reward.e.j() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.3
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            a.a(a.this, true);
            a.this.vg.setText(a.vk[2]);
        }
    };

    private void a(long j, long j2, long j3) {
        if (j < (j2 - 800) - j3) {
            int i = (int) ((((float) (j2 - j)) / 1000.0f) + 0.5f);
            w(i);
            if (this.qB.px != null) {
                this.qB.px.U(i);
                return;
            }
            return;
        }
        this.qB.pt = true;
        if (!com.kwad.components.ad.reward.j.v(this.mAdTemplate)) {
            notifyRewardVerify();
            it();
            if (this.qB.px != null) {
                this.qB.px.U(0);
                return;
            }
            return;
        }
        if (!com.kwad.components.ad.reward.j.t(this.mAdTemplate) || this.qB.pE == null) {
            if (com.kwad.components.ad.reward.j.u(this.mAdTemplate) && this.qB.pF != null && !this.qB.pF.jJ()) {
                this.qB.pF.jI();
            }
        } else if (!this.qB.pE.jJ()) {
            this.qB.pE.jI();
        }
        if (this.vl) {
            return;
        }
        this.vg.setText(vk[1]);
        iu();
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.vl = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mApkDownloadHelper = this.qB.mApkDownloadHelper;
        long a = com.kwad.components.ad.reward.j.a(com.kwad.sdk.core.response.b.a.H(this.mAdInfo), this.mAdInfo) / 1000;
        if (com.kwad.components.ad.reward.j.v(this.mAdTemplate)) {
            this.vi.setVisibility(0);
            this.vi.setOnClickListener(this);
            this.vg.setText(String.format(vk[0], Long.valueOf(a)));
            this.gx.setVisibility(8);
        } else {
            this.vi.setVisibility(8);
            this.gx.setText(String.valueOf(a));
            this.gx.setVisibility(0);
            this.gx.setAlpha(1.0f);
        }
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.qB.oZ.a(this.mVideoPlayStateListener);
    }

    private void it() {
        if (this.vj) {
            return;
        }
        this.vj = true;
        this.vh.setAlpha(0.0f);
        this.vh.setVisibility(0);
        this.vh.setOnClickListener(this);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a.this.gx.setVisibility(8);
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a.this.gx.setAlpha(1.0f - floatValue);
                a.this.vh.setAlpha(floatValue);
            }
        });
        ofFloat.start();
    }

    private void iu() {
        if (this.qB.mAdRewardStepListener != null) {
            this.qB.mAdRewardStepListener.fA();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdClick() {
        com.kwad.components.ad.reward.i.b.a(this.mAdTemplate, "native_id", "playTopBar-style1", new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(41), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    private void notifyRewardVerify() {
        this.qB.mAdOpenInteractionListener.onRewardVerify();
    }

    private void w(int i) {
        this.qB.pG = i;
        if (!com.kwad.components.ad.reward.j.v(this.mAdTemplate)) {
            this.gx.setText(String.valueOf(i));
        } else if (this.vl) {
        } else {
            this.vg.setText(String.format(vk[0], Integer.valueOf(i)));
        }
    }

    public final void a(long j, long j2) {
        long aE = (com.kwad.sdk.core.response.b.a.aG(this.mAdInfo) && com.kwad.components.core.r.a.pU().pV() == 0 ? com.kwad.sdk.core.response.b.a.aE(this.mAdInfo) : com.kwad.sdk.core.response.b.a.aC(this.mAdInfo)) * (this.qB.pq ? 1000 : 0);
        n.a(this.qB, j2, j, aE);
        a(j2, j, aE);
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (message.what == 1) {
            if (this.qB.gd() || this.qB.gc()) {
                this.gz.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            this.gB += 500;
            a(com.kwad.sdk.core.response.b.a.Y(this.mAdInfo), this.gB);
            this.gz.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.gz = new bn(this);
        if (com.kwad.components.ad.reward.j.b(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            return;
        }
        bV();
        if (this.qB.oZ.jT()) {
            w((int) (((float) com.kwad.sdk.core.response.b.a.Y(this.mAdInfo)) / 1000.0f));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vh || view == this.vi) {
            com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.mAdTemplate).b(this.mApkDownloadHelper).ao(2).s(this.qB.oZ.getPlayDuration()).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.a.a.6
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    a.this.notifyAdClick();
                }
            }));
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.gx = (TextView) findViewById(R.id.ksad_video_count_down);
        this.vh = (ImageView) findViewById(R.id.ksad_detail_reward_icon);
        this.vg = (TextView) findViewById(R.id.ksad_reward_deep_task_count_down);
        this.vi = findViewById(R.id.ksad_detail_reward_deep_task_view);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
        this.qB.oZ.b(this.mVideoPlayStateListener);
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.vh.setVisibility(8);
        this.vi.setVisibility(8);
        this.vj = false;
        this.vl = false;
        this.gA = false;
    }
}
