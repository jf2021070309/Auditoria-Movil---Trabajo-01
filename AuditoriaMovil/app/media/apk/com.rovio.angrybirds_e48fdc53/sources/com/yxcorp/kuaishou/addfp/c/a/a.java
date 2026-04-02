package com.yxcorp.kuaishou.addfp.c.a;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.yxcorp.kuaishou.addfp.KWEGIDDFP;
/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015e, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0160, code lost:
        r11 = r0;
        r10 = r1;
        r1 = r12;
        r12 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017f A[Catch: IOException -> 0x017b, TryCatch #20 {IOException -> 0x017b, blocks: (B:112:0x0177, B:116:0x017f, B:118:0x0184), top: B:133:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184 A[Catch: IOException -> 0x017b, TRY_LEAVE, TryCatch #20 {IOException -> 0x017b, blocks: (B:112:0x0177, B:116:0x017f, B:118:0x0184), top: B:133:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d A[Catch: IOException -> 0x0129, TryCatch #11 {IOException -> 0x0129, blocks: (B:76:0x0125, B:80:0x012d, B:82:0x0132), top: B:131:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132 A[Catch: IOException -> 0x0129, TRY_LEAVE, TryCatch #11 {IOException -> 0x0129, blocks: (B:76:0x0125, B:80:0x012d, B:82:0x0132), top: B:131:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152 A[Catch: IOException -> 0x014e, TryCatch #9 {IOException -> 0x014e, blocks: (B:93:0x014a, B:97:0x0152, B:99:0x0157), top: B:128:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157 A[Catch: IOException -> 0x014e, TRY_LEAVE, TryCatch #9 {IOException -> 0x014e, blocks: (B:93:0x014a, B:97:0x0152, B:99:0x0157), top: B:128:0x014a }] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yxcorp.kuaishou.addfp.android.b.e a(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a(java.lang.String, boolean):com.yxcorp.kuaishou.addfp.android.b.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a():java.lang.String");
    }

    public static String a(int i, String str) {
        String a;
        Context paramContext = KWEGIDDFP.instance().getParamContext();
        if (paramContext == null) {
            return "";
        }
        String[] split = new String(Base64.decode("U3lzdGVtQFNlY3VyZUBHbG9iYWw=", 0)).split("@");
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]);
        sb.append(split[1]);
        sb.append(split[2]);
        if (i == 0) {
            a = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[0], str);
            if (TextUtils.isEmpty(a)) {
                a = Settings.System.getString(paramContext.getContentResolver(), str);
            }
        } else if (i == 1) {
            a = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[1], str);
            if (TextUtils.isEmpty(a)) {
                a = Settings.Secure.getString(paramContext.getContentResolver(), str);
            }
        } else if (i == 2) {
            a = com.yxcorp.kuaishou.addfp.android.b.a.a(paramContext, split[2], str);
            if (TextUtils.isEmpty(a)) {
                a = Settings.Global.getString(paramContext.getContentResolver(), str);
            }
        } else {
            a = "";
        }
        return a == null ? "" : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:39:0x00a6, B:41:0x00ae), top: B:57:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #1 {all -> 0x00cd, blocks: (B:3:0x0004, B:6:0x0016, B:8:0x0020, B:21:0x0057, B:23:0x005d, B:26:0x0065, B:28:0x006f, B:32:0x007f, B:34:0x0085, B:35:0x009c, B:45:0x00c0, B:47:0x00c6, B:30:0x0075, B:15:0x003b, B:17:0x0045, B:19:0x0053), top: B:55:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r8) {
        /*
            java.lang.String r0 = "k_w_o_d_out_dtt"
            java.lang.String r1 = "KWE_N"
            java.lang.String r2 = a(r8, r0)     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r4 = "Lm91a2R0ZnQ="
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r7 = ""
            if (r3 == 0) goto L3b
            java.lang.String[] r3 = new java.lang.String[]{r6, r5}     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = com.yxcorp.kuaishou.addfp.android.b.g.a(r8, r3)     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L38
            com.yxcorp.kuaishou.addfp.android.a.d r3 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = r3.a(r4)     // Catch: java.lang.Throwable -> Lcd
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r3 != 0) goto L56
            android.content.ContentResolver r3 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L36
            android.provider.Settings.System.putString(r3, r0, r7)     // Catch: java.lang.Throwable -> L36
            goto L56
        L36:
            r0 = move-exception
            goto L56
        L38:
            java.lang.String r0 = "KWE_PN"
            goto L57
        L3b:
            java.lang.String[] r0 = new java.lang.String[]{r6, r5}     // Catch: java.lang.Throwable -> Lcd
            boolean r0 = com.yxcorp.kuaishou.addfp.android.b.g.a(r8, r0)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L56
            com.yxcorp.kuaishou.addfp.android.a.d r0 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = r0.a(r4)     // Catch: java.lang.Throwable -> Lcd
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L56
            com.yxcorp.kuaishou.addfp.android.a.d.a(r8, r2)     // Catch: java.lang.Throwable -> Lcd
        L56:
            r0 = r1
        L57:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L65
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L65
            goto Ld3
        L65:
            com.yxcorp.kuaishou.addfp.android.a.d r1 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Lcd
            java.util.LinkedHashMap r1 = r1.b(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto L75
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lcd
            if (r2 != 0) goto L7d
        L75:
            com.yxcorp.kuaishou.addfp.android.a.d r8 = com.yxcorp.kuaishou.addfp.android.a.d.a(r8)     // Catch: java.lang.Throwable -> Lcd
            java.util.LinkedHashMap r1 = r8.b(r7)     // Catch: java.lang.Throwable -> Lcd
        L7d:
            if (r1 == 0) goto Lcb
            int r8 = r1.size()     // Catch: java.lang.Throwable -> Lcd
            if (r8 <= 0) goto Lcb
            r8 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            java.util.Set r3 = r1.entrySet()     // Catch: java.lang.Throwable -> Lcd
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lcd
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lcd
            java.util.ListIterator r1 = r2.listIterator(r1)     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r2.<init>()     // Catch: java.lang.Throwable -> Lcd
        L9c:
            boolean r3 = r1.hasPrevious()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto Lc0
            r3 = 10
            if (r8 >= r3) goto Lc0
            java.lang.Object r3 = r1.previous()     // Catch: java.lang.Throwable -> Lbe
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto Lbb
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lbe
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Lbe
        Lbb:
            int r8 = r8 + 1
            goto L9c
        Lbe:
            r3 = move-exception
            goto L9c
        Lc0:
            int r8 = r2.length()     // Catch: java.lang.Throwable -> Lcd
            if (r8 <= 0) goto Lcb
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> Lcd
            return r8
        Lcb:
            r1 = r0
            goto Ld3
        Lcd:
            r8 = move-exception
            r8.printStackTrace()
            java.lang.String r1 = "KWE_PE"
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yxcorp.kuaishou.addfp.c.a.a.a(android.content.Context):java.lang.String");
    }

    public static String a(Context context, String str) {
        try {
            return Settings.System.getString(context.getContentResolver(), str);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String a(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }
}
