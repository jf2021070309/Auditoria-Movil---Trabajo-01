package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
/* loaded from: classes2.dex */
final class a {
    private final BitMatrix a;
    private Version b;
    private e c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height < 21 || (height & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.a = bitMatrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e a() {
        int i = 0;
        if (this.c != null) {
            return this.c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = a(i3, 8, i2);
        }
        int a = a(8, 7, a(8, 8, a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = a(8, i4, a);
        }
        int height = this.a.getHeight();
        int i5 = height - 7;
        for (int i6 = height - 1; i6 >= i5; i6--) {
            i = a(8, i6, i);
        }
        for (int i7 = height - 8; i7 < height; i7++) {
            i = a(i7, 8, i);
        }
        this.c = e.b(a, i);
        if (this.c != null) {
            return this.c;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Version b() {
        if (this.b != null) {
            return this.b;
        }
        int height = this.a.getHeight();
        int i = (height - 17) / 4;
        if (i <= 6) {
            return Version.getVersionForNumber(i);
        }
        int i2 = height - 11;
        int i3 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = height - 9; i5 >= i2; i5--) {
                i3 = a(i5, i4, i3);
            }
        }
        Version a = Version.a(i3);
        if (a != null && a.getDimensionForVersion() == height) {
            this.b = a;
            return a;
        }
        int i6 = 0;
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = height - 9; i8 >= i2; i8--) {
                i6 = a(i7, i8, i6);
            }
        }
        Version a2 = Version.a(i6);
        if (a2 != null && a2.getDimensionForVersion() == height) {
            this.b = a2;
            return a2;
        }
        throw FormatException.getFormatInstance();
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.a.get(i2, i) : this.a.get(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] c() {
        e a = a();
        Version b = b();
        c cVar = c.values()[a.b()];
        int height = this.a.getHeight();
        cVar.a(this.a, height);
        BitMatrix a2 = b.a();
        byte[] bArr = new byte[b.getTotalCodewords()];
        int i = height - 1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (i > 0) {
            if (i == 6) {
                i--;
            }
            for (int i5 = 0; i5 < height; i5++) {
                int i6 = z ? (height - 1) - i5 : i5;
                for (int i7 = 0; i7 < 2; i7++) {
                    if (!a2.get(i - i7, i6)) {
                        i2++;
                        i3 <<= 1;
                        if (this.a.get(i - i7, i6)) {
                            i3 |= 1;
                        }
                        if (i2 == 8) {
                            bArr[i4] = (byte) i3;
                            i3 = 0;
                            i4++;
                            i2 = 0;
                        }
                    }
                }
            }
            i -= 2;
            z = !z;
        }
        if (i4 != b.getTotalCodewords()) {
            throw FormatException.getFormatInstance();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.c != null) {
            c.values()[this.c.b()].a(this.a, this.a.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.b = null;
        this.c = null;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        for (int i = 0; i < this.a.getWidth(); i++) {
            for (int i2 = i + 1; i2 < this.a.getHeight(); i2++) {
                if (this.a.get(i, i2) != this.a.get(i2, i)) {
                    this.a.flip(i2, i);
                    this.a.flip(i, i2);
                }
            }
        }
    }
}
