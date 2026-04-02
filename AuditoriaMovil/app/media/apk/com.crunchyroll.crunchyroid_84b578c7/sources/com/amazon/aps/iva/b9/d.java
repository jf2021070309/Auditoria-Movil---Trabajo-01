package com.amazon.aps.iva.b9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c cVar = this.a;
        ArrayList arrayList = new ArrayList(cVar.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).onAnimationEnd(cVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        c cVar = this.a;
        ArrayList arrayList = new ArrayList(cVar.f);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).onAnimationStart(cVar);
        }
    }
}
