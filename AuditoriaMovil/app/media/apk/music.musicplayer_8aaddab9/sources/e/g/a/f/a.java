package e.g.a.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.jrt.recyclerview.views.FastScroller;
/* loaded from: classes2.dex */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ FastScroller a;

    public a(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a = false;
    }
}
