package com.kwad.components.ad.reward.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.components.ad.widget.KsPriceView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.components.core.widget.KsStyledTextButton;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.CouponInfo;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class i extends d implements View.OnClickListener {
    private TextView gS;
    private KSCornerImageView lF;
    private TextView lG;
    private KsLogoView mLogoView;
    private com.kwad.components.ad.reward.j qB;
    private ViewGroup sA;
    private ViewGroup yZ;
    private KsPriceView za;
    private TextView zb;
    private KsStyledTextButton zc;
    private TextView zd;
    private TextView ze;
    private View zf;
    private ImageView zg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private String lr;
        private String qp;
        private String qq;
        private String rS;
        private String rating;
        private String title;
        private String zq;
        private String zr;
        private String zs;
        private String zt;

        private a() {
        }

        static a D(AdTemplate adTemplate) {
            CouponInfo firstCouponList;
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(ck);
            a aVar = new a();
            String name = cy.getName();
            aVar.title = name;
            if (TextUtils.isEmpty(name)) {
                aVar.title = com.kwad.sdk.core.response.b.a.ap(ck);
            }
            aVar.zs = com.kwad.sdk.core.response.b.a.aw(ck);
            aVar.qp = cy.getIcon();
            aVar.qq = com.kwad.sdk.core.response.b.a.an(ck);
            aVar.zq = cy.getPrice();
            aVar.lr = cy.getOriginPrice();
            aVar.zt = cy.getVolume();
            aVar.rating = cy.getRating();
            if (!cy.isCouponListEmpty() && (firstCouponList = cy.getFirstCouponList()) != null) {
                aVar.zr = CouponInfo.jinniuFormatCoupon(firstCouponList);
                aVar.P(firstCouponList.getFormattedJinniuPrefix());
            }
            return aVar;
        }

        private void P(String str) {
            this.rS = str;
        }

        public final String eh() {
            return this.lr;
        }

        public final String getRating() {
            return this.rating;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String gw() {
            return this.qp;
        }

        public final String gx() {
            return this.qq;
        }

        public final String hi() {
            return this.rS;
        }

        public final String kc() {
            return this.zq;
        }

        public final String kd() {
            return this.zr;
        }

        public final String ke() {
            return this.zs;
        }

        public final String kf() {
            return this.zt;
        }
    }

    public i(com.kwad.components.ad.reward.j jVar, ViewGroup viewGroup, KsLogoView ksLogoView) {
        this.qB = jVar;
        this.mLogoView = ksLogoView;
        this.yZ = viewGroup;
        initView();
    }

    private static Animator a(View view, float f) {
        if (view == null || view.getWidth() <= 0) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", view.getResources().getDimension(R.dimen.ksad_jinniu_light_sweep_width) + f).setDuration(1000L);
        duration.setInterpolator(PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f).setDuration(1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator a(final View view, View view2, final View view3) {
        final int height = view.getHeight();
        if (height <= 0 || view.getLayoutParams() == null) {
            return null;
        }
        Interpolator create = PathInterpolatorCompat.create(0.51f, 0.0f, 0.67f, 1.0f);
        ValueAnimator duration = ValueAnimator.ofInt(height, view.getResources().getDimensionPixelSize(R.dimen.ksad_reward_jinniu_card_height_full)).setDuration(500L);
        duration.setInterpolator(create);
        view.getContext();
        if (ai.IK() && view3 != null && (view3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            final int i = marginLayoutParams.bottomMargin;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.m.i.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    marginLayoutParams.bottomMargin = i + (intValue - height);
                    view3.setLayoutParams(marginLayoutParams);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                        view.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 0.0f).setDuration(200L);
        Interpolator create2 = PathInterpolatorCompat.create(0.86f, 0.0f, 0.83f, 1.0f);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f).setDuration(300L);
        duration3.setInterpolator(create2);
        animatorSet.playSequentially(duration2, duration3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration, animatorSet);
        return animatorSet2;
    }

    static /* synthetic */ Animator a(i iVar, View view, float f) {
        return a(view, f);
    }

    private void a(AdTemplate adTemplate, a aVar) {
        TextView textView;
        String rating;
        if (aVar == null) {
            return;
        }
        KSImageLoader.loadAppIcon(this.lF, aVar.gw(), adTemplate, 4);
        TextView textView2 = this.gS;
        if (textView2 != null) {
            textView2.setText(aVar.getTitle());
        }
        TextView textView3 = this.lG;
        if (textView3 != null) {
            textView3.setText(aVar.gx());
        }
        KsPriceView ksPriceView = this.za;
        if (ksPriceView != null) {
            int dimensionPixelSize = ksPriceView.getResources().getDimensionPixelSize(R.dimen.ksad_reward_jinniu_end_origin_text_size);
            this.za.getConfig().ag(dimensionPixelSize).ai(dimensionPixelSize).ah(this.za.getResources().getColor(R.color.ksad_jinniu_end_origin_color));
            this.za.d(aVar.kc(), aVar.eh(), true);
        }
        if (this.zb != null) {
            if (!TextUtils.isEmpty(aVar.kf())) {
                textView = this.zb;
                rating = aVar.kf();
            } else if (TextUtils.isEmpty(aVar.getRating())) {
                this.zb.setVisibility(8);
            } else {
                textView = this.zb;
                rating = aVar.getRating();
            }
            textView.setText(rating);
        }
        if (this.zd != null && !TextUtils.isEmpty(aVar.kd())) {
            this.zd.setText(aVar.kd());
        }
        if (this.zc != null && !TextUtils.isEmpty(aVar.ke())) {
            this.zc.setText(aVar.ke());
        }
        int i = TextUtils.isEmpty(aVar.kd()) ? 8 : 0;
        View view = this.zf;
        if (view != null) {
            view.setVisibility(i);
        }
        if (this.ze == null || TextUtils.isEmpty(aVar.hi())) {
            return;
        }
        this.ze.setText(aVar.hi());
    }

    private void initView() {
        this.sA = (ViewGroup) this.yZ.findViewById(R.id.ksad_reward_jinniu_root);
        this.lF = (KSCornerImageView) this.yZ.findViewById(R.id.ksad_reward_jinniu_icon);
        this.gS = (TextView) this.yZ.findViewById(R.id.ksad_reward_jinniu_title);
        this.lG = (TextView) this.yZ.findViewById(R.id.ksad_reward_jinniu_desc);
        this.za = (KsPriceView) this.yZ.findViewById(R.id.ksad_reward_jinniu_price);
        this.zb = (TextView) this.yZ.findViewById(R.id.ksad_reward_jinniu_right_label);
        this.zc = (KsStyledTextButton) this.yZ.findViewById(R.id.ksad_reward_jinniu_btn_buy);
        this.zg = (ImageView) this.yZ.findViewById(R.id.ksad_reward_jinniu_light_sweep);
        this.zf = this.yZ.findViewById(R.id.ksad_reward_jinniu_coupon_layout);
        this.zd = (TextView) this.yZ.findViewById(R.id.ksad_reward_jinniu_coupon);
        this.ze = (TextView) this.yZ.findViewById(R.id.ksad_reward_jinniu_coupon_prefix);
        this.sA.setOnClickListener(this);
        KsStyledTextButton ksStyledTextButton = this.zc;
        if (ksStyledTextButton != null) {
            ksStyledTextButton.setOnClickListener(this);
        }
        Context context = this.sA.getContext();
        if (ai.IK()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.sA.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_reward_follow_card_width_horizontal);
            this.sA.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        if (rVar == null) {
            return;
        }
        a(rVar.getAdTemplate(), a.D(rVar.getAdTemplate()));
        ViewGroup viewGroup = this.sA;
        if (viewGroup != null) {
            viewGroup.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.m.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = i.this;
                    Animator a2 = iVar.a(iVar.sA, i.this.zc, i.this.mLogoView);
                    if (a2 != null) {
                        a2.start();
                    }
                }
            }, 3000L);
            this.sA.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.m.i.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (i.this.zc == null || i.this.zc.getWidth() == 0) {
                        return;
                    }
                    i iVar = i.this;
                    final Animator a2 = i.a(iVar, iVar.zg, i.this.zc.getWidth());
                    if (a2 != null) {
                        a2.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.m.i.2.1
                            private int zi = 1;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                if (this.zi >= 3) {
                                    return;
                                }
                                a2.start();
                                this.zi++;
                            }
                        });
                        a2.start();
                    }
                }
            }, PushUIConfig.dismissTime);
        }
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.sA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.sA)) {
            this.qB.a(1, view.getContext(), 118, 2);
        } else if (view.equals(this.zc)) {
            this.qB.a(1, view.getContext(), 1, 1);
        }
    }
}
