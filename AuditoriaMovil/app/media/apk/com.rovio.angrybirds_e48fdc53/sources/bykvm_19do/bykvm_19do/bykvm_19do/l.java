package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends e2 {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context) {
        super(false, false);
        this.e = context;
    }

    private boolean a() {
        h k = a.k();
        if (k != null) {
            return k.A();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "a.1"
            r1 = 0
            bykvm_19do.bykvm_19do.bykvm_19do.l0.a(r0, r1)
            boolean r0 = r7.a()
            if (r0 == 0) goto L1f
            android.content.Context r0 = r7.e     // Catch: java.lang.Exception -> L19
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L19
            java.lang.String r2 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)     // Catch: java.lang.Exception -> L19
            goto L20
        L19:
            r0 = move-exception
            java.lang.String r2 = ""
            bykvm_19do.bykvm_19do.bykvm_19do.l0.c(r2, r0)
        L1f:
            r0 = r1
        L20:
            boolean r2 = bykvm_19do.bykvm_19do.bykvm_19do.k2.a(r0)
            r3 = 1
            java.lang.String r4 = "openudid"
            if (r2 == 0) goto L31
            java.lang.String r2 = "9774d56d682e549c"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L93
        L31:
            android.content.Context r0 = r7.e
            java.lang.String r2 = "snssdk_openudid"
            r5 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r5)
            java.lang.String r1 = r0.getString(r4, r1)
            boolean r2 = bykvm_19do.bykvm_19do.bykvm_19do.k2.a(r1)
            if (r2 != 0) goto L92
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 64
            java.security.SecureRandom r6 = new java.security.SecureRandom
            r6.<init>()
            r1.<init>(r2, r6)
            r2 = 16
            java.lang.String r1 = r1.toString(r2)
            char r2 = r1.charAt(r5)
            r5 = 45
            if (r2 != r5) goto L62
            java.lang.String r1 = r1.substring(r3)
        L62:
            int r2 = r1.length()
            int r2 = 13 - r2
            if (r2 <= 0) goto L80
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L6f:
            if (r2 <= 0) goto L79
            r6 = 70
            r5.append(r6)
            int r2 = r2 + (-1)
            goto L6f
        L79:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L80:
            java.lang.String r2 = "openudid.dat"
            java.lang.String r1 = r7.a(r2, r1)     // Catch: java.lang.Exception -> L87
            goto L88
        L87:
            r2 = move-exception
        L88:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r4, r1)
            r0.apply()
        L92:
            r0 = r1
        L93:
            r8.put(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_19do.l.a(org.json.JSONObject):boolean");
    }
}
