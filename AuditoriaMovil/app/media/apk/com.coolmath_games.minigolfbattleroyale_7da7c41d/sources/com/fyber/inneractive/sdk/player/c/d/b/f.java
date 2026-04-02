package com.fyber.inneractive.sdk.player.c.d.b;

import com.fyber.inneractive.sdk.player.c.d.g;
import java.io.IOException;
import kotlin.UByte;
/* loaded from: classes.dex */
final class f {
    private static final long[] b = {128, 64, 32, 16, 8, 4, 2, 1};
    int a;
    private final byte[] c = new byte[8];
    private int d;

    public final void a() {
        this.d = 0;
        this.a = 0;
    }

    public final long a(g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.d == 0) {
            if (!gVar.a(this.c, 0, 1, z)) {
                return -1L;
            }
            int a = a(this.c[0] & UByte.MAX_VALUE);
            this.a = a;
            if (a == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.d = 1;
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2L;
        }
        if (i2 != 1) {
            gVar.b(this.c, 1, i2 - 1);
        }
        this.d = 0;
        return a(this.c, this.a, z2);
    }

    public static int a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = b;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~b[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
