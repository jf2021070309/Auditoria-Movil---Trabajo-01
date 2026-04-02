package com.amazon.aps.iva.u9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class g {
    static {
        com.amazon.aps.iva.k9.m.e("PackageManagerHelper");
    }

    public static void a(Context context, Class<?> cls, boolean z) {
        int i;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            String.format("%s %s", objArr);
            c.a(new Throwable[0]);
        } catch (Exception e) {
            com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            String.format("%s could not be %s", objArr2);
            c2.a(e);
        }
    }
}
