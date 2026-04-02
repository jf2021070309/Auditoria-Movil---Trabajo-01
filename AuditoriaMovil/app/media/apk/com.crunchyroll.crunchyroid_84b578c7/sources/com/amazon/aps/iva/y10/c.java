package com.amazon.aps.iva.y10;

import android.animation.Animator;
/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class c implements Animator.AnimatorListener {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e eVar = this.a;
        eVar.a.setEnabled(true);
        e.a(eVar, eVar.b, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
