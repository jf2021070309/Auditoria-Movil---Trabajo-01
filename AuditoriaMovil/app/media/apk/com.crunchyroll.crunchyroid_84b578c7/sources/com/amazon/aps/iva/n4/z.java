package com.amazon.aps.iva.n4;

import android.transition.Transition;
import java.util.ArrayList;
/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class z implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ y g;

    public z(y yVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = yVar;
        this.a = obj;
        this.b = arrayList;
        this.e = obj2;
        this.f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        y yVar = this.g;
        Object obj = this.a;
        if (obj != null) {
            yVar.t(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            yVar.t(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            yVar.t(obj3, this.f, null);
        }
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
}
