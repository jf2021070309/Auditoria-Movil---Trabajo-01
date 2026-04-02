package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;
/* loaded from: assets/audience_network.dex */
public class SB extends MK {
    public final /* synthetic */ SA A00;

    public SB(SA sa) {
        this.A00 = sa;
    }

    @Override // com.facebook.ads.redexgen.X.MK, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ML.A0H(this.A00.A01);
        this.A00.A00.AB7();
    }
}
