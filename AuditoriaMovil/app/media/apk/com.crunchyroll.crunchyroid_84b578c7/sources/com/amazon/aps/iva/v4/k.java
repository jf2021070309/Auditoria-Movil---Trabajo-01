package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.p1;
import com.amazon.aps.iva.z3.q;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: CodedOutputStream.java */
/* loaded from: classes.dex */
public abstract class k extends f {
    public static final Logger b = Logger.getLogger(k.class.getName());
    public static final boolean c = o1.e;
    public l a;

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static abstract class a extends k {
        public final byte[] d;
        public final int e;
        public int f;

        public a(int i) {
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.d = bArr;
                this.e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void R(int i) {
            int i2 = this.f;
            int i3 = i2 + 1;
            byte[] bArr = this.d;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void S(long j) {
            int i = this.f;
            int i2 = i + 1;
            byte[] bArr = this.d;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void T(int i, int i2) {
            U((i << 3) | i2);
        }

        public final void U(int i) {
            boolean z = k.c;
            byte[] bArr = this.d;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    o1.q(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                o1.q(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                bArr[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            int i5 = this.f;
            this.f = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void V(long j) {
            boolean z = k.c;
            byte[] bArr = this.d;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    o1.q(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                o1.q(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static class b extends k {
        public final byte[] d;
        public final int e;
        public int f;

        public b(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.d = bArr;
                this.f = 0;
                this.e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void A(int i, boolean z) throws IOException {
            M(i, 0);
            z(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void B(int i, h hVar) throws IOException {
            M(i, 2);
            S(hVar);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void C(int i, int i2) throws IOException {
            M(i, 5);
            D(i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void D(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void E(int i, long j) throws IOException {
            M(i, 1);
            F(j);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void F(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void G(int i, int i2) throws IOException {
            M(i, 0);
            H(i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void H(int i) throws IOException {
            if (i >= 0) {
                O(i);
            } else {
                Q(i);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void I(int i, p0 p0Var, e1 e1Var) throws IOException {
            M(i, 2);
            O(((com.amazon.aps.iva.v4.a) p0Var).d(e1Var));
            e1Var.a(p0Var, this.a);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void J(int i, p0 p0Var) throws IOException {
            M(1, 3);
            N(2, i);
            M(3, 2);
            T(p0Var);
            M(1, 4);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void K(int i, h hVar) throws IOException {
            M(1, 3);
            N(2, i);
            B(3, hVar);
            M(1, 4);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void L(int i, String str) throws IOException {
            M(i, 2);
            U(str);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void M(int i, int i2) throws IOException {
            O((i << 3) | i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void N(int i, int i2) throws IOException {
            M(i, 0);
            O(i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void O(int i) throws IOException {
            boolean z = k.c;
            int i2 = this.e;
            byte[] bArr = this.d;
            if (z && !com.amazon.aps.iva.v4.d.a()) {
                int i3 = this.f;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) == 0) {
                        this.f = i3 + 1;
                        o1.q(bArr, i3, (byte) i);
                        return;
                    }
                    this.f = i3 + 1;
                    o1.q(bArr, i3, (byte) (i | 128));
                    int i4 = i >>> 7;
                    if ((i4 & (-128)) == 0) {
                        int i5 = this.f;
                        this.f = i5 + 1;
                        o1.q(bArr, i5, (byte) i4);
                        return;
                    }
                    int i6 = this.f;
                    this.f = i6 + 1;
                    o1.q(bArr, i6, (byte) (i4 | 128));
                    int i7 = i4 >>> 7;
                    if ((i7 & (-128)) == 0) {
                        int i8 = this.f;
                        this.f = i8 + 1;
                        o1.q(bArr, i8, (byte) i7);
                        return;
                    }
                    int i9 = this.f;
                    this.f = i9 + 1;
                    o1.q(bArr, i9, (byte) (i7 | 128));
                    int i10 = i7 >>> 7;
                    if ((i10 & (-128)) == 0) {
                        int i11 = this.f;
                        this.f = i11 + 1;
                        o1.q(bArr, i11, (byte) i10);
                        return;
                    }
                    int i12 = this.f;
                    this.f = i12 + 1;
                    o1.q(bArr, i12, (byte) (i10 | 128));
                    int i13 = this.f;
                    this.f = i13 + 1;
                    o1.q(bArr, i13, (byte) (i10 >>> 7));
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    int i14 = this.f;
                    this.f = i14 + 1;
                    bArr[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i2), 1), e);
                }
            }
            int i15 = this.f;
            this.f = i15 + 1;
            bArr[i15] = (byte) i;
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void P(int i, long j) throws IOException {
            M(i, 0);
            Q(j);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void Q(long j) throws IOException {
            boolean z = k.c;
            int i = this.e;
            byte[] bArr = this.d;
            if (z && i - this.f >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    o1.q(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                o1.q(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.f;
                    this.f = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.f;
            this.f = i5 + 1;
            bArr[i5] = (byte) j;
        }

        public final void R(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        public final void S(h hVar) throws IOException {
            O(hVar.size());
            hVar.n(this);
        }

        public final void T(p0 p0Var) throws IOException {
            O(p0Var.getSerializedSize());
            p0Var.b(this);
        }

        public final void U(String str) throws IOException {
            int i = this.f;
            try {
                int v = k.v(str.length() * 3);
                int v2 = k.v(str.length());
                int i2 = this.e;
                byte[] bArr = this.d;
                if (v2 == v) {
                    int i3 = i + v2;
                    this.f = i3;
                    int b = p1.a.b(str, bArr, i3, i2 - i3);
                    this.f = i;
                    O((b - i) - v2);
                    this.f = b;
                } else {
                    O(p1.b(str));
                    int i4 = this.f;
                    this.f = p1.a.b(str, bArr, i4, i2 - i4);
                }
            } catch (p1.d e) {
                this.f = i;
                y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // com.amazon.aps.iva.v4.f
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            R(bArr, i, i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void z(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static final class d extends a {
        public final OutputStream g;

        public d(q.b bVar, int i) {
            super(i);
            this.g = bVar;
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void A(int i, boolean z) throws IOException {
            X(11);
            T(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.f;
            this.f = i2 + 1;
            this.d[i2] = b;
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void B(int i, h hVar) throws IOException {
            M(i, 2);
            Z(hVar);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void C(int i, int i2) throws IOException {
            X(14);
            T(i, 5);
            R(i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void D(int i) throws IOException {
            X(4);
            R(i);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void E(int i, long j) throws IOException {
            X(18);
            T(i, 1);
            S(j);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void F(long j) throws IOException {
            X(8);
            S(j);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void G(int i, int i2) throws IOException {
            X(20);
            T(i, 0);
            if (i2 >= 0) {
                U(i2);
            } else {
                V(i2);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void H(int i) throws IOException {
            if (i >= 0) {
                O(i);
            } else {
                Q(i);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void I(int i, p0 p0Var, e1 e1Var) throws IOException {
            M(i, 2);
            O(((com.amazon.aps.iva.v4.a) p0Var).d(e1Var));
            e1Var.a(p0Var, this.a);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void J(int i, p0 p0Var) throws IOException {
            M(1, 3);
            N(2, i);
            M(3, 2);
            a0(p0Var);
            M(1, 4);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void K(int i, h hVar) throws IOException {
            M(1, 3);
            N(2, i);
            B(3, hVar);
            M(1, 4);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void L(int i, String str) throws IOException {
            M(i, 2);
            b0(str);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void M(int i, int i2) throws IOException {
            O((i << 3) | i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void N(int i, int i2) throws IOException {
            X(20);
            T(i, 0);
            U(i2);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void O(int i) throws IOException {
            X(5);
            U(i);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void P(int i, long j) throws IOException {
            X(20);
            T(i, 0);
            V(j);
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void Q(long j) throws IOException {
            X(10);
            V(j);
        }

        public final void W() throws IOException {
            this.g.write(this.d, 0, this.f);
            this.f = 0;
        }

        public final void X(int i) throws IOException {
            if (this.e - this.f < i) {
                W();
            }
        }

        public final void Y(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.e;
            int i5 = i4 - i3;
            byte[] bArr2 = this.d;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f = i4;
            W();
            if (i7 <= i4) {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f = i7;
                return;
            }
            this.g.write(bArr, i6, i7);
        }

        public final void Z(h hVar) throws IOException {
            O(hVar.size());
            hVar.n(this);
        }

        @Override // com.amazon.aps.iva.v4.f
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            Y(bArr, i, i2);
        }

        public final void a0(p0 p0Var) throws IOException {
            O(p0Var.getSerializedSize());
            p0Var.b(this);
        }

        public final void b0(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int v = k.v(length);
                int i = v + length;
                int i2 = this.e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int b = p1.a.b(str, bArr, 0, length);
                    O(b);
                    Y(bArr, 0, b);
                    return;
                }
                if (i > i2 - this.f) {
                    W();
                }
                int v2 = k.v(str.length());
                int i3 = this.f;
                byte[] bArr2 = this.d;
                try {
                    try {
                        if (v2 == v) {
                            int i4 = i3 + v2;
                            this.f = i4;
                            int b2 = p1.a.b(str, bArr2, i4, i2 - i4);
                            this.f = i3;
                            U((b2 - i3) - v2);
                            this.f = b2;
                        } else {
                            int b3 = p1.b(str);
                            U(b3);
                            this.f = p1.a.b(str, bArr2, this.f, b3);
                        }
                    } catch (p1.d e) {
                        this.f = i3;
                        throw e;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new c(e2);
                }
            } catch (p1.d e3) {
                y(str, e3);
            }
        }

        @Override // com.amazon.aps.iva.v4.k
        public final void z(byte b) throws IOException {
            if (this.f == this.e) {
                W();
            }
            int i = this.f;
            this.f = i + 1;
            this.d[i] = b;
        }
    }

    public static int b(int i) {
        return t(i) + 1;
    }

    public static int c(int i, h hVar) {
        int t = t(i);
        int size = hVar.size();
        return v(size) + size + t;
    }

    public static int d(int i) {
        return t(i) + 8;
    }

    public static int e(int i, int i2) {
        return k(i2) + t(i);
    }

    public static int f(int i) {
        return t(i) + 4;
    }

    public static int g(int i) {
        return t(i) + 8;
    }

    public static int h(int i) {
        return t(i) + 4;
    }

    @Deprecated
    public static int i(int i, p0 p0Var, e1 e1Var) {
        return ((com.amazon.aps.iva.v4.a) p0Var).d(e1Var) + (t(i) * 2);
    }

    public static int j(int i, int i2) {
        return k(i2) + t(i);
    }

    public static int k(int i) {
        if (i >= 0) {
            return v(i);
        }
        return 10;
    }

    public static int l(int i, long j) {
        return x(j) + t(i);
    }

    public static int m(c0 c0Var) {
        int i;
        if (c0Var.b != null) {
            i = c0Var.b.size();
        } else if (c0Var.a != null) {
            i = c0Var.a.getSerializedSize();
        } else {
            i = 0;
        }
        return v(i) + i;
    }

    public static int n(int i) {
        return t(i) + 4;
    }

    public static int o(int i) {
        return t(i) + 8;
    }

    public static int p(int i, int i2) {
        return v((i2 >> 31) ^ (i2 << 1)) + t(i);
    }

    public static int q(int i, long j) {
        return x((j >> 63) ^ (j << 1)) + t(i);
    }

    public static int r(int i, String str) {
        return s(str) + t(i);
    }

    public static int s(String str) {
        int length;
        try {
            length = p1.b(str);
        } catch (p1.d unused) {
            length = str.getBytes(y.b).length;
        }
        return v(length) + length;
    }

    public static int t(int i) {
        return v((i << 3) | 0);
    }

    public static int u(int i, int i2) {
        return v(i2) + t(i);
    }

    public static int v(int i) {
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

    public static int w(int i, long j) {
        return x(j) + t(i);
    }

    public static int x(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public abstract void A(int i, boolean z) throws IOException;

    public abstract void B(int i, h hVar) throws IOException;

    public abstract void C(int i, int i2) throws IOException;

    public abstract void D(int i) throws IOException;

    public abstract void E(int i, long j) throws IOException;

    public abstract void F(long j) throws IOException;

    public abstract void G(int i, int i2) throws IOException;

    public abstract void H(int i) throws IOException;

    public abstract void I(int i, p0 p0Var, e1 e1Var) throws IOException;

    public abstract void J(int i, p0 p0Var) throws IOException;

    public abstract void K(int i, h hVar) throws IOException;

    public abstract void L(int i, String str) throws IOException;

    public abstract void M(int i, int i2) throws IOException;

    public abstract void N(int i, int i2) throws IOException;

    public abstract void O(int i) throws IOException;

    public abstract void P(int i, long j) throws IOException;

    public abstract void Q(long j) throws IOException;

    public final void y(String str, p1.d dVar) throws IOException {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.b);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new c(e2);
        }
    }

    public abstract void z(byte b2) throws IOException;

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static class c extends IOException {
        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(com.amazon.aps.iva.oa.a.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
