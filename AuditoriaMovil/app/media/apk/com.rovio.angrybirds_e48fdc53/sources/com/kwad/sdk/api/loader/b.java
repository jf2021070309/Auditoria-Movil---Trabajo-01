package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
final class b {
    private static void B(String str, String str2) {
        d(new FileInputStream(str), new FileOutputStream(str2));
    }

    private static void C(String str, String str2) {
        String str3 = w.is64Bit() ? "lib/arm64-v8a/" : "lib/armeabi-v7a/";
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (!nextElement.isDirectory()) {
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !name.contains("../") && name.endsWith(".so") && name.startsWith(str3)) {
                            d(zipFile2.getInputStream(nextElement), new FileOutputStream(new File(str2, name.substring(str3.length()))));
                        }
                    }
                }
                try {
                    zipFile2.close();
                } catch (Exception e) {
                }
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, ClassLoader classLoader, String str, String str2) {
        String n = h.n(context, str2);
        h(new File(n));
        String p = h.p(context, str2);
        String q = h.q(context, str2);
        String r = h.r(context, str2);
        try {
            B(str, p);
            C(str, r);
            return k.b(context, classLoader, p, q, r).yp() != null;
        } catch (Exception e) {
            h(new File(p));
            h(new File(q));
            h(new File(r));
            h(new File(n));
            throw e;
        }
    }

    private static void c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static void d(InputStream inputStream, OutputStream outputStream) {
        try {
            c(inputStream, outputStream);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                }
            }
            try {
                outputStream.close();
            } catch (Exception e2) {
            }
        }
    }

    private static void h(File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            h(file2);
        }
    }
}
