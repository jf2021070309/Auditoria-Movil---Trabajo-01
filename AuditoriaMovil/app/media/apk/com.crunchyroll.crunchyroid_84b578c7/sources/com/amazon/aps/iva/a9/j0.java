package com.amazon.aps.iva.a9;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class j0 extends i0 {
    @Override // com.amazon.aps.iva.a9.i0, com.amazon.aps.iva.a9.k0
    public final void l(int i, View view) {
        view.setTransitionVisibility(i);
    }

    @Override // com.amazon.aps.iva.a9.c0
    public final float n(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // com.amazon.aps.iva.a9.c0
    public final void o(float f, View view) {
        view.setTransitionAlpha(f);
    }

    @Override // com.amazon.aps.iva.a9.e0
    public final void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.amazon.aps.iva.a9.e0
    public final void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // com.amazon.aps.iva.a9.g0
    public final void r(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
