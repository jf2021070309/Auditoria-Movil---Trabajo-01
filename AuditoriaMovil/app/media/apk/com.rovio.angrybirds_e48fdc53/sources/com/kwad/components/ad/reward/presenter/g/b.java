package com.kwad.components.ad.reward.presenter.g;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.kwad.components.ad.reward.e.j;
import com.kwad.components.ad.reward.m.c;
import com.kwad.components.ad.reward.m.e;
import com.kwad.components.ad.reward.m.q;
import com.kwad.sdk.R;
import com.kwad.sdk.core.c.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.v;
import com.kwad.sdk.widget.KSFrameLayout;
import com.kwad.sdk.widget.f;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements c.a, com.kwad.sdk.b.a, com.kwad.sdk.core.webview.d.a.a, com.kwad.sdk.widget.c {
    private static float xj = 0.4548105f;
    private AdInfo mAdInfo;
    private com.kwad.components.ad.reward.k.b.a pE;
    private ViewGroup xc;
    private q xd;
    private ViewGroup xe;
    private e xf;
    private c xg;
    private c xh;
    private int xk = 15;
    private long xl = -1;
    private boolean xm = false;
    private final j mRewardVerifyListener = new j() { // from class: com.kwad.components.ad.reward.presenter.g.b.3
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (b.this.xg != null && com.kwad.components.ad.reward.j.v(b.this.qB.mAdTemplate)) {
                b.this.xg.jX();
            }
            if (b.this.xh != null) {
                b.this.xh.jX();
            }
        }
    };
    private com.kwad.sdk.core.c.c xn = new d() { // from class: com.kwad.components.ad.reward.presenter.g.b.4
        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToBackground() {
            super.onBackToBackground();
            b.this.X(false);
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToForeground() {
            super.onBackToForeground();
            b.this.X(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void X(boolean z) {
        com.kwad.components.ad.reward.k.b.a aVar;
        com.kwad.components.ad.reward.k.b.a.a(this.pE, getContext(), this.qB.mAdTemplate);
        if (!this.pE.jO()) {
            if (z) {
                Y(false);
            }
        } else if (!z) {
            this.xl = System.currentTimeMillis();
        } else {
            boolean jm = jm();
            if (jm && (aVar = this.pE) != null) {
                aVar.jN();
                com.kwad.components.ad.reward.c.fv().notifyRewardVerify();
                this.qB.mAdOpenInteractionListener.onRewardVerify();
            }
            Y(jm);
        }
    }

    private void Y(boolean z) {
        com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "showTaskToast hasShowCompletedToast: " + this.xm + " completed: " + z);
        if (this.xm) {
            return;
        }
        v.d(getContext(), z ? "恭喜！任务达标啦，成功获取奖励~" : "哎呀，差一点就达标啦，再试一次~", 0);
        if (z) {
            this.xm = true;
        }
    }

    private void Z(boolean z) {
        this.qB.a(1, getContext(), z ? 1 : 153, 1);
    }

    private void a(AdBaseFrameLayout adBaseFrameLayout) {
        getContext();
        if (!ai.IK()) {
            com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "initBottomActionBar screen is horizontal");
            return;
        }
        ((ViewStub) findViewById(R.id.ksad_reward_apk_info_stub)).inflate();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ksad_reward_apk_info_card_native_container);
        this.xe = viewGroup;
        viewGroup.setClickable(true);
        new f(this.xe, this);
        final KSFrameLayout kSFrameLayout = (KSFrameLayout) findViewById(R.id.ksad_reward_apk_info_card_root);
        kSFrameLayout.setRadius(getContext().getResources().getDimension(R.dimen.ksad_reward_apk_info_card_step_icon_radius));
        final float dimension = getContext().getResources().getDimension(R.dimen.ksad_reward_apk_info_card_height);
        kSFrameLayout.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.g.b.1
            @Override // java.lang.Runnable
            public final void run() {
                kSFrameLayout.getHeight();
            }
        });
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.ksad_reward_apk_info_card_native_container);
        this.xe = viewGroup2;
        c cVar = new c(viewGroup2);
        this.xg = cVar;
        cVar.a(this.qB.mApkDownloadHelper);
        this.xg.a(this);
        this.xg.c(this.qB.mAdTemplate, false);
        e eVar = new e((KsAdWebView) findViewById(R.id.ksad_reward_apk_info_card_h5), this.xe, this.qB.mApkDownloadHelper, this);
        this.xf = eVar;
        eVar.a(new com.kwad.components.ad.reward.m.f() { // from class: com.kwad.components.ad.reward.presenter.g.b.2
            @Override // com.kwad.components.ad.reward.m.f
            public final void h(String str, int i) {
                int i2 = com.kwad.sdk.core.response.b.d.ck(b.this.qB.mAdTemplate).status;
                com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "onUpdateDownloadProgress downloadStatus: " + i2);
                b.this.xg.i(str, i);
            }
        });
        this.xf.a(this.qB.mAdTemplate, adBaseFrameLayout);
    }

    private boolean jm() {
        com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "checkUseAppTime appBackgroundTimestamp: " + this.xl);
        return this.xl >= 0 && System.currentTimeMillis() - this.xl > ((long) (this.xk * 1000));
    }

    @Override // com.kwad.sdk.b.a
    public final void S(String str) {
        if (TextUtils.equals(com.kwad.sdk.core.response.b.a.aq(this.mAdInfo), str) && this.qB.pE != null && com.kwad.components.ad.reward.j.t(this.qB.mAdTemplate)) {
            this.qB.pE.jL();
            com.kwad.sdk.core.c.b.AT();
            if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                return;
            }
            this.xl = System.currentTimeMillis();
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        Z(true);
    }

    @Override // com.kwad.sdk.core.webview.d.a.a
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "onBind");
        if (com.kwad.components.ad.reward.j.t(this.qB.mAdTemplate)) {
            this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
            this.xk = com.kwad.components.ad.reward.a.b.gG();
            com.kwad.sdk.core.c.b.AT();
            com.kwad.sdk.core.c.b.a(this.xn);
            com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
            this.pE = com.kwad.components.ad.reward.k.d.jG();
            this.qB.pE = this.pE;
            com.kwad.components.ad.reward.k.b.a.a(this.pE, getContext(), this.qB.mAdTemplate);
            AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ksad_activity_apk_info_area_native);
            this.xc = viewGroup;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                c cVar = new c(this.xc);
                this.xh = cVar;
                cVar.a(this.qB.mApkDownloadHelper);
                this.xh.a(this);
                this.xh.c(this.qB.mAdTemplate, false);
                ((KSFrameLayout) findViewById(R.id.ksad_right_area_webview_container)).setWidthBasedRatio(false);
                q qVar = new q((KsAdWebView) findViewById(R.id.ksad_right_area_webview), this.xc, this.qB.mApkDownloadHelper, this);
                this.xd = qVar;
                qVar.a(this.qB.mAdTemplate, adBaseFrameLayout);
            }
            com.kwad.sdk.b.b.yy().a(this);
            a(adBaseFrameLayout);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.qB.mAdTemplate)) {
            Z(false);
        }
    }

    @Override // com.kwad.components.ad.reward.m.c.a
    public final void c(boolean z, int i) {
        this.qB.b(1, getContext(), z ? 1 : 153, 1);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.e.c.d("LaunchAppTaskPresenter", "onUnbind");
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.b(this.xn);
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
        com.kwad.sdk.b.b.yy().b(this);
        e eVar = this.xf;
        if (eVar != null) {
            eVar.jZ();
            this.xf = null;
        }
        c cVar = this.xh;
        if (cVar != null) {
            cVar.jW();
        }
        this.qB.pE = null;
    }
}
