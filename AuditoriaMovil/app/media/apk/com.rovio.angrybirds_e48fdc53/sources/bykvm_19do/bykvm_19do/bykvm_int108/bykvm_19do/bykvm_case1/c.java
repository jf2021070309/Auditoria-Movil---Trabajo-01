package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
/* loaded from: classes.dex */
public class c {
    private static boolean a;

    public static String a() {
        return a("ro.build.version.emui");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Throwable] */
    private static String a(String str) {
        String str2;
        BufferedReader bufferedReader = null;
        String str3 = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                str3 = bufferedReader2.readLine();
                bufferedReader2.close();
                f.a(bufferedReader2);
                return str3;
            } catch (Throwable th) {
                str2 = str3;
                bufferedReader = bufferedReader2;
                f.a(bufferedReader);
                return str2;
            }
        } catch (Throwable th2) {
            str2 = null;
        }
    }

    public static boolean b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return c();
        }
        return true;
    }

    public static boolean c() {
        if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
            if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
                if (Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean d() {
        if (!a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.b.a = true;
                    a = true;
                    return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.b.a;
                }
            } catch (Exception e) {
            }
            a = true;
        }
        return bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.b.a;
    }
}
