package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ h.d a;
    public final /* synthetic */ ViewPropertyAnimator b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;

    public m(h hVar, h.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = hVar;
        this.a = dVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h.d dVar = this.a;
        RecyclerView.f0 f0Var = dVar.b;
        h hVar = this.d;
        hVar.d(f0Var);
        hVar.r.remove(dVar.b);
        hVar.n();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.f0 f0Var = this.a.b;
        this.d.getClass();
    }
}
