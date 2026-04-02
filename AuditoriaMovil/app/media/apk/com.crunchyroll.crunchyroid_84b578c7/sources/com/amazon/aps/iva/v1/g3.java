package com.amazon.aps.iva.v1;

import android.view.View;
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class g3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ com.amazon.aps.iva.o0.m2 c;

    public g3(View view, com.amazon.aps.iva.o0.m2 m2Var) {
        this.b = view;
        this.c = m2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
        this.b.removeOnAttachStateChangeListener(this);
        this.c.t();
    }
}
