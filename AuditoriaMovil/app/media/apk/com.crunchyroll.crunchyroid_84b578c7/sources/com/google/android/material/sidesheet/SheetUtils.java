package com.google.android.material.sidesheet;
/* loaded from: classes3.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f, float f2) {
        if (Math.abs(f) > Math.abs(f2)) {
            return true;
        }
        return false;
    }
}
