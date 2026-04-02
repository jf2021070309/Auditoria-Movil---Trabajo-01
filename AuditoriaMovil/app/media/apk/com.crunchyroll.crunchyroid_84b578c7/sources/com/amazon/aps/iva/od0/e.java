package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: CodedOutputStream.java */
/* loaded from: classes4.dex */
public final class e {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public final OutputStream d;

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public e(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public static int a(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int b(int i, int i2) {
        return c(i2) + h(i);
    }

    public static int c(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int d(int i, p pVar) {
        int h = h(i);
        int serializedSize = pVar.getSerializedSize();
        return f(serializedSize) + serializedSize + h;
    }

    public static int e(p pVar) {
        int serializedSize = pVar.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int h(int i) {
        return f((i << 3) | 0);
    }

    public static e j(OutputStream outputStream, int i) {
        return new e(outputStream, new byte[i]);
    }

    public final void i() throws IOException {
        if (this.d != null) {
            k();
        }
    }

    public final void k() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public final void l(int i, int i2) throws IOException {
        x(i, 0);
        n(i2);
    }

    public final void m(int i, int i2) throws IOException {
        x(i, 0);
        n(i2);
    }

    public final void n(int i) throws IOException {
        if (i >= 0) {
            v(i);
        } else {
            w(i);
        }
    }

    public final void o(int i, p pVar) throws IOException {
        x(i, 2);
        p(pVar);
    }

    public final void p(p pVar) throws IOException {
        v(pVar.getSerializedSize());
        pVar.a(this);
    }

    public final void q(int i) throws IOException {
        byte b = (byte) i;
        if (this.c == this.b) {
            k();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        this.a[i2] = b;
    }

    public final void r(c cVar) throws IOException {
        int size = cVar.size();
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr = this.a;
        if (i3 >= size) {
            cVar.e(bArr, 0, i, size);
            this.c += size;
            return;
        }
        cVar.e(bArr, 0, i, i3);
        int i4 = i3 + 0;
        int i5 = size - i3;
        this.c = i2;
        k();
        if (i5 <= i2) {
            cVar.e(bArr, i4, 0, i5);
            this.c = i5;
        } else if (i4 >= 0) {
            if (i5 >= 0) {
                int i6 = i4 + i5;
                if (i6 <= cVar.size()) {
                    if (i5 > 0) {
                        cVar.u(this.d, i4, i5);
                        return;
                    }
                    return;
                }
                throw new IndexOutOfBoundsException(j0.c(39, "Source end offset exceeded: ", i6));
            }
            throw new IndexOutOfBoundsException(j0.c(23, "Length < 0: ", i5));
        } else {
            throw new IndexOutOfBoundsException(j0.c(30, "Source offset < 0: ", i4));
        }
    }

    public final void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = this.c;
        int i2 = this.b;
        int i3 = i2 - i;
        byte[] bArr2 = this.a;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i, i3);
        int i4 = i3 + 0;
        int i5 = length - i3;
        this.c = i2;
        k();
        if (i5 <= i2) {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.c = i5;
            return;
        }
        this.d.write(bArr, i4, i5);
    }

    public final void t(int i) throws IOException {
        q(i & 255);
        q((i >> 8) & 255);
        q((i >> 16) & 255);
        q((i >> 24) & 255);
    }

    public final void u(long j) throws IOException {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public final void v(int i) throws IOException {
        while ((i & (-128)) != 0) {
            q((i & 127) | 128);
            i >>>= 7;
        }
        q(i);
    }

    public final void w(long j) throws IOException {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        q((int) j);
    }

    public final void x(int i, int i2) throws IOException {
        v((i << 3) | i2);
    }
}
