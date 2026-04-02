package e.d.b.d.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import e.d.b.d.l.d;
/* loaded from: classes2.dex */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ e.d.b.d.l.d a;

    public c(FabTransformationBehavior fabTransformationBehavior, e.d.b.d.l.d dVar) {
        this.a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d.e revealInfo = this.a.getRevealInfo();
        revealInfo.f6402c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
