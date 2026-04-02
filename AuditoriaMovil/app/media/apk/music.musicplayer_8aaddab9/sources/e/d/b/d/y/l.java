package e.d.b.d.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes2.dex */
public class l extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public l(h hVar) {
        this.a = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h hVar = this.a;
        hVar.f6704c.setChecked(hVar.f6696l);
        this.a.r.start();
    }
}
