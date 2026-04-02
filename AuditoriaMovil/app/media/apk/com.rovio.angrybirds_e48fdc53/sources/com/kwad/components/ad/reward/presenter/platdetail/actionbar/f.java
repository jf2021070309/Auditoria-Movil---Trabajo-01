package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import com.kwad.components.ad.reward.j.q;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.t.m;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.webview.jshandler.aa;
import com.kwad.components.core.webview.jshandler.ac;
import com.kwad.components.core.webview.jshandler.ad;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.components.core.webview.jshandler.ap;
import com.kwad.components.core.webview.jshandler.as;
import com.kwad.components.core.webview.jshandler.u;
import com.kwad.components.core.webview.jshandler.w;
import com.kwad.components.core.webview.jshandler.x;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class f extends com.kwad.components.ad.reward.presenter.a {
    private KsAdWebView cB;
    private ad.a cC;
    private com.kwad.components.core.webview.a cD;
    private com.kwad.sdk.core.webview.b cE;
    private ap cG;
    private ValueAnimator cL;
    private ValueAnimator cM;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private String mUrl;
    private RewardActionBarControl pc;
    private KsLogoView ss;
    private boolean vd;
    private long ve;
    private int cF = -1;
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-bottom-card-v2", f.this.qB.mAdTemplate).equals(str)) {
                f.this.bV();
            }
        }
    };
    private RewardActionBarControl.e uJ = new RewardActionBarControl.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.3
        @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.e
        public final boolean g(a aVar) {
            f fVar = f.this;
            fVar.vd = fVar.g(aVar);
            return f.this.vd;
        }
    };
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.4
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            f.this.release();
        }
    };
    private com.kwad.sdk.core.webview.d.a.a cH = new com.kwad.sdk.core.webview.d.a.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.5
        @Override // com.kwad.sdk.core.webview.d.a.a
        public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
            f.this.qB.mAdOpenInteractionListener.bF();
        }
    };
    private ad.b cI = new ad.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.7
        @Override // com.kwad.components.core.webview.jshandler.ad.b
        public final void a(ad.a aVar) {
            f.this.cC = aVar;
            f.this.cB.setTranslationY(aVar.height + aVar.bottomMargin);
        }
    };
    private ac.b cJ = new ac.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.8
        @Override // com.kwad.components.core.webview.jshandler.ac.b
        public final void a(ac.a aVar) {
            f.this.vd = false;
            f.this.aC();
        }
    };
    private ak.b cK = new ak.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.9
        @Override // com.kwad.components.core.webview.jshandler.ak.b
        public final void a(ak.a aVar) {
            f.this.cF = aVar.status;
            long elapsedRealtime = SystemClock.elapsedRealtime() - f.this.ve;
            com.kwad.sdk.core.e.c.i("RewardActionBarWeb", "load time:" + elapsedRealtime + ", pageStatus: " + f.this.cF);
            if (f.this.cF == 1) {
                com.kwad.components.core.p.a.pC().h(f.this.qB.mAdTemplate, elapsedRealtime);
            } else {
                com.kwad.components.ad.reward.monitor.a.a(f.this.qB.pn, "play_card", com.kwad.sdk.core.response.b.b.aZ(f.this.qB.mAdTemplate), System.currentTimeMillis() - f.this.cB.getLoadTime(), 3);
            }
            if (f.this.qB.fV()) {
                return;
            }
            f.this.pc.io();
        }
    };

    private void B(AdTemplate adTemplate) {
        KsLogoView ksLogoView;
        if (!com.kwad.sdk.core.response.b.a.cq(com.kwad.sdk.core.response.b.d.ck(adTemplate)) || ai.IL() || (ksLogoView = this.ss) == null) {
            return;
        }
        ksLogoView.setVisibility(0);
    }

    private void a(com.kwad.components.core.webview.a aVar) {
        aVar.a(new u(this.cE, this.mApkDownloadHelper, this.cH));
        aVar.a(new com.kwad.components.core.webview.b.a.f());
        aVar.a(new q(this.cE, this.mApkDownloadHelper, this.qB, -1L, this.cH, null));
        aVar.a(new x(this.cE));
        aVar.a(new aa(this.cE));
        aVar.a(new w(this.cE));
        aVar.a(new ad(this.cE, this.cI));
        aVar.a(new ak(this.cK, com.kwad.sdk.core.response.b.b.aZ(this.qB.mAdTemplate)));
        ap apVar = new ap();
        this.cG = apVar;
        aVar.a(apVar);
        aVar.a(new as(this.cE, this.mApkDownloadHelper));
        aVar.a(new ac(this.cJ));
        aVar.a(new ae(this.cE));
        aVar.a(new com.kwad.components.ad.reward.h.b(getContext(), this.qB.mAdTemplate, PlayableSource.ACTIONBAR_CLICK));
    }

    private void aB() {
        B(this.qB.mAdTemplate);
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rC();
        }
        this.cB.setVisibility(0);
        ap apVar2 = this.cG;
        if (apVar2 != null) {
            apVar2.rD();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aC() {
        if (this.cB.getVisibility() != 0) {
            return;
        }
        if (this.cC == null) {
            aD();
            return;
        }
        aE();
        ValueAnimator c = m.c(this.cB, 0, this.cC.height + this.cC.bottomMargin);
        this.cM = c;
        c.setInterpolator(new DecelerateInterpolator(2.0f));
        this.cM.setDuration(300L);
        this.cM.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                f.this.cB.setVisibility(4);
                if (f.this.cG != null) {
                    f.this.cG.rF();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (f.this.cG != null) {
                    f.this.cG.rE();
                }
            }
        });
        this.cM.start();
    }

    private void aD() {
        if (this.cB.getVisibility() != 0) {
            return;
        }
        ap apVar = this.cG;
        if (apVar != null) {
            apVar.rE();
        }
        this.cB.setVisibility(4);
        ap apVar2 = this.cG;
        if (apVar2 != null) {
            apVar2.rF();
        }
    }

    private void aE() {
        ValueAnimator valueAnimator = this.cL;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.cL.cancel();
        }
        ValueAnimator valueAnimator2 = this.cM;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.cM.cancel();
        }
    }

    private void aF() {
        int i = this.cF;
        String str = i == -1 ? "timeout" : i != 1 ? "h5error" : "others";
        com.kwad.sdk.core.e.c.w("RewardActionBarWeb", "show webCard fail, reason: " + str);
    }

    private void av() {
        com.kwad.sdk.core.webview.b bVar = new com.kwad.sdk.core.webview.b();
        this.cE = bVar;
        bVar.setAdTemplate(this.qB.mAdTemplate);
        this.cE.mScreenOrientation = this.qB.mScreenOrientation;
        this.cE.aym = this.qB.mRootContainer;
        this.cE.MZ = this.qB.mRootContainer;
        this.cE.My = this.cB;
    }

    private void aw() {
        this.cF = -1;
        ax();
        this.cB.setBackgroundColor(0);
        this.cB.getBackground().setAlpha(0);
        this.cB.setVisibility(4);
        this.cB.setClientConfig(this.cB.getClientConfig().cC(this.qB.mAdTemplate).b(dd()));
        this.ve = SystemClock.elapsedRealtime();
        this.mUrl = com.kwad.sdk.core.response.b.b.aZ(this.qB.mAdTemplate);
        com.kwad.sdk.core.e.c.d("RewardActionBarWeb", "startPreloadWebView url: " + this.mUrl);
        com.kwad.components.ad.reward.monitor.a.a(this.qB.pn, "play_card", this.mUrl);
        this.cB.loadUrl(this.mUrl);
    }

    private void ax() {
        ay();
        com.kwad.components.core.webview.a aVar = new com.kwad.components.core.webview.a(this.cB);
        this.cD = aVar;
        a(aVar);
        this.cB.addJavascriptInterface(this.cD, "KwaiAd");
    }

    private void ay() {
        com.kwad.components.core.webview.a aVar = this.cD;
        if (aVar != null) {
            aVar.destroy();
            this.cD = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        if (this.cB == null || !com.kwad.sdk.core.response.b.b.bb(this.qB.mAdTemplate)) {
            return;
        }
        this.mApkDownloadHelper = this.qB.mApkDownloadHelper;
        av();
        aw();
        this.qB.b(this.mPlayEndPageListener);
    }

    private KsAdWebView.d dd() {
        return new KsAdWebView.d() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.6
            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageFinished() {
                com.kwad.components.ad.reward.monitor.a.a(f.this.qB.pn, "play_card", f.this.mUrl, System.currentTimeMillis() - f.this.cB.getLoadTime());
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onPageStart() {
            }

            @Override // com.kwad.sdk.core.webview.KsAdWebView.d
            public final void onReceivedHttpError(int i, String str, String str2) {
                com.kwad.components.ad.reward.monitor.a.a(f.this.qB.pn, "play_card", com.kwad.sdk.core.response.b.b.aZ(f.this.qB.mAdTemplate), System.currentTimeMillis() - f.this.cB.getLoadTime(), 2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(a aVar) {
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView == null) {
            return false;
        }
        if (ksAdWebView.getVisibility() == 0) {
            return true;
        }
        if (this.cF == 1) {
            h(aVar);
            return true;
        }
        aF();
        return false;
    }

    private void h(final a aVar) {
        if (this.cC == null) {
            aB();
            return;
        }
        B(this.qB.mAdTemplate);
        aE();
        this.cB.setVisibility(0);
        ValueAnimator c = m.c(this.cB, this.cC.height + this.cC.bottomMargin, 0);
        this.cL = c;
        c.setInterpolator(new DecelerateInterpolator(2.0f));
        this.cL.setDuration(500L);
        this.cL.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.f.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (f.this.cG != null) {
                    f.this.cG.rD();
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(RewardActionBarControl.ShowActionBarResult.SHOW_H5_SUCCESS, f.this.cB);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (f.this.cG != null) {
                    f.this.cG.rC();
                }
            }
        });
        this.cL.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        this.cF = -1;
        KsAdWebView ksAdWebView = this.cB;
        if (ksAdWebView != null) {
            ksAdWebView.setVisibility(8);
        }
        ay();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.components.ad.reward.monitor.a.a(this.qB.pn, "play_card");
        RewardActionBarControl rewardActionBarControl = this.qB.pc;
        this.pc = rewardActionBarControl;
        rewardActionBarControl.a(this.uJ);
        if (com.kwad.components.ad.reward.j.d(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
        } else {
            bV();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.cB = (KsAdWebView) findViewById(R.id.ksad_play_web_card_webView);
        this.ss = (KsLogoView) findViewById(R.id.ksad_ad_label_play_bar);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        RewardActionBarControl rewardActionBarControl = this.pc;
        if (rewardActionBarControl != null) {
            rewardActionBarControl.a((RewardActionBarControl.e) null);
        }
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.c(this.mPlayEndPageListener);
        aE();
        release();
    }
}
