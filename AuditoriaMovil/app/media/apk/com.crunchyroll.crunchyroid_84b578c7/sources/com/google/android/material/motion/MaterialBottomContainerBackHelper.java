package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.c5.b;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
/* loaded from: classes3.dex */
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistance;
    private final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, View.SCALE_Y, 1.0f));
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(this.cancelDuration);
        createResetScaleAnimator.start();
    }

    public void finishBackProgressNotPersistent(com.amazon.aps.iva.e.b bVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Y, this.view.getScaleY() * this.view.getHeight());
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, bVar.c));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialBottomContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialBottomContainerBackHelper.this.view.setTranslationY(0.0f);
                MaterialBottomContainerBackHelper.this.updateBackProgress(0.0f);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void finishBackProgressPersistent(com.amazon.aps.iva.e.b bVar, Animator.AnimatorListener animatorListener) {
        Animator createResetScaleAnimator = createResetScaleAnimator();
        createResetScaleAnimator.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, bVar.c));
        if (animatorListener != null) {
            createResetScaleAnimator.addListener(animatorListener);
        }
        createResetScaleAnimator.start();
    }

    public void startBackProgress(com.amazon.aps.iva.e.b bVar) {
        super.onStartBackProgress(bVar);
    }

    public void updateBackProgress(com.amazon.aps.iva.e.b bVar) {
        if (super.onUpdateBackProgress(bVar) == null) {
            return;
        }
        updateBackProgress(bVar.c);
    }

    public void updateBackProgress(float f) {
        float interpolateProgress = interpolateProgress(f);
        float width = this.view.getWidth();
        float height = this.view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float lerp = 1.0f - AnimationUtils.lerp(0.0f, this.maxScaleXDistance / width, interpolateProgress);
        float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, this.maxScaleYDistance / height, interpolateProgress);
        this.view.setScaleX(lerp);
        this.view.setPivotY(height);
        this.view.setScaleY(lerp2);
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(lerp2 != 0.0f ? lerp / lerp2 : 1.0f);
            }
        }
    }
}
