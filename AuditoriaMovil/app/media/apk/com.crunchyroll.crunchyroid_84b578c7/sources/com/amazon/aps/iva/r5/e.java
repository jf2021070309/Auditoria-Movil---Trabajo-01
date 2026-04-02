package com.amazon.aps.iva.r5;

import com.google.android.gms.cast.MediaError;
import java.util.Arrays;
/* compiled from: Sonic.java */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public e(float f, int i, float f2, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int c(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d = f4;
        int i14 = (d > 1.00001d ? 1 : (d == 1.00001d ? 0 : -1));
        int i15 = this.a;
        int i16 = this.b;
        if (i14 <= 0 && d >= 0.99999d) {
            short[] sArr = this.j;
            int i17 = this.k;
            short[] b = b(this.l, i13, i17);
            this.l = b;
            System.arraycopy(sArr, 0 * i16, b, this.m * i16, i16 * i17);
            this.m += i17;
            this.k = 0;
        } else {
            int i18 = this.k;
            int i19 = this.h;
            if (i18 >= i19) {
                int i20 = 0;
                while (true) {
                    int i21 = this.r;
                    if (i21 > 0) {
                        int min = Math.min(i19, i21);
                        short[] sArr2 = this.j;
                        short[] b2 = b(this.l, this.m, min);
                        this.l = b2;
                        i = i13;
                        System.arraycopy(sArr2, i20 * i16, b2, this.m * i16, i16 * min);
                        this.m += min;
                        this.r -= min;
                        i20 += min;
                        f = f5;
                        i3 = i15;
                    } else {
                        i = i13;
                        short[] sArr3 = this.j;
                        if (i15 > 4000) {
                            i2 = i15 / 4000;
                        } else {
                            i2 = 1;
                        }
                        int i22 = this.g;
                        int i23 = this.f;
                        if (i16 == 1 && i2 == 1) {
                            i4 = c(sArr3, i20, i23, i22);
                            f = f5;
                            i3 = i15;
                        } else {
                            a(sArr3, i20, i2);
                            i3 = i15;
                            short[] sArr4 = this.i;
                            f = f5;
                            int c = c(sArr4, 0, i23 / i2, i22 / i2);
                            if (i2 != 1) {
                                int i24 = c * i2;
                                int i25 = i2 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                if (i26 >= i23) {
                                    i23 = i26;
                                }
                                if (i27 <= i22) {
                                    i22 = i27;
                                }
                                if (i16 == 1) {
                                    i4 = c(sArr3, i20, i23, i22);
                                } else {
                                    a(sArr3, i20, 1);
                                    i4 = c(sArr4, 0, i23, i22);
                                }
                            } else {
                                i4 = c;
                            }
                        }
                        int i28 = this.u;
                        int i29 = this.v;
                        if (i28 != 0 && this.s != 0 && i29 <= i28 * 3 && i28 * 2 > this.t * 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i5 = this.s;
                        } else {
                            i5 = i4;
                        }
                        this.t = i28;
                        this.s = i4;
                        if (d > 1.0d) {
                            short[] sArr5 = this.j;
                            if (f4 >= 2.0f) {
                                i7 = (int) (i5 / (f4 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f4) * i5) / (f4 - 1.0f));
                                i7 = i5;
                            }
                            short[] b3 = b(this.l, this.m, i7);
                            this.l = b3;
                            int i30 = i20;
                            d(i7, this.b, b3, this.m, sArr5, i30, sArr5, i20 + i5);
                            this.m += i7;
                            i20 = i5 + i7 + i30;
                        } else {
                            int i31 = i20;
                            short[] sArr6 = this.j;
                            if (f4 < 0.5f) {
                                i6 = (int) ((i5 * f4) / (1.0f - f4));
                            } else {
                                this.r = (int) ((((2.0f * f4) - 1.0f) * i5) / (1.0f - f4));
                                i6 = i5;
                            }
                            int i32 = i5 + i6;
                            short[] b4 = b(this.l, this.m, i32);
                            this.l = b4;
                            System.arraycopy(sArr6, i31 * i16, b4, this.m * i16, i16 * i5);
                            d(i6, this.b, this.l, this.m + i5, sArr6, i31 + i5, sArr6, i31);
                            this.m += i32;
                            i20 = i31 + i6;
                        }
                    }
                    if (i20 + i19 > i18) {
                        break;
                    }
                    i13 = i;
                    i15 = i3;
                    f5 = f;
                }
                int i33 = this.k - i20;
                short[] sArr7 = this.j;
                System.arraycopy(sArr7, i20 * i16, sArr7, 0, i16 * i33);
                this.k = i33;
                if (f == 1.0f && this.m != (i8 = i)) {
                    int i34 = i3;
                    int i35 = (int) (i34 / f);
                    int i36 = i34;
                    while (true) {
                        if (i35 <= 16384 && i36 <= 16384) {
                            break;
                        }
                        i35 /= 2;
                        i36 /= 2;
                    }
                    int i37 = this.m - i8;
                    short[] b5 = b(this.n, this.o, i37);
                    this.n = b5;
                    System.arraycopy(this.l, i8 * i16, b5, this.o * i16, i16 * i37);
                    this.m = i8;
                    this.o += i37;
                    int i38 = 0;
                    while (true) {
                        i9 = this.o;
                        i10 = i9 - 1;
                        if (i38 >= i10) {
                            break;
                        }
                        while (true) {
                            i11 = this.p + 1;
                            int i39 = i11 * i35;
                            i12 = this.q;
                            if (i39 <= i12 * i36) {
                                break;
                            }
                            this.l = b(this.l, this.m, 1);
                            for (int i40 = 0; i40 < i16; i40++) {
                                short[] sArr8 = this.n;
                                int i41 = (i38 * i16) + i40;
                                short s = sArr8[i41];
                                short s2 = sArr8[i41 + i16];
                                int i42 = this.p;
                                int i43 = i42 * i35;
                                int i44 = (i42 + 1) * i35;
                                int i45 = i44 - (this.q * i36);
                                int i46 = i44 - i43;
                                this.l[(this.m * i16) + i40] = (short) ((((i46 - i45) * s2) + (s * i45)) / i46);
                            }
                            this.q++;
                            this.m++;
                        }
                        this.p = i11;
                        if (i11 == i36) {
                            this.p = 0;
                            if (i12 == i35) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.amazon.aps.iva.cq.b.C(z2);
                            this.q = 0;
                        }
                        i38++;
                    }
                    if (i10 != 0) {
                        short[] sArr9 = this.n;
                        System.arraycopy(sArr9, i10 * i16, sArr9, 0, (i9 - i10) * i16);
                        this.o -= i10;
                        return;
                    }
                    return;
                }
            }
        }
        i = i13;
        f = f5;
        i3 = i15;
        if (f == 1.0f) {
        }
    }
}
