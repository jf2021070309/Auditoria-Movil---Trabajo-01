package com.bytedance.pangle.util.b.a;

import com.flurry.android.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class c {
    public final byte[] a = new byte[2];
    private final byte[] b = new byte[4];

    public final int a(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.b);
        return b(this.b);
    }

    public final int b(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.a);
        return a(this.a);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        a(this.a, i);
        byteArrayOutputStream.write(this.a);
    }

    public final void a(OutputStream outputStream, int i) {
        b(this.b, i);
        outputStream.write(this.b);
    }

    private static int a(byte[] bArr) {
        return ((bArr[1] & Constants.UNKNOWN) << 8) | (bArr[0] & Constants.UNKNOWN);
    }

    private static int b(byte[] bArr) {
        return ((((bArr[3] & Constants.UNKNOWN) << 8) | (bArr[2] & Constants.UNKNOWN)) << 16) | (bArr[0] & Constants.UNKNOWN) | ((bArr[1] & Constants.UNKNOWN) << 8);
    }

    public static void a(byte[] bArr, int i) {
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
    }

    private static void b(byte[] bArr, int i) {
        bArr[3] = (byte) (i >>> 24);
        bArr[2] = (byte) (i >>> 16);
        bArr[1] = (byte) (i >>> 8);
        bArr[0] = (byte) (i & 255);
    }
}
