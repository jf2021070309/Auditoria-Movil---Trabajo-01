package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.d;
/* loaded from: classes.dex */
public final class ab {
    static Boolean AFInAppEventType;
    static String valueOf;

    public static d.e.C0036d AFInAppEventParameterName(ContentResolver contentResolver) {
        String str;
        if (AFKeystoreWrapper() && contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                return new d.e.C0036d(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.AFInAppEventType("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new d.e.C0036d(str, Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.d.e.C0036d values(android.content.Context r6) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.ab.valueOf
            r2 = 1
            if (r1 == 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r3 = 0
            if (r1 == 0) goto L13
            java.lang.String r6 = com.appsflyer.internal.ab.valueOf
        L11:
            r0 = r3
            goto L52
        L13:
            java.lang.Boolean r4 = com.appsflyer.internal.ab.AFInAppEventType
            if (r4 == 0) goto L1d
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L29
        L1d:
            java.lang.Boolean r4 = com.appsflyer.internal.ab.AFInAppEventType
            if (r4 != 0) goto L50
            java.lang.String r4 = "collectOAID"
            boolean r2 = r0.getBoolean(r4, r2)
            if (r2 == 0) goto L50
        L29:
            com.appsflyer.oaid.OaidClient r2 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L49
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L49
            boolean r6 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L49
            r2.setLogging(r6)     // Catch: java.lang.Throwable -> L49
            com.appsflyer.oaid.OaidClient$Info r6 = r2.fetch()     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L50
            java.lang.String r0 = r6.getId()     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r6 = r6.getLat()     // Catch: java.lang.Throwable -> L47
            r5 = r0
            r0 = r6
            r6 = r5
            goto L52
        L47:
            r6 = r0
            goto L4a
        L49:
            r6 = r3
        L4a:
            java.lang.String r0 = "No OAID library"
            com.appsflyer.AFLogger.values(r0)
            goto L11
        L50:
            r6 = r3
            r0 = r6
        L52:
            if (r6 == 0) goto L60
            com.appsflyer.internal.d$e$d r2 = new com.appsflyer.internal.d$e$d
            r2.<init>(r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r2.AFInAppEventParameterName = r6
            return r2
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ab.values(android.content.Context):com.appsflyer.internal.d$e$d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r8.length() == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.d.e.C0036d valueOf(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ab.valueOf(android.content.Context, java.util.Map):com.appsflyer.internal.d$e$d");
    }

    private static boolean AFKeystoreWrapper() {
        Boolean bool = AFInAppEventType;
        return bool == null || bool.booleanValue();
    }
}
