package com.amazon.aps.iva.a80;

import android.animation.Animator;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.ui.animation.SimpleAnimatorListener;
/* compiled from: ViewPagerTransitionAccelerator.kt */
/* loaded from: classes2.dex */
public final class a extends SimpleAnimatorListener {
    public final com.amazon.aps.iva.xb0.a<q> a;
    public final com.amazon.aps.iva.xb0.a<q> b;

    public a(f fVar, g gVar) {
        this.a = fVar;
        this.b = gVar;
    }

    @Override // com.ellation.crunchyroll.ui.animation.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.amazon.aps.iva.yb0.j.f(animator, "animation");
        this.b.invoke();
    }

    @Override // com.ellation.crunchyroll.ui.animation.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        com.amazon.aps.iva.yb0.j.f(animator, "animation");
        this.a.invoke();
    }
}
