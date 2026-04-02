package com.amazon.aps.iva.v1;

import android.view.View;
/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class d3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ com.amazon.aps.iva.se0.j1 b;

    public d3(com.amazon.aps.iva.se0.c2 c2Var) {
        this.b = c2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
        view.removeOnAttachStateChangeListener(this);
        this.b.a(null);
    }
}
