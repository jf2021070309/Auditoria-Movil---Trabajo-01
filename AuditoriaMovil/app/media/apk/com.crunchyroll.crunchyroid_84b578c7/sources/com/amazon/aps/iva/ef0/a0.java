package com.amazon.aps.iva.ef0;

import java.security.MessageDigest;
/* compiled from: SegmentedByteString.kt */
/* loaded from: classes4.dex */
public final class a0 extends i {
    public final transient byte[][] f;
    public final transient int[] g;

    public a0(byte[][] bArr, int[] iArr) {
        super(i.e.b);
        this.f = bArr;
        this.g = iArr;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final String a() {
        return new i(o()).a();
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        com.amazon.aps.iva.yb0.j.c(digest);
        return new i(digest);
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final int c() {
        return this.g[this.f.length - 1];
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (iVar.c() != c() || !k(iVar, c())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final String f() {
        return new i(o()).f();
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final byte[] h() {
        return o();
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            byte[][] bArr = this.f;
            int length = bArr.length;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (i2 < length) {
                int[] iArr = this.g;
                int i5 = iArr[length + i2];
                int i6 = iArr[i2];
                byte[] bArr2 = bArr[i2];
                int i7 = (i6 - i4) + i5;
                while (i5 < i7) {
                    i3 = (i3 * 31) + bArr2[i5];
                    i5++;
                }
                i2++;
                i4 = i6;
            }
            this.c = i3;
            return i3;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final byte i(int i) {
        int i2;
        byte[][] bArr = this.f;
        int[] iArr = this.g;
        b.b(iArr[bArr.length - 1], i, 1L);
        int N = com.amazon.aps.iva.aq.j.N(this, i);
        if (N == 0) {
            i2 = 0;
        } else {
            i2 = iArr[N - 1];
        }
        return bArr[N][(i - i2) + iArr[bArr.length + N]];
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final boolean j(int i, byte[] bArr, int i2, int i3) {
        int i4;
        com.amazon.aps.iva.yb0.j.f(bArr, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int N = com.amazon.aps.iva.aq.j.N(this, i);
        while (i < i5) {
            int[] iArr = this.g;
            if (N == 0) {
                i4 = 0;
            } else {
                i4 = iArr[N - 1];
            }
            byte[][] bArr2 = this.f;
            int i6 = iArr[bArr2.length + N];
            int min = Math.min(i5, (iArr[N] - i4) + i4) - i;
            if (!b.a(bArr2[N], (i - i4) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            N++;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final boolean k(i iVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(iVar, "other");
        if (c() - i < 0) {
            return false;
        }
        int i3 = i + 0;
        int N = com.amazon.aps.iva.aq.j.N(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int[] iArr = this.g;
            if (N == 0) {
                i2 = 0;
            } else {
                i2 = iArr[N - 1];
            }
            byte[][] bArr = this.f;
            int i6 = iArr[bArr.length + N];
            int min = Math.min(i3, (iArr[N] - i2) + i2) - i4;
            if (!iVar.j(i5, bArr[N], (i4 - i2) + i6, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            N++;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final i l() {
        return new i(o()).l();
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final void n(e eVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(eVar, "buffer");
        int i3 = 0 + i;
        int N = com.amazon.aps.iva.aq.j.N(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.g;
            if (N == 0) {
                i2 = 0;
            } else {
                i2 = iArr[N - 1];
            }
            byte[][] bArr = this.f;
            int i5 = iArr[bArr.length + N];
            int min = Math.min(i3, (iArr[N] - i2) + i2) - i4;
            int i6 = (i4 - i2) + i5;
            y yVar = new y(bArr[N], i6, i6 + min, true, false);
            y yVar2 = eVar.b;
            if (yVar2 == null) {
                yVar.g = yVar;
                yVar.f = yVar;
                eVar.b = yVar;
            } else {
                y yVar3 = yVar2.g;
                com.amazon.aps.iva.yb0.j.c(yVar3);
                yVar3.b(yVar);
            }
            i4 += min;
            N++;
        }
        eVar.c += i;
    }

    public final byte[] o() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            com.amazon.aps.iva.lb0.m.D(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // com.amazon.aps.iva.ef0.i
    public final String toString() {
        return new i(o()).toString();
    }
}
