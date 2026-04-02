package com.amazon.aps.iva.e8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
/* compiled from: DeviceUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;

    public static boolean a(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b(Context context) {
        boolean z;
        Resources resources = context.getResources();
        boolean z2 = false;
        if (resources == null) {
            return false;
        }
        if (b == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || a(resources)) {
                z2 = true;
            }
            b = Boolean.valueOf(z2);
        }
        return b.booleanValue();
    }

    public static boolean c(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        if (g == null) {
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            } else {
                z = true;
            }
            g = Boolean.valueOf(z);
        }
        return g.booleanValue();
    }
}
