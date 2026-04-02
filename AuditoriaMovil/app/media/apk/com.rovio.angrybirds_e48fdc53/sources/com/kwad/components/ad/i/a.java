package com.kwad.components.ad.i;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class a {
    private View GH;
    private Runnable GI;
    private boolean GJ = false;
    private Animator gZ;
    private View yt;
    private Button yu;
    private Button yv;

    public a(View view) {
        this.GH = view;
        initView();
    }

    private static Animator a(final View view, float f, final float f2, long j) {
        final float f3 = f / f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f2);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f));
        final float dimension = view.getResources().getDimension(R.dimen.ksad_reward_apk_info_card_actionbar_text_size);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.ad.i.a.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f4 = f3 * floatValue;
                float f5 = f2;
                if (f5 != 0.0f) {
                    float f6 = (floatValue / f5) * dimension;
                    View view2 = view;
                    if (view2 instanceof TextView) {
                        ((TextView) view2).setTextSize(0, f6);
                    }
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) floatValue;
                    layoutParams.width = (int) f4;
                    view.setLayoutParams(layoutParams);
                }
            }
        });
        return ofFloat;
    }

    private static Animator a(final View view, View view2, int i, int i2, long j, long j2) {
        Animator d = d(view, 200L);
        float f = i;
        float f2 = i2;
        Animator a = a(view2, f, f2, 200L);
        a.addListener(new com.kwad.components.ad.widget.tailframe.appbar.b() { // from class: com.kwad.components.ad.i.a.2
            @Override // com.kwad.components.ad.widget.tailframe.appbar.b, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setAlpha(1.0f);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = 0;
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                }
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 1.0f);
        ofFloat.setDuration(1600L);
        Animator d2 = d(view2, 200L);
        Animator a2 = a(view, f, f2, 200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(d, a, ofFloat, d2, a2);
        return animatorSet;
    }

    private static Animator d(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f));
        return ofFloat;
    }

    private void initView() {
        this.yu = (Button) this.GH.findViewById(R.id.ksad_reward_apk_info_install_action);
        this.yv = (Button) this.GH.findViewById(R.id.ksad_reward_apk_info_install_start);
        this.yt = this.GH.findViewById(R.id.ksad_reward_apk_info_install_container);
    }

    public final void ic() {
        c.d("ApkInstallAnimHelper", "startAnimation");
        int height = this.yt.getHeight();
        int width = this.yt.getWidth();
        if (height == 0 || width == 0) {
            return;
        }
        if (this.gZ == null) {
            Animator a = a(this.yv, this.yu, width, height, 1600L, 200L);
            this.gZ = a;
            a.addListener(new com.kwad.components.ad.widget.tailframe.appbar.b() { // from class: com.kwad.components.ad.i.a.1
                @Override // com.kwad.components.ad.widget.tailframe.appbar.b, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(final Animator animator) {
                    if (a.this.GJ) {
                        return;
                    }
                    if (a.this.GI == null) {
                        a.this.GI = new Runnable() { // from class: com.kwad.components.ad.i.a.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                animator.start();
                            }
                        };
                    }
                    bj.a(a.this.GI, null, 1600L);
                }
            });
        }
        c.d("ApkInstallAnimHelper", "mAnimator isStarted: " + this.gZ.isStarted());
        if (!this.gZ.isStarted()) {
            c.d("ApkInstallAnimHelper", "mAnimator.start()");
            this.gZ.start();
        }
        this.GJ = false;
    }

    public final void jW() {
        lR();
    }

    public final void lR() {
        Animator animator = this.gZ;
        if (animator != null) {
            animator.cancel();
            this.gZ.removeAllListeners();
            this.GJ = true;
        }
        Runnable runnable = this.GI;
        if (runnable != null) {
            bj.b(runnable);
            this.GI = null;
        }
    }

    public final void lS() {
        this.GJ = true;
    }
}
