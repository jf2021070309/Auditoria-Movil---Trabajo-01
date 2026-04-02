package com.fyber.inneractive.sdk.player.c.a;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.Arrays;
/* loaded from: classes.dex */
final class j {
    final int a;
    final int b;
    short[] c;
    short[] d;
    int g;
    int h;
    int i;
    int j;
    private final int k;
    private final int l;
    private final int m;
    private final short[] n;
    private int o;
    private int p;
    private int q;
    private short[] r;
    private int v;
    private int w;
    private int x;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    float e = 1.0f;
    float f = 1.0f;

    public j(int i, int i2) {
        this.k = i;
        this.a = i2;
        this.l = i / 400;
        int i3 = i / 65;
        this.m = i3;
        int i4 = i3 * 2;
        this.b = i4;
        this.n = new short[i4];
        this.o = i4;
        this.c = new short[i4 * i2];
        this.p = i4;
        this.d = new short[i4 * i2];
        this.q = i4;
        this.r = new short[i4 * i2];
    }

    private void b(int i) {
        int i2 = this.h + i;
        int i3 = this.p;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.p = i4;
            this.d = Arrays.copyOf(this.d, i4 * this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int i2 = this.g + i;
        int i3 = this.o;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.o = i4;
            this.c = Arrays.copyOf(this.c, i4 * this.a);
        }
    }

    private void a(short[] sArr, int i, int i2) {
        b(i2);
        int i3 = this.a;
        System.arraycopy(sArr, i * i3, this.d, this.h * i3, i3 * i2);
        this.h += i2;
    }

    private void b(short[] sArr, int i, int i2) {
        int i3 = this.b / i2;
        int i4 = this.a;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.n[i7] = (short) (i8 / i5);
        }
    }

    private int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.a;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.w = i5 / i7;
        this.x = i8 / i6;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.h;
        float f = this.e / this.f;
        double d = f;
        int i8 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.c, 0, this.g);
            this.g = 0;
        } else {
            int i9 = this.g;
            if (i9 >= this.b) {
                int i10 = 0;
                while (true) {
                    int i11 = this.j;
                    if (i11 <= 0) {
                        short[] sArr = this.c;
                        int i12 = this.k;
                        int i13 = i12 > 4000 ? i12 / GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND : i8;
                        if (this.a == i8 && i13 == i8) {
                            i = a(sArr, i10, this.l, this.m);
                        } else {
                            b(sArr, i10, i13);
                            int a = a(this.n, 0, this.l / i13, this.m / i13);
                            if (i13 != i8) {
                                int i14 = a * i13;
                                int i15 = i13 * 4;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.l;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.m;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.a == i8) {
                                    i = a(sArr, i10, i16, i17);
                                } else {
                                    b(sArr, i10, i8);
                                    i = a(this.n, 0, i16, i17);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i20 = this.w;
                        int i21 = ((i20 == 0 || this.u == 0 || this.x > i20 * 3 || i20 * 2 <= this.v * 3) ? 0 : i8) != 0 ? this.u : i;
                        this.v = this.w;
                        this.u = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.c;
                            if (f >= 2.0f) {
                                i3 = (int) (i21 / (f - 1.0f));
                            } else {
                                this.j = (int) ((i21 * (2.0f - f)) / (f - 1.0f));
                                i3 = i21;
                            }
                            b(i3);
                            int i22 = i3;
                            a(i3, this.a, this.d, this.h, sArr2, i10, sArr2, i10 + i21);
                            this.h += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.c;
                            if (f < 0.5f) {
                                i2 = (int) ((i23 * f) / (1.0f - f));
                            } else {
                                this.j = (int) ((i23 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i2 = i23;
                            }
                            int i24 = i23 + i2;
                            b(i24);
                            int i25 = this.a;
                            System.arraycopy(sArr3, i10 * i25, this.d, this.h * i25, i25 * i23);
                            a(i2, this.a, this.d, this.h + i23, sArr3, i23 + i10, sArr3, i10);
                            this.h += i24;
                            i10 += i2;
                        }
                    } else {
                        int min = Math.min(this.b, i11);
                        a(this.c, i10, min);
                        this.j -= min;
                        i10 += min;
                    }
                    if (this.b + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.g - i10;
                short[] sArr4 = this.c;
                int i27 = this.a;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.g = i26;
            }
        }
        float f2 = this.f;
        if (f2 == 1.0f || this.h == i7) {
            return;
        }
        int i28 = this.k;
        int i29 = (int) (i28 / f2);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.h - i7;
        int i31 = this.i + i30;
        int i32 = this.q;
        if (i31 > i32) {
            int i33 = i32 + (i32 / 2) + i30;
            this.q = i33;
            this.r = Arrays.copyOf(this.r, i33 * this.a);
        }
        short[] sArr5 = this.d;
        int i34 = this.a;
        System.arraycopy(sArr5, i7 * i34, this.r, this.i * i34, i34 * i30);
        this.h = i7;
        this.i += i30;
        int i35 = 0;
        while (true) {
            i4 = this.i;
            if (i35 >= i4 - 1) {
                break;
            }
            while (true) {
                i5 = this.s;
                int i36 = (i5 + 1) * i29;
                i6 = this.t;
                if (i36 <= i6 * i28) {
                    break;
                }
                b(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.a;
                    if (i37 < i38) {
                        short[] sArr6 = this.r;
                        int i39 = (i35 * i38) + i37;
                        short s = sArr6[i39];
                        short s2 = sArr6[i39 + i38];
                        int i40 = this.s;
                        int i41 = i40 * i29;
                        int i42 = (i40 + 1) * i29;
                        int i43 = i42 - (this.t * i28);
                        int i44 = i42 - i41;
                        this.d[(this.h * i38) + i37] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i37++;
                    }
                }
                this.t++;
                this.h++;
            }
            int i45 = i5 + 1;
            this.s = i45;
            if (i45 == i28) {
                this.s = 0;
                com.fyber.inneractive.sdk.player.c.k.a.b(i6 == i29);
                this.t = 0;
            }
            i35++;
        }
        int i46 = i4 - 1;
        if (i46 != 0) {
            short[] sArr7 = this.r;
            int i47 = this.a;
            System.arraycopy(sArr7, i46 * i47, sArr7, 0, (i4 - i46) * i47);
            this.i -= i46;
        }
    }

    private static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
