package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.kwad.components.ad.reward.m.h;
import com.kwad.components.ad.reward.m.r;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape;
import com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait;
import com.kwad.components.ad.reward.widget.actionbar.ActionBarH5;
import com.kwad.components.core.t.m;
import com.kwad.components.core.video.l;
import com.kwad.components.core.webview.b.j;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a {
    private ValueAnimator cL;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private RewardActionBarControl pc;
    private KsLogoView ss;
    private ViewGroup uA;
    private ViewGroup uB;
    private ViewGroup uC;
    private h uD;
    private boolean uE;
    private ActionBarAppLandscape uv;
    private ActionBarAppPortrait uw;
    private ActionBarH5 ux;
    private boolean uz;
    private boolean uy = false;
    private final l sw = new l() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.g
        public final void onLivePlayEnd() {
            super.onLivePlayEnd();
            b.this.uE = true;
            if (!com.kwad.sdk.core.response.b.a.cw(b.this.mAdInfo) || b.this.uC == null) {
                return;
            }
            b.this.uC.setVisibility(8);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            b.this.uE = false;
            if (!com.kwad.sdk.core.response.b.a.cw(b.this.mAdInfo) || b.this.uC == null) {
                return;
            }
            b.this.uC.setVisibility(0);
        }
    };
    private com.kwad.components.core.webview.b.e.e gv = new com.kwad.components.core.webview.b.e.e() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.5
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-bottom-card-v2", b.this.qB.mAdTemplate).equals(str)) {
                b.this.bV();
            }
        }
    };
    private RewardActionBarControl.b uF = new RewardActionBarControl.b() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.6
        @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.b
        public final void a(boolean z, a aVar) {
            b.this.uz = true;
            b.this.a(z, aVar);
        }
    };
    private com.kwad.components.ad.reward.e.f uG = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.7
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            b.this.uz = false;
            b.this.M(false);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void M(boolean z) {
        View view;
        if (this.uy) {
            this.uy = false;
            this.ss.setVisibility(8);
            ViewGroup viewGroup = this.uA;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.uC;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            if (com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
                if (this.qB.mScreenOrientation == 1) {
                    if (z) {
                        m16if();
                        return;
                    } else {
                        ig();
                        return;
                    }
                } else if (!z) {
                    ActionBarAppPortrait actionBarAppPortrait = this.uw;
                    if (actionBarAppPortrait != null) {
                        actionBarAppPortrait.setVisibility(8);
                        return;
                    }
                    return;
                } else {
                    view = this.uw;
                    if (view == null) {
                        return;
                    }
                }
            } else if (!z) {
                this.ux.setVisibility(8);
                return;
            } else {
                view = this.ux;
            }
            g(view, com.kwad.sdk.d.a.a.a(getContext(), 90.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, a aVar) {
        ViewGroup viewGroup;
        RewardActionBarControl.ShowActionBarResult showActionBarResult;
        ViewGroup viewGroup2;
        if (this.uy) {
            return;
        }
        this.uy = true;
        this.ss.setVisibility(com.kwad.sdk.core.response.b.a.cw(this.mAdInfo) ? 8 : 0);
        getContext();
        final boolean z2 = !ai.IK();
        if (com.kwad.sdk.core.response.b.a.aV(this.mAdInfo)) {
            if (this.uD == null) {
                h hVar = new h() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.8
                    @Override // com.kwad.components.ad.reward.m.h
                    public final int ih() {
                        return z2 ? R.id.ksad_common_app_card_land_stub : super.ih();
                    }
                };
                this.uD = hVar;
                hVar.a(new h.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.9
                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void ii() {
                        b.this.qB.a(1, b.this.getContext(), 29, 1);
                    }

                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void ij() {
                        b.this.qB.a(1, b.this.getContext(), 30, 2);
                    }

                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void ik() {
                        b.this.qB.a(1, b.this.getContext(), 31, 2);
                    }

                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void il() {
                        b.this.qB.a(1, b.this.getContext(), 32, 2);
                    }

                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void im() {
                        b.this.qB.a(1, b.this.getContext(), 84, 2);
                    }

                    @Override // com.kwad.components.ad.reward.m.h.a
                    public final void in() {
                        b.this.qB.a(1, b.this.getContext(), 53, 2);
                    }
                });
                this.uD.f((ViewGroup) getRootView());
                this.uD.b(r.a(this.mAdTemplate, this.mApkDownloadHelper));
            }
            this.uD.show();
            viewGroup = this.uD.gS();
            showActionBarResult = RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_PLAYABLE_PORTRAIT;
        } else if (com.kwad.sdk.core.response.b.a.bL(this.mAdInfo) != 1 || (viewGroup2 = this.uA) == null) {
            if (com.kwad.sdk.core.response.b.a.cw(this.mAdInfo)) {
                ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.ksad_reward_origin_live_root);
                this.uC = viewGroup3;
                if (viewGroup3 != null) {
                    if (!this.uE) {
                        viewGroup3.setVisibility(0);
                    }
                    viewGroup = this.uC;
                    showActionBarResult = RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORIGIN_LIVE;
                }
            }
            if (com.kwad.sdk.core.response.b.a.aR(this.mAdTemplate)) {
                ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.ksad_reward_live_subscribe_root);
                this.uB = viewGroup4;
                if (viewGroup4 != null) {
                    Resources resources = viewGroup4.getResources();
                    e(this.uB, (int) (resources.getDimension(R.dimen.ksad_live_subscribe_card_full_height) + resources.getDimension(R.dimen.ksad_live_subscribe_card_margin)));
                    viewGroup = this.uB;
                    showActionBarResult = RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_LIVE_SUBSCRIBE;
                }
            }
            if (!com.kwad.sdk.core.response.b.a.ax(this.mAdInfo)) {
                d(z, aVar);
                return;
            } else if (this.qB.mScreenOrientation == 1) {
                b(z, aVar);
                return;
            } else {
                c(z, aVar);
                return;
            }
        } else {
            viewGroup2.setVisibility(0);
            viewGroup = this.uA;
            showActionBarResult = RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_JINNIU;
        }
        RewardActionBarControl.a(aVar, viewGroup, showActionBarResult);
    }

    private void aE() {
        ValueAnimator valueAnimator = this.cL;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.cL.cancel();
        }
    }

    private void b(boolean z, a aVar) {
        id();
        this.uv.a(this.mAdTemplate, this.mApkDownloadHelper, new ActionBarAppLandscape.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.10
            @Override // com.kwad.components.ad.reward.widget.actionbar.ActionBarAppLandscape.a
            public final void O(boolean z2) {
                b.this.N(z2);
            }
        });
        if (z) {
            f(this.uv, com.kwad.sdk.d.a.a.a(getContext(), 90.0f));
        } else {
            this.uv.setVisibility(0);
        }
        RewardActionBarControl.a(aVar, this.uv, RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mAdInfo = ck;
        if (com.kwad.sdk.core.response.b.a.cq(ck)) {
            this.uA = (ViewGroup) findViewById(R.id.ksad_reward_jinniu_root);
        }
        this.ss.ad(this.mAdTemplate);
        this.mApkDownloadHelper = this.qB.mApkDownloadHelper;
        RewardActionBarControl rewardActionBarControl = this.qB.pc;
        this.pc = rewardActionBarControl;
        rewardActionBarControl.a(this.uF);
        this.qB.b(this.uG);
    }

    private void c(boolean z, a aVar) {
        ie();
        this.uw.a(this.mAdTemplate, this.mApkDownloadHelper, new ActionBarAppPortrait.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.11
            @Override // com.kwad.components.ad.reward.widget.actionbar.ActionBarAppPortrait.a
            public final void O(boolean z2) {
                b.this.N(z2);
            }
        });
        if (z) {
            f(this.uw, com.kwad.sdk.d.a.a.a(getContext(), 90.0f));
        } else {
            this.uw.setVisibility(0);
        }
        RewardActionBarControl.a(aVar, this.uw, RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT);
    }

    private void d(boolean z, a aVar) {
        this.ux.a(this.mAdTemplate, new ActionBarH5.a() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.12
            @Override // com.kwad.components.ad.reward.widget.actionbar.ActionBarH5.a
            public final void O(boolean z2) {
                b.this.N(z2);
            }
        });
        if (z) {
            f(this.ux, com.kwad.sdk.d.a.a.a(getContext(), 90.0f));
        } else {
            this.ux.setVisibility(0);
        }
        RewardActionBarControl.a(aVar, this.ux, RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_DEFAULT);
    }

    private void e(final View view, int i) {
        aE();
        view.setVisibility(0);
        Interpolator create = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        ValueAnimator c = m.c(view, i, 0);
        this.cL = c;
        c.setInterpolator(create);
        this.cL.setDuration(500L);
        this.cL.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(0);
            }
        });
        this.cL.start();
    }

    @Deprecated
    private void f(final View view, int i) {
        aE();
        view.setVisibility(0);
        ValueAnimator b = m.b(view, 0, i);
        this.cL = b;
        b.setInterpolator(new DecelerateInterpolator(2.0f));
        this.cL.setDuration(500L);
        this.cL.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(0);
            }
        });
        this.cL.start();
    }

    private void g(final View view, int i) {
        aE();
        view.setVisibility(0);
        ValueAnimator b = m.b(view, i, 0);
        this.cL = b;
        b.setInterpolator(new DecelerateInterpolator(2.0f));
        this.cL.setDuration(300L);
        this.cL.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.b.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(8);
            }
        });
        this.cL.start();
    }

    private void id() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_action_bar_landscape);
        this.uv = (ActionBarAppLandscape) (viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_video_play_bar_app_landscape));
    }

    private void ie() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_action_bar);
        this.uw = (ActionBarAppPortrait) (viewStub != null ? viewStub.inflate() : findViewById(R.id.ksad_video_play_bar_app_portrait));
    }

    /* renamed from: if  reason: not valid java name */
    private void m16if() {
        ie();
        f(this.uw, com.kwad.sdk.d.a.a.a(getContext(), 90.0f));
    }

    private void ig() {
        ActionBarAppPortrait actionBarAppPortrait = this.uw;
        if (actionBarAppPortrait != null) {
            actionBarAppPortrait.setVisibility(8);
        }
    }

    protected final void N(boolean z) {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, "native_id", (String) null, new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(z ? 1 : 153), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        if (com.kwad.components.ad.reward.j.d(this.qB)) {
            com.kwad.components.core.webview.b.d.b.si().a(this.gv);
            return;
        }
        this.qB.oZ.a(this.sw);
        bV();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ss = (KsLogoView) findViewById(R.id.ksad_ad_label_play_bar);
        this.ux = (ActionBarH5) findViewById(R.id.ksad_video_play_bar_h5);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        RewardActionBarControl rewardActionBarControl = this.pc;
        if (rewardActionBarControl != null) {
            rewardActionBarControl.a((RewardActionBarControl.b) null);
        }
        this.qB.oZ.b(this.sw);
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.qB.c(this.uG);
        aE();
    }
}
