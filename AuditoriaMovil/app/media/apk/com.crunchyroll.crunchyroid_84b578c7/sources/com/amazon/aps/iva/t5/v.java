package com.amazon.aps.iva.t5;

import com.amazon.aps.iva.j0.j0;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: ParsableByteArray.java */
/* loaded from: classes.dex */
public final class v {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final ImmutableSet<Charset> f = ImmutableSet.of(Charsets.US_ASCII, Charsets.UTF_8, Charsets.UTF_16, Charsets.UTF_16BE, Charsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public v() {
        this.a = g0.e;
    }

    public final long A() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.a[this.b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException(j0.f("Invalid UTF-8 sequence continuation byte: ", j));
                }
            }
            this.b += i2;
            return j;
        }
        throw new NumberFormatException(j0.f("Invalid UTF-8 sequence first byte: ", j));
    }

    public final Charset B() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
                return Charsets.UTF_8;
            }
        }
        if (i - i2 >= 2) {
            byte[] bArr2 = this.a;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.b = i2 + 2;
                return Charsets.UTF_16BE;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.b = i2 + 2;
                return Charsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void C(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        D(i, bArr);
    }

    public final void D(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void E(int i) {
        boolean z;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.c = i;
    }

    public final void F(int i) {
        boolean z;
        if (i >= 0 && i <= this.c) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.b = i;
    }

    public final void G(int i) {
        F(this.b + i);
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final char b(Charset charset) {
        boolean contains = f.contains(charset);
        com.amazon.aps.iva.cq.b.v(contains, "Unsupported charset: " + charset);
        return (char) (c(charset) >> 16);
    }

    public final int c(Charset charset) {
        int i;
        byte checkedCast;
        char fromBytes;
        int i2 = 1;
        if (charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) {
            if (this.c - this.b >= 1) {
                checkedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.a[i]));
                return (Chars.checkedCast(checkedCast) << 16) + i2;
            }
        }
        if (charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) {
            int i3 = this.c;
            int i4 = this.b;
            if (i3 - i4 >= 2) {
                byte[] bArr = this.a;
                fromBytes = Chars.fromBytes(bArr[i4], bArr[i4 + 1]);
                checkedCast = (byte) fromBytes;
                i2 = 2;
                return (Chars.checkedCast(checkedCast) << 16) + i2;
            }
        }
        if (charset.equals(Charsets.UTF_16LE)) {
            int i5 = this.c;
            int i6 = this.b;
            if (i5 - i6 >= 2) {
                byte[] bArr2 = this.a;
                fromBytes = Chars.fromBytes(bArr2[i6 + 1], bArr2[i6]);
                checkedCast = (byte) fromBytes;
                i2 = 2;
                return (Chars.checkedCast(checkedCast) << 16) + i2;
            }
            return 0;
        }
        return 0;
    }

    public final void d(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 8);
        this.b = i5 + 1;
        return (bArr[i5] & UnsignedBytes.MAX_VALUE) | i6;
    }

    public final String f() {
        return g(Charsets.UTF_8);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(java.nio.charset.Charset r6) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t5.v.g(java.nio.charset.Charset):java.lang.String");
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 16);
        this.b = i5 + 1;
        return ((bArr[i5] & UnsignedBytes.MAX_VALUE) << 24) | i6;
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.b = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    public final short j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.b = i2 + 1;
        return (short) (((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3);
    }

    public final long k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final int l() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException(com.amazon.aps.iva.q.c0.a("Top bit not zero: ", h));
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.b = i2 + 1;
        return ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
    }

    public final long n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    public final String o() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        int i4 = g0.a;
        String str = new String(bArr, i3, i2 - i3, Charsets.UTF_8);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return str;
    }

    public final String p(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.b;
        int i4 = (i3 + i) - 1;
        if (i4 < this.c && this.a[i4] == 0) {
            i2 = i - 1;
        } else {
            i2 = i;
        }
        byte[] bArr = this.a;
        int i5 = g0.a;
        String str = new String(bArr, i3, i2, Charsets.UTF_8);
        this.b += i;
        return str;
    }

    public final short q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2 + 1;
        return (short) ((bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public final String r(int i) {
        return s(i, Charsets.UTF_8);
    }

    public final String s(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    public final long v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8);
        this.b = i3 + 1;
        return (bArr[i3] & UnsignedBytes.MAX_VALUE) | i4;
    }

    public final int x() {
        int e2 = e();
        if (e2 >= 0) {
            return e2;
        }
        throw new IllegalStateException(com.amazon.aps.iva.q.c0.a("Top bit not zero: ", e2));
    }

    public final long y() {
        long n = n();
        if (n >= 0) {
            return n;
        }
        throw new IllegalStateException(j0.f("Top bit not zero: ", n));
    }

    public final int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2 + 1;
        return (bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public v(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public v(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public v(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
