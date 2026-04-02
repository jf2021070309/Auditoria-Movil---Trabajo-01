package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Og  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0809Og implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0908Sc A00;

    public C0809Og(C0908Sc c0908Sc) {
        this.A00 = c0908Sc;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A06;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A06;
        view2.requestLayout();
    }
}
