package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class DefaultPlacement {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        this.d = new byte[i * i2];
        Arrays.fill(this.d, (byte) -1);
    }

    public final boolean getBit(int i, int i2) {
        return this.d[(this.c * i2) + i] == 1;
    }

    private void a(int i, int i2, boolean z) {
        this.d[(this.c * i2) + i] = (byte) (z ? 1 : 0);
    }

    private boolean a(int i, int i2) {
        return this.d[(this.c * i2) + i] >= 0;
    }

    public final void place() {
        int i;
        int i2 = 0;
        int i3 = 4;
        int i4 = 0;
        while (true) {
            if (i3 == this.b && i2 == 0) {
                a(i4);
                i4++;
            }
            if (i3 == this.b - 2 && i2 == 0 && this.c % 4 != 0) {
                b(i4);
                i4++;
            }
            if (i3 == this.b - 2 && i2 == 0 && this.c % 8 == 4) {
                c(i4);
                i4++;
            }
            if (i3 == this.b + 4 && i2 == 2 && this.c % 8 == 0) {
                d(i4);
                i4++;
            }
            do {
                if (i3 < this.b && i2 >= 0 && !a(i2, i3)) {
                    a(i3, i2, i4);
                    i4++;
                }
                i3 -= 2;
                i2 += 2;
                if (i3 < 0) {
                    break;
                }
            } while (i2 < this.c);
            int i5 = i3 + 1;
            int i6 = i2 + 3;
            int i7 = i4;
            while (true) {
                if (i5 < 0 || i6 >= this.c || a(i6, i5)) {
                    i4 = i7;
                } else {
                    i4 = i7 + 1;
                    a(i5, i6, i7);
                }
                i5 += 2;
                i = i6 - 2;
                if (i5 >= this.b || i < 0) {
                    break;
                }
                i6 = i;
                i7 = i4;
            }
            i3 = i5 + 3;
            i2 = i + 1;
            if (i3 >= this.b && i2 >= this.c) {
                break;
            }
        }
        if (!a(this.c - 1, this.b - 1)) {
            a(this.c - 1, this.b - 1, true);
            a(this.c - 2, this.b - 2, true);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i < 0) {
            i6 = i + this.b;
            i5 = (4 - ((this.b + 4) % 8)) + i2;
        } else {
            i5 = i2;
            i6 = i;
        }
        if (i5 < 0) {
            i5 += this.c;
            i6 += 4 - ((this.c + 4) % 8);
        }
        a(i5, i6, (this.a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void a(int i, int i2, int i3) {
        a(i - 2, i2 - 2, i3, 1);
        a(i - 2, i2 - 1, i3, 2);
        a(i - 1, i2 - 2, i3, 3);
        a(i - 1, i2 - 1, i3, 4);
        a(i - 1, i2, i3, 5);
        a(i, i2 - 2, i3, 6);
        a(i, i2 - 1, i3, 7);
        a(i, i2, i3, 8);
    }

    private void a(int i) {
        a(this.b - 1, 0, i, 1);
        a(this.b - 1, 1, i, 2);
        a(this.b - 1, 2, i, 3);
        a(0, this.c - 2, i, 4);
        a(0, this.c - 1, i, 5);
        a(1, this.c - 1, i, 6);
        a(2, this.c - 1, i, 7);
        a(3, this.c - 1, i, 8);
    }

    private void b(int i) {
        a(this.b - 3, 0, i, 1);
        a(this.b - 2, 0, i, 2);
        a(this.b - 1, 0, i, 3);
        a(0, this.c - 4, i, 4);
        a(0, this.c - 3, i, 5);
        a(0, this.c - 2, i, 6);
        a(0, this.c - 1, i, 7);
        a(1, this.c - 1, i, 8);
    }

    private void c(int i) {
        a(this.b - 3, 0, i, 1);
        a(this.b - 2, 0, i, 2);
        a(this.b - 1, 0, i, 3);
        a(0, this.c - 2, i, 4);
        a(0, this.c - 1, i, 5);
        a(1, this.c - 1, i, 6);
        a(2, this.c - 1, i, 7);
        a(3, this.c - 1, i, 8);
    }

    private void d(int i) {
        a(this.b - 1, 0, i, 1);
        a(this.b - 1, this.c - 1, i, 2);
        a(0, this.c - 3, i, 3);
        a(0, this.c - 2, i, 4);
        a(0, this.c - 1, i, 5);
        a(1, this.c - 3, i, 6);
        a(1, this.c - 2, i, 7);
        a(1, this.c - 1, i, 8);
    }
}
