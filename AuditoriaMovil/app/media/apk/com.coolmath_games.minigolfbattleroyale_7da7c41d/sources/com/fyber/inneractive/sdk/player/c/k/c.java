package com.fyber.inneractive.sdk.player.c.k;

import android.util.Pair;
/* loaded from: classes.dex */
public final class c {
    private static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        j jVar = new j(bArr);
        int a2 = a(jVar);
        int b2 = b(jVar);
        int c2 = jVar.c(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(jVar);
            if (a(jVar) == 22) {
                c2 = jVar.c(4);
            }
        }
        int i = c[c2];
        a.a(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, a.length, i2);
        return bArr3;
    }

    private static int a(j jVar) {
        int c2 = jVar.c(5);
        return c2 == 31 ? jVar.c(6) + 32 : c2;
    }

    private static int b(j jVar) {
        int c2 = jVar.c(4);
        if (c2 == 15) {
            return jVar.c(24);
        }
        a.a(c2 < 13);
        return b[c2];
    }
}
