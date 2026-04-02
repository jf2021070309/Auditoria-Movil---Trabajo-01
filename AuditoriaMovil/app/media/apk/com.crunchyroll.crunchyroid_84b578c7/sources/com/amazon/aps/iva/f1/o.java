package com.amazon.aps.iva.f1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class o {
    public static final com.amazon.aps.iva.g1.c a(Bitmap bitmap) {
        com.amazon.aps.iva.g1.c b;
        com.amazon.aps.iva.yb0.j.f(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace == null || (b = e0.b(colorSpace)) == null) {
            float[] fArr = com.amazon.aps.iva.g1.g.a;
            return com.amazon.aps.iva.g1.g.c;
        }
        return b;
    }

    public static final Bitmap b(int i, int i2, int i3, boolean z, com.amazon.aps.iva.g1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, j.b(i3), z, e0.a(cVar));
        com.amazon.aps.iva.yb0.j.e(createBitmap, "createBitmap(\n          …oidColorSpace()\n        )");
        return createBitmap;
    }
}
