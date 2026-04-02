package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes.dex */
public final class k implements h {
    private final s a;
    private String b;
    private com.fyber.inneractive.sdk.player.c.d.n c;
    private a d;
    private boolean e;
    private long l;
    private long m;
    private final boolean[] f = new boolean[3];
    private final n g = new n(32);
    private final n h = new n(33);
    private final n i = new n(34);
    private final n j = new n(39);
    private final n k = new n(40);
    private final com.fyber.inneractive.sdk.player.c.k.k n = new com.fyber.inneractive.sdk.player.c.k.k();

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    public k(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        com.fyber.inneractive.sdk.player.c.k.i.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        a aVar = this.d;
        aVar.e = false;
        aVar.f = false;
        aVar.g = false;
        aVar.h = false;
        aVar.i = false;
        this.l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.b = dVar.c();
        this.c = hVar.a(dVar.b());
        this.d = new a(this.c);
        this.a.a(hVar, dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        this.m = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        long j;
        int i;
        byte[] bArr;
        int i2;
        float f;
        int i3;
        long j2;
        boolean z;
        while (kVar.b() > 0) {
            int i4 = kVar.b;
            int i5 = kVar.c;
            byte[] bArr2 = kVar.a;
            this.l += kVar.b();
            this.c.a(kVar, kVar.b());
            while (i4 < i5) {
                int a2 = com.fyber.inneractive.sdk.player.c.k.i.a(bArr2, i4, i5, this.f);
                if (a2 == i5) {
                    a(bArr2, i4, i5);
                    return;
                }
                int c = com.fyber.inneractive.sdk.player.c.k.i.c(bArr2, a2);
                int i6 = a2 - i4;
                if (i6 > 0) {
                    a(bArr2, i4, a2);
                }
                int i7 = i5 - a2;
                long j3 = this.l - i7;
                int i8 = i6 < 0 ? -i6 : 0;
                long j4 = this.m;
                if (this.e) {
                    a aVar = this.d;
                    if (aVar.i && aVar.f) {
                        aVar.l = aVar.b;
                        aVar.i = false;
                        i = i5;
                        bArr = bArr2;
                        i2 = a2;
                        j = j4;
                    } else {
                        if (aVar.g || aVar.f) {
                            j = j4;
                            if (aVar.h) {
                                aVar.a(((int) (j3 - aVar.a)) + i7);
                            }
                            aVar.j = aVar.a;
                            aVar.k = aVar.d;
                            aVar.h = true;
                            aVar.l = aVar.b;
                        } else {
                            j = j4;
                        }
                        i = i5;
                        bArr = bArr2;
                        i2 = a2;
                    }
                } else {
                    j = j4;
                    this.g.b(i8);
                    this.h.b(i8);
                    this.i.b(i8);
                    if (this.g.a && this.h.a && this.i.a) {
                        com.fyber.inneractive.sdk.player.c.d.n nVar = this.c;
                        String str = this.b;
                        n nVar2 = this.g;
                        n nVar3 = this.h;
                        n nVar4 = this.i;
                        byte[] bArr3 = new byte[nVar2.c + nVar3.c + nVar4.c];
                        i = i5;
                        bArr = bArr2;
                        System.arraycopy(nVar2.b, 0, bArr3, 0, nVar2.c);
                        i2 = a2;
                        System.arraycopy(nVar3.b, 0, bArr3, nVar2.c, nVar3.c);
                        System.arraycopy(nVar4.b, 0, bArr3, nVar2.c + nVar3.c, nVar4.c);
                        com.fyber.inneractive.sdk.player.c.k.l lVar = new com.fyber.inneractive.sdk.player.c.k.l(nVar3.b, 0, nVar3.c);
                        lVar.a(44);
                        int i9 = 3;
                        int c2 = lVar.c(3);
                        lVar.a();
                        lVar.a(88);
                        lVar.a(8);
                        int i10 = 0;
                        for (int i11 = 0; i11 < c2; i11++) {
                            if (lVar.b()) {
                                i10 += 89;
                            }
                            if (lVar.b()) {
                                i10 += 8;
                            }
                        }
                        lVar.a(i10);
                        int i12 = 2;
                        if (c2 > 0) {
                            lVar.a((8 - c2) * 2);
                        }
                        lVar.e();
                        int e = lVar.e();
                        if (e == 3) {
                            lVar.a();
                        }
                        int e2 = lVar.e();
                        int e3 = lVar.e();
                        if (lVar.b()) {
                            int e4 = lVar.e();
                            int e5 = lVar.e();
                            int e6 = lVar.e();
                            int e7 = lVar.e();
                            e2 -= ((e == 1 || e == 2) ? 2 : 1) * (e4 + e5);
                            e3 -= (e == 1 ? 2 : 1) * (e6 + e7);
                        }
                        int i13 = e2;
                        int i14 = e3;
                        lVar.e();
                        lVar.e();
                        int e8 = lVar.e();
                        for (int i15 = lVar.b() ? 0 : c2; i15 <= c2; i15++) {
                            lVar.e();
                            lVar.e();
                            lVar.e();
                        }
                        lVar.e();
                        lVar.e();
                        lVar.e();
                        lVar.e();
                        lVar.e();
                        lVar.e();
                        if (lVar.b() && lVar.b()) {
                            int i16 = 0;
                            for (int i17 = 4; i16 < i17; i17 = 4) {
                                for (int i18 = 0; i18 < 6; i18 += i16 == i9 ? i9 : 1) {
                                    if (lVar.b()) {
                                        int min = Math.min(64, 1 << ((i16 << 1) + 4));
                                        if (i16 > 1) {
                                            lVar.d();
                                        }
                                        for (int i19 = 0; i19 < min; i19++) {
                                            lVar.d();
                                        }
                                        i9 = 3;
                                    } else {
                                        lVar.e();
                                    }
                                }
                                i16++;
                                i12 = 2;
                            }
                        }
                        lVar.a(i12);
                        if (lVar.b()) {
                            lVar.a(8);
                            lVar.e();
                            lVar.e();
                            lVar.a();
                        }
                        int e9 = lVar.e();
                        int i20 = 0;
                        boolean z2 = false;
                        int i21 = 0;
                        while (i20 < e9) {
                            if (i20 != 0) {
                                z2 = lVar.b();
                            }
                            if (z2) {
                                lVar.a();
                                lVar.e();
                                for (int i22 = 0; i22 <= i21; i22++) {
                                    if (lVar.b()) {
                                        lVar.a();
                                    }
                                }
                                i3 = e9;
                            } else {
                                int e10 = lVar.e();
                                int e11 = lVar.e();
                                int i23 = e10 + e11;
                                i3 = e9;
                                for (int i24 = 0; i24 < e10; i24++) {
                                    lVar.e();
                                    lVar.a();
                                }
                                for (int i25 = 0; i25 < e11; i25++) {
                                    lVar.e();
                                    lVar.a();
                                }
                                i21 = i23;
                            }
                            i20++;
                            e9 = i3;
                        }
                        if (lVar.b()) {
                            for (int i26 = 0; i26 < lVar.e(); i26++) {
                                lVar.a(e8 + 4 + 1);
                            }
                        }
                        lVar.a(2);
                        float f2 = 1.0f;
                        if (lVar.b() && lVar.b()) {
                            int c3 = lVar.c(8);
                            if (c3 == 255) {
                                int c4 = lVar.c(16);
                                int c5 = lVar.c(16);
                                if (c4 != 0 && c5 != 0) {
                                    f2 = c4 / c5;
                                }
                            } else if (c3 < com.fyber.inneractive.sdk.player.c.k.i.b.length) {
                                f = com.fyber.inneractive.sdk.player.c.k.i.b[c3];
                                nVar.a(com.fyber.inneractive.sdk.player.c.h.a(str, "video/hevc", i13, i14, Collections.singletonList(bArr3), f));
                                this.e = true;
                            } else {
                                Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + c3);
                            }
                        }
                        f = f2;
                        nVar.a(com.fyber.inneractive.sdk.player.c.h.a(str, "video/hevc", i13, i14, Collections.singletonList(bArr3), f));
                        this.e = true;
                    }
                    i = i5;
                    bArr = bArr2;
                    i2 = a2;
                }
                if (this.j.b(i8)) {
                    this.n.a(this.j.b, com.fyber.inneractive.sdk.player.c.k.i.a(this.j.b, this.j.c));
                    this.n.d(5);
                    j2 = j;
                    this.a.a(j2, this.n);
                } else {
                    j2 = j;
                }
                if (this.k.b(i8)) {
                    this.n.a(this.k.b, com.fyber.inneractive.sdk.player.c.k.i.a(this.k.b, this.k.c));
                    this.n.d(5);
                    this.a.a(j2, this.n);
                }
                long j5 = this.m;
                if (this.e) {
                    a aVar2 = this.d;
                    aVar2.f = false;
                    aVar2.g = false;
                    aVar2.d = j5;
                    aVar2.c = 0;
                    aVar2.a = j3;
                    if (c >= 32) {
                        if (!aVar2.i && aVar2.h) {
                            aVar2.a(i7);
                            aVar2.h = false;
                        }
                        if (c <= 34) {
                            z = true;
                            aVar2.g = !aVar2.i;
                            aVar2.i = true;
                            aVar2.b = (c >= 16 || c > 21) ? false : z;
                            aVar2.e = (!aVar2.b || c <= 9) ? z : false;
                        }
                    }
                    z = true;
                    aVar2.b = (c >= 16 || c > 21) ? false : z;
                    aVar2.e = (!aVar2.b || c <= 9) ? z : false;
                } else {
                    this.g.a(c);
                    this.h.a(c);
                    this.i.a(c);
                }
                this.j.a(c);
                this.k.a(c);
                i4 = i2 + 3;
                i5 = i;
                bArr2 = bArr;
            }
        }
    }

    private void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            a aVar = this.d;
            if (aVar.e) {
                int i3 = (i + 2) - aVar.c;
                if (i3 < i2) {
                    aVar.f = (bArr[i3] & ByteCompanionObject.MIN_VALUE) != 0;
                    aVar.e = false;
                } else {
                    aVar.c += i2 - i;
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        long a;
        boolean b;
        int c;
        long d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        long j;
        long k;
        boolean l;
        private final com.fyber.inneractive.sdk.player.c.d.n m;

        public a(com.fyber.inneractive.sdk.player.c.d.n nVar) {
            this.m = nVar;
        }

        final void a(int i) {
            boolean z = this.l;
            this.m.a(this.k, z ? 1 : 0, (int) (this.a - this.j), i, null);
        }
    }
}
