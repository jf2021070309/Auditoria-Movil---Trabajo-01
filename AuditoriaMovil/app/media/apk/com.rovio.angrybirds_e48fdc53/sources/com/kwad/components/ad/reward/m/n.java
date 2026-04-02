package com.kwad.components.ad.reward.m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.ad.reward.widget.KSCouponLabelTextView;
import com.kwad.components.ad.widget.KsPriceView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.CouponInfo;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
/* loaded from: classes.dex */
public final class n extends d implements View.OnClickListener {
    private ViewGroup gi;
    private TextView yT;
    private ViewGroup zM;
    private KSCornerImageView zS;
    private LinearLayout zT;
    private KsPriceView zU;
    private TextView zV;
    private View zW;
    private KSCornerImageView zX;
    private b zY;
    private a zZ;

    /* loaded from: classes.dex */
    public interface a {
        void hD();
    }

    public n(ViewGroup viewGroup, b bVar) {
        this.gi = viewGroup;
        this.zY = bVar;
        initView();
    }

    private static View a(Context context, CouponInfo couponInfo, ViewGroup viewGroup) {
        KSCouponLabelTextView kSCouponLabelTextView = (KSCouponLabelTextView) com.kwad.sdk.m.l.a(context, R.layout.ksad_reward_order_card_coupon, viewGroup, false);
        kSCouponLabelTextView.setText(couponInfo.getDisplayName());
        return kSCouponLabelTextView;
    }

    static /* synthetic */ View a(n nVar, Context context, CouponInfo couponInfo, ViewGroup viewGroup) {
        return a(context, couponInfo, viewGroup);
    }

    private void a(final AdProductInfo adProductInfo, AdTemplate adTemplate) {
        KSImageLoader.loadImage(this.zS, adProductInfo.getIcon(), adTemplate);
        this.yT.setText(adProductInfo.getName());
        if (adProductInfo.isCouponListEmpty()) {
            this.zT.setVisibility(8);
            this.zZ.hD();
        } else {
            this.zT.setVisibility(0);
            this.zT.post(new Runnable() { // from class: com.kwad.components.ad.reward.m.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    for (CouponInfo couponInfo : adProductInfo.getCouponList()) {
                        n nVar = n.this;
                        View a2 = n.a(nVar, nVar.zT.getContext(), couponInfo, n.this.zT);
                        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -1);
                        } else {
                            layoutParams.width = -2;
                            layoutParams.height = -1;
                        }
                        n.this.zT.addView(a2, layoutParams);
                        com.kwad.components.core.t.g.a(new com.kwad.components.core.widget.e(), n.this.zT);
                    }
                    if (n.this.zZ != null) {
                        if (n.this.zT.getChildCount() > 0) {
                            n.this.zT.getChildAt(0).post(new Runnable() { // from class: com.kwad.components.ad.reward.m.n.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    n.this.zZ.hD();
                                }
                            });
                        } else {
                            n.this.zZ.hD();
                        }
                    }
                }
            });
        }
        this.zU.f(adProductInfo.getPrice(), adProductInfo.getOriginPrice());
        String X = com.kwad.components.ad.d.b.X();
        if (bc.isNullString(X)) {
            return;
        }
        KSImageLoader.loadImage(this.zX, X, adTemplate);
    }

    private void initView() {
        this.zM = (ViewGroup) this.gi.findViewById(R.id.ksad_reward_order_root);
        this.zS = (KSCornerImageView) this.gi.findViewById(R.id.ksad_reward_order_icon);
        this.yT = (TextView) this.gi.findViewById(R.id.ksad_reward_order_title);
        this.zT = (LinearLayout) this.gi.findViewById(R.id.ksad_reward_order_coupon_list);
        this.zU = (KsPriceView) this.gi.findViewById(R.id.ksad_reward_order_price);
        this.zV = (TextView) this.gi.findViewById(R.id.ksad_reward_order_btn_buy);
        this.zW = this.gi.findViewById(R.id.ksad_reward_order_text_area);
        this.zX = (KSCornerImageView) this.gi.findViewById(R.id.ksad_reward_order_kwai_logo);
        this.zV.setText(com.kwad.components.ad.d.b.W());
        this.zV.setOnClickListener(this);
        this.zS.setOnClickListener(this);
        this.zW.setOnClickListener(this);
        Context context = this.gi.getContext();
        if (ai.IK()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.gi.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_reward_follow_card_width_horizontal);
            this.gi.setLayoutParams(layoutParams2);
        }
    }

    public final void a(a aVar) {
        this.zZ = aVar;
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        a(com.kwad.sdk.core.response.b.a.cy(com.kwad.sdk.core.response.b.d.ck(rVar.getAdTemplate())), rVar.getAdTemplate());
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.zM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.zY == null) {
            return;
        }
        if (view.equals(this.zV)) {
            this.zY.gW();
        } else if (view.equals(this.zS)) {
            this.zY.ir();
        } else if (view.equals(this.zW)) {
            this.zY.is();
        }
    }
}
