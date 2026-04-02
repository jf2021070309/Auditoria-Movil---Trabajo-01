package com.amazon.aps.iva.a9;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class i0 extends g0 {
    public static boolean n = true;

    @Override // com.amazon.aps.iva.a9.k0
    @SuppressLint({"NewApi"})
    public void l(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.l(i, view);
        } else if (n) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }
}
