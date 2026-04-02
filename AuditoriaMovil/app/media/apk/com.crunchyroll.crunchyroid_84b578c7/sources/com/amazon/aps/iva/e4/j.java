package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.a0;
import com.amazon.aps.iva.e4.i;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class j {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;
    public k d;

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class a extends j {
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.e = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int A() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.e
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.h = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.C()
                int r0 = (int) r0
                return r0
            L70:
                r5.h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.j.a.A():int");
        }

        public final long B() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << Ascii.SO);
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (bArr[i5] << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (bArr[i11] << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (bArr[i7] << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                        i5 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                                this.h = i5;
                                return j2;
                            }
                        }
                        i5 = i7;
                        j2 = j;
                        this.h = i5;
                        return j2;
                    }
                    j2 = i;
                    this.h = i5;
                    return j2;
                }
            }
            return C();
        }

        public final long C() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 != this.f) {
                    this.h = i2 + 1;
                    byte b = this.e[i2];
                    j |= (b & Ascii.DEL) << i;
                    if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                        return j;
                    }
                } else {
                    throw a0.f();
                }
            }
            throw a0.c();
        }

        public final void D(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw a0.d();
            }
            throw a0.f();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final void a(int i) throws a0 {
            if (this.j == i) {
                return;
            }
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int b() {
            return this.h - this.i;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean c() throws IOException {
            if (this.h == this.f) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final void d(int i) {
            this.k = i;
            int i2 = this.f + this.g;
            this.f = i2;
            int i3 = i2 - this.i;
            if (i3 > i) {
                int i4 = i3 - i;
                this.g = i4;
                this.f = i2 - i4;
                return;
            }
            this.g = 0;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int e(int i) throws a0 {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.i;
                int i4 = (i2 - i3) + i;
                int i5 = this.k;
                if (i4 <= i5) {
                    this.k = i4;
                    int i6 = this.f + this.g;
                    this.f = i6;
                    int i7 = i6 - i3;
                    if (i7 > i4) {
                        int i8 = i7 - i4;
                        this.g = i8;
                        this.f = i6 - i8;
                    } else {
                        this.g = 0;
                    }
                    return i5;
                }
                throw a0.f();
            }
            throw a0.d();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean f() throws IOException {
            if (B() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final i.e g() throws IOException {
            byte[] bArr;
            int A = A();
            byte[] bArr2 = this.e;
            if (A > 0) {
                int i = this.f;
                int i2 = this.h;
                if (A <= i - i2) {
                    i.e e = i.e(i2, bArr2, A);
                    this.h += A;
                    return e;
                }
            }
            if (A == 0) {
                return i.c;
            }
            if (A > 0) {
                int i3 = this.f;
                int i4 = this.h;
                if (A <= i3 - i4) {
                    int i5 = A + i4;
                    this.h = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    i.e eVar = i.c;
                    return new i.e(bArr);
                }
            }
            if (A <= 0) {
                if (A == 0) {
                    bArr = z.b;
                    i.e eVar2 = i.c;
                    return new i.e(bArr);
                }
                throw a0.d();
            }
            throw a0.f();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final double h() throws IOException {
            return Double.longBitsToDouble(z());
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int i() throws IOException {
            return A();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int j() throws IOException {
            return y();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long k() throws IOException {
            return z();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final float l() throws IOException {
            return Float.intBitsToFloat(y());
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int m() throws IOException {
            return A();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long n() throws IOException {
            return B();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int o() throws IOException {
            return y();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long p() throws IOException {
            return z();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int q() throws IOException {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long r() throws IOException {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final String s() throws IOException {
            int A = A();
            if (A > 0) {
                int i = this.f;
                int i2 = this.h;
                if (A <= i - i2) {
                    String str = new String(this.e, i2, A, z.a);
                    this.h += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw a0.d();
            }
            throw a0.f();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final String t() throws IOException {
            int A = A();
            if (A > 0) {
                int i = this.f;
                int i2 = this.h;
                if (A <= i - i2) {
                    String a = s1.a.a(this.e, i2, A);
                    this.h += A;
                    return a;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw a0.d();
            }
            throw a0.f();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int u() throws IOException {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int A = A();
            this.j = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new a0("Protocol message contained an invalid tag (zero).");
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int v() throws IOException {
            return A();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long w() throws IOException {
            return B();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean x(int i) throws IOException {
            int u;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return false;
                            }
                            if (i2 == 5) {
                                D(4);
                                return true;
                            }
                            int i4 = a0.b;
                            throw new a0.a();
                        }
                        do {
                            u = u();
                            if (u == 0) {
                                break;
                            }
                        } while (x(u));
                        a(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    D(A());
                    return true;
                }
                D(8);
                return true;
            }
            int i5 = this.f - this.h;
            byte[] bArr = this.e;
            if (i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.h;
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw a0.c();
            }
            while (i3 < 10) {
                int i7 = this.h;
                if (i7 != this.f) {
                    this.h = i7 + 1;
                    if (bArr[i7] < 0) {
                        i3++;
                    }
                } else {
                    throw a0.f();
                }
            }
            throw a0.c();
            return true;
        }

        public final int y() throws IOException {
            int i = this.h;
            if (this.f - i >= 4) {
                this.h = i + 4;
                byte[] bArr = this.e;
                return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
            }
            throw a0.f();
        }

        public final long z() throws IOException {
            int i = this.h;
            if (this.f - i >= 8) {
                this.h = i + 8;
                byte[] bArr = this.e;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw a0.f();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class b extends j {
        public final InputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = z.a;
            this.e = fileInputStream;
            this.f = new byte[4096];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public final ArrayList A(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.k += read;
                        i2 += read;
                    } else {
                        throw a0.f();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() throws IOException {
            int i = this.i;
            if (this.g - i < 4) {
                H(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f;
            return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long C() throws IOException {
            int i = this.i;
            if (this.g - i < 8) {
                H(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r3[r2] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int D() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                int r2 = r0 + 1
                byte[] r3 = r5.f
                r0 = r3[r0]
                if (r0 < 0) goto L12
                r5.i = r2
                return r0
            L12:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r2
                goto L70
            L31:
                int r1 = r2 + 1
                r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r2 = r1 + 1
                r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
                int r2 = r1 + 1
                r1 = r3[r1]
                if (r1 >= 0) goto L2f
                int r1 = r2 + 1
                r2 = r3[r2]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.F()
                int r0 = (int) r0
                return r0
            L70:
                r5.i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.j.b.D():int");
        }

        public final long E() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.i;
            int i3 = this.g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.i = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << Ascii.SO);
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = (bArr[i5] << 28) ^ j4;
                                if (j5 >= 0) {
                                    j2 = j5 ^ 266354560;
                                    i5 = i10;
                                } else {
                                    int i11 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i11 + 1;
                                        long j7 = j6 ^ (bArr[i11] << 42);
                                        if (j7 >= 0) {
                                            j = j7 ^ 4363953127296L;
                                        } else {
                                            i11 = i7 + 1;
                                            j6 = j7 ^ (bArr[i7] << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i11 + 1;
                                                j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    i11 = i7 + 1;
                                                    if (bArr[i7] >= 0) {
                                                        j2 = j;
                                                        i5 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j6;
                                    i5 = i11;
                                }
                                this.i = i5;
                                return j2;
                            }
                        }
                        i5 = i7;
                        j2 = j;
                        this.i = i5;
                        return j2;
                    }
                    j2 = i;
                    this.i = i5;
                    return j2;
                }
            }
            return F();
        }

        public final long F() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.g) {
                    H(1);
                }
                int i2 = this.i;
                this.i = i2 + 1;
                byte b = this.f[i2];
                j |= (b & Ascii.DEL) << i;
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw a0.c();
        }

        public final void G() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.h = i4;
                this.g = i - i4;
                return;
            }
            this.h = 0;
        }

        public final void H(int i) throws IOException {
            if (!J(i)) {
                if (i > (this.c - this.k) - this.i) {
                    throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                throw a0.f();
            }
        }

        public final void I(int i) throws IOException {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3 && i >= 0) {
                this.i = i3 + i;
                return;
            }
            InputStream inputStream = this.e;
            if (i >= 0) {
                int i4 = this.k;
                int i5 = i4 + i3;
                int i6 = i5 + i;
                int i7 = this.l;
                if (i6 <= i7) {
                    this.k = i5;
                    int i8 = i2 - i3;
                    this.g = 0;
                    this.i = 0;
                    while (i8 < i) {
                        long j = i - i8;
                        try {
                            long skip = inputStream.skip(j);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 >= 0 && skip <= j) {
                                if (i9 == 0) {
                                    break;
                                }
                                i8 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.k += i8;
                            G();
                        }
                    }
                    if (i8 < i) {
                        int i10 = this.g;
                        int i11 = i10 - this.i;
                        this.i = i10;
                        H(1);
                        while (true) {
                            int i12 = i - i11;
                            int i13 = this.g;
                            if (i12 > i13) {
                                i11 += i13;
                                this.i = i13;
                                H(1);
                            } else {
                                this.i = i12;
                                return;
                            }
                        }
                    }
                } else {
                    I((i7 - i4) - i3);
                    throw a0.f();
                }
            } else {
                throw a0.d();
            }
        }

        public final boolean J(int i) throws IOException {
            InputStream inputStream;
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                int i5 = this.k;
                int i6 = this.c;
                if (i > (i6 - i5) - i2 || i5 + i2 + i > this.l) {
                    return false;
                }
                byte[] bArr = this.f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.k += i2;
                    this.g -= i2;
                    this.i = 0;
                }
                int i7 = this.g;
                int min = Math.min(bArr.length - i7, (i6 - this.k) - i7);
                int read = this.e.read(bArr, i7, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.g += read;
                    G();
                    if (this.g >= i) {
                        return true;
                    }
                    return J(i);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException(com.amazon.aps.iva.c80.a.d("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }

        @Override // com.amazon.aps.iva.e4.j
        public final void a(int i) throws a0 {
            if (this.j == i) {
                return;
            }
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int b() {
            return this.k + this.i;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean c() throws IOException {
            if (this.i == this.g && !J(1)) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final void d(int i) {
            this.l = i;
            G();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int e(int i) throws a0 {
            if (i >= 0) {
                int i2 = this.k + this.i + i;
                int i3 = this.l;
                if (i2 <= i3) {
                    this.l = i2;
                    G();
                    return i3;
                }
                throw a0.f();
            }
            throw a0.d();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean f() throws IOException {
            if (E() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.e4.j
        public final i.e g() throws IOException {
            int D = D();
            int i = this.g;
            int i2 = this.i;
            int i3 = i - i2;
            byte[] bArr = this.f;
            if (D <= i3 && D > 0) {
                i.e e = i.e(i2, bArr, D);
                this.i += D;
                return e;
            } else if (D == 0) {
                return i.c;
            } else {
                byte[] z = z(D);
                if (z != null) {
                    return i.e(0, z, z.length);
                }
                int i4 = this.i;
                int i5 = this.g;
                int i6 = i5 - i4;
                this.k += i5;
                this.i = 0;
                this.g = 0;
                ArrayList A = A(D - i6);
                byte[] bArr2 = new byte[D];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                    i6 += bArr3.length;
                }
                i.e eVar = i.c;
                return new i.e(bArr2);
            }
        }

        @Override // com.amazon.aps.iva.e4.j
        public final double h() throws IOException {
            return Double.longBitsToDouble(C());
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int i() throws IOException {
            return D();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int j() throws IOException {
            return B();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long k() throws IOException {
            return C();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final float l() throws IOException {
            return Float.intBitsToFloat(B());
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int m() throws IOException {
            return D();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long n() throws IOException {
            return E();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int o() throws IOException {
            return B();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long p() throws IOException {
            return C();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int q() throws IOException {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long r() throws IOException {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final String s() throws IOException {
            int D = D();
            byte[] bArr = this.f;
            if (D > 0) {
                int i = this.g;
                int i2 = this.i;
                if (D <= i - i2) {
                    String str = new String(bArr, i2, D, z.a);
                    this.i += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= this.g) {
                H(D);
                String str2 = new String(bArr, this.i, D, z.a);
                this.i += D;
                return str2;
            }
            return new String(y(D), z.a);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final String t() throws IOException {
            int D = D();
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 - i;
            byte[] bArr = this.f;
            if (D <= i3 && D > 0) {
                this.i = i + D;
            } else if (D == 0) {
                return "";
            } else {
                i = 0;
                if (D <= i2) {
                    H(D);
                    this.i = D + 0;
                } else {
                    bArr = y(D);
                }
            }
            return s1.a.a(bArr, i, D);
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int u() throws IOException {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int D = D();
            this.j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new a0("Protocol message contained an invalid tag (zero).");
        }

        @Override // com.amazon.aps.iva.e4.j
        public final int v() throws IOException {
            return D();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final long w() throws IOException {
            return E();
        }

        @Override // com.amazon.aps.iva.e4.j
        public final boolean x(int i) throws IOException {
            int u;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return false;
                            }
                            if (i2 == 5) {
                                I(4);
                                return true;
                            }
                            int i4 = a0.b;
                            throw new a0.a();
                        }
                        do {
                            u = u();
                            if (u == 0) {
                                break;
                            }
                        } while (x(u));
                        a(((i >>> 3) << 3) | 4);
                        return true;
                    }
                    I(D());
                    return true;
                }
                I(8);
                return true;
            }
            int i5 = this.g - this.i;
            byte[] bArr = this.f;
            if (i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.i;
                    this.i = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw a0.c();
            }
            while (i3 < 10) {
                if (this.i == this.g) {
                    H(1);
                }
                int i7 = this.i;
                this.i = i7 + 1;
                if (bArr[i7] < 0) {
                    i3++;
                }
            }
            throw a0.c();
            return true;
        }

        public final byte[] y(int i) throws IOException {
            byte[] z = z(i);
            if (z != null) {
                return z;
            }
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            ArrayList A = A(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, i4);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i) throws IOException {
            if (i == 0) {
                return z.b;
            }
            if (i >= 0) {
                int i2 = this.k;
                int i3 = this.i;
                int i4 = i2 + i3 + i;
                if (i4 - this.c <= 0) {
                    int i5 = this.l;
                    if (i4 <= i5) {
                        int i6 = this.g - i3;
                        int i7 = i - i6;
                        InputStream inputStream = this.e;
                        if (i7 >= 4096 && i7 > inputStream.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f, this.i, bArr, 0, i6);
                        this.k += this.g;
                        this.i = 0;
                        this.g = 0;
                        while (i6 < i) {
                            int read = inputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.k += read;
                                i6 += read;
                            } else {
                                throw a0.f();
                            }
                        }
                        return bArr;
                    }
                    I((i5 - i2) - i3);
                    throw a0.f();
                }
                throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw a0.d();
        }
    }

    public abstract void a(int i) throws a0;

    public abstract int b();

    public abstract boolean c() throws IOException;

    public abstract void d(int i);

    public abstract int e(int i) throws a0;

    public abstract boolean f() throws IOException;

    public abstract i.e g() throws IOException;

    public abstract double h() throws IOException;

    public abstract int i() throws IOException;

    public abstract int j() throws IOException;

    public abstract long k() throws IOException;

    public abstract float l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract String s() throws IOException;

    public abstract String t() throws IOException;

    public abstract int u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract boolean x(int i) throws IOException;
}
