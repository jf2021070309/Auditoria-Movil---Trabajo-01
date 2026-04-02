package c.g.a.i.l;

import c.g.a.i.c;
import c.g.a.i.d;
import c.g.a.i.l.b;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {
    public static b.a a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    public static int f1786b;

    /* renamed from: c  reason: collision with root package name */
    public static int f1787c;

    public static boolean a(c.g.a.i.d dVar) {
        d.a aVar;
        d.a aVar2;
        d.a m2 = dVar.m();
        d.a t = dVar.t();
        c.g.a.i.d dVar2 = dVar.V;
        c.g.a.i.e eVar = dVar2 != null ? (c.g.a.i.e) dVar2 : null;
        if (eVar != null) {
            eVar.m();
            d.a aVar3 = d.a.FIXED;
        }
        if (eVar != null) {
            eVar.t();
            d.a aVar4 = d.a.FIXED;
        }
        d.a aVar5 = d.a.FIXED;
        boolean z = m2 == aVar5 || dVar.E() || m2 == d.a.WRAP_CONTENT || (m2 == (aVar2 = d.a.MATCH_CONSTRAINT) && dVar.r == 0 && dVar.Y == 0.0f && dVar.x(0)) || (m2 == aVar2 && dVar.r == 1 && dVar.y(0, dVar.u()));
        boolean z2 = t == aVar5 || dVar.F() || t == d.a.WRAP_CONTENT || (t == (aVar = d.a.MATCH_CONSTRAINT) && dVar.s == 0 && dVar.Y == 0.0f && dVar.x(1)) || (t == aVar && dVar.s == 1 && dVar.y(1, dVar.l()));
        if (dVar.Y <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i2, c.g.a.i.d dVar, b.InterfaceC0029b interfaceC0029b, boolean z) {
        c.g.a.i.c cVar;
        c.g.a.i.c cVar2;
        c.g.a.i.c cVar3;
        c.g.a.i.c cVar4;
        if (dVar.f1752m) {
            return;
        }
        f1786b++;
        int i3 = 0;
        if (!(dVar instanceof c.g.a.i.e) && dVar.D() && a(dVar)) {
            c.g.a.i.e.f0(dVar, interfaceC0029b, new b.a(), 0);
        }
        c.g.a.i.c i4 = dVar.i(c.a.LEFT);
        c.g.a.i.c i5 = dVar.i(c.a.RIGHT);
        int c2 = i4.c();
        int c3 = i5.c();
        HashSet<c.g.a.i.c> hashSet = i4.a;
        if (hashSet != null && i4.f1734c) {
            Iterator<c.g.a.i.c> it = hashSet.iterator();
            while (it.hasNext()) {
                c.g.a.i.c next = it.next();
                c.g.a.i.d dVar2 = next.f1735d;
                int i6 = i2 + 1;
                boolean a2 = a(dVar2);
                if (dVar2.D() && a2) {
                    c.g.a.i.e.f0(dVar2, interfaceC0029b, new b.a(), i3);
                }
                c.g.a.i.c cVar5 = dVar2.J;
                boolean z2 = (next == cVar5 && (cVar4 = dVar2.L.f1737f) != null && cVar4.f1734c) || (next == dVar2.L && (cVar3 = cVar5.f1737f) != null && cVar3.f1734c);
                d.a m2 = dVar2.m();
                d.a aVar = d.a.MATCH_CONSTRAINT;
                if (m2 != aVar || a2) {
                    if (!dVar2.D()) {
                        c.g.a.i.c cVar6 = dVar2.J;
                        if (next == cVar6 && dVar2.L.f1737f == null) {
                            int d2 = cVar6.d() + c2;
                            dVar2.M(d2, dVar2.u() + d2);
                            b(i6, dVar2, interfaceC0029b, z);
                        } else {
                            c.g.a.i.c cVar7 = dVar2.L;
                            if (next == cVar7 && cVar6.f1737f == null) {
                                int d3 = c2 - cVar7.d();
                                dVar2.M(d3 - dVar2.u(), d3);
                                b(i6, dVar2, interfaceC0029b, z);
                            } else if (z2 && !dVar2.B()) {
                                c(i6, interfaceC0029b, dVar2, z);
                            }
                        }
                    }
                } else if (dVar2.m() == aVar && dVar2.v >= 0 && dVar2.u >= 0 && ((dVar2.i0 == 8 || (dVar2.r == 0 && dVar2.Y == 0.0f)) && !dVar2.B() && !dVar2.G && z2 && !dVar2.B())) {
                    d(i6, dVar, interfaceC0029b, dVar2, z);
                }
                i3 = 0;
            }
        }
        if (dVar instanceof c.g.a.i.f) {
            return;
        }
        HashSet<c.g.a.i.c> hashSet2 = i5.a;
        if (hashSet2 != null && i5.f1734c) {
            Iterator<c.g.a.i.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                c.g.a.i.c next2 = it2.next();
                c.g.a.i.d dVar3 = next2.f1735d;
                int i7 = i2 + 1;
                boolean a3 = a(dVar3);
                if (dVar3.D() && a3) {
                    c.g.a.i.e.f0(dVar3, interfaceC0029b, new b.a(), 0);
                }
                c.g.a.i.c cVar8 = dVar3.J;
                boolean z3 = (next2 == cVar8 && (cVar2 = dVar3.L.f1737f) != null && cVar2.f1734c) || (next2 == dVar3.L && (cVar = cVar8.f1737f) != null && cVar.f1734c);
                d.a m3 = dVar3.m();
                d.a aVar2 = d.a.MATCH_CONSTRAINT;
                if (m3 != aVar2 || a3) {
                    if (!dVar3.D()) {
                        c.g.a.i.c cVar9 = dVar3.J;
                        if (next2 == cVar9 && dVar3.L.f1737f == null) {
                            int d4 = cVar9.d() + c3;
                            dVar3.M(d4, dVar3.u() + d4);
                            b(i7, dVar3, interfaceC0029b, z);
                        } else {
                            c.g.a.i.c cVar10 = dVar3.L;
                            if (next2 == cVar10 && cVar9.f1737f == null) {
                                int d5 = c3 - cVar10.d();
                                dVar3.M(d5 - dVar3.u(), d5);
                                b(i7, dVar3, interfaceC0029b, z);
                            } else if (z3 && !dVar3.B()) {
                                c(i7, interfaceC0029b, dVar3, z);
                            }
                        }
                    }
                } else if (dVar3.m() == aVar2 && dVar3.v >= 0 && dVar3.u >= 0 && (dVar3.i0 == 8 || (dVar3.r == 0 && dVar3.Y == 0.0f))) {
                    if (!dVar3.B() && !dVar3.G && z3 && !dVar3.B()) {
                        d(i7, dVar, interfaceC0029b, dVar3, z);
                    }
                }
            }
        }
        dVar.f1752m = true;
    }

    public static void c(int i2, b.InterfaceC0029b interfaceC0029b, c.g.a.i.d dVar, boolean z) {
        float f2 = dVar.f0;
        int c2 = dVar.J.f1737f.c();
        int c3 = dVar.L.f1737f.c();
        int d2 = dVar.J.d() + c2;
        int d3 = c3 - dVar.L.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int u = dVar.u();
        int i3 = (c3 - c2) - u;
        if (c2 > c3) {
            i3 = (c2 - c3) - u;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + c2;
        int i5 = i4 + u;
        if (c2 > c3) {
            i5 = i4 - u;
        }
        dVar.M(i4, i5);
        b(i2 + 1, dVar, interfaceC0029b, z);
    }

    public static void d(int i2, c.g.a.i.d dVar, b.InterfaceC0029b interfaceC0029b, c.g.a.i.d dVar2, boolean z) {
        float f2 = dVar2.f0;
        int d2 = dVar2.J.d() + dVar2.J.f1737f.c();
        int c2 = dVar2.L.f1737f.c() - dVar2.L.d();
        if (c2 >= d2) {
            int u = dVar2.u();
            if (dVar2.i0 != 8) {
                int i3 = dVar2.r;
                if (i3 == 2) {
                    u = (int) (dVar2.f0 * 0.5f * (dVar instanceof c.g.a.i.e ? dVar.u() : dVar.V.u()));
                } else if (i3 == 0) {
                    u = c2 - d2;
                }
                u = Math.max(dVar2.u, u);
                int i4 = dVar2.v;
                if (i4 > 0) {
                    u = Math.min(i4, u);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((c2 - d2) - u)) + 0.5f));
            dVar2.M(i5, u + i5);
            b(i2 + 1, dVar2, interfaceC0029b, z);
        }
    }

    public static void e(int i2, b.InterfaceC0029b interfaceC0029b, c.g.a.i.d dVar) {
        float f2 = dVar.g0;
        int c2 = dVar.K.f1737f.c();
        int c3 = dVar.M.f1737f.c();
        int d2 = dVar.K.d() + c2;
        int d3 = c3 - dVar.M.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int l2 = dVar.l();
        int i3 = (c3 - c2) - l2;
        if (c2 > c3) {
            i3 = (c2 - c3) - l2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = c2 + i4;
        int i6 = i5 + l2;
        if (c2 > c3) {
            i5 = c2 - i4;
            i6 = i5 - l2;
        }
        dVar.N(i5, i6);
        g(i2 + 1, dVar, interfaceC0029b);
    }

    public static void f(int i2, c.g.a.i.d dVar, b.InterfaceC0029b interfaceC0029b, c.g.a.i.d dVar2) {
        float f2 = dVar2.g0;
        int d2 = dVar2.K.d() + dVar2.K.f1737f.c();
        int c2 = dVar2.M.f1737f.c() - dVar2.M.d();
        if (c2 >= d2) {
            int l2 = dVar2.l();
            if (dVar2.i0 != 8) {
                int i3 = dVar2.s;
                if (i3 == 2) {
                    l2 = (int) (f2 * 0.5f * (dVar instanceof c.g.a.i.e ? dVar.l() : dVar.V.l()));
                } else if (i3 == 0) {
                    l2 = c2 - d2;
                }
                l2 = Math.max(dVar2.x, l2);
                int i4 = dVar2.y;
                if (i4 > 0) {
                    l2 = Math.min(i4, l2);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((c2 - d2) - l2)) + 0.5f));
            dVar2.N(i5, l2 + i5);
            g(i2 + 1, dVar2, interfaceC0029b);
        }
    }

    public static void g(int i2, c.g.a.i.d dVar, b.InterfaceC0029b interfaceC0029b) {
        c.g.a.i.c cVar;
        c.g.a.i.c cVar2;
        c.g.a.i.c cVar3;
        c.g.a.i.c cVar4;
        if (dVar.f1753n) {
            return;
        }
        f1787c++;
        if (!(dVar instanceof c.g.a.i.e) && dVar.D() && a(dVar)) {
            c.g.a.i.e.f0(dVar, interfaceC0029b, new b.a(), 0);
        }
        c.g.a.i.c i3 = dVar.i(c.a.TOP);
        c.g.a.i.c i4 = dVar.i(c.a.BOTTOM);
        int c2 = i3.c();
        int c3 = i4.c();
        HashSet<c.g.a.i.c> hashSet = i3.a;
        if (hashSet != null && i3.f1734c) {
            Iterator<c.g.a.i.c> it = hashSet.iterator();
            while (it.hasNext()) {
                c.g.a.i.c next = it.next();
                c.g.a.i.d dVar2 = next.f1735d;
                int i5 = i2 + 1;
                boolean a2 = a(dVar2);
                if (dVar2.D() && a2) {
                    c.g.a.i.e.f0(dVar2, interfaceC0029b, new b.a(), 0);
                }
                c.g.a.i.c cVar5 = dVar2.K;
                boolean z = (next == cVar5 && (cVar4 = dVar2.M.f1737f) != null && cVar4.f1734c) || (next == dVar2.M && (cVar3 = cVar5.f1737f) != null && cVar3.f1734c);
                d.a t = dVar2.t();
                d.a aVar = d.a.MATCH_CONSTRAINT;
                if (t != aVar || a2) {
                    if (!dVar2.D()) {
                        c.g.a.i.c cVar6 = dVar2.K;
                        if (next == cVar6 && dVar2.M.f1737f == null) {
                            int d2 = cVar6.d() + c2;
                            dVar2.N(d2, dVar2.l() + d2);
                            g(i5, dVar2, interfaceC0029b);
                        } else {
                            c.g.a.i.c cVar7 = dVar2.M;
                            if (next == cVar7 && cVar6.f1737f == null) {
                                int d3 = c2 - cVar7.d();
                                dVar2.N(d3 - dVar2.l(), d3);
                                g(i5, dVar2, interfaceC0029b);
                            } else if (z && !dVar2.C()) {
                                e(i5, interfaceC0029b, dVar2);
                            }
                        }
                    }
                } else if (dVar2.t() == aVar && dVar2.y >= 0 && dVar2.x >= 0 && ((dVar2.i0 == 8 || (dVar2.s == 0 && dVar2.Y == 0.0f)) && !dVar2.C() && !dVar2.G && z && !dVar2.C())) {
                    f(i5, dVar, interfaceC0029b, dVar2);
                }
            }
        }
        if (dVar instanceof c.g.a.i.f) {
            return;
        }
        HashSet<c.g.a.i.c> hashSet2 = i4.a;
        if (hashSet2 != null && i4.f1734c) {
            Iterator<c.g.a.i.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                c.g.a.i.c next2 = it2.next();
                c.g.a.i.d dVar3 = next2.f1735d;
                int i6 = i2 + 1;
                boolean a3 = a(dVar3);
                if (dVar3.D() && a3) {
                    c.g.a.i.e.f0(dVar3, interfaceC0029b, new b.a(), 0);
                }
                c.g.a.i.c cVar8 = dVar3.K;
                boolean z2 = (next2 == cVar8 && (cVar2 = dVar3.M.f1737f) != null && cVar2.f1734c) || (next2 == dVar3.M && (cVar = cVar8.f1737f) != null && cVar.f1734c);
                d.a t2 = dVar3.t();
                d.a aVar2 = d.a.MATCH_CONSTRAINT;
                if (t2 != aVar2 || a3) {
                    if (!dVar3.D()) {
                        c.g.a.i.c cVar9 = dVar3.K;
                        if (next2 == cVar9 && dVar3.M.f1737f == null) {
                            int d4 = cVar9.d() + c3;
                            dVar3.N(d4, dVar3.l() + d4);
                            g(i6, dVar3, interfaceC0029b);
                        } else {
                            c.g.a.i.c cVar10 = dVar3.M;
                            if (next2 == cVar10 && cVar9.f1737f == null) {
                                int d5 = c3 - cVar10.d();
                                dVar3.N(d5 - dVar3.l(), d5);
                                g(i6, dVar3, interfaceC0029b);
                            } else if (z2 && !dVar3.C()) {
                                e(i6, interfaceC0029b, dVar3);
                            }
                        }
                    }
                } else if (dVar3.t() == aVar2 && dVar3.y >= 0 && dVar3.x >= 0 && (dVar3.i0 == 8 || (dVar3.s == 0 && dVar3.Y == 0.0f))) {
                    if (!dVar3.C() && !dVar3.G && z2 && !dVar3.C()) {
                        f(i6, dVar, interfaceC0029b, dVar3);
                    }
                }
            }
        }
        c.g.a.i.c i7 = dVar.i(c.a.BASELINE);
        if (i7.a != null && i7.f1734c) {
            int c4 = i7.c();
            Iterator<c.g.a.i.c> it3 = i7.a.iterator();
            while (it3.hasNext()) {
                c.g.a.i.c next3 = it3.next();
                c.g.a.i.d dVar4 = next3.f1735d;
                int i8 = i2 + 1;
                boolean a4 = a(dVar4);
                if (dVar4.D() && a4) {
                    c.g.a.i.e.f0(dVar4, interfaceC0029b, new b.a(), 0);
                }
                if (dVar4.t() != d.a.MATCH_CONSTRAINT || a4) {
                    if (!dVar4.D() && next3 == dVar4.N) {
                        int d6 = next3.d() + c4;
                        if (dVar4.E) {
                            int i9 = d6 - dVar4.c0;
                            int i10 = dVar4.X + i9;
                            dVar4.b0 = i9;
                            dVar4.K.j(i9);
                            dVar4.M.j(i10);
                            c.g.a.i.c cVar11 = dVar4.N;
                            cVar11.f1733b = d6;
                            cVar11.f1734c = true;
                            dVar4.f1751l = true;
                        }
                        g(i8, dVar4, interfaceC0029b);
                    }
                }
            }
        }
        dVar.f1753n = true;
    }
}
