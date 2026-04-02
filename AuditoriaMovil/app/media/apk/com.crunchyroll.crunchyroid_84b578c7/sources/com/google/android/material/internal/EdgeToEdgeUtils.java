package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.amazon.aps.iva.g3.e;
import com.amazon.aps.iva.p3.u0;
import com.amazon.aps.iva.p3.y0;
import com.google.android.material.color.MaterialColors;
/* loaded from: classes3.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return e.h(MaterialColors.getColor(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843858, -16777216);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, 16843857, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        if (!MaterialColors.isColorLight(i) && (i != 0 || !z)) {
            return false;
        }
        return true;
    }

    public static void setLightNavigationBar(Window window, boolean z) {
        new y0(window, window.getDecorView()).a.d(z);
    }

    public static void setLightStatusBar(Window window, boolean z) {
        new y0(window, window.getDecorView()).a.e(z);
    }

    public static void applyEdgeToEdge(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z2 = true;
        }
        if (z3 || z2) {
            int color = MaterialColors.getColor(window.getContext(), 16842801, -16777216);
            if (z3) {
                num = Integer.valueOf(color);
            }
            if (z2) {
                num2 = Integer.valueOf(color);
            }
        }
        u0.a(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
