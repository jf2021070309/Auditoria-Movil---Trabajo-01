package com.facebook.ads.redexgen.X;

import android.animation.Animator;
/* loaded from: assets/audience_network.dex */
public class QN implements Animator.AnimatorListener {
    public final /* synthetic */ IU A00;

    public QN(IU iu) {
        this.A00 = iu;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = QL.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
