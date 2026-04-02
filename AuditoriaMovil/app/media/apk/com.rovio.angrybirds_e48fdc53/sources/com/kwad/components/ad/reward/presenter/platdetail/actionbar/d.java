package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.ad.reward.m.i;
import com.kwad.components.ad.reward.m.r;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class d extends com.kwad.components.ad.reward.presenter.a implements com.kwad.components.ad.reward.m.b {
    private ViewGroup gi;
    private KsLogoView ss;
    private i uX;

    public d(ViewGroup viewGroup) {
        this.gi = viewGroup;
    }

    public static FrameLayout.LayoutParams a(Context context, AdInfo adInfo, KsLogoView ksLogoView, int i, boolean z) {
        FrameLayout.LayoutParams layoutParams = null;
        if (ksLogoView != null && context != null) {
            ViewGroup.LayoutParams layoutParams2 = ksLogoView.getLayoutParams();
            if (!(layoutParams2 instanceof FrameLayout.LayoutParams)) {
                return null;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams = a(layoutParams3);
            boolean z2 = false;
            if (z) {
                ksLogoView.setVisibility(0);
            }
            boolean z3 = !ai.IK() && (com.kwad.components.ad.reward.a.b.i(adInfo) || com.kwad.sdk.core.response.b.a.cq(adInfo));
            boolean z4 = ai.IK() && com.kwad.sdk.core.response.b.a.cp(adInfo);
            if (z3 || z4) {
                z2 = true;
            }
            layoutParams3.gravity = 85;
            if (z2) {
                i = R.dimen.ksad_reward_follow_card_margin;
            }
            layoutParams3.bottomMargin = context.getResources().getDimensionPixelOffset(i);
            layoutParams3.rightMargin = context.getResources().getDimensionPixelOffset(R.dimen.ksad_reward_follow_card_margin);
            ksLogoView.setLayoutParams(layoutParams3);
        }
        return layoutParams;
    }

    private static FrameLayout.LayoutParams a(FrameLayout.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        layoutParams2.gravity = layoutParams.gravity;
        return layoutParams2;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        i iVar = new i(this.qB, this.gi, this.ss);
        this.uX = iVar;
        iVar.b(r.E(this.qB.mAdTemplate));
        a(getContext(), com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate), this.ss, R.dimen.ksad_reward_jinniu_logo_margin_bottom, false);
    }

    @Override // com.kwad.components.ad.reward.m.b
    public final void gW() {
    }

    @Override // com.kwad.components.ad.reward.m.b
    public final void ir() {
    }

    @Override // com.kwad.components.ad.reward.m.b
    public final void is() {
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ss = (KsLogoView) findViewById(R.id.ksad_ad_label_play_bar);
    }
}
