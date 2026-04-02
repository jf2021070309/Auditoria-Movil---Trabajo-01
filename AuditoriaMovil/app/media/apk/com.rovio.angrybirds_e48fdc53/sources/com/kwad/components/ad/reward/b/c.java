package com.kwad.components.ad.reward.b;

import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.ad.reward.b.b;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.reward.presenter.a implements b.a {
    private AdTemplate mAdTemplate;
    private boolean rp = false;

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.rp = true;
        return true;
    }

    private static boolean l(AdInfo adInfo) {
        AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
        return (!com.kwad.components.ad.reward.a.b.i(adInfo) || cy == null || cy.isCouponListEmpty()) ? false : true;
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mAdTemplate = this.qB.mAdTemplate;
    }

    @Override // com.kwad.components.ad.reward.b.b.a
    public final void gW() {
        this.qB.a(1, getContext(), 29, 1);
    }

    public final void showDialog() {
        com.kwad.sdk.core.e.c.d("RewardCouponDialogPresenter", "onBind hasShown : " + this.rp);
        if (this.rp) {
            return;
        }
        AdInfo ck = d.ck(this.mAdTemplate);
        ViewGroup viewGroup = (ViewGroup) this.qB.mRootContainer.findViewById(R.id.ksad_reward_order_coupon_list);
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        View view = viewGroup;
        if (childCount > 0) {
            view = viewGroup.getChildAt(0);
        }
        final int[] D = com.kwad.sdk.d.a.a.D(view);
        if (!l(ck) || D == null) {
            return;
        }
        view.post(new Runnable() { // from class: com.kwad.components.ad.reward.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.core.e.c.d("RewardCouponDialogPresenter", "targetView x: " + D[0] + ", y: " + D[1]);
                b.a(c.this.getActivity(), c.this.mAdTemplate, c.this, D);
                c.a(c.this, true);
            }
        });
    }
}
