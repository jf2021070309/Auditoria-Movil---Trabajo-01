package com.amazon.aps.iva.n4;

import android.transition.Transition;
/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class a0 implements Transition.TransitionListener {
    public final /* synthetic */ Runnable a;

    public a0(d dVar) {
        this.a = dVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
