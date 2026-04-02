package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;
/* renamed from: com.facebook.ads.redexgen.X.Mr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class animation.Animation$AnimationListenerC0768Mr implements Animation.AnimationListener {
    public final /* synthetic */ AnonymousClass59 A00;
    public final /* synthetic */ TM A01;
    public final /* synthetic */ TM A02;

    public animation.Animation$AnimationListenerC0768Mr(TM tm, TM tm2, AnonymousClass59 anonymousClass59) {
        this.A01 = tm;
        this.A02 = tm2;
        this.A00 = anonymousClass59;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        ML.A0H(this.A02);
        new Handler().postDelayed(new TP(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
