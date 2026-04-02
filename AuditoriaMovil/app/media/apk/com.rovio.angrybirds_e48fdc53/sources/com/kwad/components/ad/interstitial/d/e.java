package com.kwad.components.ad.interstitial.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.view.View;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.sdk.R;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bj;
import com.kwad.sdk.utils.bn;
import com.kwad.sdk.widget.KSFrameLayout;
import com.kwad.sdk.widget.swipe.HorizontalSwipeLayout;
import com.qq.e.comm.adevent.AdEventType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e extends b implements bn.a {
    private bn gz;
    private KSFrameLayout jq;
    private ObjectAnimator kA;
    private ObjectAnimator kB;
    private ObjectAnimator kC;
    private ObjectAnimator kD;
    private ObjectAnimator kE;
    private ObjectAnimator kF;
    private int kG;
    private HorizontalSwipeLayout kq;
    private View kr;
    private View ks;
    private View kt;
    private View ku;
    private View kv;
    private View kw;
    private View kx;
    private View ky;
    private AnimatorSet kz;
    protected AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    protected Context mContext;
    private com.kwad.components.core.page.c mLandingPageView;
    private String mPageUrl;
    private c.a jn = new c.a() { // from class: com.kwad.components.ad.interstitial.d.e.1
        @Override // com.kwad.components.ad.interstitial.d.c.a
        public final void cl() {
            e.this.jq.removeAllViews();
            e.this.dz();
            e.this.jq.setVisibility(8);
            e.this.kq.b(e.this.kI);
        }
    };
    private Runnable kH = new AnonymousClass3();
    private HorizontalSwipeLayout.a kI = new HorizontalSwipeLayout.a() { // from class: com.kwad.components.ad.interstitial.d.e.4
        @Override // com.kwad.sdk.widget.swipe.HorizontalSwipeLayout.a
        public final void dE() {
            com.kwad.sdk.core.e.c.d("InterstitialHorizontalSwipe", "onRightSwiped: ");
            e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
            e.this.jh.cT();
            e.this.kq.b(e.this.kI);
        }

        @Override // com.kwad.sdk.widget.swipe.HorizontalSwipeLayout.a
        public final void dF() {
            com.kwad.sdk.core.e.c.d("InterstitialHorizontalSwipe", "onLeftSwiped: ");
            e.this.dz();
            e.this.jq.setAllCorner(false);
            e.this.mAdTemplate.converted = true;
            e.this.mLandingPageView.requestLayout();
            e.this.mLandingPageView.oH();
            e.this.jq.requestLayout();
            com.kwad.sdk.core.report.a.a(e.this.mAdTemplate, 74, (ac.a) null);
            if (e.this.jh.hB != null) {
                e.this.jh.hB.onAdClicked();
            }
            e.this.jh.cU();
        }
    };
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener = new com.kwad.sdk.core.webview.d.a.b() { // from class: com.kwad.components.ad.interstitial.d.e.5
        @Override // com.kwad.sdk.core.webview.d.a.b
        public final void a(WebCloseStatus webCloseStatus) {
            e.this.jh.hI.dismiss();
        }
    };
    private com.kwad.components.core.page.a.a mLandPageViewListener = new com.kwad.components.core.page.a.a() { // from class: com.kwad.components.ad.interstitial.d.e.6
        @Override // com.kwad.components.core.page.a.a
        public final void dG() {
            e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
            e.this.jh.cT();
            e.this.kq.b(e.this.kI);
        }

        @Override // com.kwad.components.core.page.a.a
        public final void dH() {
            e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
            e.this.jh.cT();
            e.this.kq.b(e.this.kI);
        }
    };

    /* renamed from: com.kwad.components.ad.interstitial.d.e$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.this.b(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.d.e.3.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
                    e.this.kr.setTranslationX(com.kwad.sdk.d.a.a.a(e.this.mContext, 500.0f));
                    e.this.ks.setTranslationX(com.kwad.sdk.d.a.a.a(e.this.mContext, 140.0f));
                    e.this.kr.setAlpha(1.0f);
                    e.this.ks.setAlpha(1.0f);
                    e.this.kt.setVisibility(8);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    e.this.a(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.interstitial.d.e.3.1.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator2) {
                            super.onAnimationCancel(animator2);
                            e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
                            e.this.kr.setAlpha(1.0f);
                            e.this.ks.setAlpha(1.0f);
                            e.this.kt.setVisibility(8);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator2) {
                            super.onAnimationStart(animator2);
                            e.this.dD();
                        }
                    });
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    e.this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(e.this.mContext));
                    e.this.kr.setTranslationX(com.kwad.sdk.d.a.a.a(e.this.mContext, 500.0f));
                    e.this.ks.setTranslationX(com.kwad.sdk.d.a.a.a(e.this.mContext, 140.0f));
                    e.this.kr.setAlpha(1.0f);
                    e.this.ks.setAlpha(1.0f);
                    e.this.kt.setVisibility(8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimator = this.kD;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.kD.cancel();
            this.kD.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.kE;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.kE.cancel();
        }
        ObjectAnimator objectAnimator3 = this.kF;
        if (objectAnimator3 != null && objectAnimator3.isRunning()) {
            this.kF.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.jq, View.TRANSLATION_X.getName(), com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) - com.kwad.sdk.d.a.a.a(this.mContext, 45.0f), com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) - com.kwad.sdk.d.a.a.a(this.mContext, 30.0f), com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) - com.kwad.sdk.d.a.a.a(this.mContext, 45.0f));
        this.kD = ofFloat;
        ofFloat.setDuration(1200L);
        this.kD.setRepeatMode(1);
        this.kD.setRepeatCount(-1);
        this.kD.addListener(animatorListener);
        this.kD.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kr, View.TRANSLATION_X.getName(), com.kwad.sdk.d.a.a.a(this.mContext, 322.0f), com.kwad.sdk.d.a.a.a(this.mContext, 500.0f), com.kwad.sdk.d.a.a.a(this.mContext, 322.0f));
        this.kE = ofFloat2;
        ofFloat2.setDuration(1200L);
        this.kE.setRepeatMode(1);
        this.kE.setRepeatCount(-1);
        this.kE.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.kr, View.ALPHA.getName(), 0.0f, 1.0f, 0.0f);
        this.kF = ofFloat3;
        ofFloat3.setDuration(1200L);
        this.kF.setRepeatMode(1);
        this.kF.setRepeatCount(-1);
        this.kF.start();
        this.kr.setVisibility(4);
        this.gz.sendEmptyMessageDelayed(6666, 600L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = this.kz;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.kz.removeAllListeners();
            this.kz.cancel();
        }
        z.a aVar = new z.a();
        aVar.asU = 7;
        com.kwad.sdk.core.report.a.d(this.mAdTemplate, (JSONObject) null, new com.kwad.sdk.core.report.j().a(aVar).ci(AdEventType.VIDEO_COMPLETE));
        this.kz = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.jq, View.TRANSLATION_X.getName(), com.kwad.sdk.d.a.a.getScreenWidth(this.mContext), com.kwad.sdk.d.a.a.getScreenWidth(this.mContext) - com.kwad.sdk.d.a.a.a(this.mContext, 45.0f));
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kr, View.TRANSLATION_X.getName(), com.kwad.sdk.d.a.a.a(this.mContext, 500.0f), com.kwad.sdk.d.a.a.a(this.mContext, 322.0f));
        ofFloat2.setDuration(300L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.kr, View.ALPHA.getName(), 1.0f, 0.0f);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.ks, View.TRANSLATION_X.getName(), com.kwad.sdk.d.a.a.a(this.mContext, 140.0f), com.kwad.sdk.d.a.a.a(this.mContext, 0.0f));
        ofFloat4.setDuration(300L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.ks, View.ALPHA.getName(), 1.0f, 0.99f);
        ofFloat5.setDuration(300L);
        this.kz.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        this.kz.removeAllListeners();
        this.kz.addListener(animatorListener);
        this.kz.start();
    }

    private void dA() {
        ObjectAnimator objectAnimator = this.kD;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.kD.cancel();
            this.kD.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.kE;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.kE.cancel();
        }
        ObjectAnimator objectAnimator3 = this.kF;
        if (objectAnimator3 != null && objectAnimator3.isRunning()) {
            this.kF.cancel();
        }
        this.kr.setTranslationX(com.kwad.sdk.d.a.a.a(this.mContext, 500.0f));
        this.ks.setTranslationX(com.kwad.sdk.d.a.a.a(this.mContext, 140.0f));
        this.kr.setAlpha(1.0f);
        this.ks.setAlpha(1.0f);
        this.gz.removeCallbacksAndMessages(null);
    }

    private void dB() {
        AnimatorSet animatorSet = this.kz;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.kz.removeAllListeners();
        this.kz.cancel();
    }

    private void dC() {
        ObjectAnimator objectAnimator = this.kA;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.kA.cancel();
        }
        ObjectAnimator objectAnimator2 = this.kB;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.kB.cancel();
        }
        ObjectAnimator objectAnimator3 = this.kC;
        if (objectAnimator3 == null || !objectAnimator3.isRunning()) {
            return;
        }
        this.kC.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dD() {
        com.kwad.sdk.core.e.c.d("InterstitialHorizontalSwipe", "showGuideButton: ");
        this.kt.setVisibility(8);
        ObjectAnimator objectAnimator = this.kA;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.kA.cancel();
        }
        ObjectAnimator objectAnimator2 = this.kB;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.kB.cancel();
        }
        ObjectAnimator objectAnimator3 = this.kC;
        if (objectAnimator3 != null && objectAnimator3.isRunning()) {
            this.kC.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kx, View.ALPHA.getName(), 0.0f, 1.0f, 0.6f, 0.3f, 0.0f, 0.01f, 0.0f);
        this.kA = ofFloat;
        ofFloat.setDuration(600L);
        this.kA.setRepeatMode(1);
        this.kA.setRepeatCount(-1);
        this.kA.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kw, View.ALPHA.getName(), 0.0f, 0.01f, 1.0f, 0.6f, 0.3f, 0.01f, 0.0f);
        this.kB = ofFloat2;
        ofFloat2.setDuration(600L);
        this.kB.setRepeatMode(1);
        this.kB.setRepeatCount(-1);
        this.kB.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.kv, View.ALPHA.getName(), 0.0f, 0.01f, 0.0f, 1.0f, 0.6f, 0.3f, 0.0f);
        this.kC = ofFloat3;
        ofFloat3.setDuration(600L);
        this.kC.setRepeatMode(1);
        this.kC.setRepeatCount(-1);
        this.kC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() {
        this.kr.removeCallbacks(this.kH);
        this.ky.setVisibility(8);
        dB();
        dC();
        dA();
        this.jq.setTranslationX(0.0f);
        this.kt.setOnClickListener(null);
    }

    private void initContentView() {
        this.mPageUrl = com.kwad.sdk.core.response.b.b.bq(this.mAdTemplate);
        this.mLandingPageView = com.kwad.components.core.page.c.b(this.mContext, new AdWebViewActivityProxy.a.C0206a().at(this.mPageUrl).V(this.mAdTemplate).oE());
        this.kq.a(this.kI);
        this.mLandingPageView.setLandPageViewListener(this.mLandPageViewListener);
        this.mLandingPageView.setWebCardCloseListener(this.mWebCardCloseListener);
        this.jq.addView(this.mLandingPageView);
        this.jq.setRadius(com.kwad.sdk.d.a.a.a(this.mContext, 20.0f));
        this.jq.setTranslationX(com.kwad.sdk.d.a.a.getScreenWidth(this.mContext));
        this.kr.setTranslationX(com.kwad.sdk.d.a.a.a(this.mContext, 500.0f));
        this.ks.setTranslationX(com.kwad.sdk.d.a.a.a(this.mContext, 140.0f));
        this.kt.setVisibility(8);
        this.ky.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.interstitial.d.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.kwad.sdk.core.e.c.d("InterstitialHorizontalSwipe", "mGuideButtonLayout click: ");
                e.this.dz();
                e.this.jq.setAllCorner(false);
                e.this.mAdTemplate.converted = true;
                e.this.mLandingPageView.requestLayout();
                e.this.mLandingPageView.oH();
                e.this.jq.requestLayout();
                e.this.jh.cU();
                com.kwad.sdk.core.report.a.a(e.this.mAdTemplate, 110, (ac.a) null);
                if (e.this.jh.hB != null) {
                    e.this.jh.hB.onAdClicked();
                }
                e.this.kq.b(e.this.kI);
            }
        });
        this.kr.postDelayed(this.kH, this.kG * 1000);
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        Runnable runnable;
        if (message.what == 6666) {
            View view = this.kr;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    runnable = new Runnable() { // from class: com.kwad.components.ad.interstitial.d.e.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.this.kr.setVisibility(4);
                            e.this.ku.setVisibility(4);
                        }
                    };
                } else if (this.kr.getVisibility() == 4) {
                    runnable = new Runnable() { // from class: com.kwad.components.ad.interstitial.d.e.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.this.kr.setVisibility(0);
                            e.this.ku.setVisibility(0);
                        }
                    };
                }
                bj.runOnUiThread(runnable);
            }
            this.gz.sendEmptyMessageDelayed(6666, 600L);
        }
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.jh = (c) Gh();
        AdTemplate adTemplate = this.jh.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mContext = getContext();
        this.jh.a(this.jn);
        this.kG = com.kwad.sdk.core.response.b.a.ca(this.mAdInfo);
        this.gz = com.kwad.sdk.core.threads.a.a(this);
        initContentView();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.jq = (KSFrameLayout) findViewById(R.id.ksad_land_page_root);
        this.kq = (HorizontalSwipeLayout) findViewById(R.id.ksad_swipe);
        this.kr = findViewById(R.id.ksad_interstitial_guide_bg);
        this.ks = findViewById(R.id.ksad_interstitial_guide_bg_bg);
        this.kt = findViewById(R.id.ksad_interstitial_guide_button_layout);
        this.ky = findViewById(R.id.ksad_interstitial_guide_click_layout);
        this.ku = findViewById(R.id.ksad_interstitial_guide_button);
        this.kv = findViewById(R.id.ksad_interstitial_guide_button_img_1);
        this.kw = findViewById(R.id.ksad_interstitial_guide_button_img_2);
        this.kx = findViewById(R.id.ksad_interstitial_guide_button_img_3);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.jq.removeAllViews();
        this.jh.b(this.jn);
        dz();
        this.gz.removeCallbacksAndMessages(null);
        this.kq.b(this.kI);
    }
}
