package com.amazon.aps.iva.c70;

import android.animation.Animator;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class b implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public b(int i, a aVar, int i2) {
        this.a = i;
        this.b = aVar;
        this.c = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        j.f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int messageHeight;
        j.f(animator, "animator");
        a aVar = this.b;
        messageHeight = aVar.getMessageHeight();
        if (this.a == (-messageHeight)) {
            aVar.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        j.f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        j.f(animator, "animator");
        if (this.c == 0) {
            this.b.setVisibility(0);
        }
    }
}
