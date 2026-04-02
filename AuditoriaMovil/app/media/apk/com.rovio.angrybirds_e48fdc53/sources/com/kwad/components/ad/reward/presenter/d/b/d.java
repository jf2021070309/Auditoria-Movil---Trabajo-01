package com.kwad.components.ad.reward.presenter.d.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.webview.b.e.e;
import com.kwad.components.core.webview.b.j;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.reward.presenter.a implements View.OnClickListener, c {
    private static final String[] vZ = {"未获得奖励", "已获得奖励1/2", "已获得全部奖励"};
    private e gv = new e() { // from class: com.kwad.components.ad.reward.presenter.d.b.d.1
        @Override // com.kwad.components.core.webview.b.e.b
        public final void q(String str) {
            if (j.b("ksad-video-top-bar", d.this.qB.mAdTemplate).equals(str)) {
                d.this.bV();
            }
        }
    };
    private final com.kwad.components.ad.reward.e.j mRewardVerifyListener = new com.kwad.components.ad.reward.e.j() { // from class: com.kwad.components.ad.reward.presenter.d.b.d.2
        @Override // com.kwad.components.ad.reward.e.j
        public final void onRewardVerify() {
            if (com.kwad.components.ad.reward.j.v(d.this.qB.mAdTemplate)) {
                d.this.iO();
            }
        }
    };
    private ViewGroup vV;
    private ImageView vW;
    private ViewGroup vX;
    private TextView vY;

    /* JADX INFO: Access modifiers changed from: private */
    public void bV() {
        com.kwad.components.ad.reward.c.fv().a(this.mRewardVerifyListener);
        this.vV.setVisibility(0);
        this.vX.setVisibility(com.kwad.components.ad.reward.j.v(this.qB.mAdTemplate) ? 0 : 8);
    }

    private void iN() {
        ImageView imageView = this.vW;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.vW.setOnClickListener(this);
        }
        ViewGroup viewGroup = this.vV;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
            this.vV.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iO() {
        this.vY.setText(vZ[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdClick() {
        com.kwad.components.ad.reward.i.b.a(this.qB.mAdTemplate, (String) null, (String) null, new com.kwad.sdk.core.report.j().c(this.qB.mRootContainer.getTouchCoords()).cg(41), this.qB.mReportExtData);
        this.qB.mAdOpenInteractionListener.bF();
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

    @Override // com.kwad.components.ad.reward.presenter.d.b.c
    public final void iL() {
        if (this.qB.py) {
            if (com.kwad.sdk.core.response.b.a.ak(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate))) {
                this.vX.setVisibility(8);
            }
        } else if (com.kwad.components.ad.reward.j.t(this.qB.mAdTemplate) || com.kwad.components.ad.reward.j.u(this.qB.mAdTemplate)) {
            if (this.qB.ge()) {
                return;
            }
            this.vY.setText(this.qB.pt ? vZ[1] : vZ[0]);
        } else if (this.qB.ge()) {
            iN();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.vW || view == this.vV) {
            com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.qB.mAdTemplate).b(this.qB.mApkDownloadHelper).al(false).ao(2).a(new a.b() { // from class: com.kwad.components.ad.reward.presenter.d.b.d.3
                @Override // com.kwad.components.core.e.d.a.b
                public final void onAdClicked() {
                    d.this.notifyAdClick();
                }
            }));
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.vV = (ViewGroup) findViewById(R.id.ksad_end_reward_icon_layout);
        this.vW = (ImageView) findViewById(R.id.ksad_end_reward_icon);
        this.vX = (ViewGroup) findViewById(R.id.ksad_detail_reward_deep_task_view_playend);
        this.vY = (TextView) findViewById(R.id.ksad_reward_deep_task_count_down_playend);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.components.ad.reward.c.fv().b(this.mRewardVerifyListener);
        com.kwad.components.core.webview.b.d.b.si().b(this.gv);
        this.vV.setVisibility(8);
        this.vW.setVisibility(8);
        this.vX.setVisibility(8);
    }
}
