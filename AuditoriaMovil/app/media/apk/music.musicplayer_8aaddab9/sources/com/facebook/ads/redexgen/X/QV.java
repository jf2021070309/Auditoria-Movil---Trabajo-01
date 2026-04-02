package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class QV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IH A01;

    public QV(IH ih, View view) {
        this.A01 = ih;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
