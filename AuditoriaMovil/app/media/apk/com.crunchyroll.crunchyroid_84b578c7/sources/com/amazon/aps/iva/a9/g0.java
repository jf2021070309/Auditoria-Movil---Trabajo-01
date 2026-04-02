package com.amazon.aps.iva.a9;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class g0 extends e0 {
    public static boolean m = true;

    @SuppressLint({"NewApi"})
    public void r(View view, int i, int i2, int i3, int i4) {
        if (m) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
