package com.amazon.aps.iva.p3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class r0 {
    public final WeakReference<View> a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public r0(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(s0 s0Var) {
        View view = this.a.get();
        if (view != null) {
            if (s0Var != null) {
                view.animate().setListener(new q0(s0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
