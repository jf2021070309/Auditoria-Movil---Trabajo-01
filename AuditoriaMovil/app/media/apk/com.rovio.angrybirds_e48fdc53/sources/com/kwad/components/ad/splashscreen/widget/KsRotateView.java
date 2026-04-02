package com.kwad.components.ad.splashscreen.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class KsRotateView extends b {
    private static int Fv = 50;
    private static int Fw = -12;
    private static int Fx = -25;
    private static int Fy = 12;
    private static int Fz = 25;
    private int FA;
    private ImageView Fu;
    private ImageView eZ;

    public KsRotateView(Context context) {
        super(context);
    }

    public KsRotateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KsRotateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected final void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KsShakeView, i, 0);
        this.FA = obtainStyledAttributes.getResourceId(R.styleable.ksad_KsShakeView_ksad_shakeIcon, R.drawable.ksad_ic_rotate_phone);
        obtainStyledAttributes.recycle();
        ImageView imageView = new ImageView(getContext());
        this.Fu = imageView;
        imageView.setImageResource(R.drawable.ksad_ic_rotate_line);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        addView(this.Fu, layoutParams);
        this.eZ = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = com.kwad.sdk.d.a.a.a(context, 22.0f);
        layoutParams2.gravity = 1;
        addView(this.eZ, layoutParams2);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected int getAnimationDelayTime() {
        return TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT;
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected View getInteractionView() {
        return this.eZ;
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected final Animator lI() {
        View interactionView = getInteractionView();
        if (interactionView == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        interactionView.setPivotX(interactionView.getWidth() / 2.0f);
        interactionView.setPivotY(interactionView.getHeight() / 2.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fx).setDuration(500L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(interactionView, "alpha", 1.0f, 1.0f);
        ofFloat.setDuration(340L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(interactionView, "rotation", Fx, 0.0f).setDuration(Fv);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fy).setDuration(Fv);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(interactionView, "rotation", Fy, 0.0f).setDuration(Fv);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fw).setDuration(Fv);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(interactionView, "rotation", Fw, 0.0f).setDuration(Fv);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(interactionView, "alpha", 1.0f, 1.0f);
        ofFloat2.setDuration(500L);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fz).setDuration(500L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(interactionView, "alpha", 1.0f, 1.0f);
        ofFloat.setDuration(340L);
        animatorSet.playSequentially(duration, ofFloat, duration2, duration3, duration4, duration5, duration6, ofFloat2, duration7, ofFloat3, ObjectAnimator.ofFloat(interactionView, "rotation", Fz, 0.0f).setDuration(Fv), ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fw).setDuration(Fv), ObjectAnimator.ofFloat(interactionView, "rotation", Fw, 0.0f).setDuration(Fv), ObjectAnimator.ofFloat(interactionView, "rotation", 0.0f, Fy).setDuration(Fv), ObjectAnimator.ofFloat(interactionView, "rotation", Fy, 0.0f).setDuration(Fv));
        return animatorSet;
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected final void lJ() {
        getInteractionView().setRotation(0.0f);
    }

    @Override // com.kwad.components.ad.splashscreen.widget.b
    protected final void lo() {
        this.eZ.setImageResource(this.FA);
    }
}
