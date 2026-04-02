package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2636c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2637d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2638e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f2639f;

    public i(f fVar, RecyclerView.a0 a0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2639f = fVar;
        this.a = a0Var;
        this.f2635b = i2;
        this.f2636c = view;
        this.f2637d = i3;
        this.f2638e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f2635b != 0) {
            this.f2636c.setTranslationX(0.0f);
        }
        if (this.f2637d != 0) {
            this.f2636c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2638e.setListener(null);
        this.f2639f.c(this.a);
        this.f2639f.q.remove(this.a);
        this.f2639f.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2639f);
    }
}
