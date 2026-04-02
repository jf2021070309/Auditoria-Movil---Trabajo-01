package com.qq.e.comm.managers.plugin;

import android.text.TextUtils;
import com.qq.e.comm.managers.plugin.c;
import com.qq.e.comm.util.GDTLogger;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g {
    private final File a;
    private final File b;
    private String c;
    private int d;
    private String e;

    public g(File file, File file2) {
        this.a = file;
        this.b = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.io.File r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Exception while close bufferreader"
            r1 = 0
            if (r6 == 0) goto L51
            boolean r2 = r6.exists()
            if (r2 != 0) goto Lc
            goto L51
        Lc:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.String r6 = "UTF-8"
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
        L22:
            java.lang.String r2 = r6.readLine()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            if (r2 == 0) goto L2c
            r1.append(r2)     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            goto L22
        L2c:
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L39 java.lang.Throwable -> L42
            r6.close()     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r6 = move-exception
            com.qq.e.comm.util.GDTLogger.d(r0)
        L38:
            return r1
        L39:
            r1 = move-exception
            goto L41
        L3b:
            r6 = move-exception
            goto L46
        L3d:
            r6 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
        L41:
            throw r1     // Catch: java.lang.Throwable -> L42
        L42:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
        L46:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Exception -> L4c
            goto L50
        L4c:
            r1 = move-exception
            com.qq.e.comm.util.GDTLogger.d(r0)
        L50:
            throw r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.e.comm.managers.plugin.g.a(java.io.File):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        int i;
        try {
            if (this.b.exists() && this.a.exists()) {
                String a = a(this.b);
                this.e = a;
                if (TextUtils.isEmpty(a)) {
                    return false;
                }
                String[] split = this.e.split("#####");
                if (split.length == 2) {
                    String str = split[1];
                    try {
                        i = Integer.parseInt(split[0]);
                    } catch (Throwable th) {
                        i = 0;
                    }
                    if (c.b.a.a(str, this.a)) {
                        this.c = str;
                        this.d = i;
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            GDTLogger.d("Exception while checking plugin");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(File file, File file2) {
        return (file.equals(this.a) || h.a(this.a, file)) && (file2.equals(this.b) || h.a(this.b, file2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }
}
