package com.amazon.aps.iva.a9;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class e0 extends c0 {
    public static boolean k = true;
    public static boolean l = true;

    @SuppressLint({"NewApi"})
    public void p(View view, Matrix matrix) {
        if (k) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void q(View view, Matrix matrix) {
        if (l) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}
