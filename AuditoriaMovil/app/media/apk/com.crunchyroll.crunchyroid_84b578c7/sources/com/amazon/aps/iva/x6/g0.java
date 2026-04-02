package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.f0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes.dex */
public final class g0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(f0 f0Var, f0.a aVar) {
        if (this.c > 0) {
            f0Var.d(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public final void b(f0 f0Var, long j, int i, int i2, int i3, f0.a aVar) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.b) {
                return;
            }
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(f0Var, aVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(o oVar) throws IOException {
        char c;
        if (this.b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.a;
        oVar.g(0, bArr, 10);
        oVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                if ((b & UnsignedBytes.MAX_VALUE) == 187) {
                    i = 1;
                }
                if (i != 0) {
                    c = '\t';
                } else {
                    c = '\b';
                }
                i = 40 << ((bArr[c] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
