package com.amazon.aps.iva.n4;

import android.graphics.Rect;
import android.transition.Transition;
/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class x extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect a;

    public x(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
