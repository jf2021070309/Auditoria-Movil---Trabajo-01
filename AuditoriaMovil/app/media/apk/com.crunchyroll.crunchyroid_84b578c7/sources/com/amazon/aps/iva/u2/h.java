package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
import java.util.ArrayList;
/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class h extends e {
    public float s0 = -1.0f;
    public int t0 = -1;
    public int u0 = -1;
    public d v0 = this.L;
    public int w0 = 0;
    public boolean x0;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.T.clear();
        this.T.add(this.v0);
        int length = this.S.length;
        for (int i = 0; i < length; i++) {
            this.S[i] = this.v0;
        }
    }

    @Override // com.amazon.aps.iva.u2.e
    public final boolean B() {
        return this.x0;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final boolean C() {
        return this.x0;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void Q(com.amazon.aps.iva.s2.d dVar, boolean z) {
        if (this.W == null) {
            return;
        }
        d dVar2 = this.v0;
        dVar.getClass();
        int n = com.amazon.aps.iva.s2.d.n(dVar2);
        if (this.w0 == 1) {
            this.b0 = n;
            this.c0 = 0;
            L(this.W.l());
            O(0);
            return;
        }
        this.b0 = 0;
        this.c0 = n;
        O(this.W.r());
        L(0);
    }

    public final void R(int i) {
        this.v0.l(i);
        this.x0 = true;
    }

    public final void S(int i) {
        if (this.w0 == i) {
            return;
        }
        this.w0 = i;
        ArrayList<d> arrayList = this.T;
        arrayList.clear();
        if (this.w0 == 1) {
            this.v0 = this.K;
        } else {
            this.v0 = this.L;
        }
        arrayList.add(this.v0);
        d[] dVarArr = this.S;
        int length = dVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            dVarArr[i2] = this.v0;
        }
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void c(com.amazon.aps.iva.s2.d dVar, boolean z) {
        boolean z2;
        f fVar = (f) this.W;
        if (fVar == null) {
            return;
        }
        Object j = fVar.j(d.b.LEFT);
        Object j2 = fVar.j(d.b.RIGHT);
        e eVar = this.W;
        boolean z3 = true;
        if (eVar != null && eVar.V[0] == e.b.WRAP_CONTENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.w0 == 0) {
            j = fVar.j(d.b.TOP);
            j2 = fVar.j(d.b.BOTTOM);
            e eVar2 = this.W;
            if (eVar2 == null || eVar2.V[1] != e.b.WRAP_CONTENT) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.x0) {
            d dVar2 = this.v0;
            if (dVar2.c) {
                com.amazon.aps.iva.s2.h k = dVar.k(dVar2);
                dVar.d(k, this.v0.d());
                if (this.t0 != -1) {
                    if (z2) {
                        dVar.f(dVar.k(j2), k, 0, 5);
                    }
                } else if (this.u0 != -1 && z2) {
                    com.amazon.aps.iva.s2.h k2 = dVar.k(j2);
                    dVar.f(k, dVar.k(j), 0, 5);
                    dVar.f(k2, k, 0, 5);
                }
                this.x0 = false;
                return;
            }
        }
        if (this.t0 != -1) {
            com.amazon.aps.iva.s2.h k3 = dVar.k(this.v0);
            dVar.e(k3, dVar.k(j), this.t0, 8);
            if (z2) {
                dVar.f(dVar.k(j2), k3, 0, 5);
            }
        } else if (this.u0 != -1) {
            com.amazon.aps.iva.s2.h k4 = dVar.k(this.v0);
            com.amazon.aps.iva.s2.h k5 = dVar.k(j2);
            dVar.e(k4, k5, -this.u0, 8);
            if (z2) {
                dVar.f(k4, dVar.k(j), 0, 5);
                dVar.f(k5, k4, 0, 5);
            }
        } else if (this.s0 != -1.0f) {
            com.amazon.aps.iva.s2.h k6 = dVar.k(this.v0);
            com.amazon.aps.iva.s2.h k7 = dVar.k(j2);
            float f = this.s0;
            com.amazon.aps.iva.s2.b l = dVar.l();
            l.d.i(k6, -1.0f);
            l.d.i(k7, f);
            dVar.c(l);
        }
    }

    @Override // com.amazon.aps.iva.u2.e
    public final boolean d() {
        return true;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final d j(d.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1 && i != 2) {
            if ((i == 3 || i == 4) && this.w0 == 0) {
                return this.v0;
            }
            return null;
        } else if (this.w0 == 1) {
            return this.v0;
        } else {
            return null;
        }
    }
}
