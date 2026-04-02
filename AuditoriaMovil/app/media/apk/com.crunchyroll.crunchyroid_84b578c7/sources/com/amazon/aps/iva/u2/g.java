package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.u2.e;
import java.util.ArrayList;
/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class g extends l {
    public e[] c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList<a> Y0 = new ArrayList<>();
    public e[] Z0 = null;
    public e[] a1 = null;
    public int[] b1 = null;
    public int d1 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {
        public int a;
        public d d;
        public d e;
        public d f;
        public d g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public e b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, d dVar, d dVar2, d dVar3, d dVar4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = dVar;
            this.e = dVar2;
            this.f = dVar3;
            this.g = dVar4;
            this.h = g.this.y0;
            this.i = g.this.u0;
            this.j = g.this.z0;
            this.k = g.this.v0;
            this.q = i2;
        }

        public final void a(e eVar) {
            int i = this.a;
            int i2 = 0;
            g gVar = g.this;
            if (i == 0) {
                int V = gVar.V(this.q, eVar);
                if (eVar.V[0] == e.b.MATCH_CONSTRAINT) {
                    this.p++;
                    V = 0;
                }
                int i3 = gVar.R0;
                if (eVar.j0 != 8) {
                    i2 = i3;
                }
                this.l = V + i2 + this.l;
                int U = gVar.U(this.q, eVar);
                if (this.b == null || this.c < U) {
                    this.b = eVar;
                    this.c = U;
                    this.m = U;
                }
            } else {
                int V2 = gVar.V(this.q, eVar);
                int U2 = gVar.U(this.q, eVar);
                if (eVar.V[1] == e.b.MATCH_CONSTRAINT) {
                    this.p++;
                    U2 = 0;
                }
                int i4 = gVar.S0;
                if (eVar.j0 != 8) {
                    i2 = i4;
                }
                this.m = U2 + i2 + this.m;
                if (this.b == null || this.c < V2) {
                    this.b = eVar;
                    this.c = V2;
                    this.l = V2;
                }
            }
            this.o++;
        }

        public final void b(int i, boolean z, boolean z2) {
            g gVar;
            boolean z3;
            int i2;
            int i3;
            int i4;
            e eVar;
            int i5;
            int i6;
            char c;
            int i7;
            float f;
            float f2;
            int i8;
            float f3;
            float f4;
            int i9;
            int i10;
            int i11;
            int i12 = this.o;
            int i13 = 0;
            while (true) {
                gVar = g.this;
                if (i13 >= i12 || (i11 = this.n + i13) >= gVar.d1) {
                    break;
                }
                e eVar2 = gVar.c1[i11];
                if (eVar2 != null) {
                    eVar2.E();
                }
                i13++;
            }
            if (i12 != 0 && this.b != null) {
                if (z2 && i == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i14 = -1;
                int i15 = -1;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (z) {
                        i10 = (i12 - 1) - i16;
                    } else {
                        i10 = i16;
                    }
                    int i17 = this.n + i10;
                    if (i17 >= gVar.d1) {
                        break;
                    }
                    e eVar3 = gVar.c1[i17];
                    if (eVar3 != null && eVar3.j0 == 0) {
                        if (i14 == -1) {
                            i14 = i16;
                        }
                        i15 = i16;
                    }
                }
                if (this.a == 0) {
                    e eVar4 = this.b;
                    eVar4.m0 = gVar.G0;
                    int i18 = this.i;
                    if (i > 0) {
                        i18 += gVar.S0;
                    }
                    d dVar = this.e;
                    d dVar2 = eVar4.L;
                    dVar2.a(dVar, i18);
                    d dVar3 = eVar4.N;
                    if (z2) {
                        dVar3.a(this.g, this.k);
                    }
                    if (i > 0) {
                        this.e.d.N.a(dVar2, 0);
                    }
                    if (gVar.U0 == 3 && !eVar4.F) {
                        for (int i19 = 0; i19 < i12; i19++) {
                            if (z) {
                                i9 = (i12 - 1) - i19;
                            } else {
                                i9 = i19;
                            }
                            int i20 = this.n + i9;
                            if (i20 >= gVar.d1) {
                                break;
                            }
                            eVar = gVar.c1[i20];
                            if (eVar.F) {
                                break;
                            }
                        }
                    }
                    eVar = eVar4;
                    int i21 = 0;
                    e eVar5 = null;
                    while (i21 < i12) {
                        if (z) {
                            i5 = (i12 - 1) - i21;
                        } else {
                            i5 = i21;
                        }
                        int i22 = this.n + i5;
                        if (i22 < gVar.d1) {
                            e eVar6 = gVar.c1[i22];
                            if (eVar6 == null) {
                                i6 = i12;
                                c = 3;
                            } else {
                                d dVar4 = eVar6.K;
                                if (i21 == 0) {
                                    eVar6.g(dVar4, this.d, this.h);
                                }
                                if (i5 == 0) {
                                    int i23 = gVar.F0;
                                    if (z) {
                                        i7 = i23;
                                        f = 1.0f - gVar.L0;
                                    } else {
                                        i7 = i23;
                                        f = gVar.L0;
                                    }
                                    if (this.n == 0) {
                                        int i24 = gVar.H0;
                                        f2 = f;
                                        if (i24 != -1) {
                                            if (z) {
                                                f4 = 1.0f - gVar.N0;
                                            } else {
                                                f4 = gVar.N0;
                                            }
                                            f3 = f4;
                                            i8 = i24;
                                            eVar6.l0 = i8;
                                            eVar6.g0 = f3;
                                        }
                                    } else {
                                        f2 = f;
                                    }
                                    if (z2 && (i8 = gVar.J0) != -1) {
                                        if (z) {
                                            f3 = 1.0f - gVar.P0;
                                        } else {
                                            f3 = gVar.P0;
                                        }
                                    } else {
                                        i8 = i7;
                                        f3 = f2;
                                    }
                                    eVar6.l0 = i8;
                                    eVar6.g0 = f3;
                                }
                                if (i21 == i12 - 1) {
                                    i6 = i12;
                                    eVar6.g(eVar6.M, this.f, this.j);
                                } else {
                                    i6 = i12;
                                }
                                if (eVar5 != null) {
                                    int i25 = gVar.R0;
                                    d dVar5 = eVar5.M;
                                    dVar4.a(dVar5, i25);
                                    if (i21 == i14) {
                                        int i26 = this.h;
                                        if (dVar4.h()) {
                                            dVar4.h = i26;
                                        }
                                    }
                                    dVar5.a(dVar4, 0);
                                    if (i21 == i15 + 1) {
                                        int i27 = this.j;
                                        if (dVar5.h()) {
                                            dVar5.h = i27;
                                        }
                                    }
                                }
                                if (eVar6 != eVar4) {
                                    int i28 = gVar.U0;
                                    c = 3;
                                    if (i28 == 3 && eVar.F && eVar6 != eVar && eVar6.F) {
                                        eVar6.O.a(eVar.O, 0);
                                    } else {
                                        d dVar6 = eVar6.L;
                                        if (i28 != 0) {
                                            d dVar7 = eVar6.N;
                                            if (i28 != 1) {
                                                if (z3) {
                                                    dVar6.a(this.e, this.i);
                                                    dVar7.a(this.g, this.k);
                                                } else {
                                                    dVar6.a(dVar2, 0);
                                                    dVar7.a(dVar3, 0);
                                                }
                                            } else {
                                                dVar7.a(dVar3, 0);
                                            }
                                        } else {
                                            dVar6.a(dVar2, 0);
                                        }
                                    }
                                } else {
                                    c = 3;
                                }
                                eVar5 = eVar6;
                            }
                            i21++;
                            i12 = i6;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                e eVar7 = this.b;
                eVar7.l0 = gVar.F0;
                int i29 = this.h;
                if (i > 0) {
                    i29 += gVar.R0;
                }
                d dVar8 = eVar7.M;
                d dVar9 = eVar7.K;
                if (z) {
                    dVar8.a(this.f, i29);
                    if (z2) {
                        dVar9.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.K.a(dVar8, 0);
                    }
                } else {
                    dVar9.a(this.d, i29);
                    if (z2) {
                        dVar8.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.M.a(dVar9, 0);
                    }
                }
                int i30 = 0;
                e eVar8 = null;
                while (i30 < i12) {
                    int i31 = this.n + i30;
                    if (i31 < gVar.d1) {
                        e eVar9 = gVar.c1[i31];
                        if (eVar9 == null) {
                            eVar9 = eVar8;
                        } else {
                            d dVar10 = eVar9.L;
                            if (i30 == 0) {
                                eVar9.g(dVar10, this.e, this.i);
                                int i32 = gVar.G0;
                                float f5 = gVar.M0;
                                if (this.n == 0) {
                                    i4 = gVar.I0;
                                    i2 = i32;
                                    i3 = -1;
                                    if (i4 != -1) {
                                        f5 = gVar.O0;
                                        eVar9.m0 = i4;
                                        eVar9.h0 = f5;
                                    }
                                } else {
                                    i2 = i32;
                                    i3 = -1;
                                }
                                if (z2 && (i4 = gVar.K0) != i3) {
                                    f5 = gVar.Q0;
                                } else {
                                    i4 = i2;
                                }
                                eVar9.m0 = i4;
                                eVar9.h0 = f5;
                            }
                            if (i30 == i12 - 1) {
                                eVar9.g(eVar9.N, this.g, this.k);
                            }
                            if (eVar8 != null) {
                                int i33 = gVar.S0;
                                d dVar11 = eVar8.N;
                                dVar10.a(dVar11, i33);
                                if (i30 == i14) {
                                    int i34 = this.i;
                                    if (dVar10.h()) {
                                        dVar10.h = i34;
                                    }
                                }
                                dVar11.a(dVar10, 0);
                                if (i30 == i15 + 1) {
                                    int i35 = this.k;
                                    if (dVar11.h()) {
                                        dVar11.h = i35;
                                    }
                                }
                            }
                            if (eVar9 != eVar7) {
                                d dVar12 = eVar9.M;
                                d dVar13 = eVar9.K;
                                if (z) {
                                    int i36 = gVar.T0;
                                    if (i36 != 0) {
                                        if (i36 != 1) {
                                            if (i36 == 2) {
                                                dVar13.a(dVar9, 0);
                                                dVar12.a(dVar8, 0);
                                            }
                                        } else {
                                            dVar13.a(dVar9, 0);
                                        }
                                    } else {
                                        dVar12.a(dVar8, 0);
                                    }
                                    i30++;
                                    eVar8 = eVar9;
                                } else {
                                    int i37 = gVar.T0;
                                    if (i37 != 0) {
                                        if (i37 != 1) {
                                            if (i37 == 2) {
                                                if (z3) {
                                                    dVar13.a(this.d, this.h);
                                                    dVar12.a(this.f, this.j);
                                                } else {
                                                    dVar13.a(dVar9, 0);
                                                    dVar12.a(dVar8, 0);
                                                }
                                            }
                                        } else {
                                            dVar12.a(dVar8, 0);
                                        }
                                    } else {
                                        dVar13.a(dVar9, 0);
                                    }
                                    i30++;
                                    eVar8 = eVar9;
                                }
                            }
                        }
                        i30++;
                        eVar8 = eVar9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.a == 1) {
                return this.m - g.this.S0;
            }
            return this.m;
        }

        public final int d() {
            if (this.a == 0) {
                return this.l - g.this.R0;
            }
            return this.l;
        }

        public final void e(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.n;
                int i7 = i6 + i5;
                g gVar = g.this;
                if (i7 >= gVar.d1) {
                    break;
                }
                e eVar = gVar.c1[i6 + i5];
                if (this.a == 0) {
                    if (eVar != null) {
                        e.b[] bVarArr = eVar.V;
                        if (bVarArr[0] == e.b.MATCH_CONSTRAINT && eVar.s == 0) {
                            gVar.T(eVar, e.b.FIXED, i4, bVarArr[1], eVar.l());
                        }
                    }
                } else if (eVar != null) {
                    e.b[] bVarArr2 = eVar.V;
                    if (bVarArr2[1] == e.b.MATCH_CONSTRAINT && eVar.t == 0) {
                        gVar.T(eVar, bVarArr2[0], eVar.r(), e.b.FIXED, i4);
                    }
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                g gVar2 = g.this;
                if (i10 < gVar2.d1) {
                    e eVar2 = gVar2.c1[i10];
                    if (this.a == 0) {
                        int r = eVar2.r();
                        int i11 = gVar2.R0;
                        if (eVar2.j0 == 8) {
                            i11 = 0;
                        }
                        this.l = r + i11 + this.l;
                        int U = gVar2.U(this.q, eVar2);
                        if (this.b == null || this.c < U) {
                            this.b = eVar2;
                            this.c = U;
                            this.m = U;
                        }
                    } else {
                        int V = gVar2.V(this.q, eVar2);
                        int U2 = gVar2.U(this.q, eVar2);
                        int i12 = gVar2.S0;
                        if (eVar2.j0 == 8) {
                            i12 = 0;
                        }
                        this.m = U2 + i12 + this.m;
                        if (this.b == null || this.c < V) {
                            this.b = eVar2;
                            this.c = V;
                            this.l = V;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i, d dVar, d dVar2, d dVar3, d dVar4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = dVar;
            this.e = dVar2;
            this.f = dVar3;
            this.g = dVar4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0865  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x0518 -> B:295:0x052c). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.u2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u2.g.S(int, int, int, int):void");
    }

    public final int U(int i, e eVar) {
        if (eVar == null) {
            return 0;
        }
        e.b[] bVarArr = eVar.V;
        if (bVarArr[1] == e.b.MATCH_CONSTRAINT) {
            int i2 = eVar.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.A * i);
                if (i3 != eVar.l()) {
                    eVar.g = true;
                    T(eVar, bVarArr[0], eVar.r(), e.b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.l();
            } else {
                if (i2 == 3) {
                    return (int) ((eVar.r() * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.l();
    }

    public final int V(int i, e eVar) {
        if (eVar == null) {
            return 0;
        }
        e.b[] bVarArr = eVar.V;
        if (bVarArr[0] == e.b.MATCH_CONSTRAINT) {
            int i2 = eVar.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.x * i);
                if (i3 != eVar.r()) {
                    eVar.g = true;
                    T(eVar, e.b.FIXED, i3, bVarArr[1], eVar.l());
                }
                return i3;
            } else if (i2 == 1) {
                return eVar.r();
            } else {
                if (i2 == 3) {
                    return (int) ((eVar.l() * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.r();
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void c(com.amazon.aps.iva.s2.d dVar, boolean z) {
        boolean z2;
        boolean z3;
        e eVar;
        float f;
        int i;
        boolean z4;
        super.c(dVar, z);
        e eVar2 = this.W;
        if (eVar2 != null && ((f) eVar2).x0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.V0;
        ArrayList<a> arrayList = this.Y0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            a aVar = arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            aVar.b(i3, z2, z4);
                        }
                    }
                } else if (this.b1 != null && this.a1 != null && this.Z0 != null) {
                    for (int i4 = 0; i4 < this.d1; i4++) {
                        this.c1[i4].E();
                    }
                    int[] iArr = this.b1;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.L0;
                    e eVar3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.L0;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        e eVar4 = this.a1[i];
                        if (eVar4 != null && eVar4.j0 != 8) {
                            d dVar2 = eVar4.K;
                            if (i7 == 0) {
                                eVar4.g(dVar2, this.K, this.y0);
                                eVar4.l0 = this.F0;
                                eVar4.g0 = f;
                            }
                            if (i7 == i5 - 1) {
                                eVar4.g(eVar4.M, this.M, this.z0);
                            }
                            if (i7 > 0 && eVar3 != null) {
                                int i8 = this.R0;
                                d dVar3 = eVar3.M;
                                eVar4.g(dVar2, dVar3, i8);
                                eVar3.g(dVar3, dVar2, 0);
                            }
                            eVar3 = eVar4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        e eVar5 = this.Z0[i9];
                        if (eVar5 != null && eVar5.j0 != 8) {
                            d dVar4 = eVar5.L;
                            if (i9 == 0) {
                                eVar5.g(dVar4, this.L, this.u0);
                                eVar5.m0 = this.G0;
                                eVar5.h0 = this.M0;
                            }
                            if (i9 == i6 - 1) {
                                eVar5.g(eVar5.N, this.N, this.v0);
                            }
                            if (i9 > 0 && eVar3 != null) {
                                int i10 = this.S0;
                                d dVar5 = eVar3.N;
                                eVar5.g(dVar4, dVar5, i10);
                                eVar3.g(dVar5, dVar4, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.X0 == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            e[] eVarArr = this.c1;
                            if (i13 < eVarArr.length && (eVar = eVarArr[i13]) != null && eVar.j0 != 8) {
                                e eVar6 = this.a1[i11];
                                e eVar7 = this.Z0[i12];
                                if (eVar != eVar6) {
                                    eVar.g(eVar.K, eVar6.K, 0);
                                    eVar.g(eVar.M, eVar6.M, 0);
                                }
                                if (eVar != eVar7) {
                                    eVar.g(eVar.L, eVar7.L, 0);
                                    eVar.g(eVar.N, eVar7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    a aVar2 = arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar2.b(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z2, true);
        }
        this.A0 = false;
    }
}
