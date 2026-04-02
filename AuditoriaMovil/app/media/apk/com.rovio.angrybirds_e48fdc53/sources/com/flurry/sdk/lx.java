package com.flurry.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class lx {
    private static final String a = lx.class.getSimpleName();

    public static String a(Context context) {
        PackageInfo d = d(context);
        return (d == null || d.packageName == null) ? "" : d.packageName;
    }

    private static PackageInfo d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            ko.a(a, "Cannot find package info for package: " + context.getPackageName());
            return null;
        }
    }

    public static String b(Context context) {
        PackageInfo d = d(context);
        return (d == null || d.versionName == null) ? "" : d.versionName;
    }

    public static Bundle c(Context context) {
        ApplicationInfo e = e(context);
        return (e == null || e.metaData == null) ? Bundle.EMPTY : e.metaData;
    }

    private static ApplicationInfo e(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            ko.a(a, "Cannot find application info for package: " + context.getPackageName());
            return null;
        }
    }
}
