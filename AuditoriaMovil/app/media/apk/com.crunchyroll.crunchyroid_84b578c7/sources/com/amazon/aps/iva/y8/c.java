package com.amazon.aps.iva.y8;

import android.animation.Animator;
import com.amazon.aps.iva.y8.d;
/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {
    public final /* synthetic */ d.a a;
    public final /* synthetic */ d b;

    public c(d dVar, d.a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.b;
        d.a aVar = this.a;
        dVar.a(1.0f, aVar, true);
        aVar.k = aVar.e;
        aVar.l = aVar.f;
        aVar.m = aVar.g;
        aVar.a((aVar.j + 1) % aVar.i.length);
        if (dVar.g) {
            dVar.g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (aVar.n) {
                aVar.n = false;
                return;
            }
            return;
        }
        dVar.f += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.f = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
