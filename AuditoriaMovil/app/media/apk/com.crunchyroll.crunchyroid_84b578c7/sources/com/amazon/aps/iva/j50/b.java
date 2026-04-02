package com.amazon.aps.iva.j50;

import android.animation.Animator;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
import com.ellation.crunchyroll.ui.animation.SimpleAnimatorListener;
/* compiled from: RateButtonLayout.kt */
/* loaded from: classes2.dex */
public final class b extends SimpleAnimatorListener {
    public final /* synthetic */ RateButtonLayout a;

    public b(RateButtonLayout rateButtonLayout) {
        this.a = rateButtonLayout;
    }

    @Override // com.ellation.crunchyroll.ui.animation.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j.f(animator, "animation");
        c cVar = this.a.b;
        if (cVar != null) {
            cVar.getView().O9();
        } else {
            j.m("presenter");
            throw null;
        }
    }
}
