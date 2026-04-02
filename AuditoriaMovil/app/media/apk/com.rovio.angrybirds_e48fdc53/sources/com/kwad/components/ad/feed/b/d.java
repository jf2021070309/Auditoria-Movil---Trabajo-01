package com.kwad.components.ad.feed.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class d extends FrameLayout {
    private int count;
    private ImageView eP;
    private ImageView eQ;
    private ImageView eR;
    private Animator eS;
    private Animator eT;
    private Animation eU;
    private Animation eV;

    public d(Context context) {
        this(context, null);
    }

    private d(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.count = 0;
        D(context);
    }

    private void D(Context context) {
        com.kwad.sdk.m.l.inflate(context, R.layout.ksad_promote_ad_click, this);
        this.eP = (ImageView) findViewById(R.id.ksad_inside_circle);
        this.eQ = (ImageView) findViewById(R.id.ksad_outside_circle);
        this.eR = (ImageView) findViewById(R.id.ksad_hand);
    }

    private Animation a(final View view, float f, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, 0.0f);
        float a = i / com.kwad.sdk.d.a.a.a(getContext(), 10.0f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, a, 1.0f, a, 1, 0.5f, 1, 0.5f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(200L);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.kwad.components.ad.feed.b.d.3
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        return animationSet;
    }

    private void bn() {
        this.eS = d(this.eR);
        this.eT = e(this.eR);
        this.eU = a(this.eP, 0.45f, com.kwad.sdk.d.a.a.a(getContext(), 34.0f));
        this.eV = a(this.eQ, 0.5f, com.kwad.sdk.d.a.a.a(getContext(), 50.0f));
        this.eS.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.feed.b.d.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                d.this.eP.startAnimation(d.this.eU);
                d.this.eQ.startAnimation(d.this.eV);
                d.this.eT.start();
            }
        });
        this.eT.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.feed.b.d.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                d.f(d.this);
                if (d.this.count >= 5) {
                    return;
                }
                d.this.eS.start();
            }
        });
    }

    private Animator d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, -10.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -com.kwad.sdk.d.a.a.a(getContext(), 9.5f));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -com.kwad.sdk.d.a.a.a(getContext(), 9.5f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    private Animator e(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", -10.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", -com.kwad.sdk.d.a.a.a(getContext(), 9.5f), 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", -com.kwad.sdk.d.a.a.a(getContext(), 9.5f), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    static /* synthetic */ int f(d dVar) {
        int i = dVar.count;
        dVar.count = i + 1;
        return i;
    }

    public final void bl() {
        bn();
        this.eS.start();
    }

    public final void bm() {
        Animator animator = this.eS;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.eT;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animation animation = this.eU;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.eV;
        if (animation2 != null) {
            animation2.cancel();
        }
    }
}
