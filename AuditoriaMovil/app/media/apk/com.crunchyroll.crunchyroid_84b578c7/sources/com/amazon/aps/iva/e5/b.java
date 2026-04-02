package com.amazon.aps.iva.e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.crunchyroll.crunchyroid.R;
/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes.dex */
public final class b {
    public static ObjectAnimator a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, DecelerateInterpolator decelerateInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transitionPosition);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        int round = Math.round(f - translationX) + i;
        int round2 = Math.round(f2 - translationY) + i2;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(aVar);
        ofFloat.addListener(aVar);
        ofFloat.addPauseListener(aVar);
        ofFloat.setInterpolator(decelerateInterpolator);
        return ofFloat;
    }

    /* compiled from: TranslationAnimationCreator.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View a;
        public final View b;
        public final int c;
        public final int d;
        public int[] e;
        public float f;
        public float g;
        public final float h;
        public final float i;

        public a(View view, View view2, int i, int i2, float f, float f2) {
            this.b = view;
            this.a = view2;
            this.c = i - Math.round(view.getTranslationX());
            this.d = i2 - Math.round(view.getTranslationY());
            this.h = f;
            this.i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transitionPosition);
            this.e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transitionPosition, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr = this.e;
            View view = this.b;
            iArr[0] = Math.round(view.getTranslationX() + this.c);
            this.e[1] = Math.round(view.getTranslationY() + this.d);
            this.a.setTag(R.id.transitionPosition, this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.b;
            this.f = view.getTranslationX();
            this.g = view.getTranslationY();
            view.setTranslationX(this.h);
            view.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.g);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            float f = this.h;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }
}
