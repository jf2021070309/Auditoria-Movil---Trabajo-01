package e.j.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* loaded from: classes2.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;

    public k(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
