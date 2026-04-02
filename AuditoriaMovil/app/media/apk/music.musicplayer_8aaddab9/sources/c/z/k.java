package c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ i a;

    public k(i iVar) {
        this.a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.o();
        animator.removeListener(this);
    }
}
