package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
/* loaded from: assets/audience_network.dex */
public class SA extends L7 {
    public final /* synthetic */ PK A00;
    public final /* synthetic */ PL A01;

    public SA(PL pl, PK pk) {
        this.A01 = pl;
        this.A00 = pk;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new SB(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
