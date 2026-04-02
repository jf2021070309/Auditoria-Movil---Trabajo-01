package com.amazon.aps.iva.e;

import android.view.View;
import android.view.ViewParent;
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, View> {
    public static final x h = new x();

    public x() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final View invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "it");
        ViewParent parent = view2.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
