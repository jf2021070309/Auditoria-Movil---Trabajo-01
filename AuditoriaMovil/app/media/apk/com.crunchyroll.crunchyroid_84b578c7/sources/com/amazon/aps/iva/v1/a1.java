package com.amazon.aps.iva.v1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class a1 implements y0 {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    @Override // com.amazon.aps.iva.v1.y0
    public void a(View view, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(fArr, "matrix");
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        int[] iArr = this.b;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        com.amazon.aps.iva.e.z.P(matrix, fArr);
    }
}
