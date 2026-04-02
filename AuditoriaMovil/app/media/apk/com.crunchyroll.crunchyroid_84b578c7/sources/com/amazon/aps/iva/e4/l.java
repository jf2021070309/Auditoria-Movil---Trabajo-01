package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.s1;
import com.amazon.aps.iva.z3.q;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: CodedOutputStream.java */
/* loaded from: classes.dex */
public abstract class l extends g {
    public static final Logger b = Logger.getLogger(l.class.getName());
    public static final boolean c = r1.f;
    public m a;

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static abstract class a extends l {
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

        public final void V(int i) {
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

        public final void W(long j) {
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

        public final void X(int i, int i2) {
            Y((i << 3) | i2);
        }

        public final void Y(int i) {
            boolean z = l.c;
            byte[] bArr = this.d;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    r1.p(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                r1.p(bArr, i3, (byte) i);
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

        public final void Z(long j) {
            boolean z = l.c;
            byte[] bArr = this.d;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    r1.p(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                r1.p(bArr, i2, (byte) j);
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
    public static class b extends l {
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

        @Override // com.amazon.aps.iva.e4.l
        public final void A(int i, boolean z) throws IOException {
            Q(i, 0);
            z(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void B(byte[] bArr, int i) throws IOException {
            S(i);
            V(bArr, 0, i);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void C(int i, i iVar) throws IOException {
            Q(i, 2);
            D(iVar);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void D(i iVar) throws IOException {
            S(iVar.size());
            iVar.l(this);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void E(int i, int i2) throws IOException {
            Q(i, 5);
            F(i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void F(int i) throws IOException {
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

        @Override // com.amazon.aps.iva.e4.l
        public final void G(int i, long j) throws IOException {
            Q(i, 1);
            H(j);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void H(long j) throws IOException {
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

        @Override // com.amazon.aps.iva.e4.l
        public final void I(int i, int i2) throws IOException {
            Q(i, 0);
            J(i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void J(int i) throws IOException {
            if (i >= 0) {
                S(i);
            } else {
                U(i);
            }
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void K(int i, q0 q0Var, g1 g1Var) throws IOException {
            Q(i, 2);
            S(((com.amazon.aps.iva.e4.a) q0Var).d(g1Var));
            g1Var.b(q0Var, this.a);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void L(q0 q0Var) throws IOException {
            S(q0Var.getSerializedSize());
            q0Var.b(this);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void M(int i, q0 q0Var) throws IOException {
            Q(1, 3);
            R(2, i);
            Q(3, 2);
            L(q0Var);
            Q(1, 4);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void N(int i, i iVar) throws IOException {
            Q(1, 3);
            R(2, i);
            C(3, iVar);
            Q(1, 4);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void O(int i, String str) throws IOException {
            Q(i, 2);
            P(str);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void P(String str) throws IOException {
            int i = this.f;
            try {
                int v = l.v(str.length() * 3);
                int v2 = l.v(str.length());
                int i2 = this.e;
                byte[] bArr = this.d;
                if (v2 == v) {
                    int i3 = i + v2;
                    this.f = i3;
                    int b = s1.a.b(str, bArr, i3, i2 - i3);
                    this.f = i;
                    S((b - i) - v2);
                    this.f = b;
                } else {
                    S(s1.b(str));
                    int i4 = this.f;
                    this.f = s1.a.b(str, bArr, i4, i2 - i4);
                }
            } catch (s1.d e) {
                this.f = i;
                y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void Q(int i, int i2) throws IOException {
            S((i << 3) | i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void R(int i, int i2) throws IOException {
            Q(i, 0);
            S(i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void S(int i) throws IOException {
            boolean z = l.c;
            int i2 = this.e;
            byte[] bArr = this.d;
            if (z && !com.amazon.aps.iva.e4.d.a()) {
                int i3 = this.f;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) == 0) {
                        this.f = i3 + 1;
                        r1.p(bArr, i3, (byte) i);
                        return;
                    }
                    this.f = i3 + 1;
                    r1.p(bArr, i3, (byte) (i | 128));
                    int i4 = i >>> 7;
                    if ((i4 & (-128)) == 0) {
                        int i5 = this.f;
                        this.f = i5 + 1;
                        r1.p(bArr, i5, (byte) i4);
                        return;
                    }
                    int i6 = this.f;
                    this.f = i6 + 1;
                    r1.p(bArr, i6, (byte) (i4 | 128));
                    int i7 = i4 >>> 7;
                    if ((i7 & (-128)) == 0) {
                        int i8 = this.f;
                        this.f = i8 + 1;
                        r1.p(bArr, i8, (byte) i7);
                        return;
                    }
                    int i9 = this.f;
                    this.f = i9 + 1;
                    r1.p(bArr, i9, (byte) (i7 | 128));
                    int i10 = i7 >>> 7;
                    if ((i10 & (-128)) == 0) {
                        int i11 = this.f;
                        this.f = i11 + 1;
                        r1.p(bArr, i11, (byte) i10);
                        return;
                    }
                    int i12 = this.f;
                    this.f = i12 + 1;
                    r1.p(bArr, i12, (byte) (i10 | 128));
                    int i13 = this.f;
                    this.f = i13 + 1;
                    r1.p(bArr, i13, (byte) (i10 >>> 7));
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

        @Override // com.amazon.aps.iva.e4.l
        public final void T(int i, long j) throws IOException {
            Q(i, 0);
            U(j);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void U(long j) throws IOException {
            boolean z = l.c;
            int i = this.e;
            byte[] bArr = this.d;
            if (z && i - this.f >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    r1.p(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i3 = this.f;
                this.f = i3 + 1;
                r1.p(bArr, i3, (byte) j);
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

        public final void V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.amazon.aps.iva.e4.g
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            V(bArr, i, i2);
        }

        @Override // com.amazon.aps.iva.e4.l
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

        @Override // com.amazon.aps.iva.e4.l
        public final void A(int i, boolean z) throws IOException {
            b0(11);
            X(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.f;
            this.f = i2 + 1;
            this.d[i2] = b;
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void B(byte[] bArr, int i) throws IOException {
            S(i);
            c0(bArr, 0, i);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void C(int i, i iVar) throws IOException {
            Q(i, 2);
            D(iVar);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void D(i iVar) throws IOException {
            S(iVar.size());
            iVar.l(this);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void E(int i, int i2) throws IOException {
            b0(14);
            X(i, 5);
            V(i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void F(int i) throws IOException {
            b0(4);
            V(i);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void G(int i, long j) throws IOException {
            b0(18);
            X(i, 1);
            W(j);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void H(long j) throws IOException {
            b0(8);
            W(j);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void I(int i, int i2) throws IOException {
            b0(20);
            X(i, 0);
            if (i2 >= 0) {
                Y(i2);
            } else {
                Z(i2);
            }
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void J(int i) throws IOException {
            if (i >= 0) {
                S(i);
            } else {
                U(i);
            }
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void K(int i, q0 q0Var, g1 g1Var) throws IOException {
            Q(i, 2);
            S(((com.amazon.aps.iva.e4.a) q0Var).d(g1Var));
            g1Var.b(q0Var, this.a);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void L(q0 q0Var) throws IOException {
            S(q0Var.getSerializedSize());
            q0Var.b(this);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void M(int i, q0 q0Var) throws IOException {
            Q(1, 3);
            R(2, i);
            Q(3, 2);
            L(q0Var);
            Q(1, 4);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void N(int i, i iVar) throws IOException {
            Q(1, 3);
            R(2, i);
            C(3, iVar);
            Q(1, 4);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void O(int i, String str) throws IOException {
            Q(i, 2);
            P(str);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void P(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int v = l.v(length);
                int i = v + length;
                int i2 = this.e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int b = s1.a.b(str, bArr, 0, length);
                    S(b);
                    c0(bArr, 0, b);
                    return;
                }
                if (i > i2 - this.f) {
                    a0();
                }
                int v2 = l.v(str.length());
                int i3 = this.f;
                byte[] bArr2 = this.d;
                try {
                    if (v2 == v) {
                        int i4 = i3 + v2;
                        this.f = i4;
                        int b2 = s1.a.b(str, bArr2, i4, i2 - i4);
                        this.f = i3;
                        Y((b2 - i3) - v2);
                        this.f = b2;
                    } else {
                        int b3 = s1.b(str);
                        Y(b3);
                        this.f = s1.a.b(str, bArr2, this.f, b3);
                    }
                } catch (s1.d e) {
                    this.f = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new c(e2);
                }
            } catch (s1.d e3) {
                y(str, e3);
            }
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void Q(int i, int i2) throws IOException {
            S((i << 3) | i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void R(int i, int i2) throws IOException {
            b0(20);
            X(i, 0);
            Y(i2);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void S(int i) throws IOException {
            b0(5);
            Y(i);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void T(int i, long j) throws IOException {
            b0(20);
            X(i, 0);
            Z(j);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void U(long j) throws IOException {
            b0(10);
            Z(j);
        }

        @Override // com.amazon.aps.iva.e4.g
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c0(bArr, i, i2);
        }

        public final void a0() throws IOException {
            this.g.write(this.d, 0, this.f);
            this.f = 0;
        }

        public final void b0(int i) throws IOException {
            if (this.e - this.f < i) {
                a0();
            }
        }

        public final void c0(byte[] bArr, int i, int i2) throws IOException {
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
            a0();
            if (i7 <= i4) {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f = i7;
                return;
            }
            this.g.write(bArr, i6, i7);
        }

        @Override // com.amazon.aps.iva.e4.l
        public final void z(byte b) throws IOException {
            if (this.f == this.e) {
                a0();
            }
            int i = this.f;
            this.f = i + 1;
            this.d[i] = b;
        }
    }

    public static int b(int i) {
        return t(i) + 1;
    }

    public static int c(int i, i iVar) {
        int t = t(i);
        int size = iVar.size();
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
    public static int i(int i, q0 q0Var, g1 g1Var) {
        return ((com.amazon.aps.iva.e4.a) q0Var).d(g1Var) + (t(i) * 2);
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

    public static int m(d0 d0Var) {
        int i;
        if (d0Var.b != null) {
            i = d0Var.b.size();
        } else if (d0Var.a != null) {
            i = d0Var.a.getSerializedSize();
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
            length = s1.b(str);
        } catch (s1.d unused) {
            length = str.getBytes(z.a).length;
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

    public abstract void B(byte[] bArr, int i) throws IOException;

    public abstract void C(int i, i iVar) throws IOException;

    public abstract void D(i iVar) throws IOException;

    public abstract void E(int i, int i2) throws IOException;

    public abstract void F(int i) throws IOException;

    public abstract void G(int i, long j) throws IOException;

    public abstract void H(long j) throws IOException;

    public abstract void I(int i, int i2) throws IOException;

    public abstract void J(int i) throws IOException;

    public abstract void K(int i, q0 q0Var, g1 g1Var) throws IOException;

    public abstract void L(q0 q0Var) throws IOException;

    public abstract void M(int i, q0 q0Var) throws IOException;

    public abstract void N(int i, i iVar) throws IOException;

    public abstract void O(int i, String str) throws IOException;

    public abstract void P(String str) throws IOException;

    public abstract void Q(int i, int i2) throws IOException;

    public abstract void R(int i, int i2) throws IOException;

    public abstract void S(int i) throws IOException;

    public abstract void T(int i, long j) throws IOException;

    public abstract void U(long j) throws IOException;

    public final void y(String str, s1.d dVar) throws IOException {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.a);
        try {
            S(bytes.length);
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
