package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
/* loaded from: assets/audience_network.dex */
public class QA extends AnimatorListenerAdapter {
    public final /* synthetic */ C04107o A00;

    public QA(C04107o c04107o) {
        this.A00 = c04107o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new KR(this), 2000L);
    }
}
