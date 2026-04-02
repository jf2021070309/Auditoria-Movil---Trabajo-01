package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.f;
import java.util.Objects;
/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ f.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2640b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2641c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2642d;

    public j(f fVar, f.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2642d = fVar;
        this.a = dVar;
        this.f2640b = viewPropertyAnimator;
        this.f2641c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2640b.setListener(null);
        this.f2641c.setAlpha(1.0f);
        this.f2641c.setTranslationX(0.0f);
        this.f2641c.setTranslationY(0.0f);
        this.f2642d.c(this.a.a);
        this.f2642d.s.remove(this.a.a);
        this.f2642d.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        f fVar = this.f2642d;
        RecyclerView.a0 a0Var = this.a.a;
        Objects.requireNonNull(fVar);
    }
}
