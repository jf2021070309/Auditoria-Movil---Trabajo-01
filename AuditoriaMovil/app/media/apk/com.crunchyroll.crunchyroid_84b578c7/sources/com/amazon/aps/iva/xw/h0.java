package com.amazon.aps.iva.xw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: ScrollViewExtensions.kt */
/* loaded from: classes2.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a;

    public h0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.amazon.aps.iva.yb0.j.f(animator, "animation");
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
