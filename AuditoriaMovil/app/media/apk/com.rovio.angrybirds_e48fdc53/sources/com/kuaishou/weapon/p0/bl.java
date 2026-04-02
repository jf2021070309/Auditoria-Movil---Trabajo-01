package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.facebook.appevents.AppEventsConstants;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bl {
    public static int a(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                return displayMetrics.densityDpi;
            }
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    public static JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            TimeZone timeZone = Calendar.getInstance().getTimeZone();
            if (timeZone != null) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
                jSONObject.put("1", timeZone.getID());
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static String b() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = statFs.getBlockSize() * statFs.getBlockCount();
            }
        } catch (Throwable th) {
        }
        return String.valueOf(j);
    }

    public static String c() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable th) {
            str = "";
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject d() {
        /*
            java.lang.String r0 = ";"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "lsmod"
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L6b
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L6b
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L6b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L6b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L67
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L67
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L67
        L25:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L5a
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L25
            java.lang.String r2 = com.kuaishou.weapon.p0.bn.a(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "-"
            boolean r5 = r2.contains(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L25
            boolean r5 = r2.contains(r0)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L25
            java.lang.String r5 = ";;;"
            java.lang.String r2 = r2.replace(r5, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L65
            int r5 = r2.length     // Catch: java.lang.Throwable -> L65
            r6 = 1
            if (r5 <= r6) goto L25
            r5 = 0
            r5 = r2[r5]     // Catch: java.lang.Throwable -> L65
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L65
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L65
            goto L25
        L5a:
            r4.close()     // Catch: java.io.IOException -> L5e
            goto L5f
        L5e:
            r0 = move-exception
        L5f:
            r3.close()     // Catch: java.io.IOException -> L63
            goto L77
        L63:
            r0 = move-exception
            goto L77
        L65:
            r0 = move-exception
            goto L69
        L67:
            r0 = move-exception
            r3 = r2
        L69:
            r2 = r4
            goto L6d
        L6b:
            r0 = move-exception
            r3 = r2
        L6d:
            if (r2 == 0) goto L74
            r2.close()     // Catch: java.io.IOException -> L73
            goto L74
        L73:
            r0 = move-exception
        L74:
            if (r3 == 0) goto L77
            goto L5f
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.bl.d():org.json.JSONObject");
    }
}
