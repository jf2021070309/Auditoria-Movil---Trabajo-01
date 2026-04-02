package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class QU implements Animator.AnimatorListener {
    public final /* synthetic */ IH A00;

    public QU(IH ih) {
        this.A00 = ih;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = QL.A05;
        view = this.A00.A05;
        ML.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
