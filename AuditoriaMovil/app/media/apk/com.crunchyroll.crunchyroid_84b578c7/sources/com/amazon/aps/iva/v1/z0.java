package com.amazon.aps.iva.v1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class z0 implements y0 {
    public final int[] a = new int[2];
    public final float[] b = com.amazon.aps.iva.aq.k.k();

    @Override // com.amazon.aps.iva.v1.y0
    public final void a(View view, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        com.amazon.aps.iva.yb0.j.f(fArr, "matrix");
        com.amazon.aps.iva.aq.k.A(fArr);
        c(view, fArr);
    }

    public final void b(float[] fArr, float f, float f2) {
        float[] fArr2 = this.b;
        com.amazon.aps.iva.aq.k.A(fArr2);
        com.amazon.aps.iva.aq.k.P(fArr2, f, f2);
        com.amazon.aps.iva.gr.n.m(fArr, fArr2);
    }

    public final void c(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr2 = this.b;
            com.amazon.aps.iva.e.z.P(matrix, fArr2);
            com.amazon.aps.iva.gr.n.m(fArr, fArr2);
        }
    }
}
