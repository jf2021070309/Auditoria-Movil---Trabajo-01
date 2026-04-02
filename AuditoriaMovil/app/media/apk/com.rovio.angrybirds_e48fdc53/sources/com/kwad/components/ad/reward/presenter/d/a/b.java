package com.kwad.components.ad.reward.presenter.d.a;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.kwad.components.ad.reward.e.f;
import com.kwad.components.ad.reward.e.j;
import com.kwad.components.ad.reward.m.k;
import com.kwad.components.ad.reward.widget.tailframe.TailFrameView;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.reward.presenter.a implements ak.b {
    private com.kwad.components.ad.k.b bY;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private DetailVideoView mDetailVideoView;
    private TailFrameView vF;
    private volatile boolean vG;
    private boolean vH;
    private k vI;
    private Drawable vL;
    private boolean sS = false;
    private int vJ = Integer.MIN_VALUE;
    private int vK = Integer.MIN_VALUE;
    private final j mRewardVerifyListener = new j() { // from class: com.kwad.components.ad.reward.presenter.d.a.b.1
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            b.this.iE();
            if (b.this.vF == null || !com.kwad.components.ad.reward.j.v(b.this.mAdTemplate)) {
                return;
            }
            b.this.vF.jX();
        }
    };
    private f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.d.a.b.2
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if ((!d.cy(b.this.mAdTemplate) && b.this.sS && !b.this.qB.fZ()) || b.this.qB.py || b.this.qB.pD) {
                return;
            }
            b.this.vH = true;
            if (b.this.bY != null && b.this.bY.ap()) {
                b.this.vH = false;
            }
            b.this.qB.pP = true ^ b.this.vH;
            if (b.this.vH) {
                if (b.this.qB.pd != null) {
                    com.kwad.components.ad.reward.monitor.a.a(b.this.qB.pn, "end_card", com.kwad.sdk.core.response.b.b.bn(b.this.mAdTemplate), System.currentTimeMillis() - b.this.qB.pd.getLoadTime(), 1);
                }
                b.this.aG();
            }
        }

        @Override // com.kwad.components.ad.reward.e.a, com.kwad.components.ad.reward.e.f
        public final int getPriority() {
            return -1;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z) {
        com.kwad.components.ad.reward.i.b.a(this.mAdTemplate, "native_id", (String) null, new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(z ? 2 : 153), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
    }

    private void O(int i) {
        ViewGroup.LayoutParams layoutParams = this.mDetailVideoView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            this.mDetailVideoView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aG() {
        iE();
        this.vF.a(new com.kwad.components.ad.reward.widget.tailframe.b() { // from class: com.kwad.components.ad.reward.presenter.d.a.b.3
            @Override // com.kwad.components.ad.reward.widget.tailframe.b
            public final void O(boolean z) {
                b.this.L(z);
            }
        });
        this.vF.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iE() {
        if (this.vG) {
            return;
        }
        iF();
    }

    private void iF() {
        com.kwad.sdk.core.e.c.d("RewardPlayEndNativeCardPresenter", "initTailView");
        this.vF.a(getContext(), this.qB.mScreenOrientation == 0, iH());
        this.vG = true;
    }

    private void iG() {
        if (this.vH) {
            iE();
            this.vF.destroy();
            this.vF.setVisibility(8);
            this.vI.hide();
        }
    }

    private boolean iH() {
        AdInfo.AdMaterialInfo.MaterialFeature aN = com.kwad.sdk.core.response.b.a.aN(this.mAdInfo);
        return aN.height > aN.width;
    }

    @Override // com.kwad.components.core.webview.jshandler.ak.b
    public final void a(ak.a aVar) {
        this.sS = aVar.isSuccess();
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        k kVar;
        super.ah();
        if (this.qB.pb != null) {
            this.qB.pb.a(this);
        }
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = d.ck(adTemplate);
        this.bY = this.qB.pd;
        this.qB.b(this.mPlayEndPageListener);
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.vF.setCallerContext(this.qB);
        ViewStub viewStub = (ViewStub) findViewById(R.id.ksad_playend_native_jinniu);
        if (viewStub != null) {
            kVar = new k(this.qB, viewStub);
        } else {
            kVar = new k(this.qB, (ViewGroup) findViewById(R.id.ksad_reward_jinniu_end_card_root));
        }
        this.vI = kVar;
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.vF = (TailFrameView) findViewById(R.id.ksad_video_tail_frame);
        DetailVideoView detailVideoView = (DetailVideoView) findViewById(R.id.ksad_video_player);
        this.mDetailVideoView = detailVideoView;
        if (detailVideoView.getLayoutTransition() != null) {
            this.mDetailVideoView.getLayoutTransition().enableTransitionType(4);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (this.qB.pb != null) {
            this.qB.pb.b(this);
        }
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
        iG();
        this.qB.c(this.mPlayEndPageListener);
        DetailVideoView detailVideoView = this.mDetailVideoView;
        if (detailVideoView != null) {
            int i = this.vK;
            if (i != Integer.MIN_VALUE) {
                detailVideoView.updateTextureViewGravity(i);
            }
            com.kwad.sdk.core.e.c.d("RewardPlayEndNativeCardPresenter", "onUnbind:  videoOriginalWidth :" + this.vJ);
            int i2 = this.vJ;
            if (i2 != Integer.MIN_VALUE) {
                O(i2);
            }
            Drawable drawable = this.vL;
            if (drawable != null) {
                this.mDetailVideoView.setBackground(drawable);
            }
        }
    }
}
