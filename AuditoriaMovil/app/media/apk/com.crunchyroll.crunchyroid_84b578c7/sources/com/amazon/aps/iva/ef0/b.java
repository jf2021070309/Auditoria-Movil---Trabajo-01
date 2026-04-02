package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.ef0.e;
import com.google.common.base.Ascii;
/* compiled from: Util.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final e.a a = new e.a();
    public static final int b = -1234567890;

    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(bArr, "a");
        com.amazon.aps.iva.yb0.j.f(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    public static final String c(byte b2) {
        char[] cArr = com.amazon.aps.iva.ff0.b.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & Ascii.SI]});
    }
}
