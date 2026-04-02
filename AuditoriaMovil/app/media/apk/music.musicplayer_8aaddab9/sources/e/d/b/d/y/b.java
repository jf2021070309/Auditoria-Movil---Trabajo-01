package e.d.b.d.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes2.dex */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.a.a.setEndIconVisible(true);
    }
}
