package com.kwad.components.core.e.b;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class c {
    private final int[] Jv;

    private c(int[] iArr) {
        this.Jv = iArr;
    }

    private static long a(int i, int[] iArr, long j) {
        long j2 = j >>> 48;
        return (e(i, iArr, j2) << 32) | ((((j & 65535) ^ e(i, iArr, j2)) ^ (i + 1)) << 48) | (((j >> 32) & 65535) << 16) | ((j >> 16) & 65535);
    }

    private static long a(long j, int[] iArr) {
        int i = 0;
        while (i < 8) {
            j = a(i, iArr, j);
            i++;
        }
        while (i < 16) {
            j = b(i, iArr, j);
            i++;
        }
        while (i < 24) {
            j = a(i, iArr, j);
            i++;
        }
        while (i < 32) {
            j = b(i, iArr, j);
            i++;
        }
        return j;
    }

    public static c a(int[] iArr) {
        return new c(iArr);
    }

    private static long b(int i, int[] iArr, long j) {
        long j2 = j >>> 48;
        long e = e(i, iArr, j2);
        return (((i + 1) ^ (j2 ^ ((j >> 32) & 65535))) << 16) | ((j & 65535) << 48) | (e << 32) | ((j >> 16) & 65535);
    }

    private static long b(long j, int[] iArr) {
        int i = 31;
        while (i > 23) {
            j = d(i, iArr, j);
            i--;
        }
        while (i > 15) {
            j = c(i, iArr, j);
            i--;
        }
        while (i > 7) {
            j = d(i, iArr, j);
            i--;
        }
        while (i >= 0) {
            j = c(i, iArr, j);
            i--;
        }
        return j;
    }

    private static long c(int i, int[] iArr, long j) {
        long j2 = j >>> 48;
        long j3 = (j >> 32) & 65535;
        long f = f(i, iArr, j3);
        return ((i + 1) ^ (j2 ^ j3)) | ((j & 65535) << 16) | (f << 48) | (((j >> 16) & 65535) << 32);
    }

    private static long d(int i, int[] iArr, long j) {
        long j2 = j >>> 48;
        long j3 = (j >> 32) & 65535;
        long f = f(i, iArr, j3);
        long f2 = f(i, iArr, j3);
        return (((i + 1) ^ (f2 ^ ((j >> 16) & 65535))) << 32) | (f << 48) | ((j & 65535) << 16) | j2;
    }

    private static long e(int i, int[] iArr, long j) {
        int i2 = (int) (j & 255);
        int i3 = i * 4;
        int i4 = iArr[i3 % 10];
        int i5 = iArr[(i3 + 1) % 10];
        int i6 = iArr[(i3 + 2) % 10];
        int i7 = iArr[(i3 + 3) % 10];
        int i8 = b.Ju[i4 ^ i2] ^ ((int) (j >>> 8));
        int i9 = i2 ^ b.Ju[i8 ^ i5];
        int i10 = i8 ^ b.Ju[i9 ^ i6];
        return (i10 << 8) | (b.Ju[i7 ^ i10] ^ i9);
    }

    private static long f(int i, int[] iArr, long j) {
        int i2 = (int) (j >>> 8);
        int i3 = i * 4;
        int i4 = iArr[(i3 + 3) % 10];
        int i5 = iArr[(i3 + 2) % 10];
        int i6 = iArr[(i3 + 1) % 10];
        int i7 = iArr[i3 % 10];
        int i8 = b.Ju[i4 ^ i2] ^ ((int) (255 & j));
        int i9 = i2 ^ b.Ju[i8 ^ i5];
        int i10 = i8 ^ b.Ju[i9 ^ i6];
        return i10 | ((b.Ju[i7 ^ i10] ^ i9) << 8);
    }

    public final long al(String str) {
        byte[] decode = com.kwad.sdk.core.a.c.AL().decode(str);
        if (decode == null || decode.length != 8) {
            throw new RuntimeException("fail to decode: " + str);
        }
        return b(ByteBuffer.wrap(decode).getLong(), this.Jv);
    }

    public final String r(long j) {
        return com.kwad.sdk.core.a.c.AJ().encodeToString(ByteBuffer.allocate(8).putLong(a(j, this.Jv)).array());
    }
}
