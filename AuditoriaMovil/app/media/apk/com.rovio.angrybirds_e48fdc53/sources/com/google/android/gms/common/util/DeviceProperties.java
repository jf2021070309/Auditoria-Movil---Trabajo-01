package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.umeng.analytics.pro.as;
/* loaded from: classes2.dex */
public final class DeviceProperties {
    private static Boolean zzgl;
    private static Boolean zzgm;
    private static Boolean zzgn;
    private static Boolean zzgo;
    private static Boolean zzgp;
    private static Boolean zzgq;
    private static Boolean zzgr;
    private static Boolean zzgs;

    private DeviceProperties() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (com.google.android.gms.common.util.DeviceProperties.zzgm.booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isTablet(android.content.res.Resources r5) {
        /*
            r4 = 3
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L6
        L5:
            return r2
        L6:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzgl
            if (r0 != 0) goto L41
            android.content.res.Configuration r0 = r5.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            if (r0 <= r4) goto L48
            r0 = r1
        L15:
            if (r0 != 0) goto L3a
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzgm
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r5.getConfiguration()
            int r3 = r0.screenLayout
            r3 = r3 & 15
            if (r3 > r4) goto L4a
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 < r3) goto L4a
            r0 = r1
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzgm = r0
        L32:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzgm
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3b
        L3a:
            r2 = r1
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            com.google.android.gms.common.util.DeviceProperties.zzgl = r0
        L41:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzgl
            boolean r2 = r0.booleanValue()
            goto L5
        L48:
            r0 = r2
            goto L15
        L4a:
            r0 = r2
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isTablet(android.content.res.Resources):boolean");
    }

    public static boolean isWearable(Context context) {
        if (zzgn == null) {
            zzgn = Boolean.valueOf(PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return zzgn.booleanValue();
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        return isWearable(context) && (!PlatformVersion.isAtLeastN() || (isSidewinder(context) && !PlatformVersion.isAtLeastO()));
    }

    public static boolean isSidewinder(Context context) {
        if (zzgo == null) {
            zzgo = Boolean.valueOf(PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzgo.booleanValue();
    }

    public static boolean isLatchsky(Context context) {
        if (zzgp == null) {
            PackageManager packageManager = context.getPackageManager();
            zzgp = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return zzgp.booleanValue();
    }

    public static boolean zzf(Context context) {
        if (zzgq == null) {
            zzgq = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return zzgq.booleanValue();
    }

    public static boolean isAuto(Context context) {
        if (zzgr == null) {
            zzgr = Boolean.valueOf(PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return zzgr.booleanValue();
    }

    public static boolean isTv(Context context) {
        if (zzgs == null) {
            PackageManager packageManager = context.getPackageManager();
            zzgs = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return zzgs.booleanValue();
    }

    public static boolean isUserBuild() {
        return as.m.equals(Build.TYPE);
    }
}
