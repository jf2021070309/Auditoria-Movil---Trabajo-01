package com.ss.android.downloadlib.rb;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    public static String dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.ss.android.dr.o.dr(new File(str));
    }

    public static int dr(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 5;
        }
        return com.ss.android.dr.o.dr(str, new File(str2));
    }

    public static String ge(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = com.ss.android.downloadlib.addownload.wb.getContext().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.sourceDir;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void dr() {
        if (com.ss.android.downloadlib.addownload.wb.ll().optInt("hook", 0) != 1) {
            return;
        }
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.rb.dr.1
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.bn.q.rb();
                dr.o();
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        Field declaredField;
        Class<?> cls;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } else {
                declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null || (cls = Class.forName("android.app.IActivityManager")) == null) {
                return;
            }
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new C0300dr(obj2)));
        } catch (Throwable th) {
        }
    }

    public static void dr(Object[] objArr) {
        if (com.ss.android.downloadlib.addownload.wb.ll().optInt("hook", 0) == 1 && (objArr[1] instanceof String) && (objArr[2] instanceof Intent)) {
            Intent intent = (Intent) objArr[2];
            if ("android.intent.action.VIEW".equals(intent.getAction()) && DownloadConstants.MIME_APK.equals(intent.getType())) {
                if (com.ss.android.socialbase.appdownloader.bn.q.o()) {
                    String optString = com.ss.android.downloadlib.addownload.wb.ll().optString("hook_vivo_arg", "com.android.settings");
                    if (!"null".equals(optString)) {
                        objArr[1] = optString;
                    }
                } else if (com.ss.android.socialbase.appdownloader.bn.q.g()) {
                    JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
                    String optString2 = ll.optString("hook_kllk_arg1", "com." + DownloadConstants.LOWER_OPPO + ".market");
                    if (!"null".equals(optString2)) {
                        objArr[1] = optString2;
                    }
                    String optString3 = com.ss.android.downloadlib.addownload.wb.ll().optString("hook_kllk_arg2", "com.android.browser");
                    JSONObject ll2 = com.ss.android.downloadlib.addownload.wb.ll();
                    String optString4 = ll2.optString("hook_kllk_arg3", "m.store." + DownloadConstants.LOWER_OPPO + "mobile.com");
                    StringBuilder sb = new StringBuilder();
                    sb.append(DownloadConstants.LOWER_OPPO);
                    sb.append("_extra_pkg_name");
                    intent.putExtra(sb.toString(), optString3);
                    intent.putExtra("refererHost", optString4);
                    if (com.ss.android.downloadlib.addownload.wb.ll().optInt("hook_kllk_arg4", 0) == 1) {
                        Intent intent2 = new Intent();
                        intent2.putExtra(DownloadConstants.LOWER_OPPO + "_extra_pkg_name", optString3);
                        intent2.putExtra("refererHost", optString4);
                        intent.putExtra("android.intent.extra.INTENT", intent2);
                    }
                } else if (com.ss.android.socialbase.appdownloader.bn.q.dr()) {
                    String optString5 = com.ss.android.downloadlib.addownload.wb.ll().optString("hook_huawei_arg1", "com.huawei.appmarket");
                    if (!"null".equals(optString5)) {
                        objArr[1] = optString5;
                    }
                    intent.putExtra("caller_package", com.ss.android.downloadlib.addownload.wb.ll().optString("hook_huawei_arg2", "com.huawei.appmarket"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.rb.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0300dr implements InvocationHandler {
        private Object dr;

        private C0300dr(Object obj) {
            this.dr = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if ("startActivity".contains(method.getName())) {
                    dr.dr(objArr);
                }
            } catch (Throwable th) {
            }
            return method.invoke(this.dr, objArr);
        }
    }
}
