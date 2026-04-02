package com.fyber.inneractive.sdk.player.c.d.e;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.l;
/* loaded from: classes.dex */
final class k {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean a(int i, com.fyber.inneractive.sdk.player.c.k.k kVar, boolean z) throws l {
        if (kVar.b() < 7) {
            if (z) {
                return false;
            }
            throw new l("too short header: " + kVar.b());
        } else if (kVar.d() != i) {
            if (z) {
                return false;
            }
            throw new l("expected header type " + Integer.toHexString(i));
        } else if (kVar.d() == 118 && kVar.d() == 111 && kVar.d() == 114 && kVar.d() == 98 && kVar.d() == 105 && kVar.d() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new l("expected characters 'vorbis'");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c[] a(i iVar) {
        int a2 = iVar.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i = 0; i < a2; i++) {
            cVarArr[i] = new c(iVar.a(), iVar.a(16), iVar.a(16), iVar.a(8));
        }
        return cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, i iVar) throws l {
        int a2 = iVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = iVar.a(16);
            if (a3 == 0) {
                int a4 = iVar.a() ? iVar.a(4) + 1 : 1;
                if (iVar.a()) {
                    int a5 = iVar.a(8) + 1;
                    for (int i3 = 0; i3 < a5; i3++) {
                        int i4 = i - 1;
                        iVar.b(a(i4));
                        iVar.b(a(i4));
                    }
                }
                if (iVar.a(2) != 0) {
                    throw new l("to reserved bits must be zero after mapping coupling steps");
                }
                if (a4 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        iVar.b(4);
                    }
                }
                for (int i6 = 0; i6 < a4; i6++) {
                    iVar.b(8);
                    iVar.b(8);
                    iVar.b(8);
                }
            } else {
                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + a3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(i iVar) throws l {
        int a2 = iVar.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            if (iVar.a(16) > 2) {
                throw new l("residueType greater than 2 is not decodable");
            }
            iVar.b(24);
            iVar.b(24);
            iVar.b(24);
            int a3 = iVar.a(6) + 1;
            iVar.b(8);
            int[] iArr = new int[a3];
            for (int i2 = 0; i2 < a3; i2++) {
                iArr[i2] = ((iVar.a() ? iVar.a(5) : 0) * 8) + iVar.a(3);
            }
            for (int i3 = 0; i3 < a3; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        iVar.b(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(i iVar) throws l {
        int a2 = iVar.a(6) + 1;
        for (int i = 0; i < a2; i++) {
            int a3 = iVar.a(16);
            if (a3 == 0) {
                iVar.b(8);
                iVar.b(16);
                iVar.b(16);
                iVar.b(6);
                iVar.b(8);
                int a4 = iVar.a(4) + 1;
                for (int i2 = 0; i2 < a4; i2++) {
                    iVar.b(8);
                }
            } else if (a3 == 1) {
                int a5 = iVar.a(5);
                int i3 = -1;
                int[] iArr = new int[a5];
                for (int i4 = 0; i4 < a5; i4++) {
                    iArr[i4] = iVar.a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = iVar.a(3) + 1;
                    int a6 = iVar.a(2);
                    if (a6 > 0) {
                        iVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << a6); i7++) {
                        iVar.b(8);
                    }
                }
                iVar.b(2);
                int a7 = iVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < a5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        iVar.b(a7);
                        i9++;
                    }
                }
            } else {
                throw new l("floor type greater than 1 not decodable: " + a3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final String[] b;
        public final int c;

        public b(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final long a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.a = j;
            this.b = i;
            this.c = j2;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = z;
            this.j = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }
}
