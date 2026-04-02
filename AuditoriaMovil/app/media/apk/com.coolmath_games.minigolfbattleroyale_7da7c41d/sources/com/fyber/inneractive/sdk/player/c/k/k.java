package com.fyber.inneractive.sdk.player.c.k;

import java.nio.charset.Charset;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class k {
    public byte[] a;
    public int b;
    public int c;

    public k() {
    }

    public k(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public k(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public k(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void a(int i) {
        a(c() < i ? new byte[i] : this.a, i);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final void b(int i) {
        a.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final int c() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void c(int i) {
        a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void d(int i) {
        c(this.b + i);
    }

    public final void a(j jVar, int i) {
        a(jVar.a, 0, i);
        jVar.a(0);
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i2 + 1;
        return (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8);
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.b = i2 + 1;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 16) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        this.b = i3 + 1;
        return (bArr[i3] & UByte.MAX_VALUE) | i4;
    }

    public final long h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        this.b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        this.b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
        int i5 = i3 + 1;
        this.b = i5;
        int i6 = i4 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        this.b = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i6;
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i2 + 1;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        int i6 = i4 + 1;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.b = i6 + 1;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = i4 + 1;
        this.b = i5;
        int i6 = i5 + 1;
        this.b = i6;
        int i7 = i6 + 1;
        this.b = i7;
        int i8 = i7 + 1;
        this.b = i8;
        this.b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    public final int m() {
        return (d() << 21) | (d() << 14) | (d() << 7) | d();
    }

    public final int n() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Top bit not zero: " + j);
    }

    public final int o() {
        int k = k();
        if (k >= 0) {
            return k;
        }
        throw new IllegalStateException("Top bit not zero: " + k);
    }

    public final long p() {
        long l = l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    public final String e(int i) {
        String str = new String(this.a, this.b, i, Charset.defaultCharset());
        this.b += i;
        return str;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.b + i) - 1;
        String str = new String(this.a, this.b, (i2 >= this.c || this.a[i2] != 0) ? i : i - 1);
        this.b += i;
        return str;
    }

    public final String q() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }
}
