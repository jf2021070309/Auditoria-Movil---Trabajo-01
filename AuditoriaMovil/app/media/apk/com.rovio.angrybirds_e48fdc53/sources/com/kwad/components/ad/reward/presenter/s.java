package com.kwad.components.ad.reward.presenter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.utils.bj;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s extends a implements View.OnClickListener, com.kwad.components.ad.reward.e.m, com.kwad.sdk.core.g.b {
    private com.kwad.sdk.core.g.d dO;
    private Vibrator dP;
    private ViewGroup gR;
    private TextView gS;
    private TextView gT;
    private ImageView gU;
    private FrameLayout gV;
    private ImageView gW;
    private FrameLayout gX;
    private TextView gY;
    private Animator gZ;
    private com.kwad.components.ad.reward.e.f mPlayEndPageListener = new com.kwad.components.ad.reward.e.a() { // from class: com.kwad.components.ad.reward.presenter.s.1
        @Override // com.kwad.components.ad.reward.e.f
        public final void bE() {
            if (s.this.gR != null) {
                s.this.gR.setVisibility(8);
            }
            if (s.this.gX != null) {
                s.this.gX.setVisibility(8);
            }
            if (s.this.dO != null) {
                s.this.dO.bj(s.this.getContext());
            }
            if (s.this.gZ != null) {
                s.this.gZ.cancel();
                s.this.gZ = null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public Animator a(float f, float f2) {
        if (this.gR == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = this.gR.getResources();
        Animator a = com.kwad.components.core.t.m.a((View) this.gU, (Interpolator) null, 100L, 16.0f);
        a.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.s.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                s.this.gU.setPivotX(s.this.gU.getWidth());
                s.this.gU.setPivotY(s.this.gU.getHeight());
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.gR, "translationX", f - (this.gR.getLeft() + (this.gR.getWidth() / 2.0f)));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.gR, "translationY", f2 - (this.gR.getTop() + (this.gR.getHeight() / 2.0f)));
        float dimension = resources.getDimension(R.dimen.ksad_reward_shake_tips_height);
        final float dimension2 = resources.getDimension(R.dimen.ksad_reward_shake_tips_icon_size);
        float width = this.gV.getWidth();
        float width2 = this.gU.getWidth();
        if (width == 0.0f || width2 == 0.0f) {
            return null;
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(width, dimension);
        ofFloat3.addUpdateListener(new com.kwad.components.ad.widget.a(this.gW) { // from class: com.kwad.components.ad.reward.presenter.s.8
            @Override // com.kwad.components.ad.widget.a
            public final void a(ViewGroup.LayoutParams layoutParams, Object obj) {
                float floatValue = ((Float) obj).floatValue();
                if (layoutParams != null) {
                    int i = (int) floatValue;
                    layoutParams.height = i;
                    layoutParams.width = i;
                }
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(width2, dimension2);
        ofFloat4.addUpdateListener(new com.kwad.components.ad.widget.a(this.gU) { // from class: com.kwad.components.ad.reward.presenter.s.9
            @Override // com.kwad.components.ad.widget.a
            public final void a(ViewGroup.LayoutParams layoutParams, Object obj) {
                float floatValue = ((Float) obj).floatValue();
                if (layoutParams != null) {
                    int i = (int) floatValue;
                    layoutParams.height = i;
                    layoutParams.width = i;
                }
            }
        });
        int color = resources.getColor(R.color.ksad_shake_icon_bg_start_color);
        final int color2 = resources.getColor(R.color.ksad_reward_main_color);
        final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_icon_stroke_size);
        ValueAnimator ofArgb = com.kwad.sdk.widget.a.ofArgb(color, color2);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.s.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    GradientDrawable gradientDrawable = (GradientDrawable) s.this.gW.getBackground();
                    gradientDrawable.mutate();
                    gradientDrawable.setColor(intValue);
                    if (intValue == color2) {
                        gradientDrawable.setStroke(dimensionPixelSize, -1);
                    }
                    s.this.gW.setBackground(gradientDrawable);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
            }
        });
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat5.setDuration(200L);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.s.11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    s.this.gS.setAlpha(floatValue);
                    s.this.gT.setAlpha(floatValue);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
            }
        });
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.gS.getHeight(), 0.0f);
        ofFloat6.addUpdateListener(new com.kwad.components.ad.widget.a(this.gS) { // from class: com.kwad.components.ad.reward.presenter.s.12
            @Override // com.kwad.components.ad.widget.a
            public final void a(ViewGroup.LayoutParams layoutParams, Object obj) {
                layoutParams.height = (int) ((Float) obj).floatValue();
            }
        });
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.gT.getHeight(), 0.0f);
        ofFloat7.addUpdateListener(new com.kwad.components.ad.widget.a(this.gT) { // from class: com.kwad.components.ad.reward.presenter.s.13
            @Override // com.kwad.components.ad.widget.a
            public final void a(ViewGroup.LayoutParams layoutParams, Object obj) {
                layoutParams.height = (int) ((Float) obj).floatValue();
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(500L);
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofArgb, ofFloat6, ofFloat7);
        AnimatorSet animatorSet3 = new AnimatorSet();
        final Animator clone = a.clone();
        clone.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.reward.presenter.s.2
            private boolean hb = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.hb = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (this.hb) {
                    return;
                }
                clone.start();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                s.this.gU.setPivotX(dimension2);
                s.this.gU.setPivotY(dimension2);
            }
        });
        final ViewGroup.LayoutParams layoutParams = this.gX.getLayoutParams();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, resources.getDimension(R.dimen.ksad_reward_shake_tips_width)).setDuration(500L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.reward.presenter.s.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    s.this.gX.setVisibility(0);
                    layoutParams.width = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    s.this.gX.setLayoutParams(layoutParams);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTrace(th);
                }
            }
        });
        animatorSet3.playTogether(clone, duration, ObjectAnimator.ofFloat(this.gY, "alpha", 0.0f, 1.0f).setDuration(500L));
        animatorSet.playSequentially(a, a.clone(), a.clone(), ofFloat5, animatorSet2, animatorSet3);
        return animatorSet;
    }

    private static String a(com.kwad.components.ad.reward.j jVar, AdInfo adInfo) {
        String dx = com.kwad.sdk.core.response.b.b.dx(adInfo);
        com.kwad.components.core.e.d.c cVar = jVar.mApkDownloadHelper;
        if (!com.kwad.sdk.core.response.b.a.ax(adInfo) || cVar == null) {
            return dx;
        }
        int nA = cVar.nA();
        AdMatrixInfo.DownloadTexts dz = com.kwad.sdk.core.response.b.b.dz(adInfo);
        return nA != 8 ? nA != 12 ? dz.adActionDescription : dz.openAppLabel : dz.installAppLabel;
    }

    private void a(AdInfo adInfo) {
        String dv = com.kwad.sdk.core.response.b.b.dv(adInfo);
        TextView textView = this.gS;
        if (textView != null) {
            textView.setText(dv);
        }
        TextView textView2 = this.gY;
        if (textView2 != null) {
            textView2.setText(dv);
        }
        String a = a(this.qB, adInfo);
        TextView textView3 = this.gT;
        if (textView3 != null) {
            textView3.setText("或点击" + a);
        }
    }

    private void cb() {
        final AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_root_container);
        ViewGroup viewGroup = (ViewGroup) com.kwad.sdk.m.l.a(getContext(), R.layout.ksad_shake_center, adBaseFrameLayout, false);
        this.gR = viewGroup;
        viewGroup.setVisibility(0);
        Resources resources = this.gR.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_icon_marginLeft);
        final int dimensionPixelSize2 = this.qB.mScreenOrientation == 1 ? resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_icon_marginBottom) + com.kwad.sdk.d.a.a.a(getContext(), 50.0f) : resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_icon_marginBottom);
        int dimensionPixelSize3 = this.qB.mScreenOrientation == 1 ? resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_title_marginBottom) + com.kwad.sdk.d.a.a.a(getContext(), 50.0f) : resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_title_marginBottom);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.ksad_reward_shake_tips_height);
        FrameLayout frameLayout = (FrameLayout) com.kwad.sdk.m.l.a(getContext(), R.layout.ksad_shake_tips_title, adBaseFrameLayout, false);
        this.gX = frameLayout;
        this.gY = (TextView) frameLayout.findViewById(R.id.ksad_shake_tips_label);
        this.gX.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, dimensionPixelSize4);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize3;
        layoutParams.gravity = 83;
        adBaseFrameLayout.addView(this.gX, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        adBaseFrameLayout.addView(this.gR, layoutParams2);
        com.kwad.sdk.core.report.a.b(this.qB.mAdTemplate, 185, (JSONObject) null);
        this.gR.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.s.6
            @Override // java.lang.Runnable
            public final void run() {
                int height = adBaseFrameLayout.getHeight();
                s sVar = s.this;
                sVar.gZ = sVar.a(dimensionPixelSize, height - dimensionPixelSize2);
                if (s.this.gZ != null) {
                    s.this.gZ.start();
                }
            }
        });
    }

    private void initView() {
        this.gS = (TextView) this.gR.findViewById(R.id.ksad_shake_center_title);
        this.gT = (TextView) this.gR.findViewById(R.id.ksad_shake_center_sub_title);
        this.gU = (ImageView) this.gR.findViewById(R.id.ksad_shake_center_icon);
        this.gV = (FrameLayout) this.gR.findViewById(R.id.ksad_shake_center_circle_area);
        this.gW = (ImageView) this.gR.findViewById(R.id.ksad_shake_center_circle_area_bg);
        this.gS.setOnClickListener(this);
        this.gT.setOnClickListener(this);
        this.gV.setOnClickListener(this);
        this.gY.setOnClickListener(this);
    }

    @Override // com.kwad.sdk.core.g.b
    public final void a(double d) {
        com.kwad.sdk.core.c.b.AT();
        Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
        Activity activity = getActivity();
        boolean z = activity != null && activity.equals(currentActivity);
        if (com.kwad.components.core.e.c.b.nd() || !z) {
            bj.a(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.s.4
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.dO.CF();
                }
            }, null, 500L);
            return;
        }
        if (this.qB != null && !this.qB.gd()) {
            com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
            jVar.i(d);
            this.qB.a(1, getContext(), 157, 1, 0L, false, jVar);
        }
        bj.a(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.s.5
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.core.e.c.d("RewardShakePresenter", "onShakeEvent openGate2");
                s.this.dO.CF();
            }
        }, null, 500L);
        com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        if (this.qB.gd()) {
            return;
        }
        bj.a(getContext(), this.dP);
    }

    @Override // com.kwad.sdk.core.g.b
    public final void aT() {
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate);
        this.qB.a(this);
        this.qB.b(this.mPlayEndPageListener);
        cb();
        initView();
        a(ck);
        float dt = com.kwad.sdk.core.response.b.b.dt(ck);
        com.kwad.sdk.core.g.d dVar = this.dO;
        if (dVar == null) {
            com.kwad.sdk.core.g.d dVar2 = new com.kwad.sdk.core.g.d(dt);
            this.dO = dVar2;
            dVar2.a(this);
        } else {
            dVar.e(dt);
        }
        this.dO.bi(getContext());
        Context context = getContext();
        if (context != null) {
            this.dP = (Vibrator) context.getSystemService("vibrator");
        }
    }

    @Override // com.kwad.components.ad.reward.e.m
    public final int ca() {
        return com.kwad.sdk.d.a.a.g(getContext(), R.dimen.ksad_reward_shake_tips_title_marginBottom) + com.kwad.sdk.d.a.a.g(getContext(), R.dimen.ksad_reward_shake_tips_height);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (com.kwad.sdk.core.response.b.b.dr(com.kwad.sdk.core.response.b.d.ck(this.qB.mAdTemplate))) {
            this.qB.a(1, getContext(), 158, 1);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        ViewGroup viewGroup = this.gR;
        if (viewGroup != null) {
            if (viewGroup.getParent() != null) {
                ((ViewGroup) this.gR.getParent()).removeView(this.gR);
            }
            this.gR = null;
        }
        bj.b(getContext(), this.dP);
        this.dP = null;
        Animator animator = this.gZ;
        if (animator != null) {
            animator.cancel();
            this.gZ = null;
        }
        this.qB.c(this.mPlayEndPageListener);
    }
}
