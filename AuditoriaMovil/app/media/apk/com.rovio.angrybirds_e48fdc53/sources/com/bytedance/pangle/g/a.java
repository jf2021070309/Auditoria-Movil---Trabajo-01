package com.bytedance.pangle.g;

import android.content.pm.Signature;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
/* loaded from: classes.dex */
public final class a {
    private static final AtomicReference<byte[]> a = new AtomicReference<>();

    public static o a(String str) {
        JarFile jarFile;
        JarFile jarFile2 = null;
        try {
            try {
                jarFile = new JarFile(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        } catch (GeneralSecurityException e3) {
            e = e3;
        }
        try {
            ArrayList<JarEntry> arrayList = new ArrayList();
            JarEntry jarEntry = jarFile.getJarEntry("AndroidManifest.xml");
            if (jarEntry == null) {
                throw new q(1, "Package " + str + " has no manifest");
            }
            Certificate[][] a2 = a(jarFile, jarEntry);
            if (com.bytedance.pangle.util.d.a(a2)) {
                throw new q(4, "Package " + str + " has no certificates at entry AndroidManifest.xml");
            }
            Signature[] a3 = d.a(a2);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    String name = nextElement.getName();
                    if (!name.startsWith("META-INF/") && !name.equals("AndroidManifest.xml")) {
                        arrayList.add(nextElement);
                    }
                }
            }
            for (JarEntry jarEntry2 : arrayList) {
                Certificate[][] a4 = a(jarFile, jarEntry2);
                if (com.bytedance.pangle.util.d.a(a4)) {
                    throw new q(4, "Package " + str + " has no certificates at entry " + jarEntry2.getName());
                } else if (!o.a(a3, d.a(a4))) {
                    throw new q(3, "Package " + str + " has mismatched certificates at entry " + jarEntry2.getName());
                }
            }
            o oVar = new o(a3, 1, null, null, null);
            try {
                jarFile.close();
            } catch (Exception e4) {
            }
            return oVar;
        } catch (IOException e5) {
            e = e5;
            throw new q(4, "Failed to collect certificates from ".concat(String.valueOf(str)), e);
        } catch (RuntimeException e6) {
            e = e6;
            throw new q(4, "Failed to collect certificates from ".concat(String.valueOf(str)), e);
        } catch (GeneralSecurityException e7) {
            e = e7;
            throw new q(2, "Failed to collect certificates from ".concat(String.valueOf(str)), e);
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            if (jarFile2 != null) {
                try {
                    jarFile2.close();
                } catch (Exception e8) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0038: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x0038 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.Certificate[][] a(java.util.jar.JarFile r7, java.util.jar.JarEntry r8) {
        /*
            r0 = 0
            java.io.InputStream r1 = r7.getInputStream(r8)     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L40 java.io.IOException -> L42
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = com.bytedance.pangle.g.a.a     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            java.lang.Object r0 = r2.getAndSet(r0)     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            if (r0 != 0) goto L15
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
        L15:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            r3 = 0
            int r2 = r1.read(r0, r3, r2)     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            r4 = -1
            if (r2 != r4) goto L15
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = com.bytedance.pangle.g.a.a     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            r2.set(r0)     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            r0 = 1
            java.security.cert.Certificate[][] r0 = new java.security.cert.Certificate[r0]     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            java.security.cert.Certificate[] r2 = r8.getCertificates()     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            r0[r3] = r2     // Catch: java.lang.Throwable -> L37 java.lang.RuntimeException -> L3a java.io.IOException -> L3c
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.lang.Exception -> L32 java.lang.RuntimeException -> L34
            goto L36
        L32:
            r7 = move-exception
            goto L36
        L34:
            r7 = move-exception
            throw r7
        L36:
            return r0
        L37:
            r7 = move-exception
            r0 = r1
            goto L67
        L3a:
            r0 = move-exception
            goto L46
        L3c:
            r0 = move-exception
            goto L46
        L3e:
            r7 = move-exception
            goto L67
        L40:
            r1 = move-exception
            goto L43
        L42:
            r1 = move-exception
        L43:
            r6 = r1
            r1 = r0
            r0 = r6
        L46:
            com.bytedance.pangle.g.q r2 = new com.bytedance.pangle.g.q     // Catch: java.lang.Throwable -> L37
            r3 = 5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = "Failed reading "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L37
            r4.append(r8)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = " in "
            r4.append(r8)     // Catch: java.lang.Throwable -> L37
            r4.append(r7)     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L37
            r2.<init>(r3, r7, r0)     // Catch: java.lang.Throwable -> L37
            throw r2     // Catch: java.lang.Throwable -> L37
        L67:
            if (r0 == 0) goto L71
            r0.close()     // Catch: java.lang.Exception -> L6d java.lang.RuntimeException -> L6f
            goto L71
        L6d:
            r8 = move-exception
            goto L71
        L6f:
            r7 = move-exception
            throw r7
        L71:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.a.a(java.util.jar.JarFile, java.util.jar.JarEntry):java.security.cert.Certificate[][]");
    }
}
