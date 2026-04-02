package c.u.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
/* loaded from: classes.dex */
public class g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2625b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2626c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f2627d;

    public g(f fVar, RecyclerView.a0 a0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2627d = fVar;
        this.a = a0Var;
        this.f2625b = viewPropertyAnimator;
        this.f2626c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2625b.setListener(null);
        this.f2626c.setAlpha(1.0f);
        this.f2627d.c(this.a);
        this.f2627d.r.remove(this.a);
        this.f2627d.l();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2627d);
    }
}
