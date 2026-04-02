package com.yxcorp.kuaishou.addfp.android.a;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.g;
import com.yxcorp.kuaishou.addfp.android.Orange;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c {
    private static boolean d = true;
    private String a;
    private String b;
    private ReentrantLock c;

    private c() {
        this.b = "";
        this.c = new ReentrantLock();
    }

    public static String a(Context context) {
        boolean z;
        try {
            if (d) {
                boolean z2 = true;
                if (!(Build.VERSION.SDK_INT >= 26)) {
                    String b = b();
                    if (!TextUtils.isEmpty(b)) {
                        return b;
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    String str = Build.MODEL;
                    z = !TextUtils.isEmpty(str) && str.toLowerCase().contains("redmi") && str.toLowerCase().contains("note 7");
                    if (Build.BRAND.equalsIgnoreCase("HONOR")) {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    String gSer = Orange.getInstance().gSer();
                    if (!TextUtils.isEmpty(gSer) && !gSer.startsWith("KWE")) {
                        return gSer;
                    }
                }
                String[] strArr = {g.c};
                for (int i = 0; i <= 0; i++) {
                    if (context.checkPermission(strArr[0], Process.myPid(), Process.myUid()) == -1) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    String serial = Build.getSerial();
                    if (!TextUtils.isEmpty(serial) && !serial.equals("unknown")) {
                        return serial;
                    }
                }
                String str2 = Build.SERIAL;
                return !TextUtils.isEmpty(str2) ? !str2.equals("unknown") ? str2 : "KWE_N" : "KWE_N";
            }
            return "KWE_NPN";
        } catch (Throwable th) {
            th.printStackTrace();
            return "KWE_N";
        }
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "KWE_N" : str.replace("=", "").replace("&", "");
    }

    public static void a(JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("64".equals(next) && jSONObject.optInt(next, 1) == 0) {
                    d = false;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r2 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "/sys/class/android_usb/android0/iSerial"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L31
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L35
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L32
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L2f
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r1 = move-exception
            r1.printStackTrace()
        L2e:
            return r0
        L2f:
            r1 = move-exception
            goto L37
        L31:
            r2 = r0
        L32:
            if (r2 == 0) goto L44
            goto L3c
        L35:
            r1 = move-exception
            r2 = r0
        L37:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L44
        L3c:
            r2.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L40:
            r1 = move-exception
            r1.printStackTrace()
        L44:
            return r0
        L45:
            r0 = move-exception
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r1 = move-exception
            r1.printStackTrace()
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.android.a.c.b():java.lang.String");
    }

    public static c c() {
        return b.a;
    }

    public String a() {
        try {
            return !TextUtils.isEmpty(this.a) ? this.a : "KWE_N";
        } catch (Throwable th) {
            th.printStackTrace();
            return "KWE_N";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6 A[Catch: all -> 0x02ec, TryCatch #11 {all -> 0x034c, blocks: (B:72:0x01d2, B:77:0x0203, B:87:0x0215, B:89:0x0222, B:91:0x0233, B:93:0x0248, B:95:0x0256, B:97:0x0264, B:99:0x026a, B:101:0x0272, B:103:0x0278, B:105:0x0280, B:110:0x028c, B:114:0x0295, B:126:0x02f0, B:108:0x0287, B:86:0x0212, B:84:0x020d, B:115:0x029c, B:118:0x02a6, B:120:0x02ba, B:121:0x02c5, B:122:0x02c8), top: B:163:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264 A[Catch: all -> 0x034c, TryCatch #11 {all -> 0x034c, blocks: (B:72:0x01d2, B:77:0x0203, B:87:0x0215, B:89:0x0222, B:91:0x0233, B:93:0x0248, B:95:0x0256, B:97:0x0264, B:99:0x026a, B:101:0x0272, B:103:0x0278, B:105:0x0280, B:110:0x028c, B:114:0x0295, B:126:0x02f0, B:108:0x0287, B:86:0x0212, B:84:0x020d, B:115:0x029c, B:118:0x02a6, B:120:0x02ba, B:121:0x02c5, B:122:0x02c8), top: B:163:0x01d2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(android.content.Context r23, com.yxcorp.kuaishou.addfp.ResponseDfpCallback r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.android.a.c.a(android.content.Context, com.yxcorp.kuaishou.addfp.ResponseDfpCallback, boolean):java.lang.String");
    }

    public void b(String str) {
        this.a = str;
    }
}
