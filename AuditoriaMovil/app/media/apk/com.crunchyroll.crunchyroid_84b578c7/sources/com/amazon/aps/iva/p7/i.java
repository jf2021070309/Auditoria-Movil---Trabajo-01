package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.p7.h;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.h0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: VorbisReader.java */
/* loaded from: classes.dex */
public final class i extends h {
    public a n;
    public int o;
    public boolean p;
    public h0.c q;
    public h0.a r;

    /* compiled from: VorbisReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final h0.c a;
        public final h0.a b;
        public final byte[] c;
        public final h0.b[] d;
        public final int e;

        public a(h0.c cVar, h0.a aVar, byte[] bArr, h0.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @Override // com.amazon.aps.iva.p7.h
    public final void a(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        h0.c cVar = this.q;
        if (cVar != null) {
            i = cVar.e;
        }
        this.o = i;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final long b(v vVar) {
        int i;
        int i2 = 0;
        byte b = vVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        a aVar = this.n;
        com.amazon.aps.iva.cq.b.D(aVar);
        boolean z = aVar.d[(b >> 1) & (255 >>> (8 - aVar.e))].a;
        h0.c cVar = aVar.a;
        if (!z) {
            i = cVar.e;
        } else {
            i = cVar.f;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        long j = i2;
        byte[] bArr = vVar.a;
        int length = bArr.length;
        int i3 = vVar.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            vVar.D(copyOf.length, copyOf);
        } else {
            vVar.E(i3);
        }
        byte[] bArr2 = vVar.a;
        int i4 = vVar.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final boolean c(v vVar, long j, h.a aVar) throws IOException {
        a aVar2;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        if (this.n != null) {
            aVar.a.getClass();
            return false;
        }
        h0.c cVar = this.q;
        int i5 = 4;
        if (cVar == null) {
            h0.c(1, vVar, false);
            vVar.l();
            int u = vVar.u();
            int l = vVar.l();
            int h = vVar.h();
            if (h <= 0) {
                i3 = -1;
            } else {
                i3 = h;
            }
            int h2 = vVar.h();
            if (h2 <= 0) {
                i4 = -1;
            } else {
                i4 = h2;
            }
            vVar.h();
            int u2 = vVar.u();
            vVar.u();
            this.q = new h0.c(u, l, i3, i4, (int) Math.pow(2.0d, u2 & 15), (int) Math.pow(2.0d, (u2 & 240) >> 4), Arrays.copyOf(vVar.a, vVar.c));
        } else {
            h0.a aVar3 = this.r;
            if (aVar3 == null) {
                this.r = h0.b(vVar, true, true);
            } else {
                int i6 = vVar.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(vVar.a, 0, bArr, 0, i6);
                int i7 = 5;
                h0.c(5, vVar, false);
                int u3 = vVar.u() + 1;
                com.amazon.aps.iva.x.d dVar = new com.amazon.aps.iva.x.d(vVar.a);
                dVar.e(vVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 16;
                    if (i8 < u3) {
                        if (dVar.d(24) == 5653314) {
                            int d = dVar.d(16);
                            int d2 = dVar.d(24);
                            if (!dVar.c()) {
                                boolean c = dVar.c();
                                for (int i10 = 0; i10 < d2; i10++) {
                                    if (c) {
                                        if (dVar.c()) {
                                            dVar.e(i7);
                                        }
                                    } else {
                                        dVar.e(i7);
                                    }
                                }
                            } else {
                                dVar.e(i7);
                                int i11 = 0;
                                while (i11 < d2) {
                                    int i12 = 0;
                                    for (int i13 = d2 - i11; i13 > 0; i13 >>>= 1) {
                                        i12++;
                                    }
                                    i11 += dVar.d(i12);
                                }
                            }
                            int d3 = dVar.d(4);
                            if (d3 <= 2) {
                                if (d3 == 1 || d3 == 2) {
                                    dVar.e(32);
                                    dVar.e(32);
                                    int d4 = dVar.d(4) + 1;
                                    dVar.e(1);
                                    if (d3 == 1) {
                                        if (d != 0) {
                                            j2 = (long) Math.floor(Math.pow(d2, 1.0d / d));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = d * d2;
                                    }
                                    dVar.e((int) (j2 * d4));
                                }
                                i8++;
                                i7 = 5;
                            } else {
                                throw com.amazon.aps.iva.q5.h0.a("lookup type greater than 2 not decodable: " + d3, null);
                            }
                        } else {
                            throw com.amazon.aps.iva.q5.h0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((dVar.c * 8) + dVar.d), null);
                        }
                    } else {
                        int i14 = 6;
                        int d5 = dVar.d(6) + 1;
                        for (int i15 = 0; i15 < d5; i15++) {
                            if (dVar.d(16) != 0) {
                                throw com.amazon.aps.iva.q5.h0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int d6 = dVar.d(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < d6) {
                                int d7 = dVar.d(i9);
                                if (d7 != 0) {
                                    if (d7 == 1) {
                                        int d8 = dVar.d(5);
                                        int[] iArr = new int[d8];
                                        int i18 = -1;
                                        for (int i19 = 0; i19 < d8; i19++) {
                                            int d9 = dVar.d(i5);
                                            iArr[i19] = d9;
                                            if (d9 > i18) {
                                                i18 = d9;
                                            }
                                        }
                                        int i20 = i18 + 1;
                                        int[] iArr2 = new int[i20];
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            iArr2[i21] = dVar.d(i17) + 1;
                                            int d10 = dVar.d(2);
                                            int i22 = 8;
                                            if (d10 > 0) {
                                                dVar.e(8);
                                            }
                                            int i23 = i20;
                                            int i24 = 0;
                                            while (i24 < (1 << d10)) {
                                                dVar.e(i22);
                                                i24++;
                                                i22 = 8;
                                            }
                                            i21++;
                                            i20 = i23;
                                            i17 = 3;
                                        }
                                        dVar.e(2);
                                        int d11 = dVar.d(4);
                                        int i25 = 0;
                                        int i26 = 0;
                                        for (int i27 = 0; i27 < d8; i27++) {
                                            i25 += iArr2[iArr[i27]];
                                            while (i26 < i25) {
                                                dVar.e(d11);
                                                i26++;
                                            }
                                        }
                                    } else {
                                        throw com.amazon.aps.iva.q5.h0.a("floor type greater than 1 not decodable: " + d7, null);
                                    }
                                } else {
                                    int i28 = 8;
                                    dVar.e(8);
                                    dVar.e(16);
                                    dVar.e(16);
                                    dVar.e(6);
                                    dVar.e(8);
                                    int d12 = dVar.d(4) + 1;
                                    int i29 = 0;
                                    while (i29 < d12) {
                                        dVar.e(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                }
                                i16++;
                                i14 = 6;
                                i9 = 16;
                                i5 = 4;
                            } else {
                                int d13 = dVar.d(i14) + 1;
                                int i30 = 0;
                                while (i30 < d13) {
                                    if (dVar.d(16) <= 2) {
                                        dVar.e(24);
                                        dVar.e(24);
                                        dVar.e(24);
                                        int d14 = dVar.d(i14) + 1;
                                        int i31 = 8;
                                        dVar.e(8);
                                        int[] iArr3 = new int[d14];
                                        for (int i32 = 0; i32 < d14; i32++) {
                                            int d15 = dVar.d(3);
                                            if (dVar.c()) {
                                                i2 = dVar.d(5);
                                            } else {
                                                i2 = 0;
                                            }
                                            iArr3[i32] = (i2 * 8) + d15;
                                        }
                                        int i33 = 0;
                                        while (i33 < d14) {
                                            int i34 = 0;
                                            while (i34 < i31) {
                                                if ((iArr3[i33] & (1 << i34)) != 0) {
                                                    dVar.e(i31);
                                                }
                                                i34++;
                                                i31 = 8;
                                            }
                                            i33++;
                                            i31 = 8;
                                        }
                                        i30++;
                                        i14 = 6;
                                    } else {
                                        throw com.amazon.aps.iva.q5.h0.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int d16 = dVar.d(i14) + 1;
                                for (int i35 = 0; i35 < d16; i35++) {
                                    if (dVar.d(16) != 0) {
                                        p.c();
                                    } else {
                                        if (dVar.c()) {
                                            i = dVar.d(4) + 1;
                                        } else {
                                            i = 1;
                                        }
                                        boolean c2 = dVar.c();
                                        int i36 = cVar.a;
                                        if (c2) {
                                            int d17 = dVar.d(8) + 1;
                                            for (int i37 = 0; i37 < d17; i37++) {
                                                int i38 = i36 - 1;
                                                int i39 = 0;
                                                for (int i40 = i38; i40 > 0; i40 >>>= 1) {
                                                    i39++;
                                                }
                                                dVar.e(i39);
                                                int i41 = 0;
                                                while (i38 > 0) {
                                                    i41++;
                                                    i38 >>>= 1;
                                                }
                                                dVar.e(i41);
                                            }
                                        }
                                        if (dVar.d(2) == 0) {
                                            if (i > 1) {
                                                for (int i42 = 0; i42 < i36; i42++) {
                                                    dVar.e(4);
                                                }
                                            }
                                            for (int i43 = 0; i43 < i; i43++) {
                                                dVar.e(8);
                                                dVar.e(8);
                                                dVar.e(8);
                                            }
                                        } else {
                                            throw com.amazon.aps.iva.q5.h0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int d18 = dVar.d(6) + 1;
                                h0.b[] bVarArr = new h0.b[d18];
                                for (int i44 = 0; i44 < d18; i44++) {
                                    boolean c3 = dVar.c();
                                    dVar.d(16);
                                    dVar.d(16);
                                    dVar.d(8);
                                    bVarArr[i44] = new h0.b(c3);
                                }
                                if (dVar.c()) {
                                    int i45 = 0;
                                    for (int i46 = d18 - 1; i46 > 0; i46 >>>= 1) {
                                        i45++;
                                    }
                                    aVar2 = new a(cVar, aVar3, bArr, bVarArr, i45);
                                } else {
                                    throw com.amazon.aps.iva.q5.h0.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        h0.c cVar2 = aVar2.a;
        arrayList.add(cVar2.g);
        arrayList.add(aVar2.c);
        f0 a2 = h0.a(ImmutableList.copyOf(aVar2.b.a));
        v.a aVar4 = new v.a();
        aVar4.k = "audio/vorbis";
        aVar4.f = cVar2.d;
        aVar4.g = cVar2.c;
        aVar4.x = cVar2.a;
        aVar4.y = cVar2.b;
        aVar4.m = arrayList;
        aVar4.i = a2;
        aVar.a = new com.amazon.aps.iva.q5.v(aVar4);
        return true;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
