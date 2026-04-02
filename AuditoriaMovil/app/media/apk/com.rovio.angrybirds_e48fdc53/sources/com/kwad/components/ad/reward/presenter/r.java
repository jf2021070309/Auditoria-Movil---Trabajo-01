package com.kwad.components.ad.reward.presenter;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.components.ad.k.b;
import com.kwad.components.core.i.a;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.webview.jshandler.q;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class r extends a implements com.kwad.components.ad.reward.e.f, a.InterfaceC0202a, q.b {
    private AdTemplate mAdTemplate;
    private com.kwad.components.ad.reward.g pf;
    private ImageView sc;
    private View te;
    private KsLogoView tf;
    private DetailVideoView tg;
    private int th;
    private View ti;
    private FrameLayout tj;
    private Animator tk;
    private Animator tl;
    private Animator tm;
    private AdTemplate tn;
    private List<com.kwad.components.core.i.c> to;
    private boolean tw;
    private int td = 1;
    private long tp = 500;
    private long tq = 50;
    private float tr = 1.2254902f;
    private float ts = 0.80472106f;
    private float tt = 0.0f;
    private boolean tu = false;
    private long showTime = -1;
    private long tv = -1;
    private com.kwad.components.core.video.l mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.reward.presenter.r.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            r.this.f(j2);
        }
    };
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.r.5
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            if (aVar == null || com.kwad.sdk.core.response.b.d.b(r.this.mAdTemplate, aVar.creativeId, aVar.adStyle)) {
                r.this.qB.mAdOpenInteractionListener.bF();
                return;
            }
            com.kwad.components.core.i.c a = com.kwad.components.ad.reward.j.a(r.this.to, aVar.creativeId);
            if (a != null) {
                r.this.qB.a(a);
            }
        }
    };

    private boolean J(boolean z) {
        int b = b(hR());
        M(b);
        com.kwad.components.ad.reward.g gVar = this.pf;
        boolean ap = gVar != null ? gVar.ap() : false;
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "webLoadSuccess: " + ap);
        if (ap) {
            int a = a(hR());
            float f = -b;
            this.tt = f;
            Animator a2 = a(true, f, a, true, z);
            this.tk = a2;
            a2.start();
            Animator hQ = hQ();
            this.tm = hQ;
            hQ.start();
            this.td = 2;
            return true;
        }
        return false;
    }

    private void K(boolean z) {
        Animator a = a(false, (hR() - hS()) + this.tt, a(hS()), false, z);
        this.tl = a;
        a.start();
        com.kwad.sdk.core.d.a.AV();
        com.kwad.sdk.core.d.a.au(this.tn);
        this.td = 3;
        com.kwad.components.ad.reward.g gVar = this.pf;
        if (gVar != null) {
            gVar.fE();
        }
    }

    private void M(int i) {
        ViewGroup.LayoutParams layoutParams = this.te.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = i;
            layoutParams2.bottomMargin = -i;
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i);
        layoutParams3.height = i;
        layoutParams3.bottomMargin = -i;
        this.te.setLayoutParams(layoutParams3);
    }

    private int a(float f) {
        return (int) (com.kwad.sdk.d.a.a.e(getActivity()) - f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(com.kwad.components.ad.reward.e.f fVar) {
        return getPriority() - fVar.getPriority();
    }

    private Animator a(boolean z, float f, int i, boolean z2, boolean z3) {
        ValueAnimator ofFloat;
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "getUpAnimator: translationY0: " + f + ", videoTargetHeight: " + i);
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(this.te, "translationY", f);
        } else {
            int height = this.te.getHeight();
            final ViewGroup.LayoutParams layoutParams = this.te.getLayoutParams();
            ofFloat = ValueAnimator.ofFloat(height, Math.abs(f));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.r.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    layoutParams.height = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    r.this.te.setLayoutParams(layoutParams);
                }
            });
        }
        ObjectAnimator ofFloat2 = z2 ? ObjectAnimator.ofFloat(this.tf, "alpha", 0.0f, 255.0f) : null;
        final ViewGroup.LayoutParams layoutParams2 = this.sc.getLayoutParams();
        ValueAnimator a = this.tg.a(this.mAdTemplate, i, new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.r.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.height = intValue;
                    r.this.sc.setLayoutParams(layoutParams2);
                }
            }
        });
        long j = z3 ? this.tp : this.tq;
        Interpolator create = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(create);
        if (ofFloat2 != null) {
            if (z3) {
                animatorSet.playTogether(ofFloat, ofFloat2, a);
            } else {
                animatorSet.playTogether(ofFloat, ofFloat2);
            }
        } else if (z3) {
            animatorSet.playTogether(ofFloat, a);
        } else {
            animatorSet.playTogether(ofFloat);
        }
        return animatorSet;
    }

    private int b(float f) {
        return (int) (f + getContext().getResources().getDimensionPixelSize(R.dimen.ksad_reward_middle_end_card_logo_view_height) + getContext().getResources().getDimensionPixelSize(R.dimen.ksad_reward_middle_end_card_logo_view_margin_bottom));
    }

    private void d(List<AdTemplate> list) {
        this.pf = new com.kwad.components.ad.reward.g(list, this.qB.mReportExtData, this);
        this.qB.pf = this.pf;
        this.pf.setShowLandingPage(com.kwad.sdk.core.response.b.b.bi(this.mAdTemplate));
        this.pf.a(this.cH);
        this.pf.a(this.tj, this.qB.mRootContainer, this.mAdTemplate, this.qB.mApkDownloadHelper, this.qB.mScreenOrientation);
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "startPreloadWebView");
        this.pf.a(new b.InterfaceC0162b() { // from class: com.kwad.components.ad.reward.presenter.r.2
            @Override // com.kwad.components.ad.k.b.InterfaceC0162b
            public final void hT() {
                com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "onPreloadSuccess");
                r.this.qB.pD = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(long j) {
        AdTemplate adTemplate = this.tn;
        if (adTemplate == null || this.tw) {
            return;
        }
        if (this.showTime <= 0) {
            this.showTime = com.kwad.sdk.core.response.b.b.bf(adTemplate);
            this.tv = com.kwad.sdk.core.response.b.b.be(this.tn) + this.showTime;
        }
        long j2 = this.showTime;
        if (j2 > 0 && !this.tu && j > j2) {
            this.tw = !J(true);
            com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "showError: " + this.tw);
            if (this.tw) {
                return;
            }
            this.tu = true;
        }
        boolean z = this.td == 3;
        long j3 = this.tv;
        if (j3 <= 0 || z || j <= j3) {
            return;
        }
        K(true);
    }

    private Animator hQ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ti, "alpha", 255.0f, 0.0f);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f));
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    private float hR() {
        return com.kwad.sdk.d.a.a.d(getActivity()) / this.tr;
    }

    private float hS() {
        return com.kwad.sdk.d.a.a.d(getActivity()) / this.ts;
    }

    @Override // com.kwad.components.core.webview.jshandler.q.b
    public final void A(AdTemplate adTemplate) {
        com.kwad.components.core.i.c cVar = new com.kwad.components.core.i.c(adTemplate, com.kwad.components.core.i.e.AGGREGATION);
        if (this.qB != null) {
            this.qB.b(cVar);
        }
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.oZ.a(this.mVideoPlayStateListener);
        this.qB.b((com.kwad.components.ad.reward.e.f) this);
        this.mAdTemplate = this.qB.mAdTemplate;
        this.qB.a(this);
        this.th = com.kwad.sdk.d.a.a.E(this.tg);
        com.kwad.sdk.d.a.a.n(this.tg, 49);
        this.tf.ad(this.mAdTemplate);
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final void bE() {
        int i;
        if (this.tn == null || (i = this.td) == 3) {
            return;
        }
        if (i == 1) {
            J(false);
            K(false);
        } else if (i == 2) {
            K(true);
        }
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void c(List<com.kwad.components.core.i.c> list) {
        com.kwad.sdk.core.e.c.d("RewardPreEndCardPresenter", "onInnerAdLoad: " + list);
        if (list == null || list.size() == 0) {
            return;
        }
        this.tn = list.get(0).getAdTemplate();
        this.to = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mAdTemplate);
        arrayList.addAll(com.kwad.components.core.i.c.j(list));
        d(arrayList);
    }

    @Override // com.kwad.components.ad.reward.e.f
    public final int getPriority() {
        return 0;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.te = findViewById(R.id.ksad_middle_end_card);
        this.tg = (DetailVideoView) findViewById(R.id.ksad_video_player);
        this.tf = (KsLogoView) findViewById(R.id.ksad_splash_logo_container);
        this.sc = (ImageView) findViewById(R.id.ksad_blur_video_cover);
        this.ti = findViewById(R.id.ksad_play_web_card_webView);
        this.tj = (FrameLayout) findViewById(R.id.ksad_middle_end_card_webview_container);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onError(int i, String str) {
        com.kwad.sdk.core.e.c.w("RewardPreEndCardPresenter", "onError : msg " + str);
    }

    @Override // com.kwad.components.core.i.a.InterfaceC0202a
    public final void onRequestResult(int i) {
        com.kwad.sdk.core.e.c.w("RewardPreEndCardPresenter", "onRequestResult : adNumber " + i);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.qB.pD = false;
        this.qB.oZ.b(this.mVideoPlayStateListener);
        this.qB.c(this);
        this.qB.b((a.InterfaceC0202a) this);
        com.kwad.components.ad.reward.g gVar = this.pf;
        if (gVar != null) {
            gVar.lM();
        }
        Animator animator = this.tm;
        if (animator != null) {
            animator.cancel();
        }
        DetailVideoView detailVideoView = this.tg;
        if (detailVideoView != null) {
            com.kwad.sdk.d.a.a.n(detailVideoView, this.th);
        }
        Animator animator2 = this.tk;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.tm = null;
        this.tk = null;
    }
}
