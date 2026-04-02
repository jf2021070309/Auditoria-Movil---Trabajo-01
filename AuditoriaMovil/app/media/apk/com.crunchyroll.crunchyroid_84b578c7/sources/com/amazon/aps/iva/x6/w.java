package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.q5.v;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;
/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes.dex */
public final class w {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final com.amazon.aps.iva.q5.f0 l;

    /* compiled from: FlacStreamMetadata.java */
    /* loaded from: classes.dex */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public w(byte[] bArr, int i) {
        com.amazon.aps.iva.t5.u uVar = new com.amazon.aps.iva.t5.u(bArr);
        uVar.o(i * 8);
        this.a = uVar.i(16);
        this.b = uVar.i(16);
        this.c = uVar.i(24);
        this.d = uVar.i(24);
        int i2 = uVar.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = uVar.i(3) + 1;
        int i3 = uVar.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        int i4 = uVar.i(4);
        int i5 = uVar.i(32);
        int i6 = com.amazon.aps.iva.t5.g0.a;
        this.j = ((i4 & 4294967295L) << 32) | (i5 & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final com.amazon.aps.iva.q5.v c(byte[] bArr, com.amazon.aps.iva.q5.f0 f0Var) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        com.amazon.aps.iva.q5.f0 f0Var2 = this.l;
        if (f0Var2 != null) {
            if (f0Var == null) {
                f0Var = f0Var2;
            } else {
                f0Var = f0Var2.a(f0Var.b);
            }
        }
        v.a aVar = new v.a();
        aVar.k = "audio/flac";
        aVar.l = i;
        aVar.x = this.g;
        aVar.y = this.e;
        aVar.m = Collections.singletonList(bArr);
        aVar.i = f0Var;
        return new com.amazon.aps.iva.q5.v(aVar);
    }

    public w(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, com.amazon.aps.iva.q5.f0 f0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = f0Var;
    }
}
