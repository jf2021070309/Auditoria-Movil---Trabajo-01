package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.as;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;
/* compiled from: UMProbe.java */
/* loaded from: classes3.dex */
public class k {
    public static final String b = "_dsk_s";
    public static final String c = "_thm_z";
    public static final String d = "_gdf_r";
    public static final String a = as.b().b(as.s);
    private static Object e = new Object();

    public static String a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (e) {
                jSONObject.put(b, sharedPreferences.getString(b, ""));
                jSONObject.put(c, sharedPreferences.getString(c, ""));
                jSONObject.put(d, sharedPreferences.getString(d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            UMCrashManager.reportCrash(context, e2);
            return null;
        }
    }

    public static void b(final Context context) {
        if (!c(context)) {
            final String[] strArr = {"unknown", "unknown", "unknown"};
            new Thread() { // from class: com.umeng.commonsdk.internal.utils.k.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    try {
                        strArr[0] = k.c();
                        strArr[1] = k.a();
                        strArr[2] = k.b();
                        ULog.i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                        k.b(context, strArr);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(context, th);
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0)) != null) {
            synchronized (e) {
                sharedPreferences.edit().putString(b, strArr[0]).putString(c, strArr[1]).putString(d, strArr[2]).commit();
            }
        }
    }

    public static boolean c(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(b, ""))) {
            return false;
        }
        return true;
    }

    public static int a(String str, String str2) throws IOException {
        int i;
        if (Build.VERSION.SDK_INT > 28) {
            return -1;
        }
        Process exec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                i = -1;
                break;
            } else if (readLine.contains(str2)) {
                i = 1;
                break;
            }
        }
        try {
            if (exec.waitFor() != 0) {
                return -1;
            }
            return i;
        } catch (InterruptedException e2) {
            return -1;
        }
    }

    public static String a() {
        int i;
        try {
            i = a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable th) {
            i = -1;
        }
        if (i > 0) {
            return "thermal_zone";
        }
        if (i >= 0) {
            return "unknown";
        }
        return "noper";
    }

    public static String b() {
        int i;
        try {
            i = a("ls /", "goldfish");
        } catch (Throwable th) {
            i = -1;
        }
        if (i > 0) {
            return "goldfish";
        }
        if (i >= 0) {
            return "unknown";
        }
        return "noper";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "/proc/diskstats"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
        L14:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "mtd"
            java.lang.String r3 = "sda"
            java.lang.String r4 = "mmcblk"
            if (r0 == 0) goto L3a
            boolean r5 = r0.contains(r4)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L29
        L27:
            r2 = r4
            goto L3c
        L29:
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L32
        L30:
            r2 = r3
            goto L3c
        L32:
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L14
        L39:
            goto L3c
        L3a:
            java.lang.String r2 = "unknown"
        L3c:
            goto L44
        L3d:
            r0 = move-exception
            r0 = r1
            goto L41
        L40:
            r1 = move-exception
        L41:
            java.lang.String r2 = "noper"
            r1 = r0
        L44:
            if (r1 == 0) goto L4c
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r0 = move-exception
            goto L4d
        L4c:
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.k.c():java.lang.String");
    }
}
