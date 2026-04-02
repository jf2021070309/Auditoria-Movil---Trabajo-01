package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.f0 a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;

    public i(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.f0 f0Var) {
        this.d = hVar;
        this.a = f0Var;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        h hVar = this.d;
        RecyclerView.f0 f0Var = this.a;
        hVar.d(f0Var);
        hVar.q.remove(f0Var);
        hVar.n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
