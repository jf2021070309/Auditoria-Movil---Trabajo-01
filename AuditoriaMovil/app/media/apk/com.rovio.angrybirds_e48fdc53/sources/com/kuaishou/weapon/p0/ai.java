package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ai {
    private static final String[] b = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    private Context a;

    public ai(Context context) {
        this.a = context;
    }

    private String[] a(String[] strArr) {
        String str;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        try {
            str = System.getenv("PATH");
        } catch (Exception e) {
        }
        if (str != null && !"".equals(str)) {
            String[] split = str.split(":");
            int length = split.length;
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                if (!str2.endsWith("/")) {
                    str2 = str2 + '/';
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean b() {
        String a;
        try {
            a = bg.a("ro.build.display.id");
        } catch (Exception e) {
        }
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (a.contains("flyme")) {
            return true;
        }
        return a.toLowerCase().contains("flyme");
    }

    public int a() {
        boolean z;
        try {
            String[] a = a(bh.z);
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (new File(a[i], bh.y).exists()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return z ? 1 : 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public String a(String str) {
        try {
            return aa.a().b(str).replace("\n", "");
        } catch (Exception e) {
            return "";
        }
    }

    public String c() {
        try {
            if (Build.VERSION.SDK_INT > 29) {
                return null;
            }
            return aa.a().b("su -v").replace("\n", "");
        } catch (Exception e) {
            return null;
        }
    }

    public int d() {
        String a = aa.a().a("ro.secure");
        return (a == null || !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(a)) ? 1 : 0;
    }

    public int e() {
        String a = aa.a().a("ro.debuggable");
        return (a == null || !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(a)) ? 1 : 0;
    }

    public int f() {
        String a = aa.a().a("ro.adb.secure");
        return (a == null || !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(a)) ? 1 : 0;
    }

    public JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            String a = a(" which su ");
            if (TextUtils.isEmpty(a) || a.length() <= 2) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, 0);
            } else {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, 1);
                jSONObject.put("0-p", a);
            }
            String a2 = a(" id ");
            if (!TextUtils.isEmpty(a2)) {
                if (a2.toLowerCase().contains("uid=0")) {
                    jSONObject.put("1", 1);
                } else {
                    jSONObject.put("1", 0);
                }
            }
            String a3 = a(" busybox df ");
            if (!TextUtils.isEmpty(a3) && !a3.contains("not found")) {
                if (a3.length() > 30) {
                    jSONObject.put("2", 1);
                } else {
                    jSONObject.put("2", 0);
                }
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public int h() {
        return new File("/system/app/Superuser.apk").exists() ? 1 : 0;
    }

    public String i() {
        String[] strArr;
        for (String str : b) {
            if (new File(str, "magisk").exists()) {
                return str + "magisk";
            }
        }
        return "";
    }

    public String j() {
        String[] strArr;
        for (String str : b) {
            if (new File(str, bh.y).exists()) {
                return str + bh.y;
            }
        }
        return "";
    }

    public String k() {
        StackTraceElement[] stackTrace;
        try {
            throw new Exception("");
        } catch (Exception e) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") || stackTraceElement.getMethodName().equals("invoked") || stackTraceElement.getMethodName().equals("main") || stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    return stackTraceElement.getClassName();
                }
            }
            return "";
        }
    }
}
