package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m0 {
    private static String a = null;
    private static String b = ":push";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r4.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L48
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L48
            r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L46
        L31:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L46
            if (r3 <= 0) goto L3c
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L46
            r2.append(r3)     // Catch: java.lang.Throwable -> L46
            goto L31
        L3c:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L46
        L40:
            r1.close()     // Catch: java.lang.Exception -> L44
            goto L4d
        L44:
            r1 = move-exception
            goto L4d
        L46:
            r2 = move-exception
            goto L4a
        L48:
            r1 = move-exception
            r1 = r0
        L4a:
            if (r1 == 0) goto L4d
            goto L40
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.m0.a():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        bykvm_19do.bykvm_19do.bykvm_19do.m0.a = r1.processName;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r3) {
        /*
            java.lang.String r0 = bykvm_19do.bykvm_19do.bykvm_19do.m0.a
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            goto L59
        L9:
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Exception -> L32
            java.util.List r3 = r3.getRunningAppProcesses()     // Catch: java.lang.Exception -> L32
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L32
        L1d:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L32
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L32
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L32
            int r2 = r1.pid     // Catch: java.lang.Exception -> L32
            if (r2 != r0) goto L1d
            java.lang.String r3 = r1.processName     // Catch: java.lang.Exception -> L32
            bykvm_19do.bykvm_19do.bykvm_19do.m0.a = r3     // Catch: java.lang.Exception -> L32
            goto L36
        L32:
            r3 = move-exception
            r3.printStackTrace()
        L36:
            java.lang.String r3 = a()
            bykvm_19do.bykvm_19do.bykvm_19do.m0.a = r3
            boolean r3 = bykvm_19do.bykvm_19do.bykvm_19do.l0.a
            if (r3 == 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "getProcessName, "
            r3.append(r0)
            java.lang.String r0 = bykvm_19do.bykvm_19do.bykvm_19do.m0.a
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r0 = 0
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r3, r0)
        L57:
            java.lang.String r0 = bykvm_19do.bykvm_19do.bykvm_19do.m0.a
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.m0.a(android.content.Context):java.lang.String");
    }

    private static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    public static String a(String str, HashMap<String, String> hashMap, String str2) {
        StringBuilder sb = new StringBuilder(str);
        for (String str3 : hashMap.keySet()) {
            String a2 = a(str3, str2);
            String str4 = hashMap.get(str3);
            String a3 = str4 != null ? a(str4, str2) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a2);
            sb.append("=");
            sb.append(a3);
        }
        return sb.toString();
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        return (jSONObject == null || jSONObject2 == null) ? a((Object) jSONObject, (Object) jSONObject2) : jSONObject.toString().equals(jSONObject2.toString());
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        } catch (JSONException e) {
            l0.a(e);
        }
        return jSONObject;
    }

    public static boolean b(Context context) {
        String a2 = a(context);
        return a2 != null && a2.endsWith(b);
    }
}
