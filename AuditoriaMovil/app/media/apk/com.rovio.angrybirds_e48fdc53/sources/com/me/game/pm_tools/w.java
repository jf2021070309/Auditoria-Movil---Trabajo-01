package com.me.game.pm_tools;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
/* loaded from: classes5.dex */
public class w {
    public static final String a = ".png";
    public static final String b = ".zip";
    public static final long c = 1024;
    public static final long d = 1048576;
    public static final long e = 1073741824;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws Exception {
        e(inputStream, outputStream, null, true, true);
    }

    public static void c(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws Exception {
        e(inputStream, outputStream, bArr, true, true);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, byte[] bArr, boolean z) throws Exception {
        e(inputStream, outputStream, bArr, z, true);
    }

    public static void e(InputStream inputStream, OutputStream outputStream, byte[] bArr, boolean z, boolean z2) throws Exception {
        if (bArr == null) {
            bArr = new byte[1048576];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            outputStream.flush();
        }
        if (z) {
            a(inputStream);
        }
        if (z2) {
            a(outputStream);
        }
    }

    public static String f(long j) {
        if (j >= 1024) {
            return j < 1048576 ? String.format(Locale.ENGLISH, "%.1f KB", Float.valueOf(((float) j) / 1024.0f)) : j < 1073741824 ? String.format(Locale.ENGLISH, "%.1f MB", Float.valueOf(((float) j) / 1048576.0f)) : String.format(Locale.ENGLISH, "%.1f GB", Float.valueOf(((float) j) / 1.07374182E9f));
        }
        return j + " B";
    }
}
