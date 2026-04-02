package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.b;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class h {
    public static final b.a a = new b.a();

    public static boolean a(com.amazon.aps.iva.u2.e eVar) {
        com.amazon.aps.iva.u2.f fVar;
        boolean z;
        boolean z2;
        e.b bVar;
        e.b bVar2;
        e.b[] bVarArr = eVar.V;
        e.b bVar3 = bVarArr[0];
        e.b bVar4 = bVarArr[1];
        com.amazon.aps.iva.u2.e eVar2 = eVar.W;
        if (eVar2 != null) {
            fVar = (com.amazon.aps.iva.u2.f) eVar2;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            e.b bVar5 = fVar.V[0];
            e.b bVar6 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b bVar7 = fVar.V[1];
            e.b bVar8 = e.b.FIXED;
        }
        e.b bVar9 = e.b.FIXED;
        if (bVar3 != bVar9 && !eVar.B() && bVar3 != e.b.WRAP_CONTENT && ((bVar3 != (bVar2 = e.b.MATCH_CONSTRAINT) || eVar.s != 0 || eVar.Z != 0.0f || !eVar.u(0)) && (bVar3 != bVar2 || eVar.s != 1 || !eVar.v(0, eVar.r())))) {
            z = false;
        } else {
            z = true;
        }
        if (bVar4 != bVar9 && !eVar.C() && bVar4 != e.b.WRAP_CONTENT && ((bVar4 != (bVar = e.b.MATCH_CONSTRAINT) || eVar.t != 0 || eVar.Z != 0.0f || !eVar.u(1)) && (bVar4 != bVar || eVar.t != 1 || !eVar.v(1, eVar.l())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (eVar.Z > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void b(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b, boolean z) {
        boolean z2;
        com.amazon.aps.iva.u2.d dVar;
        com.amazon.aps.iva.u2.d dVar2;
        char c;
        com.amazon.aps.iva.u2.d dVar3;
        com.amazon.aps.iva.u2.d dVar4;
        if (eVar.n) {
            return;
        }
        if (!(eVar instanceof com.amazon.aps.iva.u2.f) && eVar.A() && a(eVar)) {
            com.amazon.aps.iva.u2.f.V(eVar, interfaceC0780b, new b.a());
        }
        com.amazon.aps.iva.u2.d j = eVar.j(d.b.LEFT);
        com.amazon.aps.iva.u2.d j2 = eVar.j(d.b.RIGHT);
        int d = j.d();
        int d2 = j2.d();
        HashSet<com.amazon.aps.iva.u2.d> hashSet = j.a;
        char c2 = 0;
        if (hashSet != null && j.c) {
            Iterator<com.amazon.aps.iva.u2.d> it = hashSet.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.u2.d next = it.next();
                com.amazon.aps.iva.u2.e eVar2 = next.d;
                int i2 = i + 1;
                boolean a2 = a(eVar2);
                if (eVar2.A() && a2) {
                    com.amazon.aps.iva.u2.f.V(eVar2, interfaceC0780b, new b.a());
                }
                com.amazon.aps.iva.u2.d dVar5 = eVar2.K;
                com.amazon.aps.iva.u2.d dVar6 = eVar2.M;
                if ((next == dVar5 && (dVar4 = dVar6.f) != null && dVar4.c) || (next == dVar6 && (dVar3 = dVar5.f) != null && dVar3.c)) {
                    c = 1;
                } else {
                    c = c2;
                }
                e.b bVar = eVar2.V[c2];
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && !a2) {
                    if (bVar == bVar2 && eVar2.w >= 0 && eVar2.v >= 0 && ((eVar2.j0 == 8 || (eVar2.s == 0 && eVar2.Z == 0.0f)) && !eVar2.y() && !eVar2.H && c != 0 && !eVar2.y())) {
                        d(i2, eVar, interfaceC0780b, eVar2, z);
                    }
                } else if (!eVar2.A()) {
                    if (next == dVar5 && dVar6.f == null) {
                        int e = dVar5.e() + d;
                        eVar2.J(e, eVar2.r() + e);
                        b(i2, eVar2, interfaceC0780b, z);
                    } else if (next == dVar6 && dVar5.f == null) {
                        int e2 = d - dVar6.e();
                        eVar2.J(e2 - eVar2.r(), e2);
                        b(i2, eVar2, interfaceC0780b, z);
                    } else if (c != 0 && !eVar2.y()) {
                        c(i2, eVar2, interfaceC0780b, z);
                    }
                }
                c2 = 0;
            }
        }
        if (eVar instanceof com.amazon.aps.iva.u2.h) {
            return;
        }
        HashSet<com.amazon.aps.iva.u2.d> hashSet2 = j2.a;
        if (hashSet2 != null && j2.c) {
            Iterator<com.amazon.aps.iva.u2.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                com.amazon.aps.iva.u2.d next2 = it2.next();
                com.amazon.aps.iva.u2.e eVar3 = next2.d;
                int i3 = i + 1;
                boolean a3 = a(eVar3);
                if (eVar3.A() && a3) {
                    com.amazon.aps.iva.u2.f.V(eVar3, interfaceC0780b, new b.a());
                }
                com.amazon.aps.iva.u2.d dVar7 = eVar3.K;
                com.amazon.aps.iva.u2.d dVar8 = eVar3.M;
                if ((next2 == dVar7 && (dVar2 = dVar8.f) != null && dVar2.c) || (next2 == dVar8 && (dVar = dVar7.f) != null && dVar.c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                e.b bVar3 = eVar3.V[0];
                e.b bVar4 = e.b.MATCH_CONSTRAINT;
                if (bVar3 == bVar4 && !a3) {
                    if (bVar3 == bVar4 && eVar3.w >= 0 && eVar3.v >= 0) {
                        if (eVar3.j0 != 8) {
                            if (eVar3.s == 0) {
                                if (eVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.y() && !eVar3.H && z2 && !eVar3.y()) {
                            d(i3, eVar, interfaceC0780b, eVar3, z);
                        }
                    }
                } else if (!eVar3.A()) {
                    if (next2 == dVar7 && dVar8.f == null) {
                        int e3 = dVar7.e() + d2;
                        eVar3.J(e3, eVar3.r() + e3);
                        b(i3, eVar3, interfaceC0780b, z);
                    } else if (next2 == dVar8 && dVar7.f == null) {
                        int e4 = d2 - dVar8.e();
                        eVar3.J(e4 - eVar3.r(), e4);
                        b(i3, eVar3, interfaceC0780b, z);
                    } else if (z2 && !eVar3.y()) {
                        c(i3, eVar3, interfaceC0780b, z);
                    }
                }
            }
        }
        eVar.n = true;
    }

    public static void c(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b, boolean z) {
        float f;
        float f2 = eVar.g0;
        com.amazon.aps.iva.u2.d dVar = eVar.K;
        int d = dVar.f.d();
        com.amazon.aps.iva.u2.d dVar2 = eVar.M;
        int d2 = dVar2.f.d();
        int e = dVar.e() + d;
        int e2 = d2 - dVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int r = eVar.r();
        int i2 = (d2 - d) - r;
        if (d > d2) {
            i2 = (d - d2) - r;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = ((int) f) + d;
        int i4 = i3 + r;
        if (d > d2) {
            i4 = i3 - r;
        }
        eVar.J(i3, i4);
        b(i + 1, eVar, interfaceC0780b, z);
    }

    public static void d(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b, com.amazon.aps.iva.u2.e eVar2, boolean z) {
        int r;
        float f = eVar2.g0;
        com.amazon.aps.iva.u2.d dVar = eVar2.K;
        int e = dVar.e() + dVar.f.d();
        com.amazon.aps.iva.u2.d dVar2 = eVar2.M;
        int d = dVar2.f.d() - dVar2.e();
        if (d >= e) {
            int r2 = eVar2.r();
            if (eVar2.j0 != 8) {
                int i2 = eVar2.s;
                if (i2 == 2) {
                    if (eVar instanceof com.amazon.aps.iva.u2.f) {
                        r = eVar.r();
                    } else {
                        r = eVar.W.r();
                    }
                    r2 = (int) (eVar2.g0 * 0.5f * r);
                } else if (i2 == 0) {
                    r2 = d - e;
                }
                r2 = Math.max(eVar2.v, r2);
                int i3 = eVar2.w;
                if (i3 > 0) {
                    r2 = Math.min(i3, r2);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - r2)) + 0.5f));
            eVar2.J(i4, r2 + i4);
            b(i + 1, eVar2, interfaceC0780b, z);
        }
    }

    public static void e(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b) {
        float f;
        float f2 = eVar.h0;
        com.amazon.aps.iva.u2.d dVar = eVar.L;
        int d = dVar.f.d();
        com.amazon.aps.iva.u2.d dVar2 = eVar.N;
        int d2 = dVar2.f.d();
        int e = dVar.e() + d;
        int e2 = d2 - dVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int l = eVar.l();
        int i2 = (d2 - d) - l;
        if (d > d2) {
            i2 = (d - d2) - l;
        }
        if (i2 > 0) {
            f = (f2 * i2) + 0.5f;
        } else {
            f = f2 * i2;
        }
        int i3 = (int) f;
        int i4 = d + i3;
        int i5 = i4 + l;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - l;
        }
        eVar.K(i4, i5);
        g(i + 1, eVar, interfaceC0780b);
    }

    public static void f(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b, com.amazon.aps.iva.u2.e eVar2) {
        int l;
        float f = eVar2.h0;
        com.amazon.aps.iva.u2.d dVar = eVar2.L;
        int e = dVar.e() + dVar.f.d();
        com.amazon.aps.iva.u2.d dVar2 = eVar2.N;
        int d = dVar2.f.d() - dVar2.e();
        if (d >= e) {
            int l2 = eVar2.l();
            if (eVar2.j0 != 8) {
                int i2 = eVar2.t;
                if (i2 == 2) {
                    if (eVar instanceof com.amazon.aps.iva.u2.f) {
                        l = eVar.l();
                    } else {
                        l = eVar.W.l();
                    }
                    l2 = (int) (f * 0.5f * l);
                } else if (i2 == 0) {
                    l2 = d - e;
                }
                l2 = Math.max(eVar2.y, l2);
                int i3 = eVar2.z;
                if (i3 > 0) {
                    l2 = Math.min(i3, l2);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - l2)) + 0.5f));
            eVar2.K(i4, l2 + i4);
            g(i + 1, eVar2, interfaceC0780b);
        }
    }

    public static void g(int i, com.amazon.aps.iva.u2.e eVar, b.InterfaceC0780b interfaceC0780b) {
        com.amazon.aps.iva.u2.d dVar;
        boolean z;
        com.amazon.aps.iva.u2.d dVar2;
        com.amazon.aps.iva.u2.d dVar3;
        char c;
        com.amazon.aps.iva.u2.d dVar4;
        com.amazon.aps.iva.u2.d dVar5;
        if (eVar.o) {
            return;
        }
        if (!(eVar instanceof com.amazon.aps.iva.u2.f) && eVar.A() && a(eVar)) {
            com.amazon.aps.iva.u2.f.V(eVar, interfaceC0780b, new b.a());
        }
        com.amazon.aps.iva.u2.d j = eVar.j(d.b.TOP);
        com.amazon.aps.iva.u2.d j2 = eVar.j(d.b.BOTTOM);
        int d = j.d();
        int d2 = j2.d();
        HashSet<com.amazon.aps.iva.u2.d> hashSet = j.a;
        char c2 = 1;
        if (hashSet != null && j.c) {
            Iterator<com.amazon.aps.iva.u2.d> it = hashSet.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.u2.d next = it.next();
                com.amazon.aps.iva.u2.e eVar2 = next.d;
                int i2 = i + 1;
                boolean a2 = a(eVar2);
                if (eVar2.A() && a2) {
                    com.amazon.aps.iva.u2.f.V(eVar2, interfaceC0780b, new b.a());
                }
                com.amazon.aps.iva.u2.d dVar6 = eVar2.L;
                com.amazon.aps.iva.u2.d dVar7 = eVar2.N;
                if ((next == dVar6 && (dVar5 = dVar7.f) != null && dVar5.c) || (next == dVar7 && (dVar4 = dVar6.f) != null && dVar4.c)) {
                    c = c2;
                } else {
                    c = 0;
                }
                e.b bVar = eVar2.V[c2];
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && !a2) {
                    if (bVar == bVar2 && eVar2.z >= 0 && eVar2.y >= 0 && ((eVar2.j0 == 8 || (eVar2.t == 0 && eVar2.Z == 0.0f)) && !eVar2.z() && !eVar2.H && c != 0 && !eVar2.z())) {
                        f(i2, eVar, interfaceC0780b, eVar2);
                    }
                } else if (!eVar2.A()) {
                    if (next == dVar6 && dVar7.f == null) {
                        int e = dVar6.e() + d;
                        eVar2.K(e, eVar2.l() + e);
                        g(i2, eVar2, interfaceC0780b);
                    } else if (next == dVar7 && dVar6.f == null) {
                        int e2 = d - dVar7.e();
                        eVar2.K(e2 - eVar2.l(), e2);
                        g(i2, eVar2, interfaceC0780b);
                    } else if (c != 0 && !eVar2.z()) {
                        e(i2, eVar2, interfaceC0780b);
                    }
                }
                c2 = 1;
            }
        }
        if (eVar instanceof com.amazon.aps.iva.u2.h) {
            return;
        }
        HashSet<com.amazon.aps.iva.u2.d> hashSet2 = j2.a;
        if (hashSet2 != null && j2.c) {
            Iterator<com.amazon.aps.iva.u2.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                com.amazon.aps.iva.u2.d next2 = it2.next();
                com.amazon.aps.iva.u2.e eVar3 = next2.d;
                int i3 = i + 1;
                boolean a3 = a(eVar3);
                if (eVar3.A() && a3) {
                    com.amazon.aps.iva.u2.f.V(eVar3, interfaceC0780b, new b.a());
                }
                com.amazon.aps.iva.u2.d dVar8 = eVar3.L;
                com.amazon.aps.iva.u2.d dVar9 = eVar3.N;
                if ((next2 == dVar8 && (dVar3 = dVar9.f) != null && dVar3.c) || (next2 == dVar9 && (dVar2 = dVar8.f) != null && dVar2.c)) {
                    z = true;
                } else {
                    z = false;
                }
                e.b bVar3 = eVar3.V[1];
                e.b bVar4 = e.b.MATCH_CONSTRAINT;
                if (bVar3 == bVar4 && !a3) {
                    if (bVar3 == bVar4 && eVar3.z >= 0 && eVar3.y >= 0) {
                        if (eVar3.j0 != 8) {
                            if (eVar3.t == 0) {
                                if (eVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!eVar3.z() && !eVar3.H && z && !eVar3.z()) {
                            f(i3, eVar, interfaceC0780b, eVar3);
                        }
                    }
                } else if (!eVar3.A()) {
                    if (next2 == dVar8 && dVar9.f == null) {
                        int e3 = dVar8.e() + d2;
                        eVar3.K(e3, eVar3.l() + e3);
                        g(i3, eVar3, interfaceC0780b);
                    } else if (next2 == dVar9 && dVar8.f == null) {
                        int e4 = d2 - dVar9.e();
                        eVar3.K(e4 - eVar3.l(), e4);
                        g(i3, eVar3, interfaceC0780b);
                    } else if (z && !eVar3.z()) {
                        e(i3, eVar3, interfaceC0780b);
                    }
                }
            }
        }
        com.amazon.aps.iva.u2.d j3 = eVar.j(d.b.BASELINE);
        if (j3.a != null && j3.c) {
            int d3 = j3.d();
            Iterator<com.amazon.aps.iva.u2.d> it3 = j3.a.iterator();
            while (it3.hasNext()) {
                com.amazon.aps.iva.u2.d next3 = it3.next();
                com.amazon.aps.iva.u2.e eVar4 = next3.d;
                int i4 = i + 1;
                boolean a4 = a(eVar4);
                if (eVar4.A() && a4) {
                    com.amazon.aps.iva.u2.f.V(eVar4, interfaceC0780b, new b.a());
                }
                if (eVar4.V[1] != e.b.MATCH_CONSTRAINT || a4) {
                    if (!eVar4.A() && next3 == (dVar = eVar4.O)) {
                        int e5 = next3.e() + d3;
                        if (eVar4.F) {
                            int i5 = e5 - eVar4.d0;
                            int i6 = eVar4.Y + i5;
                            eVar4.c0 = i5;
                            eVar4.L.l(i5);
                            eVar4.N.l(i6);
                            dVar.l(e5);
                            eVar4.m = true;
                        }
                        g(i4, eVar4, interfaceC0780b);
                    }
                }
            }
        }
        eVar.o = true;
    }
}
