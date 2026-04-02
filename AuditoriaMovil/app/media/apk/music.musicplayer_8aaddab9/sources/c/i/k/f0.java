package c.i.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class f0 {
    public WeakReference<View> a;

    /* renamed from: b  reason: collision with root package name */
    public int f2150b = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ g0 a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2151b;

        public a(f0 f0Var, g0 g0Var, View view) {
            this.a = g0Var;
            this.f2151b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.f2151b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.f2151b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.f2151b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ i0 a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2152b;

        public b(f0 f0Var, i0 i0Var, View view) {
            this.a = i0Var;
            this.f2152b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) c.b.c.b0.this.f793f.getParent()).invalidate();
        }
    }

    public f0(View view) {
        this.a = new WeakReference<>(view);
    }

    public f0 a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public f0 c(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public f0 d(g0 g0Var) {
        View view = this.a.get();
        if (view != null) {
            e(view, g0Var);
        }
        return this;
    }

    public final void e(View view, g0 g0Var) {
        if (g0Var != null) {
            view.animate().setListener(new a(this, g0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public f0 f(i0 i0Var) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(i0Var != null ? new b(this, i0Var, view) : null);
        }
        return this;
    }

    public f0 g(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
