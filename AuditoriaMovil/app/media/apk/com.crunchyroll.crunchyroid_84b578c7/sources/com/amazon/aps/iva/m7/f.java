package com.amazon.aps.iva.m7;

import com.amazon.aps.iva.x6.i;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: VarintReader.java */
/* loaded from: classes.dex */
public final class f {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(int i, byte[] bArr, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long b(i iVar, boolean z, boolean z2, int i) throws IOException {
        int i2;
        int i3 = this.b;
        byte[] bArr = this.a;
        if (i3 == 0) {
            if (!iVar.f(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & UnsignedBytes.MAX_VALUE;
            int i5 = 0;
            while (true) {
                if (i5 < 8) {
                    if ((d[i5] & i4) != 0) {
                        i2 = i5 + 1;
                        break;
                    }
                    i5++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.c = i2;
            if (i2 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i6 = this.c;
        if (i6 > i) {
            this.b = 0;
            return -2L;
        }
        if (i6 != 1) {
            iVar.f(bArr, 1, i6 - 1, false);
        }
        this.b = 0;
        return a(this.c, bArr, z2);
    }
}
