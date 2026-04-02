package com.amazon.aps.iva.ys;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: AppVersionProvider.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final String a;

    public f(Context context) {
        String str;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            str = packageInfo.versionName + " (" + com.amazon.aps.iva.e3.a.a(packageInfo) + ")";
        } catch (PackageManager.NameNotFoundException e) {
            com.amazon.aps.iva.mf0.a.a.k(e, "Failed to get application version", new Object[0]);
            str = "";
        }
        this.a = str;
    }

    @Override // com.amazon.aps.iva.ys.e
    public final String a() {
        return this.a;
    }
}
