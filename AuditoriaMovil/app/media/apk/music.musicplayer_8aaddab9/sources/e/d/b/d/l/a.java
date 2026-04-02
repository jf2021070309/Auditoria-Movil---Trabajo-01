package e.d.b.d.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
