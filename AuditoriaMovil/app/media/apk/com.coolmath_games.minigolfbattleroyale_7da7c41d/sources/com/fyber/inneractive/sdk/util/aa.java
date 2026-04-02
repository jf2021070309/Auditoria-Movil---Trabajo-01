package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public final class aa {
    public static boolean a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i3 == 0) {
                i2 = i4;
            } else if (i4 != i2) {
                return true;
            }
        }
        return false;
    }
}
