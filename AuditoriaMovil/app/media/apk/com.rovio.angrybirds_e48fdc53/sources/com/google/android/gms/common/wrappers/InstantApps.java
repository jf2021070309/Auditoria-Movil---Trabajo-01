package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
/* loaded from: classes2.dex */
public class InstantApps {
    private static Context zzht;
    private static Boolean zzhu;

    public static synchronized boolean isInstantApp(Context context) {
        boolean booleanValue;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            if (zzht != null && zzhu != null && zzht == applicationContext) {
                booleanValue = zzhu.booleanValue();
            } else {
                zzhu = null;
                if (PlatformVersion.isAtLeastO()) {
                    zzhu = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        zzhu = true;
                    } catch (ClassNotFoundException e) {
                        zzhu = false;
                    }
                }
                zzht = applicationContext;
                booleanValue = zzhu.booleanValue();
            }
        }
        return booleanValue;
    }
}
