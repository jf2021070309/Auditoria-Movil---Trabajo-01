package com.amazon.aps.iva.f1;

import android.graphics.Bitmap;
/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class j {
    public static final Bitmap a(i0 i0Var) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "<this>");
        if (i0Var instanceof i) {
            return ((i) i0Var).a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i == 4) {
            z5 = true;
        }
        if (z5) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
