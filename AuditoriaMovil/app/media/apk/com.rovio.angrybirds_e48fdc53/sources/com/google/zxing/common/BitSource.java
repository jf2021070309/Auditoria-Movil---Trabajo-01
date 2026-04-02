package com.google.zxing.common;

import com.flurry.android.Constants;
/* loaded from: classes2.dex */
public final class BitSource {
    private final byte[] a;
    private int b;
    private int c;

    public BitSource(byte[] bArr) {
        this.a = bArr;
    }

    public int getBitOffset() {
        return this.c;
    }

    public int getByteOffset() {
        return this.b;
    }

    public int readBits(int i) {
        int i2;
        int i3;
        if (i <= 0 || i > 32 || i > available()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        if (this.c > 0) {
            int i4 = 8 - this.c;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            int i7 = (((255 >> (8 - i5)) << i6) & this.a[this.b]) >> i6;
            int i8 = i - i5;
            this.c = i5 + this.c;
            if (this.c == 8) {
                this.c = 0;
                this.b++;
            }
            i2 = i7;
            i3 = i8;
        } else {
            i2 = 0;
            i3 = i;
        }
        if (i3 > 0) {
            while (i3 >= 8) {
                i2 = (i2 << 8) | (this.a[this.b] & Constants.UNKNOWN);
                this.b++;
                i3 -= 8;
            }
            if (i3 > 0) {
                int i9 = 8 - i3;
                int i10 = (i2 << i3) | ((((255 >> i9) << i9) & this.a[this.b]) >> i9);
                this.c = i3 + this.c;
                return i10;
            }
            return i2;
        }
        return i2;
    }

    public int available() {
        return ((this.a.length - this.b) * 8) - this.c;
    }
}
