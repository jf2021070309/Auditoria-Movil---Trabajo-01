package com.amazon.aps.iva.u5;

import com.amazon.aps.iva.q5.n;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.u;
import java.util.Arrays;
/* compiled from: NalUnitUtil.java */
/* loaded from: classes.dex */
public final class d {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;
        public final int g;
        public final int h;
        public final float i;
        public final int j;
        public final int k;
        public final int l;

        public a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, float f, int i7, int i8, int i9) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = f;
            this.j = i7;
            this.k = i8;
            this.l = i9;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final boolean b;

        public b(int i, int i2, boolean z) {
            this.a = i2;
            this.b = z;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;
        public final int n;
        public final int o;
        public final int p;

        public c(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3, int i10, int i11, int i12) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = z;
            this.i = z2;
            this.j = i7;
            this.k = i8;
            this.l = i9;
            this.m = z3;
            this.n = i10;
            this.o = i11;
            this.p = i12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !zArr[2] || bArr[i2 - 2] != 0 || bArr[i4] != 1 : bArr[i2 - 3] != 0 || bArr[i2 - 2] != 0 || bArr[i4] != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : !(bArr[i2 - 2] != 0 || bArr[i4] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        }
    }

    public static a c(int i, byte[] bArr, int i2) {
        boolean z;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u uVar = new u(bArr, i + 2, i2);
        int i19 = 4;
        uVar.r(4);
        int i20 = uVar.i(3);
        uVar.q();
        int i21 = uVar.i(2);
        boolean h = uVar.h();
        int i22 = uVar.i(5);
        int i23 = 0;
        int i24 = 0;
        while (true) {
            z = true;
            if (i24 >= 32) {
                break;
            }
            if (uVar.h()) {
                i23 |= 1 << i24;
            }
            i24++;
        }
        int i25 = 6;
        int[] iArr2 = new int[6];
        for (int i26 = 0; i26 < 6; i26++) {
            iArr2[i26] = uVar.i(8);
        }
        int i27 = uVar.i(8);
        int i28 = 0;
        for (int i29 = 0; i29 < i20; i29++) {
            if (uVar.h()) {
                i28 += 89;
            }
            if (uVar.h()) {
                i28 += 8;
            }
        }
        uVar.r(i28);
        if (i20 > 0) {
            uVar.r((8 - i20) * 2);
        }
        uVar.l();
        int l = uVar.l();
        if (l == 3) {
            uVar.q();
        }
        int l2 = uVar.l();
        int l3 = uVar.l();
        if (uVar.h()) {
            int l4 = uVar.l();
            int l5 = uVar.l();
            int l6 = uVar.l();
            int l7 = uVar.l();
            if (l != 1 && l != 2) {
                i17 = 1;
            } else {
                i17 = 2;
            }
            if (l == 1) {
                i18 = 2;
            } else {
                i18 = 1;
            }
            l2 -= (l4 + l5) * i17;
            l3 -= (l6 + l7) * i18;
        }
        uVar.l();
        uVar.l();
        int l8 = uVar.l();
        if (uVar.h()) {
            i3 = 0;
        } else {
            i3 = i20;
        }
        for (int i30 = i3; i30 <= i20; i30++) {
            uVar.l();
            uVar.l();
            uVar.l();
        }
        uVar.l();
        uVar.l();
        uVar.l();
        uVar.l();
        uVar.l();
        uVar.l();
        if (uVar.h() && uVar.h()) {
            int i31 = 0;
            while (i31 < i19) {
                int i32 = 0;
                while (i32 < i25) {
                    if (!uVar.h()) {
                        uVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i31 << 1) + 4));
                        if (i31 > 1) {
                            uVar.m();
                        }
                        for (int i33 = 0; i33 < min; i33++) {
                            uVar.m();
                        }
                    }
                    if (i31 == 3) {
                        i16 = 3;
                    } else {
                        i16 = 1;
                    }
                    i32 += i16;
                    i25 = 6;
                }
                i31++;
                i19 = 4;
                i25 = 6;
            }
        }
        uVar.r(2);
        if (uVar.h()) {
            uVar.r(8);
            uVar.l();
            uVar.l();
            uVar.q();
        }
        int l9 = uVar.l();
        int i34 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        while (i34 < l9) {
            if (i34 != 0 && uVar.h()) {
                z2 = z;
            } else {
                z2 = false;
            }
            if (z2) {
                int i38 = i37 + i36;
                int l10 = (1 - ((uVar.h() ? 1 : 0) * 2)) * (uVar.l() + 1);
                i10 = l9;
                int i39 = i38 + 1;
                i13 = l2;
                boolean[] zArr = new boolean[i39];
                i12 = i27;
                for (int i40 = 0; i40 <= i38; i40++) {
                    if (!uVar.h()) {
                        zArr[i40] = uVar.h();
                    } else {
                        zArr[i40] = true;
                    }
                }
                int[] iArr5 = new int[i39];
                int[] iArr6 = new int[i39];
                int i41 = 0;
                for (int i42 = i36 - 1; i42 >= 0; i42--) {
                    int i43 = iArr4[i42] + l10;
                    if (i43 < 0 && zArr[i37 + i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                if (l10 < 0 && zArr[i38]) {
                    iArr5[i41] = l10;
                    i41++;
                }
                iArr = iArr2;
                int i44 = i41;
                i11 = i23;
                for (int i45 = 0; i45 < i37; i45++) {
                    int i46 = iArr3[i45] + l10;
                    if (i46 < 0 && zArr[i45]) {
                        iArr5[i44] = i46;
                        i44++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i44);
                int i47 = 0;
                for (int i48 = i37 - 1; i48 >= 0; i48--) {
                    int i49 = iArr3[i48] + l10;
                    if (i49 > 0 && zArr[i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                if (l10 > 0 && zArr[i38]) {
                    iArr6[i47] = l10;
                    i47++;
                }
                int i50 = i47;
                for (int i51 = 0; i51 < i36; i51++) {
                    int i52 = iArr4[i51] + l10;
                    if (i52 > 0 && zArr[i37 + i51]) {
                        iArr6[i50] = i52;
                        i50++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i50);
                i36 = i50;
                i37 = i44;
                iArr3 = copyOf;
            } else {
                i10 = l9;
                i11 = i23;
                iArr = iArr2;
                i12 = i27;
                i13 = l2;
                int l11 = uVar.l();
                int l12 = uVar.l();
                int[] iArr7 = new int[l11];
                for (int i53 = 0; i53 < l11; i53++) {
                    if (i53 > 0) {
                        i15 = iArr7[i53 - 1];
                    } else {
                        i15 = 0;
                    }
                    iArr7[i53] = i15 - (uVar.l() + 1);
                    uVar.q();
                }
                int[] iArr8 = new int[l12];
                for (int i54 = 0; i54 < l12; i54++) {
                    if (i54 > 0) {
                        i14 = iArr8[i54 - 1];
                    } else {
                        i14 = 0;
                    }
                    iArr8[i54] = uVar.l() + 1 + i14;
                    uVar.q();
                }
                iArr3 = iArr7;
                iArr4 = iArr8;
                i37 = l11;
                i36 = l12;
            }
            i34++;
            l9 = i10;
            l2 = i13;
            i27 = i12;
            iArr2 = iArr;
            i23 = i11;
            z = true;
        }
        int i55 = i23;
        int[] iArr9 = iArr2;
        int i56 = i27;
        int i57 = l2;
        if (uVar.h()) {
            int l13 = uVar.l();
            for (int i58 = 0; i58 < l13; i58++) {
                uVar.r(l8 + 4 + 1);
            }
        }
        int i59 = 2;
        uVar.r(2);
        float f2 = 1.0f;
        if (uVar.h()) {
            if (uVar.h()) {
                int i60 = uVar.i(8);
                if (i60 == 255) {
                    int i61 = uVar.i(16);
                    int i62 = uVar.i(16);
                    if (i61 != 0 && i62 != 0) {
                        f2 = i61 / i62;
                    }
                } else if (i60 < 17) {
                    f2 = b[i60];
                } else {
                    p.g();
                }
            }
            if (uVar.h()) {
                uVar.q();
            }
            if (uVar.h()) {
                uVar.r(3);
                if (uVar.h()) {
                    i59 = 1;
                }
                if (uVar.h()) {
                    int i63 = uVar.i(8);
                    int i64 = uVar.i(8);
                    uVar.r(8);
                    int b2 = n.b(i63);
                    i9 = n.c(i64);
                    i35 = i59;
                    i8 = b2;
                } else {
                    i9 = -1;
                    i35 = i59;
                    i8 = -1;
                }
            } else {
                i8 = -1;
                i9 = -1;
            }
            if (uVar.h()) {
                uVar.l();
                uVar.l();
            }
            uVar.q();
            if (uVar.h()) {
                l3 *= 2;
            }
            i5 = i8;
            i7 = i9;
            f = f2;
            i4 = l3;
            i6 = i35;
        } else {
            f = 1.0f;
            i4 = l3;
            i5 = -1;
            i6 = -1;
            i7 = -1;
        }
        return new a(i21, h, i22, i55, iArr9, i56, i57, i4, f, i5, i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.u5.d.c d(int r22, byte[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u5.d.d(int, byte[], int):com.amazon.aps.iva.u5.d$c");
    }

    public static int e(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
