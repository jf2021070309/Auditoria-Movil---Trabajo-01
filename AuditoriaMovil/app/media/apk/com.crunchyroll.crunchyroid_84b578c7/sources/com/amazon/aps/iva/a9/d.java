package com.amazon.aps.iva.a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.WeakHashMap;
/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class d extends l0 {

    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i0 i0Var = z.a;
            View view = this.a;
            i0Var.o(1.0f, view);
            if (this.b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            View view = this.a;
            if (g0.d.h(view) && view.getLayerType() == 0) {
                this.b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public d(int i) {
        setMode(i);
    }

    public final ObjectAnimator a(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        z.a.o(f, view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.b, f2);
        ofFloat.addListener(new a(view));
        addListener(new c(view));
        return ofFloat;
    }

    @Override // com.amazon.aps.iva.a9.l0, com.amazon.aps.iva.a9.n
    public final void captureStartValues(u uVar) {
        super.captureStartValues(uVar);
        uVar.a.put("android:fade:transitionAlpha", Float.valueOf(z.a.n(uVar.b)));
    }

    @Override // com.amazon.aps.iva.a9.l0
    public final Animator onAppear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        float f;
        Float f2;
        float f3 = 0.0f;
        if (uVar != null && (f2 = (Float) uVar.a.get("android:fade:transitionAlpha")) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        if (f != 1.0f) {
            f3 = f;
        }
        return a(f3, 1.0f, view);
    }

    @Override // com.amazon.aps.iva.a9.l0
    public final Animator onDisappear(ViewGroup viewGroup, View view, u uVar, u uVar2) {
        float f;
        Float f2;
        z.a.getClass();
        if (uVar != null && (f2 = (Float) uVar.a.get("android:fade:transitionAlpha")) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        return a(f, 0.0f, view);
    }
}
