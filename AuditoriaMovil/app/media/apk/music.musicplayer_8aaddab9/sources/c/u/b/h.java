package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2632b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2633c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2634d;

    public h(f fVar, RecyclerView.a0 a0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2634d = fVar;
        this.a = a0Var;
        this.f2632b = view;
        this.f2633c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2632b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2633c.setListener(null);
        this.f2634d.c(this.a);
        this.f2634d.p.remove(this.a);
        this.f2634d.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2634d);
    }
}
