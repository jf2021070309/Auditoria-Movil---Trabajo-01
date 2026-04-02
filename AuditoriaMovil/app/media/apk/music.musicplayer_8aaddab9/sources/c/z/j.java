package c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ c.f.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f2900b;

    public j(i iVar, c.f.a aVar) {
        this.f2900b = iVar;
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.f2900b.p.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f2900b.p.add(animator);
    }
}
