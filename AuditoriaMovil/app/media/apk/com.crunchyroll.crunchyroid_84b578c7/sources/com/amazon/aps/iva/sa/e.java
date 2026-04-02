package com.amazon.aps.iva.sa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;
import java.util.Objects;
/* compiled from: ServiceResolver.java */
/* loaded from: classes.dex */
public final class e {
    public static ResolveInfo a(Context context, Intent intent, String str) {
        List<ResolveInfo> queryIntentServices;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            queryIntentServices = null;
        } else {
            queryIntentServices = packageManager.queryIntentServices(intent, 0);
        }
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        int size = queryIntentServices.size();
        if (str != null) {
            for (int i = size - 1; i >= 0; i--) {
                ServiceInfo serviceInfo = queryIntentServices.get(i).serviceInfo;
                String str2 = serviceInfo.packageName;
                if (!str.equals(serviceInfo.permission) && packageManager.checkPermission(str, str2) != 0) {
                    String.format("Package (%s) has NOT declared support for (%s)", str2, str);
                    queryIntentServices.remove(i);
                }
            }
            size = queryIntentServices.size();
        }
        if (size > 1) {
            for (int i2 = size - 1; i2 >= 0; i2--) {
                try {
                    int i3 = packageManager.getApplicationInfo(queryIntentServices.get(i2).serviceInfo.packageName, 0).flags;
                    if ((i3 & 1) == 0 && (i3 & 128) == 0) {
                        queryIntentServices.remove(i2);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    queryIntentServices.remove(i2);
                }
            }
        }
        if (queryIntentServices.size() > 1) {
            Objects.toString(intent);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        return queryIntentServices.get(0);
    }
}
