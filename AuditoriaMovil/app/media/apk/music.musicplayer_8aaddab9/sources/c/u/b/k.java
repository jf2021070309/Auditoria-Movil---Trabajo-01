package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.f;
import java.util.Objects;
/* loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ f.d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2643b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2644c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2645d;

    public k(f fVar, f.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2645d = fVar;
        this.a = dVar;
        this.f2643b = viewPropertyAnimator;
        this.f2644c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2643b.setListener(null);
        this.f2644c.setAlpha(1.0f);
        this.f2644c.setTranslationX(0.0f);
        this.f2644c.setTranslationY(0.0f);
        this.f2645d.c(this.a.f2611b);
        this.f2645d.s.remove(this.a.f2611b);
        this.f2645d.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        f fVar = this.f2645d;
        RecyclerView.a0 a0Var = this.a.f2611b;
        Objects.requireNonNull(fVar);
    }
}
