package com.amazon.aps.iva.t5;

import com.google.common.primitives.UnsignedBytes;
/* compiled from: ParsableBitArray.java */
/* loaded from: classes.dex */
public final class u {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public u() {
        this.a = 0;
        this.b = g0.e;
    }

    public final void a() {
        int i;
        int i2;
        boolean z = true;
        switch (this.a) {
            case 0:
                int i3 = this.c;
                if (i3 < 0 || (i3 >= (i2 = this.e) && (i3 != i2 || this.d != 0))) {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                return;
            default:
                int i4 = this.d;
                if (i4 < 0 || (i4 >= (i = this.c) && (i4 != i || this.e != 0))) {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                return;
        }
    }

    public final int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public final void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public final boolean d(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.c) {
                break;
            } else if (p(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.c;
        if (i4 < i6) {
            return true;
        }
        if (i4 == i6 && i5 == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        boolean z;
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.c && !h()) {
            i3++;
        }
        if (this.d == this.c) {
            z = true;
        } else {
            z = false;
        }
        this.d = i;
        this.e = i2;
        if (z || !d((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final int f() {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        return this.c;
    }

    public final int g() {
        return (this.c * 8) + this.d;
    }

    public final boolean h() {
        boolean z = true;
        switch (this.a) {
            case 0:
                if ((this.b[this.c] & (128 >> this.d)) == 0) {
                    z = false;
                }
                q();
                return z;
            default:
                if ((this.b[this.d] & (128 >> this.e)) == 0) {
                    z = false;
                }
                q();
                return z;
        }
    }

    public final int i(int i) {
        int i2 = 1;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i3 = 0;
                while (true) {
                    int i4 = this.d;
                    if (i4 > 8) {
                        int i5 = i4 - 8;
                        this.d = i5;
                        byte[] bArr = this.b;
                        int i6 = this.c;
                        this.c = i6 + 1;
                        i3 |= (bArr[i6] & UnsignedBytes.MAX_VALUE) << i5;
                    } else {
                        byte[] bArr2 = this.b;
                        int i7 = this.c;
                        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & UnsignedBytes.MAX_VALUE) >> (8 - i4)));
                        if (i4 == 8) {
                            this.d = 0;
                            this.c = i7 + 1;
                        }
                        a();
                        return i8;
                    }
                }
            default:
                this.e += i;
                int i9 = 0;
                while (true) {
                    int i10 = this.e;
                    int i11 = 2;
                    if (i10 > 8) {
                        int i12 = i10 - 8;
                        this.e = i12;
                        byte[] bArr3 = this.b;
                        int i13 = this.d;
                        i9 |= (bArr3[i13] & UnsignedBytes.MAX_VALUE) << i12;
                        if (!p(i13 + 1)) {
                            i11 = 1;
                        }
                        this.d = i13 + i11;
                    } else {
                        byte[] bArr4 = this.b;
                        int i14 = this.d;
                        int i15 = ((-1) >>> (32 - i)) & (i9 | ((bArr4[i14] & UnsignedBytes.MAX_VALUE) >> (8 - i10)));
                        if (i10 == 8) {
                            this.e = 0;
                            if (p(i14 + 1)) {
                                i2 = 2;
                            }
                            this.d = i14 + i2;
                        }
                        a();
                        return i15;
                    }
                }
        }
    }

    public final void j(byte[] bArr, int i) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & UnsignedBytes.MAX_VALUE) << i8));
            this.d = i8 - 8;
        }
        int i10 = this.d + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        a();
    }

    public final int l() {
        int i = 0;
        int i2 = 0;
        while (!h()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = i(i2);
        }
        return i3 + i;
    }

    public final int m() {
        int i;
        int l = l();
        if (l % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((l + 1) / 2) * i;
    }

    public final void n(int i, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public final void o(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public final boolean p(int i) {
        if (2 <= i && i < this.c) {
            byte[] bArr = this.b;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        int i = 1;
        switch (this.a) {
            case 0:
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                return;
            default:
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 == 8) {
                    this.e = 0;
                    int i4 = this.d;
                    if (p(i4 + 1)) {
                        i = 2;
                    }
                    this.d = i4 + i;
                }
                a();
                return;
        }
    }

    public final void r(int i) {
        switch (this.a) {
            case 0:
                int i2 = i / 8;
                int i3 = this.c + i2;
                this.c = i3;
                int i4 = (i - (i2 * 8)) + this.d;
                this.d = i4;
                if (i4 > 7) {
                    this.c = i3 + 1;
                    this.d = i4 - 8;
                }
                a();
                return;
            default:
                int i5 = this.d;
                int i6 = i / 8;
                int i7 = i5 + i6;
                this.d = i7;
                int i8 = (i - (i6 * 8)) + this.e;
                this.e = i8;
                if (i8 > 7) {
                    this.d = i7 + 1;
                    this.e = i8 - 8;
                }
                while (true) {
                    i5++;
                    if (i5 <= this.d) {
                        if (p(i5)) {
                            this.d++;
                            i5 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public final void s(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.c += i;
        a();
    }

    public u(byte[] bArr, int i, int i2) {
        this.a = 1;
        this.b = bArr;
        this.d = i;
        this.c = i2;
        this.e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(byte[] bArr) {
        this(bArr, bArr.length);
        this.a = 0;
    }

    public u(byte[] bArr, int i) {
        this.a = 0;
        this.b = bArr;
        this.e = i;
    }
}
