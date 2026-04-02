package com.fyber.inneractive.sdk.player.c.k;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class i {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        public b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = z;
            this.f = z2;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = z3;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static int a(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    } else if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 < i) {
                    if (d.length <= i4) {
                        d = Arrays.copyOf(d, d.length * 2);
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

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & UByte.MAX_VALUE;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static b a(byte[] bArr, int i, int i2) {
        int e;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        float f;
        int i5;
        l lVar = new l(bArr, i, i2);
        lVar.a(8);
        int c2 = lVar.c(8);
        lVar.a(16);
        int e2 = lVar.e();
        if (c2 == 100 || c2 == 110 || c2 == 122 || c2 == 244 || c2 == 44 || c2 == 83 || c2 == 86 || c2 == 118 || c2 == 128 || c2 == 138) {
            e = lVar.e();
            boolean b2 = e == 3 ? lVar.b() : false;
            lVar.e();
            lVar.e();
            lVar.a();
            if (lVar.b()) {
                int i6 = e != 3 ? 8 : 12;
                int i7 = 0;
                while (i7 < i6) {
                    if (lVar.b()) {
                        int i8 = i7 < 6 ? 16 : 64;
                        int i9 = 8;
                        int i10 = 8;
                        for (int i11 = 0; i11 < i8; i11++) {
                            if (i9 != 0) {
                                i9 = ((lVar.d() + i10) + 256) % 256;
                            }
                            if (i9 != 0) {
                                i10 = i9;
                            }
                        }
                    }
                    i7++;
                }
            }
            z = b2;
        } else {
            z = false;
            e = 1;
        }
        int e3 = lVar.e() + 4;
        int e4 = lVar.e();
        if (e4 == 0) {
            i3 = e2;
            z2 = false;
            i4 = lVar.e() + 4;
        } else if (e4 == 1) {
            boolean b3 = lVar.b();
            lVar.d();
            lVar.d();
            long e5 = lVar.e();
            i3 = e2;
            for (int i12 = 0; i12 < e5; i12++) {
                lVar.e();
            }
            i4 = 0;
            z2 = b3;
        } else {
            i3 = e2;
            i4 = 0;
            z2 = false;
        }
        lVar.e();
        lVar.a();
        int e6 = lVar.e() + 1;
        boolean b4 = lVar.b();
        int e7 = (2 - (b4 ? 1 : 0)) * (lVar.e() + 1);
        if (!b4) {
            lVar.a();
        }
        lVar.a();
        int i13 = e6 * 16;
        int i14 = e7 * 16;
        if (lVar.b()) {
            int e8 = lVar.e();
            int e9 = lVar.e();
            int e10 = lVar.e();
            int e11 = lVar.e();
            if (e == 0) {
                i5 = 2 - (b4 ? 1 : 0);
            } else {
                int i15 = e == 3 ? 1 : 2;
                i5 = (2 - (b4 ? 1 : 0)) * (e == 1 ? 2 : 1);
                r7 = i15;
            }
            i13 -= (e8 + e9) * r7;
            i14 -= (e10 + e11) * i5;
        }
        int i16 = i13;
        int i17 = i14;
        float f2 = 1.0f;
        if (lVar.b() && lVar.b()) {
            int c3 = lVar.c(8);
            if (c3 == 255) {
                int c4 = lVar.c(16);
                int c5 = lVar.c(16);
                if (c4 != 0 && c5 != 0) {
                    f2 = c4 / c5;
                }
            } else {
                float[] fArr = b;
                if (c3 < fArr.length) {
                    f = fArr[c3];
                    return new b(i3, i16, i17, f, z, b4, e3, e4, i4, z2);
                }
                Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + c3);
            }
        }
        f = f2;
        return new b(i3, i16, i17, f, z, b4, e3, e4, i4, z2);
    }

    public static a d(byte[] bArr, int i) {
        l lVar = new l(bArr, 3, i);
        lVar.a(8);
        int e = lVar.e();
        int e2 = lVar.e();
        lVar.a();
        return new a(e, e2, lVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0096, code lost:
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.k.i.a(byte[], int, int, boolean[]):int");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
