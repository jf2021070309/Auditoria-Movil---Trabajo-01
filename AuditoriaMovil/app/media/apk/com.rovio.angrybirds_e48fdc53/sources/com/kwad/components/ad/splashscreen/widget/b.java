package com.kwad.components.ad.splashscreen.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public abstract class b extends KSFrameLayout {
    private Animator Fq;
    private boolean Fr;

    public b(Context context) {
        this(context, null, 0);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Fr = false;
        a(context, attributeSet, i);
        lo();
    }

    protected void a(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        Animator animator = this.Fq;
        if (animator != null) {
            animator.cancel();
        }
    }

    protected abstract int getAnimationDelayTime();

    protected abstract View getInteractionView();

    protected abstract Animator lI();

    protected abstract void lJ();

    public final void lK() {
        this.Fr = true;
        Animator animator = this.Fq;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void lg() {
        Animator animator = this.Fq;
        if (animator != null) {
            animator.cancel();
            this.Fq = null;
        }
        Animator lI = lI();
        this.Fq = lI;
        if (lI != null) {
            lI.addListener(new AnimatorListenerAdapter() { // from class: com.kwad.components.ad.splashscreen.widget.b.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator2) {
                    super.onAnimationCancel(animator2);
                    b.this.lJ();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    super.onAnimationEnd(animator2);
                    if (b.this.Fr) {
                        return;
                    }
                    b.this.getInteractionView().postDelayed(new Runnable() { // from class: com.kwad.components.ad.splashscreen.widget.b.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            b.this.Fq.start();
                        }
                    }, b.this.getAnimationDelayTime());
                }
            });
            this.Fq.start();
        }
    }

    protected abstract void lo();
}
