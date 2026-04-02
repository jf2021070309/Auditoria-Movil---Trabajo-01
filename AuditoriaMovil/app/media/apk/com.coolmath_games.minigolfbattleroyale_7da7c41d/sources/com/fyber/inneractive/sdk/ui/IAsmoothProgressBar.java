package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class IAsmoothProgressBar extends ProgressBar {
    private static final Interpolator a = new AccelerateDecelerateInterpolator();
    private ValueAnimator b;
    private ValueAnimator c;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (!a()) {
            super.setProgress(i);
            return;
        }
        if (this.b != null) {
            this.b.cancel();
        }
        if (this.b == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.b = ofInt;
            ofInt.setInterpolator(a);
            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else {
            this.b.setIntValues(getProgress(), i);
        }
        this.b.start();
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 11;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        if (!a()) {
            super.setSecondaryProgress(i);
            return;
        }
        if (this.c != null) {
            this.c.cancel();
        }
        if (this.c == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.c = ofInt;
            ofInt.setInterpolator(a);
            this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else {
            this.c.setIntValues(getProgress(), i);
        }
        this.c.start();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
