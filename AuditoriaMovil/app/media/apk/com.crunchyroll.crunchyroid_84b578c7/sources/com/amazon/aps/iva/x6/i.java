package com.amazon.aps.iva.x6;

import com.google.android.gms.cast.Cast;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes.dex */
public final class i implements o {
    public final com.amazon.aps.iva.q5.o b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[Cast.MAX_MESSAGE_LENGTH];
    public final byte[] a = new byte[4096];

    static {
        com.amazon.aps.iva.q5.c0.a("media3.extractor");
    }

    public i(com.amazon.aps.iva.q5.o oVar, long j, long j2) {
        this.b = oVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final boolean c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!m(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void e() {
        this.f = 0;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final boolean f(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            r(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = p(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void g(int i, byte[] bArr, int i2) throws IOException {
        c(bArr, i, i2, false);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long getPosition() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final long h() {
        return this.d + this.f;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void i(int i) throws IOException {
        m(i, false);
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void k(int i) throws IOException {
        int min = Math.min(this.g, i);
        r(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = p(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            r(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = p(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4;
    }

    public final boolean m(int i, boolean z) throws IOException {
        n(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = p(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public final void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, com.amazon.aps.iva.t5.g0.i(bArr.length * 2, Cast.MAX_MESSAGE_LENGTH + i2, i2 + 524288));
        }
    }

    public final int o(int i, byte[] bArr, int i2) throws IOException {
        int min;
        n(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = p(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    public final int p(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int l = this.b.l(bArr, i + i3, i2 - i3);
            if (l == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + l;
        }
        throw new InterruptedIOException();
    }

    public final int q(int i) throws IOException {
        int min = Math.min(this.g, i);
        r(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = p(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.d += min;
        }
        return min;
    }

    public final void r(int i) {
        byte[] bArr;
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[Cast.MAX_MESSAGE_LENGTH + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }

    @Override // com.amazon.aps.iva.x6.o
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        f(bArr, i, i2, false);
    }
}
