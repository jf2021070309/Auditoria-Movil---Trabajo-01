package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.lc0.o;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeSubstitutor.java */
/* loaded from: classes4.dex */
public final class q1 {
    public static final q1 b = e(m1.a);
    public final m1 a;

    /* compiled from: TypeSubstitutor.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* loaded from: classes4.dex */
    public static final class b extends Exception {
        public b() {
            super("Out-projection in in-position");
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* loaded from: classes4.dex */
    public enum c {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public q1(m1 m1Var) {
        if (m1Var != null) {
            this.a = m1Var;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.q1.a(int):void");
    }

    public static v1 b(v1 v1Var, v1 v1Var2) {
        if (v1Var != null) {
            if (v1Var2 != null) {
                v1 v1Var3 = v1.INVARIANT;
                if (v1Var == v1Var3) {
                    if (v1Var2 != null) {
                        return v1Var2;
                    }
                    a(40);
                    throw null;
                } else if (v1Var2 == v1Var3) {
                    if (v1Var != null) {
                        return v1Var;
                    }
                    a(41);
                    throw null;
                } else if (v1Var == v1Var2) {
                    if (v1Var2 != null) {
                        return v1Var2;
                    }
                    a(42);
                    throw null;
                } else {
                    throw new AssertionError("Variance conflict: type parameter variance '" + v1Var + "' and projection kind '" + v1Var2 + "' cannot be combined");
                }
            }
            a(39);
            throw null;
        }
        a(38);
        throw null;
    }

    public static c c(v1 v1Var, v1 v1Var2) {
        v1 v1Var3 = v1.IN_VARIANCE;
        if (v1Var == v1Var3 && v1Var2 == v1.OUT_VARIANCE) {
            return c.OUT_IN_IN_POSITION;
        }
        if (v1Var == v1.OUT_VARIANCE && v1Var2 == v1Var3) {
            return c.IN_IN_OUT_POSITION;
        }
        return c.NO_CONFLICT;
    }

    public static q1 d(e0 e0Var) {
        if (e0Var != null) {
            return e(e1.b.b(e0Var.I0(), e0Var.G0()));
        }
        a(6);
        throw null;
    }

    public static q1 e(m1 m1Var) {
        if (m1Var != null) {
            return new q1(m1Var);
        }
        a(0);
        throw null;
    }

    public static q1 f(m1 m1Var, m1 m1Var2) {
        if (m1Var != null) {
            if (m1Var2 != null) {
                int i = u.d;
                if (m1Var.e()) {
                    m1Var = m1Var2;
                } else if (!m1Var2.e()) {
                    m1Var = new u(m1Var, m1Var2);
                }
                return e(m1Var);
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static String j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!com.amazon.aps.iva.aq.k.t(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    public final m1 g() {
        m1 m1Var = this.a;
        if (m1Var != null) {
            return m1Var;
        }
        a(8);
        throw null;
    }

    public final boolean h() {
        return this.a.e();
    }

    public final e0 i(e0 e0Var, v1 v1Var) {
        if (e0Var != null) {
            if (v1Var != null) {
                if (h()) {
                    if (e0Var != null) {
                        return e0Var;
                    }
                    a(11);
                    throw null;
                }
                try {
                    e0 type = l(new l1(e0Var, v1Var), null, 0).getType();
                    if (type != null) {
                        return type;
                    }
                    a(12);
                    throw null;
                } catch (b e) {
                    return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
                }
            }
            a(10);
            throw null;
        }
        a(9);
        throw null;
    }

    public final e0 k(e0 e0Var, v1 v1Var) {
        l1 l1Var;
        if (e0Var != null) {
            if (v1Var != null) {
                l1 l1Var2 = new l1(g().f(e0Var, v1Var), v1Var);
                if (!h()) {
                    try {
                        l1Var2 = l(l1Var2, null, 0);
                    } catch (b unused) {
                        l1Var2 = null;
                    }
                }
                m1 m1Var = this.a;
                if (m1Var.a() || m1Var.b()) {
                    boolean b2 = m1Var.b();
                    if (l1Var2 != null) {
                        if (!l1Var2.b()) {
                            e0 type = l1Var2.getType();
                            com.amazon.aps.iva.yb0.j.e(type, "typeProjection.type");
                            if (s1.c(type, com.amazon.aps.iva.je0.c.h)) {
                                v1 c2 = l1Var2.c();
                                com.amazon.aps.iva.yb0.j.e(c2, "typeProjection.projectionKind");
                                if (c2 == v1.OUT_VARIANCE) {
                                    l1Var = new l1(com.amazon.aps.iva.je0.b.a(type).b, c2);
                                } else if (b2) {
                                    l1Var = new l1(com.amazon.aps.iva.je0.b.a(type).a, c2);
                                } else {
                                    q1 e = e(new com.amazon.aps.iva.je0.d());
                                    if (!e.h()) {
                                        try {
                                            l1Var2 = e.l(l1Var2, null, 0);
                                        } catch (b unused2) {
                                        }
                                    }
                                }
                                l1Var2 = l1Var;
                            }
                        }
                    }
                    l1Var2 = null;
                }
                if (l1Var2 == null) {
                    return null;
                }
                return l1Var2.getType();
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    public final j1 l(j1 j1Var, com.amazon.aps.iva.oc0.y0 y0Var, int i) throws b {
        com.amazon.aps.iva.ee0.a aVar;
        m0 m0Var;
        q1 q1Var;
        o oVar;
        e0 k;
        o oVar2;
        boolean z;
        e0 e0Var = null;
        if (j1Var != null) {
            m1 m1Var = this.a;
            if (i <= 100) {
                if (j1Var.b()) {
                    return j1Var;
                }
                e0 type = j1Var.getType();
                if (type instanceof t1) {
                    t1 t1Var = (t1) type;
                    u1 E0 = t1Var.E0();
                    e0 d0 = t1Var.d0();
                    j1 l = l(new l1(E0, j1Var.c()), y0Var, i + 1);
                    if (l.b()) {
                        return l;
                    }
                    return new l1(com.amazon.aps.iva.dg.b.K(l.getType().L0(), k(d0, j1Var.c())), l.c());
                }
                if (!w.a(type) && !(type.L0() instanceof l0)) {
                    j1 d = m1Var.d(type);
                    if (d != null) {
                        if (type.getAnnotations().A(o.a.y)) {
                            c1 I0 = d.getType().I0();
                            if (I0 instanceof com.amazon.aps.iva.fe0.j) {
                                j1 j1Var2 = ((com.amazon.aps.iva.fe0.j) I0).a;
                                v1 c2 = j1Var2.c();
                                c c3 = c(j1Var.c(), c2);
                                c cVar = c.OUT_IN_IN_POSITION;
                                if (c3 == cVar) {
                                    d = new l1(j1Var2.getType());
                                } else if (y0Var != null && c(y0Var.i(), c2) == cVar) {
                                    d = new l1(j1Var2.getType());
                                }
                            }
                        }
                    } else {
                        d = null;
                    }
                    v1 c4 = j1Var.c();
                    if (d == null && com.amazon.aps.iva.dg.b.x(type)) {
                        u1 L0 = type.L0();
                        if (L0 instanceof o) {
                            oVar2 = (o) L0;
                        } else {
                            oVar2 = null;
                        }
                        if (oVar2 != null) {
                            z = oVar2.A0();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            y g = com.amazon.aps.iva.dg.b.g(type);
                            m0 m0Var2 = g.c;
                            int i2 = i + 1;
                            j1 l2 = l(new l1(m0Var2, c4), y0Var, i2);
                            m0 m0Var3 = g.d;
                            j1 l3 = l(new l1(m0Var3, c4), y0Var, i2);
                            v1 c5 = l2.c();
                            if (l2.getType() == m0Var2 && l3.getType() == m0Var3) {
                                return j1Var;
                            }
                            return new l1(f0.c(o1.a(l2.getType()), o1.a(l3.getType())), c5);
                        }
                    }
                    if (!com.amazon.aps.iva.lc0.k.F(type) && !com.amazon.aps.iva.e4.l1.D(type)) {
                        if (d != null) {
                            c c6 = c(c4, d.c());
                            if (!(type.I0() instanceof com.amazon.aps.iva.rd0.b)) {
                                int i3 = a.a[c6.ordinal()];
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        return new l1(type.I0().j().p(), v1.OUT_VARIANCE);
                                    }
                                } else {
                                    throw new b();
                                }
                            }
                            u1 L02 = type.L0();
                            if (L02 instanceof o) {
                                oVar = (o) L02;
                            } else {
                                oVar = null;
                            }
                            oVar = (oVar == null || !oVar.A0()) ? null : null;
                            if (d.b()) {
                                return d;
                            }
                            if (oVar != null) {
                                k = oVar.s0(d.getType());
                            } else {
                                k = s1.k(d.getType(), type.J0());
                            }
                            if (!type.getAnnotations().isEmpty()) {
                                com.amazon.aps.iva.pc0.h c7 = m1Var.c(type.getAnnotations());
                                if (c7 != null) {
                                    if (c7.A(o.a.y)) {
                                        c7 = new com.amazon.aps.iva.pc0.l(c7, new p1());
                                    }
                                    k = com.amazon.aps.iva.da0.a.z(k, new com.amazon.aps.iva.pc0.k(k.getAnnotations(), c7));
                                } else {
                                    a(33);
                                    throw null;
                                }
                            }
                            if (c6 == c.NO_CONFLICT) {
                                c4 = b(c4, d.c());
                            }
                            return new l1(k, c4);
                        }
                        e0 type2 = j1Var.getType();
                        v1 c8 = j1Var.c();
                        if (type2.I0().k() instanceof com.amazon.aps.iva.oc0.y0) {
                            return j1Var;
                        }
                        u1 L03 = type2.L0();
                        if (L03 instanceof com.amazon.aps.iva.ee0.a) {
                            aVar = (com.amazon.aps.iva.ee0.a) L03;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            m0Var = aVar.d;
                        } else {
                            m0Var = null;
                        }
                        if (m0Var != null) {
                            if ((m1Var instanceof b0) && m1Var.b()) {
                                b0 b0Var = (b0) m1Var;
                                q1Var = new q1(new b0(b0Var.b, b0Var.c, false));
                            } else {
                                q1Var = this;
                            }
                            e0Var = q1Var.k(m0Var, v1.INVARIANT);
                        }
                        List<com.amazon.aps.iva.oc0.y0> parameters = type2.I0().getParameters();
                        List<j1> G0 = type2.G0();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z2 = false;
                        for (int i4 = 0; i4 < parameters.size(); i4++) {
                            com.amazon.aps.iva.oc0.y0 y0Var2 = parameters.get(i4);
                            j1 j1Var3 = G0.get(i4);
                            j1 l4 = l(j1Var3, y0Var2, i + 1);
                            int i5 = a.a[c(y0Var2.i(), l4.c()).ordinal()];
                            if (i5 != 1 && i5 != 2) {
                                if (i5 == 3) {
                                    v1 i6 = y0Var2.i();
                                    v1 v1Var = v1.INVARIANT;
                                    if (i6 != v1Var && !l4.b()) {
                                        l4 = new l1(l4.getType(), v1Var);
                                    }
                                }
                            } else {
                                l4 = s1.m(y0Var2);
                            }
                            if (l4 != j1Var3) {
                                z2 = true;
                            }
                            arrayList.add(l4);
                        }
                        if (z2) {
                            G0 = arrayList;
                        }
                        com.amazon.aps.iva.pc0.h c9 = m1Var.c(type2.getAnnotations());
                        com.amazon.aps.iva.yb0.j.f(G0, "newArguments");
                        com.amazon.aps.iva.yb0.j.f(c9, "newAnnotations");
                        e0 c10 = o1.c(type2, G0, c9, 4);
                        if ((c10 instanceof m0) && (e0Var instanceof m0)) {
                            c10 = q0.d((m0) c10, (m0) e0Var);
                        }
                        return new l1(c10, c8);
                    }
                }
                return j1Var;
            }
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + j(j1Var) + "; substitution: " + j(m1Var));
        }
        a(18);
        throw null;
    }
}
