package com.kwad.library.solder.lib.d;

import com.kwad.sdk.utils.q;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File a(java.io.File r3, java.lang.String r4, java.io.File r5) {
        /*
            java.lang.String r0 = com.kwad.library.solder.lib.d.a.wN()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Try install soLib, supported abi = "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lib"
            r1.<init>(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L68
            java.io.File r3 = new java.io.File
            r3.<init>(r5, r4)
            boolean r5 = r1.renameTo(r3)
            if (r5 == 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Rename soLib, from = "
            r5.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            r5.append(r0)
            java.lang.String r0 = ", to = "
            r5.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r5.append(r0)
            goto L69
        L60:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Rename soLib fail."
            r3.<init>(r4)
            throw r3
        L68:
            r3 = 0
        L69:
            if (r3 != 0) goto L7a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Can not install "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = ", NO_MATCHING_ABIS"
            r5.append(r4)
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.library.solder.lib.d.c.a(java.io.File, java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    public static Set<String> b(File file, File file2) {
        ZipFile zipFile;
        OutputStream outputStream;
        ZipFile zipFile2;
        ZipFile zipFile3;
        ?? r7;
        if (file == null || !file.exists()) {
            throw new IOException("Apk file not found.");
        }
        HashSet hashSet = new HashSet(4);
        q.X(file2);
        StringBuilder sb = new StringBuilder("copy so file to ");
        sb.append(file2.getAbsolutePath());
        sb.append(", apk = ");
        sb.append(file.getName());
        ZipFile zipFile4 = null;
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                outputStream = null;
                while (entries.hasMoreElements()) {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        String name = nextElement.getName();
                        if (name != null && !name.contains("../")) {
                            if (!name.startsWith("lib" + File.separator)) {
                                continue;
                            } else if (nextElement.isDirectory()) {
                                File file3 = new File(file2, name);
                                new StringBuilder("create dir ").append(file3.getAbsolutePath());
                                q.X(file3);
                            } else {
                                File file4 = new File(file2, name);
                                new StringBuilder("unzip soLib file ").append(file4.getAbsolutePath());
                                q.Y(file4);
                                byte[] bArr = new byte[4096];
                                OutputStream fileOutputStream = new FileOutputStream(file4);
                                try {
                                    FileDescriptor fd = ((FileOutputStream) fileOutputStream).getFD();
                                    OutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                    try {
                                        r7 = new BufferedInputStream(zipFile.getInputStream(nextElement));
                                        while (true) {
                                            try {
                                                int read = r7.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                bufferedOutputStream.write(bArr, 0, read);
                                            } catch (IOException e) {
                                                e = e;
                                                zipFile4 = zipFile;
                                                outputStream = bufferedOutputStream;
                                                zipFile2 = r7;
                                                try {
                                                    com.kwad.library.solder.lib.a.e("plugin.so", e);
                                                    throw new IOException("Unzip soLibs fail:" + e.getMessage(), e);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    zipFile = zipFile4;
                                                    zipFile4 = zipFile2;
                                                    com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) zipFile4);
                                                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                                                    com.kwad.sdk.crash.utils.b.closeQuietly(zipFile);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zipFile4 = r7;
                                                outputStream = bufferedOutputStream;
                                                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) zipFile4);
                                                com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                                                com.kwad.sdk.crash.utils.b.closeQuietly(zipFile);
                                                throw th;
                                            }
                                        }
                                        bufferedOutputStream.flush();
                                        fd.sync();
                                        com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r7);
                                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedOutputStream);
                                        hashSet.add(file4.getName());
                                        zipFile4 = r7;
                                        outputStream = bufferedOutputStream;
                                    } catch (IOException e2) {
                                        e = e2;
                                        r7 = zipFile4;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    outputStream = fileOutputStream;
                                    zipFile3 = zipFile4;
                                    zipFile4 = zipFile;
                                    zipFile2 = zipFile3;
                                    com.kwad.library.solder.lib.a.e("plugin.so", e);
                                    throw new IOException("Unzip soLibs fail:" + e.getMessage(), e);
                                } catch (Throwable th4) {
                                    th = th4;
                                    outputStream = fileOutputStream;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) zipFile4);
                com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                com.kwad.sdk.crash.utils.b.closeQuietly(zipFile);
                return hashSet;
            } catch (IOException e5) {
                e = e5;
                outputStream = null;
                zipFile3 = null;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
            zipFile2 = null;
        } catch (Throwable th7) {
            th = th7;
            zipFile = null;
            outputStream = null;
        }
    }
}
