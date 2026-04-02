package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes.dex */
public class h0 {
    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r3) {
        /*
            r0 = 0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> Le java.lang.SecurityException -> L10
            goto L15
        Le:
            r1 = move-exception
            goto L14
        L10:
            r1 = move-exception
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r1)
        L14:
            r1 = r0
        L15:
            if (r1 == 0) goto L43
            boolean r2 = r1.isAvailable()
            if (r2 == 0) goto L43
            int r1 = r1.getType()
            r2 = 1
            if (r2 != r1) goto L27
            java.lang.String r0 = "wifi"
            goto L43
        L27:
            if (r1 != 0) goto L43
            java.lang.String r0 = "phone"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r3 = r3.getNetworkType()
            switch(r3) {
                case 1: goto L41;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3e;
                case 7: goto L41;
                case 8: goto L3e;
                case 9: goto L3e;
                case 10: goto L3e;
                case 11: goto L41;
                case 12: goto L3e;
                case 13: goto L3b;
                case 14: goto L3e;
                case 15: goto L3e;
                case 16: goto L41;
                case 17: goto L3e;
                case 18: goto L3b;
                case 19: goto L3b;
                default: goto L38;
            }
        L38:
            java.lang.String r0 = "mobile"
            goto L43
        L3b:
            java.lang.String r0 = "4g"
            goto L43
        L3e:
            java.lang.String r0 = "3g"
            goto L43
        L41:
            java.lang.String r0 = "2g"
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.h0.b(android.content.Context):java.lang.String");
    }
}
