package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.t5.g0;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: PsDurationReader.java */
/* loaded from: classes.dex */
public final class v {
    public boolean c;
    public boolean d;
    public boolean e;
    public final com.amazon.aps.iva.t5.b0 a = new com.amazon.aps.iva.t5.b0(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final com.amazon.aps.iva.t5.v b = new com.amazon.aps.iva.t5.v();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static long c(com.amazon.aps.iva.t5.v vVar) {
        int i = vVar.b;
        if (vVar.c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        vVar.d(0, bArr, 9);
        vVar.F(i);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(com.amazon.aps.iva.x6.i iVar) {
        byte[] bArr = g0.e;
        com.amazon.aps.iva.t5.v vVar = this.b;
        vVar.getClass();
        vVar.D(bArr.length, bArr);
        this.c = true;
        iVar.f = 0;
    }
}
