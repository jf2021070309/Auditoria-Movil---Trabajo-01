package com.amazon.aps.iva.a9;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class c0 extends k0 {
    public static boolean j = true;

    @SuppressLint({"NewApi"})
    public float n(View view) {
        float transitionAlpha;
        if (j) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void o(float f, View view) {
        if (j) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
        view.setAlpha(f);
    }
}
