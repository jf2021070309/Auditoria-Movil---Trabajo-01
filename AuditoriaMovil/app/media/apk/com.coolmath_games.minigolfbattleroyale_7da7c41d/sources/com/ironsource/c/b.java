package com.ironsource.c;

import android.util.Pair;
import com.ironsource.mediationsdk.C0119m;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private C0119m a = new C0119m();

    /* loaded from: classes2.dex */
    public static class a {
        final String a;
        final String b;
        final String c;
        final int d;
        final int e;
        final String f;
        ArrayList<Pair<String, String>> g;

        /* renamed from: com.ironsource.c.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0082a {
            public String b;
            public String d;
            List<Pair<String, String>> a = new ArrayList();
            public String c = "POST";
            int e = 15000;
            int f = 15000;
            String g = "UTF-8";

            public final C0082a a(List<Pair<String, String>> list) {
                this.a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0082a c0082a) {
            this.a = c0082a.b;
            this.b = c0082a.c;
            this.c = c0082a.d;
            this.g = new ArrayList<>(c0082a.a);
            this.d = c0082a.e;
            this.e = c0082a.f;
            this.f = c0082a.g;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ironsource.c.c a(com.ironsource.c.b.a r7) {
        /*
            java.lang.String r0 = r7.a
            java.lang.String r1 = r7.c
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto Lce
            com.ironsource.c.c r0 = new com.ironsource.c.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            java.lang.String r3 = r7.a     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            int r3 = r7.d     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            int r3 = r7.e     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            java.lang.String r3 = r7.b     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L83 java.io.IOException -> L86
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.g     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            a(r2, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.b     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            if (r3 == 0) goto L5f
            java.lang.String r3 = r7.c     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            java.lang.String r4 = r7.f     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r2.setRequestProperty(r5, r4)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            a(r2, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
        L5f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r0.a = r3     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            if (r1 == 0) goto L71
            byte[] r3 = com.ironsource.environment.a.AnonymousClass1.a(r1)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r0.b = r3     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
        L71:
            if (r1 == 0) goto L76
            r1.close()
        L76:
            if (r2 == 0) goto Lbd
            r2.disconnect()
            goto Lbd
        L7c:
            r7 = move-exception
            goto Lc3
        L7e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L88
        L83:
            r7 = move-exception
            r2 = r1
            goto Lc3
        L86:
            r3 = move-exception
            r2 = r1
        L88:
            if (r1 == 0) goto Lbe
            int r4 = r1.getResponseCode()     // Catch: java.lang.Throwable -> Lbf
            r0.a = r4     // Catch: java.lang.Throwable -> Lbf
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto Lbe
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = r7.a     // Catch: java.lang.Throwable -> Lbf
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbf
            int r7 = r0.a     // Catch: java.lang.Throwable -> Lbf
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> Lbf
            android.util.Log.d(r3, r7)     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto Lb8
            r2.close()
        Lb8:
            if (r1 == 0) goto Lbd
            r1.disconnect()
        Lbd:
            return r0
        Lbe:
            throw r3     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        Lc3:
            if (r1 == 0) goto Lc8
            r1.close()
        Lc8:
            if (r2 == 0) goto Lcd
            r2.disconnect()
        Lcd:
            throw r7
        Lce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.c.b.a(com.ironsource.c.b$a):com.ironsource.c.c");
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0082a c0082a = new a.C0082a();
        c0082a.b = str;
        c0082a.d = str2;
        c0082a.c = "POST";
        c0082a.a(list);
        return a(c0082a.a());
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public void a(Boolean bool) {
        C0119m.a("fs", bool);
    }

    public void a(String str) {
        C0119m.a("usid", str);
    }

    public void a(JSONObject jSONObject) {
        C0119m.a("tkgp", (Object) jSONObject);
    }

    public void b(String str) {
        C0119m.a("audt", str);
    }
}
