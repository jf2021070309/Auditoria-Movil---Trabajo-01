package com.kwad.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class InstalledAppInfoManager {

    /* loaded from: classes3.dex */
    public static class AppPackageInfo implements Serializable {
        private static final long serialVersionUID = -324393456884895874L;
        public String appName;
        public long firstInstallTime;
        public boolean isSystemApp;
        public long lastUpdateTime;
        public String packageName;
        public int reportMethod;
        public String versionName;
    }

    public static AppPackageInfo a(PackageInfo packageInfo, PackageManager packageManager) {
        AppPackageInfo appPackageInfo = new AppPackageInfo();
        appPackageInfo.packageName = packageInfo.packageName;
        if (packageInfo.applicationInfo != null) {
            appPackageInfo.isSystemApp = a(packageInfo.applicationInfo) || b(packageInfo.applicationInfo);
        }
        appPackageInfo.versionName = packageInfo.versionName;
        appPackageInfo.firstInstallTime = packageInfo.firstInstallTime;
        appPackageInfo.lastUpdateTime = packageInfo.lastUpdateTime;
        if (packageManager != null && packageInfo.applicationInfo != null && ak.ak(ServiceProvider.getContext(), packageInfo.packageName)) {
            try {
                appPackageInfo.appName = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        }
        return appPackageInfo;
    }

    public static JSONObject a(AppPackageInfo appPackageInfo) {
        JSONObject jSONObject = new JSONObject();
        t.putValue(jSONObject, "pkgName", appPackageInfo.packageName);
        t.putValue(jSONObject, "system_app", appPackageInfo.isSystemApp ? 1 : 0);
        t.putValue(jSONObject, "appVersion", appPackageInfo.versionName);
        t.putValue(jSONObject, "firstInstallTime", appPackageInfo.firstInstallTime);
        t.putValue(jSONObject, "lastUpdateTime", appPackageInfo.lastUpdateTime);
        t.putValue(jSONObject, "reportMethod", appPackageInfo.reportMethod);
        t.putValue(jSONObject, "appName", appPackageInfo.appName);
        return jSONObject;
    }

    public static void a(final Context context, final com.kwad.sdk.g.a<JSONArray> aVar) {
        g.execute(new aw() { // from class: com.kwad.sdk.utils.InstalledAppInfoManager.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                aVar.accept(InstalledAppInfoManager.f(InstalledAppInfoManager.bX(context)));
            }
        });
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    private static boolean b(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 128) != 0;
    }

    public static Map<String, AppPackageInfo> bX(Context context) {
        HashMap hashMap = new HashMap();
        if (context == null) {
            return hashMap;
        }
        PackageManager packageManager = context.getPackageManager();
        if (at.Jf()) {
            List<String> Jg = at.Jg();
            if (Jg != null && !Jg.isEmpty()) {
                for (String str : new ArrayList(Jg)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                        if (packageInfo != null) {
                            AppPackageInfo a = a(packageInfo, packageManager);
                            a.reportMethod = 3;
                            hashMap.put(a.packageName, a);
                        }
                    } catch (Throwable th) {
                    }
                }
            }
            return hashMap;
        }
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar != null && o.HX()) {
            try {
                List<String> dm = be.dm(context);
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 32)) {
                    if (resolveInfo != null && resolveInfo.activityInfo != null && !TextUtils.isEmpty(resolveInfo.activityInfo.packageName)) {
                        String str2 = resolveInfo.activityInfo.packageName;
                        if (dm != null && !dm.isEmpty()) {
                            dm.remove(str2);
                        }
                        PackageInfo packageInfo2 = packageManager.getPackageInfo(str2, 0);
                        if (packageInfo2 != null) {
                            AppPackageInfo a2 = a(packageInfo2, packageManager);
                            a2.reportMethod = 1;
                            hashMap.put(a2.packageName, a2);
                        }
                    }
                }
                if (dm != null && !dm.isEmpty()) {
                    for (String str3 : dm) {
                        try {
                            PackageInfo packageInfo3 = packageManager.getPackageInfo(str3, 0);
                            if (packageInfo3 != null) {
                                AppPackageInfo a3 = a(packageInfo3, packageManager);
                                a3.reportMethod = 2;
                                hashMap.put(a3.packageName, a3);
                            }
                        } catch (Throwable th2) {
                        }
                    }
                }
            } catch (Exception e) {
            }
            hashMap.putAll(d(context, fVar.xz()));
        }
        return hashMap;
    }

    public static JSONArray[] c(Context context, List<String> list) {
        JSONArray[] jSONArrayArr = new JSONArray[2];
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (context == null || list == null || list.isEmpty() || fVar == null || !o.HX()) {
            return jSONArrayArr;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (String str : list) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo != null) {
                    AppPackageInfo a = a(packageInfo, packageManager);
                    hashMap.put(a.packageName, a);
                } else {
                    AppPackageInfo appPackageInfo = new AppPackageInfo();
                    appPackageInfo.packageName = str;
                    hashMap2.put(appPackageInfo.packageName, appPackageInfo);
                }
            } catch (Exception e) {
                AppPackageInfo appPackageInfo2 = new AppPackageInfo();
                appPackageInfo2.packageName = str;
                hashMap2.put(appPackageInfo2.packageName, appPackageInfo2);
            }
        }
        jSONArrayArr[0] = f(hashMap);
        jSONArrayArr[1] = f(hashMap2);
        return jSONArrayArr;
    }

    private static Map<String, AppPackageInfo> d(Context context, List<String> list) {
        HashMap hashMap = new HashMap();
        if (context != null && list != null) {
            for (String str : list) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    if (packageInfo != null) {
                        AppPackageInfo a = a(packageInfo, packageManager);
                        hashMap.put(a.packageName, a);
                    }
                } catch (Exception e) {
                }
            }
        }
        return hashMap;
    }

    public static JSONArray f(Map<String, AppPackageInfo> map) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : map.keySet()) {
                AppPackageInfo appPackageInfo = map.get(str);
                if (appPackageInfo != null && !TextUtils.isEmpty(appPackageInfo.packageName)) {
                    t.putValue(jSONArray, a(appPackageInfo));
                }
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        return jSONArray;
    }
}
