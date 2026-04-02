package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
/* loaded from: classes.dex */
public class a {
    private static String a;

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
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.a():java.lang.String");
    }

    public static String a(Context context) {
        String str = a;
        if (TextUtils.isEmpty(str)) {
            try {
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        a = str2;
                        return str2;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            String a2 = a();
            a = a2;
            return a2;
        }
        return str;
    }

    public static boolean b(Context context) {
        String a2 = a(context);
        return (a2 == null || !a2.contains(":")) && a2 != null && a2.equals(context.getPackageName());
    }

    public static boolean c(Context context) {
        String a2 = a(context);
        return a2 != null && (a2.endsWith(":push") || a2.endsWith(":pushservice"));
    }
}
