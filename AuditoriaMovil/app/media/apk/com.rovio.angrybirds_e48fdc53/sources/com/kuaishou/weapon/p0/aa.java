package com.kuaishou.weapon.p0;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.BufferedInputStream;
/* loaded from: classes.dex */
public class aa {
    private static volatile aa a = null;

    private aa() {
    }

    public static synchronized aa a() {
        aa aaVar;
        synchronized (aa.class) {
            if (a == null) {
                synchronized (aa.class) {
                    if (a == null) {
                        a = new aa();
                    }
                }
            }
            aaVar = a;
        }
        return aaVar;
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception e) {
            }
        } while (read >= 512);
        return sb.toString();
    }

    public String a(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6e
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6e
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r2.write(r6)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r6 = 10
            r2.write(r6)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r2.flush()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r2.close()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r1.waitFor()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            java.lang.String r6 = a(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L40
        L3f:
            r0 = move-exception
        L40:
            if (r1 == 0) goto L45
            r1.destroy()
        L45:
            return r6
        L46:
            r6 = move-exception
            goto L4c
        L48:
            r6 = move-exception
            goto L72
        L4a:
            r6 = move-exception
            r3 = r0
        L4c:
            r0 = r2
            goto L5a
        L4e:
            r6 = move-exception
            r3 = r0
            goto L72
        L51:
            r6 = move-exception
            r3 = r0
            goto L5a
        L54:
            r6 = move-exception
            r2 = r0
            goto L71
        L57:
            r6 = move-exception
            r1 = r0
            r3 = r1
        L5a:
            if (r0 == 0) goto L61
            r0.close()     // Catch: java.io.IOException -> L60
            goto L61
        L60:
            r0 = move-exception
        L61:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L67
            goto L68
        L67:
            r0 = move-exception
        L68:
            if (r1 == 0) goto L6d
            r1.destroy()
        L6d:
            throw r6
        L6e:
            r6 = move-exception
            r1 = r0
            r2 = r1
        L71:
            r3 = r2
        L72:
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.io.IOException -> L78
            goto L79
        L78:
            r6 = move-exception
        L79:
            if (r3 == 0) goto L80
            r3.close()     // Catch: java.io.IOException -> L7f
            goto L80
        L7f:
            r6 = move-exception
        L80:
            if (r1 == 0) goto L85
            r1.destroy()
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.aa.b(java.lang.String):java.lang.String");
    }
}
