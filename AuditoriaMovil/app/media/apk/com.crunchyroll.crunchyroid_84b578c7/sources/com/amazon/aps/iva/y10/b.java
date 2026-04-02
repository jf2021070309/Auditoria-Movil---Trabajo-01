package com.amazon.aps.iva.y10;

import android.animation.Animator;
/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class b implements Animator.AnimatorListener {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.a;
        eVar.a.setEnabled(false);
        e.a(eVar, eVar.b, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
