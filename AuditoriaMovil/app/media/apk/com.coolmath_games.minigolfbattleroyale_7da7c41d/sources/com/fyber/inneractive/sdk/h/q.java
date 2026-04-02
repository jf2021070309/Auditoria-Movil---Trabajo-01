package com.fyber.inneractive.sdk.h;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public final class q<ResultData> {
    final Context a;
    com.fyber.inneractive.sdk.a.a<ResultData> b;
    SharedPreferences c;
    String d;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public q(Context context, com.fyber.inneractive.sdk.a.a<ResultData> aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final com.fyber.inneractive.sdk.a.e<ResultData> a() {
        try {
            if (!this.b.d()) {
                return com.fyber.inneractive.sdk.a.e.a(new a());
            }
            ResultData a2 = this.b.a(a(this.b.b()));
            if (this.c == null) {
                this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            String string = this.c.getString(this.b.a(), null);
            this.d = string;
            return new com.fyber.inneractive.sdk.a.e<>(a2, string);
        } catch (Exception e) {
            if (this.c == null) {
                this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            this.c.edit().remove(this.b.a()).apply();
            return com.fyber.inneractive.sdk.a.e.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public final boolean a(String str, String str2) {
        boolean z;
        int i = 1;
        IAlog.b("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
                IAlog.b("File cached successfully", new Object[0]);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (Exception e2) {
                        IAlog.d("Failed closing cache file: %s", e2.getMessage());
                        return true;
                    }
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                z = true;
                IAlog.d("Failed caching file: %s", e.getMessage());
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e4) {
                        IAlog.d("Failed closing cache file: %s", e4.getMessage());
                    }
                }
                i = z;
                return i;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    Object[] objArr = new Object[i];
                    objArr[0] = e5.getMessage();
                    IAlog.d("Failed closing cache file: %s", objArr);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r9) throws java.io.FileNotFoundException {
        /*
            r8 = this;
            java.lang.String r0 = "Failed closing local file: %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            java.lang.String r4 = "reading local file: %s"
            com.fyber.inneractive.sdk.util.IAlog.b(r4, r2)
            r2 = 0
            android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.FileInputStream r4 = r4.openFileInput(r9)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            int r5 = r4.available()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L71
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L71
            r4.read(r5)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L71
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L71
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L71
            if (r4 == 0) goto L36
            r4.close()     // Catch: java.lang.Exception -> L2a
            goto L36
        L2a:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r4[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.d(r0, r4)
        L36:
            r2 = r6
            goto L61
        L38:
            r5 = move-exception
            goto L3e
        L3a:
            r9 = move-exception
            goto L73
        L3c:
            r5 = move-exception
            r4 = r2
        L3e:
            boolean r6 = r5 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto L6b
            java.lang.String r6 = "Failed reading local file: %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L71
            r7[r3] = r5     // Catch: java.lang.Throwable -> L71
            com.fyber.inneractive.sdk.util.IAlog.b(r6, r7)     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L61
            r4.close()     // Catch: java.lang.Exception -> L55
            goto L61
        L55:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r4 = r4.getMessage()
            r5[r3] = r4
            com.fyber.inneractive.sdk.util.IAlog.d(r0, r5)
        L61:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r9
            java.lang.String r9 = "local file %s read successfully"
            com.fyber.inneractive.sdk.util.IAlog.b(r9, r0)
            return r2
        L6b:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L71
            r9.<init>()     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        L71:
            r9 = move-exception
            r2 = r4
        L73:
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.lang.Exception -> L79
            goto L85
        L79:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.d(r0, r1)
        L85:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.h.q.a(java.lang.String):java.lang.String");
    }
}
