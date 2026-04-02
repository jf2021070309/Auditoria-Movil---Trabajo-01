package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.PDF417Common;
/* loaded from: classes2.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);
    private final int[] a;
    private final int[] b;
    private final a c;
    private final a d;
    private final int e;

    private ModulusGF(int i, int i2) {
        this.e = i;
        this.a = new int[i];
        this.b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.b[this.a[i5]] = i5;
        }
        this.c = new a(this, new int[]{0});
        this.d = new a(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new a(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i, int i2) {
        return (i + i2) % this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i, int i2) {
        return ((this.e + i) - i2) % this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i]) - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.a[(this.b[i] + this.b[i2]) % (this.e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.e;
    }
}
