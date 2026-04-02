package c.g.a.i;

import c.g.a.i.c;
import c.g.a.i.d;
/* loaded from: classes.dex */
public class f extends d {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public c u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    public f() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.R[i2] = this.u0;
        }
    }

    @Override // c.g.a.i.d
    public boolean E() {
        return this.w0;
    }

    @Override // c.g.a.i.d
    public boolean F() {
        return this.w0;
    }

    @Override // c.g.a.i.d
    public void V(c.g.a.d dVar, boolean z) {
        if (this.V == null) {
            return;
        }
        int o = dVar.o(this.u0);
        if (this.v0 == 1) {
            this.a0 = o;
            this.b0 = 0;
            O(this.V.l());
            T(0);
            return;
        }
        this.a0 = 0;
        this.b0 = o;
        T(this.V.u());
        O(0);
    }

    public void W(int i2) {
        c cVar = this.u0;
        cVar.f1733b = i2;
        cVar.f1734c = true;
        this.w0 = true;
    }

    public void X(int i2) {
        if (this.v0 == i2) {
            return;
        }
        this.v0 = i2;
        this.S.clear();
        if (this.v0 == 1) {
            this.u0 = this.J;
        } else {
            this.u0 = this.K;
        }
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.R[i3] = this.u0;
        }
    }

    @Override // c.g.a.i.d
    public void d(c.g.a.d dVar, boolean z) {
        e eVar = (e) this.V;
        if (eVar == null) {
            return;
        }
        Object i2 = eVar.i(c.a.LEFT);
        Object i3 = eVar.i(c.a.RIGHT);
        d dVar2 = this.V;
        boolean z2 = true;
        boolean z3 = dVar2 != null && dVar2.U[0] == d.a.WRAP_CONTENT;
        if (this.v0 == 0) {
            i2 = eVar.i(c.a.TOP);
            i3 = eVar.i(c.a.BOTTOM);
            d dVar3 = this.V;
            z3 = (dVar3 == null || dVar3.U[1] != d.a.WRAP_CONTENT) ? false : false;
        }
        if (this.w0) {
            c cVar = this.u0;
            if (cVar.f1734c) {
                c.g.a.g l2 = dVar.l(cVar);
                dVar.e(l2, this.u0.c());
                if (this.s0 != -1) {
                    if (z3) {
                        dVar.f(dVar.l(i3), l2, 0, 5);
                    }
                } else if (this.t0 != -1 && z3) {
                    c.g.a.g l3 = dVar.l(i3);
                    dVar.f(l2, dVar.l(i2), 0, 5);
                    dVar.f(l3, l2, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            c.g.a.g l4 = dVar.l(this.u0);
            dVar.d(l4, dVar.l(i2), this.s0, 8);
            if (z3) {
                dVar.f(dVar.l(i3), l4, 0, 5);
            }
        } else if (this.t0 != -1) {
            c.g.a.g l5 = dVar.l(this.u0);
            c.g.a.g l6 = dVar.l(i3);
            dVar.d(l5, l6, -this.t0, 8);
            if (z3) {
                dVar.f(l5, dVar.l(i2), 0, 5);
                dVar.f(l6, l5, 0, 5);
            }
        } else if (this.r0 != -1.0f) {
            c.g.a.g l7 = dVar.l(this.u0);
            c.g.a.g l8 = dVar.l(i3);
            float f2 = this.r0;
            c.g.a.b m2 = dVar.m();
            m2.f1680d.d(l7, -1.0f);
            m2.f1680d.d(l8, f2);
            dVar.c(m2);
        }
    }

    @Override // c.g.a.i.d
    public boolean e() {
        return true;
    }

    @Override // c.g.a.i.d
    public c i(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 == 0) {
                return this.u0;
            }
            return null;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }
}
