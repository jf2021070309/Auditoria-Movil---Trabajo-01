package com.kuaishou.weapon.p0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.facebook.appevents.AppEventsConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bg {
    public static String A(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            String[] strArr = {g.c, g.i, g.j, "android.permission.READ_CONTACTS", "android.permission.CAMERA", "android.permission.RECORD_AUDIO", g.g, g.h, "android.permission.BLUETOOTH", "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"};
            for (int i = 0; i < 11; i++) {
                sb.append(g.a(context, strArr[i]) == 0 ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
        } catch (Exception e) {
        }
        return sb.toString();
    }

    public static String B(Context context) {
        Iterator<String> keys;
        try {
            StringBuilder sb = new StringBuilder();
            JSONObject C = C(context);
            if (C != null && (keys = C.keys()) != null) {
                String str = "";
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = C.getString(next);
                    sb.append(str);
                    str = ";";
                    sb.append(next);
                    sb.append("=");
                    sb.append(string);
                }
                return sb.toString();
            }
        } catch (Exception e) {
        }
        return "";
    }

    private static JSONObject C(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = WeaponHI.sUserId;
            String l = l();
            String str2 = WeaponHI.sChannel;
            String k = k();
            String j = j();
            String str3 = "";
            jSONObject.put("userId", TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, "UTF-8"));
            jSONObject.put("platform", TextUtils.isEmpty(l) ? "" : URLEncoder.encode(l, "UTF-8"));
            jSONObject.put("channel", TextUtils.isEmpty(str2) ? "" : URLEncoder.encode(str2, "UTF-8"));
            try {
                if (h.a(context, "re_po_rt").e("a1_p_s_p_s")) {
                    jSONObject.put("mod", TextUtils.isEmpty(k) ? "" : URLEncoder.encode(k, "UTF-8"));
                    if (!TextUtils.isEmpty(j)) {
                        str3 = URLEncoder.encode(j, "UTF-8");
                    }
                } else {
                    jSONObject.put("mod", "");
                }
                jSONObject.put("sysver", str3);
            } catch (Exception e) {
            }
            return jSONObject;
        } catch (Exception e2) {
            return null;
        }
    }

    public static double a() {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().getLocation());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                return new JSONObject(c).getDouble("latitude");
            }
            return -1.0d;
        } catch (Throwable th) {
            return -1.0d;
        }
    }

    private static String a(AccessibilityServiceInfo accessibilityServiceInfo) {
        String id = accessibilityServiceInfo.getId();
        int lastIndexOf = id.lastIndexOf("/");
        return lastIndexOf > 0 ? id.substring(0, lastIndexOf) : id;
    }

    public static String a(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fn());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String a(Context context, int i) {
        try {
            return i == 1 ? c(com.kwad.sdk.f.b.Fz().Fq()) : c(com.kwad.sdk.f.b.Fz().Fn());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(cls, str);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method b = b(cls, str, clsArr);
            try {
                b.setAccessible(true);
                return b;
            } catch (Throwable th) {
                return b;
            }
        } catch (Throwable th2) {
            return null;
        }
    }

    public static void a(final Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || h.a(context, "re_po_rt").c(de.bl, 1) == 0) {
            return;
        }
        try {
            JSONObject a = new cl(str, cj.j).a(context);
            if (map == null || map.size() <= 0) {
                a.put("module_section", new JSONObject());
            } else {
                a.put("module_section", new JSONObject(map));
            }
            final String jSONObject = a.toString();
            n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.bg.1
                @Override // java.lang.Runnable
                public final void run() {
                    co.a(context, jSONObject);
                }
            });
        } catch (Throwable th) {
        }
    }

    public static double b() {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().getLocation());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                return new JSONObject(c).getDouble("longitude");
            }
            return -1.0d;
        } catch (Throwable th) {
            return -1.0d;
        }
    }

    public static int b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return new JSONObject(str).getBoolean("userSet") ? 1 : 0;
        } catch (Throwable th) {
            return -2;
        }
    }

    public static String b(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fn());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String b(Context context, int i) {
        try {
            return i == 1 ? c(com.kwad.sdk.f.b.Fz().Fq()) : c(com.kwad.sdk.f.b.Fz().Fn());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static Method b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            if (method != null) {
                return method;
            }
        } catch (Throwable th) {
        }
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    public static String c() {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().Fv());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                JSONObject jSONObject = new JSONObject(c);
                return jSONObject.getString("cellId") + ", " + jSONObject.getString("lac");
            }
            return c;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String c(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fn());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("errorCode");
            if (i != 0) {
                return i == 3 ? bh.c : i == 1 ? bh.a : bh.d;
            }
            str2 = jSONObject.getString("value");
            return str2;
        } catch (Throwable th) {
            return str2;
        }
    }

    public static String d() {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().Fx());
            if (!TextUtils.isEmpty(c)) {
                if (c.startsWith("RISK")) {
                }
            }
            return c;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String d(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fs());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String e(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().getIccId());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static JSONArray e() {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().Fw());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray(c);
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("1", jSONArray2.getJSONObject(i).getString("ssid"));
                    jSONObject.put("2", jSONArray2.getJSONObject(i).getString("bssid"));
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static String f() {
        try {
            return c(com.kwad.sdk.f.b.Fz().getIp());
        } catch (Throwable th) {
            return bh.c;
        }
    }

    public static String f(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fo());
        } catch (Throwable th) {
            return bh.d;
        }
    }

    public static String g() {
        try {
            return c(com.kwad.sdk.f.b.Fz().Fp());
        } catch (Throwable th) {
            return bh.c;
        }
    }

    public static boolean g(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Throwable th) {
            return false;
        }
    }

    public static String h() {
        try {
            Locale locale = Locale.getDefault();
            return locale.getLanguage() + "-" + locale.getCountry();
        } catch (Throwable th) {
            return "";
        }
    }

    public static boolean h(Context context) {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT <= 16 ? Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0 : Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0) {
                z = true;
            }
        } catch (Throwable th) {
        }
        return z;
    }

    public static String i() {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public static String i(Context context) {
        try {
            List<InputMethodInfo> inputMethodList = ((InputMethodManager) context.getSystemService("input_method")).getInputMethodList();
            StringBuilder sb = new StringBuilder();
            for (InputMethodInfo inputMethodInfo : inputMethodList) {
                sb.append(inputMethodInfo.getId());
                sb.append(";");
            }
            if (TextUtils.isEmpty(sb)) {
                return bh.c;
            }
            String sb2 = sb.toString();
            return sb2.endsWith(";") ? sb2.substring(0, sb2.length() - 1) : sb2;
        } catch (Exception e) {
            return bh.d;
        }
    }

    public static String j() {
        return "ANDROID_" + Build.VERSION.RELEASE;
    }

    public static String j(Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        ActivityInfo activityInfo;
        int i = -1;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                if (string == null) {
                    string = "null";
                }
                String str = "1=" + string + ";";
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) != null) {
                    str = str + "2=";
                    for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
                        String packageName = inputMethodInfo.getPackageName();
                        if (packageName == null) {
                            packageName = "null";
                        }
                        String settingsActivity = inputMethodInfo.getSettingsActivity();
                        if (settingsActivity == null) {
                            settingsActivity = "null";
                        }
                        if (packageManager != null) {
                            try {
                                if (!packageName.equals("null") && !settingsActivity.equals("null") && (activityInfo = packageManager.getActivityInfo(new ComponentName(packageName, settingsActivity), 0)) != null) {
                                    i = activityInfo.launchMode;
                                }
                            } catch (Exception e) {
                            }
                        }
                        str = str + packageName + "-" + settingsActivity + "-" + String.format("%d", Integer.valueOf(i)) + ";";
                    }
                }
                return str;
            } catch (Throwable th) {
                return "";
            }
        }
        return "";
    }

    public static String k() {
        return Build.MANUFACTURER + "(" + Build.MODEL + ")";
    }

    public static String k(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled", 0) != 1) {
                return bh.e;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
            return TextUtils.isEmpty(string) ? bh.c : string;
        } catch (Throwable th) {
            return bh.d;
        }
    }

    private static String l() {
        return "ANDROID_PHONE";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(android.content.Context r5) {
        /*
            java.lang.String r0 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.util.List r5 = r5.getInstalledAccessibilityServiceList()     // Catch: java.lang.Exception -> L45
            if (r5 == 0) goto L43
            int r1 = r5.size()     // Catch: java.lang.Exception -> L45
            if (r1 <= 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L41
        L21:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L47
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L41
            android.accessibilityservice.AccessibilityServiceInfo r2 = (android.accessibilityservice.AccessibilityServiceInfo) r2     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L41
            int r3 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L41
            r4 = -1
            if (r3 != r4) goto L21
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "|"
            r1.append(r2)     // Catch: java.lang.Exception -> L41
            goto L21
        L41:
            r5 = move-exception
            goto L47
        L43:
            r1 = r0
            goto L47
        L45:
            r5 = move-exception
            goto L43
        L47:
            if (r1 != 0) goto L4a
            return r0
        L4a:
            int r5 = r1.length()
            if (r5 <= 0) goto L59
            int r5 = r1.length()
            int r5 = r5 + (-1)
            r1.deleteCharAt(r5)
        L59:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.bg.l(android.content.Context):java.lang.String");
    }

    public static String m(Context context) {
        StringBuilder sb;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        StringBuilder sb2 = null;
        if (accessibilityManager == null) {
            return null;
        }
        try {
            if (!accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null || enabledAccessibilityServiceList.size() <= 0) {
                sb = null;
            } else {
                sb = new StringBuilder();
                try {
                    for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                        String a = a(accessibilityServiceInfo);
                        if (sb.indexOf(a) == -1) {
                            sb.append(a);
                            sb.append("|");
                        }
                    }
                } catch (Exception e) {
                    sb2 = sb;
                    sb = sb2;
                    return sb.toString();
                }
            }
        } catch (Exception e2) {
        }
        if (sb == null) {
            return null;
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '|') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String n(Context context) {
        return bh.d;
    }

    public static String o(Context context) {
        return bh.c;
    }

    public static String p(Context context) {
        return bh.a;
    }

    public static String q(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            return "";
        }
    }

    public static String r(Context context) {
        try {
            return (String) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager());
        } catch (Throwable th) {
            return "";
        }
    }

    public static String s(Context context) {
        try {
            return context.getPackageName();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String t(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.name;
        } catch (Throwable th) {
            return "";
        }
    }

    public static int u(Context context) {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().Ft());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                return Integer.parseInt(c);
            }
            return -1;
        } catch (Throwable th) {
            return -2;
        }
    }

    public static int v(Context context) {
        try {
            String c = c(com.kwad.sdk.f.b.Fz().Fu());
            if (!TextUtils.isEmpty(c) && !c.startsWith("RISK")) {
                return Integer.parseInt(c);
            }
            return -1;
        } catch (Throwable th) {
            return -2;
        }
    }

    public static String w(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.firstInstallTime);
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String x(Context context) {
        return bh.c;
    }

    public static String y(Context context) {
        try {
            return c(com.kwad.sdk.f.b.Fz().getOaid());
        } catch (Throwable th) {
            return "";
        }
    }

    public static String z(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            PackageManager packageManager = context.getPackageManager();
            String[] strArr = {"android.hardware.camera", "android.hardware.camera.autofocus", "android.hardware.camera.flash", "android.hardware.location", "android.hardware.location.gps", "android.hardware.location.network", "android.hardware.microphone", "android.hardware.sensor.compass", "android.hardware.sensor.accelerometer", "android.hardware.sensor.light", "android.hardware.sensor.proximity", "android.hardware.telephony", "android.hardware.telephony.cdma", "android.hardware.telephony.gsm", "android.hardware.touchscreen", "android.hardware.touchscreen.multitouch", "android.hardware.touchscreen.multitouch.distinct", "android.hardware.camera.front", "android.hardware.wifi", "android.hardware.bluetooth", "android.hardware.nfc", "android.hardware.fingerprint", "android.hardware.biometrics.face", "android.hardware.screen.portrait", "android.hardware.screen.landscape", "android.hardware.faketouch", "android.hardware.audio.output"};
            for (int i = 0; i < 27; i++) {
                sb.append(packageManager.hasSystemFeature(strArr[i]) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
        } catch (Exception e) {
        }
        return sb.toString();
    }
}
