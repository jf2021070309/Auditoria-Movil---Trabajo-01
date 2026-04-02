package com.fyber.inneractive.sdk.player.c.d.e;

import kotlin.UByte;
/* loaded from: classes.dex */
final class i {
    int a;
    int b;
    private final byte[] c;
    private final int d;

    public i(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.c[this.a] & UByte.MAX_VALUE) >> this.b) & 1) == 1;
        b(1);
        return z;
    }

    public final int a(int i) {
        int i2 = this.a;
        int min = Math.min(i, 8 - this.b);
        int i3 = i2 + 1;
        int i4 = ((this.c[i2] & UByte.MAX_VALUE) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.c[i3] & UByte.MAX_VALUE) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }

    public final void b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.a + i3;
        this.a = i4;
        int i5 = this.b + (i - (i3 * 8));
        this.b = i5;
        boolean z = true;
        if (i5 > 7) {
            this.a = i4 + 1;
            this.b = i5 - 8;
        }
        int i6 = this.a;
        if (i6 < 0 || (i6 >= (i2 = this.d) && (i6 != i2 || this.b != 0))) {
            z = false;
        }
        com.fyber.inneractive.sdk.player.c.k.a.b(z);
    }
}
