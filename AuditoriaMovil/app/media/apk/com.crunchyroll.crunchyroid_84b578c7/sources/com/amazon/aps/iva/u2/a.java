package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends j {
    public int u0 = 0;
    public boolean v0 = true;
    public int w0 = 0;
    public boolean x0 = false;

    @Override // com.amazon.aps.iva.u2.e
    public final boolean B() {
        return this.x0;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final boolean C() {
        return this.x0;
    }

    public final boolean S() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.t0;
            if (i4 >= i) {
                break;
            }
            e eVar = this.s0[i4];
            if ((this.v0 || eVar.d()) && ((((i2 = this.u0) == 0 || i2 == 1) && !eVar.B()) || (((i3 = this.u0) == 2 || i3 == 3) && !eVar.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.t0; i6++) {
            e eVar2 = this.s0[i6];
            if (this.v0 || eVar2.d()) {
                if (!z2) {
                    int i7 = this.u0;
                    if (i7 == 0) {
                        i5 = eVar2.j(d.b.LEFT).d();
                    } else if (i7 == 1) {
                        i5 = eVar2.j(d.b.RIGHT).d();
                    } else if (i7 == 2) {
                        i5 = eVar2.j(d.b.TOP).d();
                    } else if (i7 == 3) {
                        i5 = eVar2.j(d.b.BOTTOM).d();
                    }
                    z2 = true;
                }
                int i8 = this.u0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.j(d.b.LEFT).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.j(d.b.RIGHT).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.j(d.b.TOP).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.j(d.b.BOTTOM).d());
                }
            }
        }
        int i9 = i5 + this.w0;
        int i10 = this.u0;
        if (i10 != 0 && i10 != 1) {
            K(i9, i9);
        } else {
            J(i9, i9);
        }
        this.x0 = true;
        return true;
    }

    public final int T() {
        int i = this.u0;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void c(com.amazon.aps.iva.s2.d dVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        d[] dVarArr = this.S;
        d dVar2 = this.K;
        dVarArr[0] = dVar2;
        int i5 = 2;
        d dVar3 = this.L;
        dVarArr[2] = dVar3;
        d dVar4 = this.M;
        dVarArr[1] = dVar4;
        d dVar5 = this.N;
        dVarArr[3] = dVar5;
        for (d dVar6 : dVarArr) {
            dVar6.i = dVar.k(dVar6);
        }
        int i6 = this.u0;
        if (i6 >= 0 && i6 < 4) {
            d dVar7 = dVarArr[i6];
            if (!this.x0) {
                S();
            }
            if (this.x0) {
                this.x0 = false;
                int i7 = this.u0;
                if (i7 != 0 && i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        dVar.d(dVar3.i, this.c0);
                        dVar.d(dVar5.i, this.c0);
                        return;
                    }
                    return;
                }
                dVar.d(dVar2.i, this.b0);
                dVar.d(dVar4.i, this.b0);
                return;
            }
            for (int i8 = 0; i8 < this.t0; i8++) {
                e eVar = this.s0[i8];
                if ((this.v0 || eVar.d()) && ((((i4 = this.u0) == 0 || i4 == 1) && eVar.V[0] == e.b.MATCH_CONSTRAINT && eVar.K.f != null && eVar.M.f != null) || ((i4 == 2 || i4 == 3) && eVar.V[1] == e.b.MATCH_CONSTRAINT && eVar.L.f != null && eVar.N.f != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!dVar2.g() && !dVar4.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!dVar3.g() && !dVar5.g()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.u0) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i9 = 0;
            while (i9 < this.t0) {
                e eVar2 = this.s0[i9];
                if (this.v0 || eVar2.d()) {
                    com.amazon.aps.iva.s2.h k = dVar.k(eVar2.S[this.u0]);
                    int i10 = this.u0;
                    d dVar8 = eVar2.S[i10];
                    dVar8.i = k;
                    d dVar9 = dVar8.f;
                    if (dVar9 != null && dVar9.d == this) {
                        i2 = dVar8.g + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != i5) {
                        com.amazon.aps.iva.s2.b l = dVar.l();
                        com.amazon.aps.iva.s2.h m = dVar.m();
                        m.e = 0;
                        l.c(dVar7.i, k, m, this.w0 + i2);
                        dVar.c(l);
                    } else {
                        com.amazon.aps.iva.s2.b l2 = dVar.l();
                        com.amazon.aps.iva.s2.h m2 = dVar.m();
                        m2.e = 0;
                        l2.d(dVar7.i, k, m2, this.w0 - i2);
                        dVar.c(l2);
                    }
                    dVar.e(dVar7.i, k, this.w0 + i2, i);
                }
                i9++;
                i5 = 2;
            }
            int i11 = this.u0;
            if (i11 == 0) {
                dVar.e(dVar4.i, dVar2.i, 0, 8);
                dVar.e(dVar2.i, this.W.M.i, 0, 4);
                dVar.e(dVar2.i, this.W.K.i, 0, 0);
            } else if (i11 == 1) {
                dVar.e(dVar2.i, dVar4.i, 0, 8);
                dVar.e(dVar2.i, this.W.K.i, 0, 4);
                dVar.e(dVar2.i, this.W.M.i, 0, 0);
            } else if (i11 == 2) {
                dVar.e(dVar5.i, dVar3.i, 0, 8);
                dVar.e(dVar3.i, this.W.N.i, 0, 4);
                dVar.e(dVar3.i, this.W.L.i, 0, 0);
            } else if (i11 == 3) {
                dVar.e(dVar3.i, dVar5.i, 0, 8);
                dVar.e(dVar3.i, this.W.L.i, 0, 4);
                dVar.e(dVar3.i, this.W.N.i, 0, 0);
            }
        }
    }

    @Override // com.amazon.aps.iva.u2.e
    public final boolean d() {
        return true;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final String toString() {
        String c = defpackage.b.c(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.t0; i++) {
            e eVar = this.s0[i];
            if (i > 0) {
                c = com.amazon.aps.iva.c80.a.f(c, ", ");
            }
            StringBuilder b = defpackage.c.b(c);
            b.append(eVar.k0);
            c = b.toString();
        }
        return com.amazon.aps.iva.c80.a.f(c, "}");
    }
}
