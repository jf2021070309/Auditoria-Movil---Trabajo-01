package com.kwad.components.ad.feed.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class e extends FrameLayout {
    private View eY;
    private ImageView eZ;
    private Animator fa;
    private com.kwad.sdk.widget.c fb;

    public e(Context context) {
        this(context, null);
    }

    private e(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        init(context);
    }

    private Animator a(View view, long j, float f) {
        if (view == null) {
            return null;
        }
        Interpolator create = PathInterpolatorCompat.create(0.22f, 0.59f, 0.36f, 1.0f);
        this.eZ.setPivotX(view.getWidth());
        this.eZ.setPivotY(view.getHeight());
        Animator a = com.kwad.components.core.t.m.a(view, create, 100L, 16.0f);
        Animator a2 = com.kwad.components.core.t.m.a(view, create, 100L, 16.0f);
        Animator a3 = com.kwad.components.core.t.m.a(view, create, 100L, 16.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(a, a2, a3);
        return animatorSet;
    }

    private Animator b(final View view, int i) {
        if (view == null) {
            return null;
        }
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float min = i / Math.min(view.getHeight(), view.getWidth());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", min, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", min, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(500L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.feed.b.e.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                view.setVisibility(0);
                view.setClickable(true);
                new com.kwad.sdk.widget.f(view, e.this.fb);
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator bo() {
        View view = this.eY;
        if (view == null || this.eZ == null || view.getWidth() + this.eY.getHeight() == 0 || this.eZ.getWidth() + this.eZ.getHeight() == 0) {
            return null;
        }
        Animator bp = bp();
        Animator a = a(this.eZ, 100L, 16.0f);
        Animator bq = bq();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(bp, a, bq);
        return animatorSet;
    }

    private Animator bp() {
        Animator b = b(this.eY, com.kwad.sdk.d.a.a.a(getContext(), 128.0f));
        Animator b2 = b(this.eZ, com.kwad.sdk.d.a.a.a(getContext(), 71.11f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(b, b2);
        return animatorSet;
    }

    private Animator bq() {
        Animator f = f(this.eY);
        Animator f2 = f(this.eZ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(f, f2);
        return animatorSet;
    }

    private Animator f(final View view) {
        if (view == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.setDuration(500L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.feed.b.e.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(8);
            }
        });
        return animatorSet;
    }

    private void init(Context context) {
        com.kwad.sdk.m.l.inflate(context, R.layout.ksad_feed_shake, this);
        setClickable(false);
        this.eY = findViewById(R.id.ksad_feed_shake_bg);
        this.eZ = (ImageView) findViewById(R.id.ksad_feed_shake_icon);
    }

    public final void a(final AnimatorListenerAdapter animatorListenerAdapter) {
        Animator animator = this.fa;
        if (animator != null) {
            animator.cancel();
            this.fa = null;
        }
        this.eZ.post(new Runnable() { // from class: com.kwad.components.ad.feed.b.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.fa = eVar.bo();
                if (e.this.fa == null) {
                    animatorListenerAdapter.onAnimationEnd(null);
                    return;
                }
                e.this.fa.addListener(animatorListenerAdapter);
                e.this.fa.start();
            }
        });
    }

    public final void setOnViewEventListener(com.kwad.sdk.widget.c cVar) {
        this.fb = cVar;
    }
}
