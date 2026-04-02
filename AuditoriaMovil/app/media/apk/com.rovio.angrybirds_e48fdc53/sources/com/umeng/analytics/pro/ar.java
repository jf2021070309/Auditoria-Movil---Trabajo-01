package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ZipUtils.java */
/* loaded from: classes3.dex */
public class ar {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return bArr;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((bArr[i] ^ bArr2[i % bArr2.length]) ^ (i & 255));
        }
        return bArr;
    }

    public static void a(byte[] bArr, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr);
            ao.a(gZIPOutputStream);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "gzip error: " + th.getMessage());
            } finally {
                ao.a(gZIPOutputStream2);
            }
        }
    }

    public static void b(byte[] bArr, OutputStream outputStream) {
        GZIPInputStream gZIPInputStream = null;
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = gZIPInputStream2.read(bArr2);
                    if (read != -1) {
                        outputStream.write(bArr2, 0, read);
                    } else {
                        ao.a(gZIPInputStream2);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                try {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "unGzip error: " + th.getMessage());
                } finally {
                    ao.a(gZIPInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
