package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.m.n;
import com.kwad.components.ad.reward.m.r;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.t.g;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
/* loaded from: classes.dex */
public final class e extends com.kwad.components.ad.reward.presenter.a implements RewardActionBarControl.c {
    private ViewGroup gi;
    private KsLogoView ss;
    private n uY;
    private int uZ;
    private FrameLayout.LayoutParams va;
    private n.a vb;

    public e(ViewGroup viewGroup, n.a aVar) {
        this.gi = viewGroup;
        this.vb = aVar;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.qB.pc.a(this);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        this.uZ = this.ss.getVisibility();
        this.va = d.a(getContext(), ck, this.ss, R.dimen.ksad_reward_order_logo_margin_bottom, !this.qB.oZ.jT());
        n nVar = new n(this.gi, new com.kwad.components.ad.reward.m.a(getContext(), this.qB) { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.e.1
            @Override // com.kwad.components.ad.reward.m.a, com.kwad.components.ad.reward.m.b
            public final void ir() {
                e.this.qB.a(1, e.this.getContext(), 10, 2);
            }

            @Override // com.kwad.components.ad.reward.m.a, com.kwad.components.ad.reward.m.b
            public final void is() {
                e.this.qB.a(1, e.this.getContext(), 10, 2);
            }
        });
        this.uY = nVar;
        nVar.a(this.vb);
        this.uY.b(r.E(this.qB.mAdTemplate));
        g.a(new com.kwad.components.core.widget.e(), this.uY.gS());
    }

    @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.c
    public final void e(a aVar) {
        this.gi.setVisibility(0);
        RewardActionBarControl.a(aVar, this.gi, RewardActionBarControl.ShowActionBarResult.SHOW_NATIVE_ORDER);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ss = (KsLogoView) findViewById(R.id.ksad_ad_label_play_bar);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.ss.setVisibility(this.uZ);
        FrameLayout.LayoutParams layoutParams = this.va;
        if (layoutParams != null) {
            this.ss.setLayoutParams(layoutParams);
        }
    }
}
