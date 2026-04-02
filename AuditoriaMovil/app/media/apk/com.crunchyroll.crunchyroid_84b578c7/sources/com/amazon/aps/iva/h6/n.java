package com.amazon.aps.iva.h6;

import com.amazon.aps.iva.h6.o;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.u1.g0;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: HlsSampleStream.java */
/* loaded from: classes.dex */
public final class n implements h0 {
    public final int b;
    public final o c;
    public int d = -1;

    public n(o oVar, int i) {
        this.c = oVar;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final void a() throws IOException {
        int i = this.d;
        o oVar = this.c;
        if (i != -2) {
            if (i == -1) {
                oVar.E();
                return;
            } else if (i != -3) {
                oVar.E();
                oVar.w[i].t();
                return;
            } else {
                return;
            }
        }
        oVar.g();
        throw new q(oVar.J.a(this.b).e[0].m);
    }

    public final void b() {
        boolean z;
        if (this.d == -1) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        o oVar = this.c;
        oVar.g();
        oVar.L.getClass();
        int[] iArr = oVar.L;
        int i = this.b;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (oVar.K.contains(oVar.J.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = oVar.O;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.d = i2;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final boolean g() {
        boolean z;
        boolean z2;
        int i = this.d;
        if (i == -3) {
            return true;
        }
        if (i != -1 && i != -3 && i != -2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o oVar = this.c;
            if (!oVar.C() && oVar.w[i].r(oVar.U)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int m(g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
        boolean z;
        boolean z2;
        long j;
        v vVar;
        boolean z3;
        int i2;
        long j2;
        int i3 = this.d;
        if (i3 == -3) {
            fVar.h(4);
            return -4;
        }
        int i4 = 1;
        if (i3 != -1 && i3 != -3 && i3 != -2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o oVar = this.c;
            if (oVar.C()) {
                return -3;
            }
            ArrayList<k> arrayList = oVar.o;
            if (!arrayList.isEmpty()) {
                int i5 = 0;
                while (i5 < arrayList.size() - i4) {
                    int i6 = arrayList.get(i5).k;
                    int length = oVar.w.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length) {
                            if (oVar.O[i7]) {
                                o.c cVar = oVar.w[i7];
                                synchronized (cVar) {
                                    int o = cVar.o(cVar.s);
                                    if (cVar.s != cVar.p) {
                                        i2 = i4;
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i2 != 0) {
                                        j2 = cVar.j[o];
                                    } else {
                                        j2 = cVar.C;
                                    }
                                }
                                if (j2 == i6) {
                                    z3 = false;
                                    break;
                                }
                            }
                            i7++;
                            i4 = 1;
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        break;
                    }
                    i5++;
                    i4 = 1;
                }
                com.amazon.aps.iva.t5.g0.V(0, i5, arrayList);
                k kVar = arrayList.get(0);
                v vVar2 = kVar.d;
                if (!vVar2.equals(oVar.H)) {
                    oVar.l.a(oVar.c, vVar2, kVar.e, kVar.f, kVar.g);
                }
                oVar.H = vVar2;
            }
            int i8 = 0;
            if (arrayList.isEmpty() || arrayList.get(0).L) {
                int v = oVar.w[i3].v(g0Var, fVar, i, oVar.U);
                if (v == -5) {
                    v vVar3 = (v) g0Var.c;
                    vVar3.getClass();
                    if (i3 == oVar.C) {
                        o.c cVar2 = oVar.w[i3];
                        synchronized (cVar2) {
                            int o2 = cVar2.o(cVar2.s);
                            if (cVar2.s != cVar2.p) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                j = cVar2.j[o2];
                            } else {
                                j = cVar2.C;
                            }
                        }
                        int checkedCast = Ints.checkedCast(j);
                        while (i8 < arrayList.size() && arrayList.get(i8).k != checkedCast) {
                            i8++;
                        }
                        if (i8 < arrayList.size()) {
                            vVar = arrayList.get(i8).d;
                        } else {
                            vVar = oVar.G;
                            vVar.getClass();
                        }
                        vVar3 = vVar3.g(vVar);
                    }
                    g0Var.c = vVar3;
                }
                return v;
            }
        }
        return -3;
    }

    @Override // com.amazon.aps.iva.o6.h0
    public final int o(long j) {
        boolean z;
        int i = this.d;
        if (i != -1 && i != -3 && i != -2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        o oVar = this.c;
        if (oVar.C()) {
            return 0;
        }
        o.c cVar = oVar.w[i];
        int p = cVar.p(j, oVar.U);
        k kVar = (k) Iterables.getLast(oVar.o, null);
        if (kVar != null && !kVar.L) {
            p = Math.min(p, kVar.g(i) - (cVar.q + cVar.s));
        }
        cVar.y(p);
        return p;
    }
}
