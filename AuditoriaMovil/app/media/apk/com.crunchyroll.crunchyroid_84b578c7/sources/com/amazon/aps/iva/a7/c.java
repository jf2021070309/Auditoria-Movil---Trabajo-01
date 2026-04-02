package com.amazon.aps.iva.a7;

import com.amazon.aps.iva.i7.g;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.u;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.c0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import com.amazon.aps.iva.x6.t;
import com.amazon.aps.iva.x6.w;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: FlacExtractor.java */
/* loaded from: classes.dex */
public final class c implements n {
    public p e;
    public f0 f;
    public com.amazon.aps.iva.q5.f0 h;
    public w i;
    public int j;
    public int k;
    public a l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final v b = new v(new byte[32768], 0);
    public final boolean c = false;
    public final t.a d = new t.a();
    public int g = 0;

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        i iVar = (i) oVar;
        com.amazon.aps.iva.g1.n nVar = g.b;
        v vVar = new v(10);
        com.amazon.aps.iva.q5.f0 f0Var = null;
        int i = 0;
        while (true) {
            try {
                iVar.c(vVar.a, 0, 10, false);
                vVar.F(0);
                if (vVar.w() != 4801587) {
                    break;
                }
                vVar.G(3);
                int t = vVar.t();
                int i2 = t + 10;
                if (f0Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(vVar.a, 0, bArr, 0, 10);
                    iVar.c(bArr, 10, t, false);
                    f0Var = new g(nVar).s(i2, bArr);
                } else {
                    iVar.m(t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iVar.f = 0;
        iVar.m(i, false);
        if (f0Var != null) {
            int length = f0Var.b.length;
        }
        v vVar2 = new v(4);
        iVar.c(vVar2.a, 0, 4, false);
        if (vVar2.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.c(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.n = j3;
        this.m = 0;
        this.b.C(0);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.e = pVar;
        this.f = pVar.r(0, 1);
        pVar.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    @Override // com.amazon.aps.iva.x6.n
    public final int h(o oVar, c0 c0Var) throws IOException {
        com.amazon.aps.iva.g1.n nVar;
        ?? r15;
        boolean z;
        w wVar;
        com.amazon.aps.iva.q5.f0 f0Var;
        d0 bVar;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.g;
        com.amazon.aps.iva.q5.f0 f0Var2 = null;
        boolean z5 = true;
        ?? r5 = 0;
        if (i != 0) {
            byte[] bArr = this.a;
            if (i != 1) {
                int i2 = 4;
                if (i != 2) {
                    int i3 = 7;
                    if (i != 3) {
                        long j2 = 0;
                        if (i != 4) {
                            if (i == 5) {
                                this.f.getClass();
                                this.i.getClass();
                                a aVar = this.l;
                                if (aVar != null) {
                                    if (aVar.c != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        return aVar.a((i) oVar, c0Var);
                                    }
                                }
                                if (this.n == -1) {
                                    w wVar2 = this.i;
                                    i iVar = (i) oVar;
                                    iVar.f = 0;
                                    iVar.m(1, false);
                                    byte[] bArr2 = new byte[1];
                                    iVar.c(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    iVar.m(2, false);
                                    if (!z3) {
                                        i3 = 6;
                                    }
                                    v vVar = new v(i3);
                                    byte[] bArr3 = vVar.a;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        int o = iVar.o(0 + i4, bArr3, i3 - i4);
                                        if (o == -1) {
                                            break;
                                        }
                                        i4 += o;
                                    }
                                    vVar.E(i4);
                                    iVar.f = 0;
                                    try {
                                        j2 = vVar.A();
                                        if (!z3) {
                                            j2 *= wVar2.b;
                                        }
                                    } catch (NumberFormatException unused) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        this.n = j2;
                                        return 0;
                                    }
                                    throw h0.a(null, null);
                                }
                                v vVar2 = this.b;
                                int i5 = vVar2.c;
                                if (i5 < 32768) {
                                    int l = ((i) oVar).l(vVar2.a, i5, 32768 - i5);
                                    if (l != -1) {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        vVar2.E(i5 + l);
                                    } else if (vVar2.c - vVar2.b == 0) {
                                        w wVar3 = this.i;
                                        int i6 = g0.a;
                                        this.f.d((this.n * 1000000) / wVar3.e, 1, this.m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z5 = false;
                                }
                                int i7 = vVar2.b;
                                int i8 = this.m;
                                int i9 = this.j;
                                if (i8 < i9) {
                                    vVar2.G(Math.min(i9 - i8, vVar2.c - i7));
                                }
                                this.i.getClass();
                                int i10 = vVar2.b;
                                while (true) {
                                    int i11 = vVar2.c - 16;
                                    t.a aVar2 = this.d;
                                    if (i10 <= i11) {
                                        vVar2.F(i10);
                                        if (t.a(vVar2, this.i, this.k, aVar2)) {
                                            vVar2.F(i10);
                                            j = aVar2.a;
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        if (z5) {
                                            while (true) {
                                                int i12 = vVar2.c;
                                                if (i10 <= i12 - this.j) {
                                                    vVar2.F(i10);
                                                    try {
                                                        z2 = t.a(vVar2, this.i, this.k, aVar2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z2 = false;
                                                    }
                                                    if (vVar2.b > vVar2.c) {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        vVar2.F(i10);
                                                        j = aVar2.a;
                                                        break;
                                                    }
                                                    i10++;
                                                } else {
                                                    vVar2.F(i12);
                                                    break;
                                                }
                                            }
                                        } else {
                                            vVar2.F(i10);
                                        }
                                        j = -1;
                                    }
                                }
                                int i13 = vVar2.b - i7;
                                vVar2.F(i7);
                                this.f.a(i13, vVar2);
                                int i14 = this.m + i13;
                                this.m = i14;
                                if (j != -1) {
                                    w wVar4 = this.i;
                                    int i15 = g0.a;
                                    this.f.d((this.n * 1000000) / wVar4.e, 1, i14, 0, null);
                                    this.m = 0;
                                    this.n = j;
                                }
                                int i16 = vVar2.c;
                                int i17 = vVar2.b;
                                int i18 = i16 - i17;
                                if (i18 >= 16) {
                                    return 0;
                                }
                                byte[] bArr4 = vVar2.a;
                                System.arraycopy(bArr4, i17, bArr4, 0, i18);
                                vVar2.F(0);
                                vVar2.E(i18);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        i iVar2 = (i) oVar;
                        iVar2.f = 0;
                        v vVar3 = new v(2);
                        iVar2.c(vVar3.a, 0, 2, false);
                        int z6 = vVar3.z();
                        if ((z6 >> 2) == 16382) {
                            iVar2.f = 0;
                            this.k = z6;
                            p pVar = this.e;
                            int i19 = g0.a;
                            long j3 = iVar2.d;
                            long j4 = iVar2.c;
                            this.i.getClass();
                            w wVar5 = this.i;
                            if (wVar5.k != null) {
                                bVar = new com.amazon.aps.iva.x6.v(wVar5, j3);
                            } else if (j4 != -1 && wVar5.j > 0) {
                                a aVar3 = new a(wVar5, this.k, j3, j4);
                                this.l = aVar3;
                                bVar = aVar3.a;
                            } else {
                                bVar = new d0.b(wVar5.b());
                            }
                            pVar.m(bVar);
                            this.g = 5;
                            return 0;
                        }
                        iVar2.f = 0;
                        throw h0.a("First frame does not start with sync code.", null);
                    }
                    w wVar6 = this.i;
                    boolean z7 = false;
                    while (!z7) {
                        i iVar3 = (i) oVar;
                        iVar3.f = r5;
                        u uVar = new u(new byte[i2]);
                        iVar3.c(uVar.b, r5, i2, r5);
                        boolean h = uVar.h();
                        int i20 = uVar.i(i3);
                        int i21 = uVar.i(24) + i2;
                        if (i20 == 0) {
                            byte[] bArr5 = new byte[38];
                            iVar3.f(bArr5, r5, 38, r5);
                            wVar6 = new w(bArr5, i2);
                            z = h;
                        } else if (wVar6 != null) {
                            if (i20 == 3) {
                                v vVar4 = new v(i21);
                                iVar3.f(vVar4.a, r5, i21, r5);
                                z = h;
                                wVar = new w(wVar6.a, wVar6.b, wVar6.c, wVar6.d, wVar6.e, wVar6.g, wVar6.h, wVar6.j, com.amazon.aps.iva.x6.u.a(vVar4), wVar6.l);
                            } else {
                                z = h;
                                com.amazon.aps.iva.q5.f0 f0Var3 = wVar6.l;
                                if (i20 == i2) {
                                    v vVar5 = new v(i21);
                                    iVar3.f(vVar5.a, 0, i21, false);
                                    vVar5.G(i2);
                                    com.amazon.aps.iva.q5.f0 a = com.amazon.aps.iva.x6.h0.a(Arrays.asList(com.amazon.aps.iva.x6.h0.b(vVar5, false, false).a));
                                    if (f0Var3 == null) {
                                        f0Var = a;
                                    } else {
                                        if (a != null) {
                                            f0Var3 = f0Var3.a(a.b);
                                        }
                                        f0Var = f0Var3;
                                    }
                                    wVar = new w(wVar6.a, wVar6.b, wVar6.c, wVar6.d, wVar6.e, wVar6.g, wVar6.h, wVar6.j, wVar6.k, f0Var);
                                } else if (i20 == 6) {
                                    v vVar6 = new v(i21);
                                    iVar3.f(vVar6.a, 0, i21, false);
                                    vVar6.G(4);
                                    com.amazon.aps.iva.q5.f0 f0Var4 = new com.amazon.aps.iva.q5.f0(ImmutableList.of(com.amazon.aps.iva.g7.a.a(vVar6)));
                                    if (f0Var3 != null) {
                                        f0Var4 = f0Var3.a(f0Var4.b);
                                    }
                                    wVar = new w(wVar6.a, wVar6.b, wVar6.c, wVar6.d, wVar6.e, wVar6.g, wVar6.h, wVar6.j, wVar6.k, f0Var4);
                                } else {
                                    iVar3.k(i21);
                                }
                            }
                            wVar6 = wVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i22 = g0.a;
                        this.i = wVar6;
                        z7 = z;
                        r5 = 0;
                        i2 = 4;
                        i3 = 7;
                    }
                    this.i.getClass();
                    this.j = Math.max(this.i.c, 6);
                    f0 f0Var5 = this.f;
                    int i23 = g0.a;
                    f0Var5.c(this.i.c(bArr, this.h));
                    this.g = 4;
                    return 0;
                }
                v vVar7 = new v(4);
                ((i) oVar).f(vVar7.a, 0, 4, false);
                if (vVar7.v() == 1716281667) {
                    this.g = 3;
                    return 0;
                }
                throw h0.a("Failed to read FLAC stream marker.", null);
            }
            i iVar4 = (i) oVar;
            iVar4.c(bArr, 0, bArr.length, false);
            iVar4.f = 0;
            this.g = 2;
            return 0;
        }
        boolean z8 = !this.c;
        i iVar5 = (i) oVar;
        iVar5.f = 0;
        long h2 = iVar5.h();
        if (z8) {
            nVar = null;
        } else {
            nVar = g.b;
        }
        v vVar8 = new v(10);
        com.amazon.aps.iva.q5.f0 f0Var6 = null;
        int i24 = 0;
        while (true) {
            try {
                try {
                    iVar5.c(vVar8.a, 0, 10, false);
                    vVar8.F(0);
                    if (vVar8.w() != 4801587) {
                        break;
                    }
                    vVar8.G(3);
                    int t = vVar8.t();
                    int i25 = t + 10;
                    if (f0Var6 == null) {
                        byte[] bArr6 = new byte[i25];
                        System.arraycopy(vVar8.a, 0, bArr6, 0, 10);
                        iVar5.c(bArr6, 10, t, false);
                        f0Var6 = new g(nVar).s(i25, bArr6);
                    } else {
                        iVar5.m(t, false);
                    }
                    i24 += i25;
                } catch (EOFException unused3) {
                    r15 = 0;
                }
            } catch (EOFException unused4) {
            }
        }
        r15 = 0;
        iVar5.f = r15;
        iVar5.m(i24, r15);
        if (f0Var6 != null && f0Var6.b.length != 0) {
            f0Var2 = f0Var6;
        }
        iVar5.k((int) (iVar5.h() - h2));
        this.h = f0Var2;
        this.g = 1;
        return 0;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
