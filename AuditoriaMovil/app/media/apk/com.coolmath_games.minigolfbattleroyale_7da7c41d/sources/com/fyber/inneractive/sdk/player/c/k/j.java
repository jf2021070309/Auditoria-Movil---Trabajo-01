package com.fyber.inneractive.sdk.player.c.k;

import kotlin.UByte;
/* loaded from: classes.dex */
public final class j {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public j() {
    }

    public j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private j(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        b();
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        b();
    }

    public final boolean a() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        b();
        return z;
    }

    public final int c(int i) {
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        b();
        return i7;
    }

    private void b() {
        int i;
        int i2 = this.b;
        a.b(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }
}
