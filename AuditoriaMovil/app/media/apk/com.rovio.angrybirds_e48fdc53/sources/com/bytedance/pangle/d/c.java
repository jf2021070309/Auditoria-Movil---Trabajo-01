package com.bytedance.pangle.d;

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.g;
import com.bytedance.pangle.util.i;
import java.io.File;
/* loaded from: classes.dex */
public final class c {
    private static File a = null;
    private static File b = null;
    private static File c = null;

    private static void d() {
        if (a == null) {
            File filesDir = Zeus.getAppApplication().getFilesDir();
            File file = new File(filesDir, "pangle" + g.c);
            a = file;
            a(file);
        }
    }

    private static String a(File file) {
        if (file != null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getPath();
        }
        return null;
    }

    private static String a(String... strArr) {
        d();
        File file = a;
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    file = new File(file, str);
                }
            }
        }
        return a(file);
    }

    public static String a() {
        Application appApplication = Zeus.getAppApplication();
        if (b == null) {
            File downloadDir = GlobalParam.getInstance().getDownloadDir();
            if (downloadDir == null) {
                File filesDir = appApplication.getFilesDir();
                downloadDir = new File(filesDir, ".pangle" + g.b);
            }
            b = downloadDir;
        }
        return a(b);
    }

    public static String b() {
        Application appApplication = Zeus.getAppApplication();
        if (c == null) {
            File filesDir = appApplication.getFilesDir();
            c = new File(filesDir, ".pangle" + g.a);
        }
        return a(c);
    }

    public static String c() {
        Application appApplication = Zeus.getAppApplication();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = appApplication.getExternalFilesDir(".pangle" + g.b);
                if (externalFilesDir != null) {
                    return a(externalFilesDir);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, int i) {
        d();
        File file = a;
        String[] strArr = {str, "version-".concat(String.valueOf(i))};
        for (int i2 = 0; i2 < 2; i2++) {
            String str2 = strArr[i2];
            if (!TextUtils.isEmpty(str2)) {
                file = new File(file, str2);
            }
        }
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    public static String a(String str) {
        return a(str);
    }

    public static String b(String str, int i) {
        return new File(a(str, "version-".concat(String.valueOf(i)), "apk"), "base-1.apk").getPath();
    }

    public static String c(String str, int i) {
        return i.i() ? a(str, "version-".concat(String.valueOf(i)), "apk", "oat", com.bytedance.pangle.e.b.a()) : a(str, "version-".concat(String.valueOf(i)), "dalvik-cache");
    }

    public static String d(String str, int i) {
        return a(str, "version-".concat(String.valueOf(i)), "lib");
    }

    public static String e(String str, int i) {
        return new File(a(str, "version-".concat(String.valueOf(i)), "apk", "temp"), "base-1.apk").getPath();
    }

    public static String f(String str, int i) {
        return new File(a(str, "version-".concat(String.valueOf(i)), "apk")).getPath();
    }

    public static String g(String str, int i) {
        return new File(a(str, "version-".concat(String.valueOf(i)), "apk", "temp")).getPath();
    }

    public static String h(String str, int i) {
        return i.i() ? a(str, "version-".concat(String.valueOf(i)), "apk", "temp", "oat", com.bytedance.pangle.e.b.a()) : a(str, "version-".concat(String.valueOf(i)), "dalvik-cache");
    }

    public static String i(String str, int i) {
        return a(str, "version-".concat(String.valueOf(i)), "secondary-dexes");
    }
}
