package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
/* loaded from: classes.dex */
public class i {
    public static String a() {
        BufferedReader bufferedReader;
        String str = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.build.version.emui").getInputStream()), 1024);
            try {
                str = bufferedReader.readLine();
                bufferedReader.close();
            } catch (Throwable th) {
                th = th;
                try {
                    l0.a(th);
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        return str;
    }

    public static boolean a(Context context) {
        return l().toUpperCase().contains("HUAWEI");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        return (!TextUtils.isEmpty(str) && (str.toLowerCase().contains("emotionui") || str.toLowerCase().contains("magicui"))) || b() || c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.lang.String r4) {
        /*
            java.lang.String r0 = ""
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            r2.append(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            java.lang.Process r4 = r1.exec(r4)     // Catch: java.lang.Throwable -> L3a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a
            java.io.InputStream r3 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r3 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L38
            r4.destroy()     // Catch: java.lang.Throwable -> L38
        L32:
            r1.close()     // Catch: java.io.IOException -> L36
            goto L3f
        L36:
            r4 = move-exception
            goto L3f
        L38:
            r4 = move-exception
            goto L3c
        L3a:
            r4 = move-exception
            r1 = 0
        L3c:
            if (r1 == 0) goto L3f
            goto L32
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.i.b(java.lang.String):java.lang.String");
    }

    public static boolean b() {
        return (!TextUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("huawei")) || (!TextUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("huawei"));
    }

    public static boolean c() {
        return (!TextUtils.isEmpty(Build.BRAND) && Build.BRAND.toLowerCase().startsWith("honor")) || (!TextUtils.isEmpty(Build.MANUFACTURER) && Build.MANUFACTURER.toLowerCase().startsWith("honor"));
    }

    public static boolean d() {
        return Class.forName("miui.os.Build").getName().length() > 0;
    }

    public static boolean e() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase().contains("oppo");
    }

    public static boolean f() {
        String str = Build.BRAND;
        if (str == null) {
            return false;
        }
        return str.toLowerCase(Locale.ENGLISH).contains("meizu");
    }

    public static boolean g() {
        return "OnePlus".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean h() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean i() {
        String str = Build.FINGERPRINT;
        if (TextUtils.isEmpty(str)) {
            String b = b("ro.build.version.incremental");
            return !TextUtils.isEmpty(b) && b.contains("VIBEUI_V2");
        }
        return str.contains("VIBEUI_V2");
    }

    public static boolean j() {
        return l().toUpperCase().contains("NUBIA");
    }

    public static boolean k() {
        return l().toUpperCase().contains("ASUS");
    }

    private static String l() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str.trim();
    }
}
