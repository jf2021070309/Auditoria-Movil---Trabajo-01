package com.amazon.aps.iva.y50;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayServicesVersion.kt */
/* loaded from: classes2.dex */
public final class c {
    public final long a;
    public final String b;

    public c(Context context) {
        PackageInfo packageInfo;
        long j;
        PackageManager.PackageInfoFlags of;
        j.f(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("com.google.android.gms", of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            }
        } catch (PackageManager.NameNotFoundException e) {
            com.amazon.aps.iva.mf0.a.a.m(e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            j = com.amazon.aps.iva.e3.a.a(packageInfo);
        } else {
            j = -1;
        }
        this.a = j;
        this.b = packageInfo != null ? packageInfo.versionName : null;
    }
}
