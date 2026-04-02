package com.fyber.inneractive.sdk.player.c.k;

import kotlin.UByte;
/* loaded from: classes.dex */
public final class l {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public l(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        f();
    }

    public final void a() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (d(i2 + 1) ? 2 : 1);
        }
        f();
    }

    public final void a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (d(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                f();
                return;
            }
        }
    }

    public final boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            } else if (d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean b() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        a();
        return z;
    }

    public final int c(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = this.a;
            int i5 = this.c;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
            if (!d(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (d(i6 + 1) ? 2 : 1);
        }
        f();
        return i7;
    }

    public final boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !b()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        return !z && b((i3 * 2) + 1);
    }

    public final int d() {
        int e = e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    public final int e() {
        int i = 0;
        while (!b()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? c(i) : 0);
    }

    private boolean d(int i) {
        if (2 > i || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private void f() {
        int i;
        int i2 = this.c;
        a.b(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }
}
