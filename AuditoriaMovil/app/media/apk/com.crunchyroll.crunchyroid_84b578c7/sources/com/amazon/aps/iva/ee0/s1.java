package com.amazon.aps.iva.ee0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: TypeUtils.java */
/* loaded from: classes4.dex */
public final class s1 {
    public static final com.amazon.aps.iva.ge0.h a = com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.DONT_CARE, new String[0]);
    public static final com.amazon.aps.iva.ge0.h b = com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final a c = new a("NO_EXPECTED_TYPE");
    public static final a d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    /* loaded from: classes4.dex */
    public static class a extends s {
        public final String c;

        public a(String str) {
            this.c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void U0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.s1.a.U0(int):void");
        }

        @Override // com.amazon.aps.iva.ee0.s, com.amazon.aps.iva.ee0.e0
        public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
            if (fVar != null) {
                return this;
            }
            U0(3);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
        public final /* bridge */ /* synthetic */ u1 M0(boolean z) {
            P0(z);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.s, com.amazon.aps.iva.ee0.u1
        public final u1 N0(com.amazon.aps.iva.fe0.f fVar) {
            if (fVar != null) {
                return this;
            }
            U0(3);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
        public final /* bridge */ /* synthetic */ u1 O0(a1 a1Var) {
            Q0(a1Var);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.m0
        public final m0 P0(boolean z) {
            throw new IllegalStateException(this.c);
        }

        @Override // com.amazon.aps.iva.ee0.m0
        public final m0 Q0(a1 a1Var) {
            if (a1Var == null) {
                U0(0);
                throw null;
            }
            throw new IllegalStateException(this.c);
        }

        @Override // com.amazon.aps.iva.ee0.s
        public final m0 R0() {
            throw new IllegalStateException(this.c);
        }

        @Override // com.amazon.aps.iva.ee0.s
        public final m0 S0(com.amazon.aps.iva.fe0.f fVar) {
            if (fVar != null) {
                return this;
            }
            U0(3);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.s
        public final s T0(m0 m0Var) {
            throw new IllegalStateException(this.c);
        }

        @Override // com.amazon.aps.iva.ee0.m0
        public final String toString() {
            String str = this.c;
            if (str != null) {
                return str;
            }
            U0(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.s1.a(int):void");
    }

    public static boolean b(e0 e0Var) {
        if (e0Var != null) {
            if (e0Var.J0()) {
                return true;
            }
            if (com.amazon.aps.iva.dg.b.x(e0Var) && b(com.amazon.aps.iva.dg.b.g(e0Var).d)) {
                return true;
            }
            return false;
        }
        a(28);
        throw null;
    }

    public static boolean c(e0 e0Var, com.amazon.aps.iva.xb0.l<u1, Boolean> lVar) {
        if (lVar != null) {
            return d(e0Var, lVar, null);
        }
        a(43);
        throw null;
    }

    public static boolean d(e0 e0Var, com.amazon.aps.iva.xb0.l<u1, Boolean> lVar, com.amazon.aps.iva.me0.d<e0> dVar) {
        y yVar = null;
        if (lVar != null) {
            if (e0Var == null) {
                return false;
            }
            u1 L0 = e0Var.L0();
            if (q(e0Var)) {
                return lVar.invoke(L0).booleanValue();
            }
            if (dVar != null && dVar.contains(e0Var)) {
                return false;
            }
            if (lVar.invoke(L0).booleanValue()) {
                return true;
            }
            if (dVar == null) {
                dVar = new com.amazon.aps.iva.me0.d<>();
            }
            dVar.add(e0Var);
            if (L0 instanceof y) {
                yVar = (y) L0;
            }
            if (yVar != null && (d(yVar.c, lVar, dVar) || d(yVar.d, lVar, dVar))) {
                return true;
            }
            if ((L0 instanceof q) && d(((q) L0).c, lVar, dVar)) {
                return true;
            }
            c1 I0 = e0Var.I0();
            if (I0 instanceof c0) {
                for (e0 e0Var2 : ((c0) I0).b) {
                    if (d(e0Var2, lVar, dVar)) {
                        return true;
                    }
                }
                return false;
            }
            for (j1 j1Var : e0Var.G0()) {
                if (!j1Var.b() && d(j1Var.getType(), lVar, dVar)) {
                    return true;
                }
            }
            return false;
        }
        a(44);
        throw null;
    }

    public static List<j1> e(List<com.amazon.aps.iva.oc0.y0> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (com.amazon.aps.iva.oc0.y0 y0Var : list) {
                arrayList.add(new l1(y0Var.m()));
            }
            return com.amazon.aps.iva.lb0.x.X0(arrayList);
        }
        a(16);
        throw null;
    }

    public static boolean f(e0 e0Var) {
        e0 e0Var2;
        if (e0Var != null) {
            if (e0Var.I0().k() instanceof com.amazon.aps.iva.oc0.e) {
                return false;
            }
            q1 d2 = q1.d(e0Var);
            Collection<e0> g = e0Var.I0().g();
            ArrayList arrayList = new ArrayList(g.size());
            for (e0 e0Var3 : g) {
                if (e0Var3 != null) {
                    e0 k = d2.k(e0Var3, v1.INVARIANT);
                    if (k != null) {
                        e0Var2 = k(k, e0Var.J0());
                    } else {
                        e0Var2 = null;
                    }
                    if (e0Var2 != null) {
                        arrayList.add(e0Var2);
                    }
                } else {
                    a(21);
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (g((e0) it.next())) {
                    return true;
                }
            }
            return false;
        }
        a(29);
        throw null;
    }

    public static boolean g(e0 e0Var) {
        if (e0Var != null) {
            if (e0Var.J0()) {
                return true;
            }
            if (com.amazon.aps.iva.dg.b.x(e0Var) && g(com.amazon.aps.iva.dg.b.g(e0Var).d)) {
                return true;
            }
            if (e0Var.L0() instanceof q) {
                return false;
            }
            if (h(e0Var)) {
                return f(e0Var);
            }
            if (e0Var instanceof d) {
                com.amazon.aps.iva.oc0.y0 a2 = ((d) e0Var).c.a();
                if (a2 == null || f(a2.m())) {
                    return true;
                }
                return false;
            }
            c1 I0 = e0Var.I0();
            if (I0 instanceof c0) {
                for (e0 e0Var2 : I0.g()) {
                    if (g(e0Var2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        a(27);
        throw null;
    }

    public static boolean h(e0 e0Var) {
        com.amazon.aps.iva.oc0.y0 y0Var = null;
        if (e0Var != null) {
            if (e0Var != null) {
                if (e0Var.I0().k() instanceof com.amazon.aps.iva.oc0.y0) {
                    y0Var = (com.amazon.aps.iva.oc0.y0) e0Var.I0().k();
                }
                if (y0Var == null && !(e0Var.I0() instanceof com.amazon.aps.iva.fe0.n)) {
                    return false;
                }
                return true;
            }
            a(63);
            throw null;
        }
        a(60);
        throw null;
    }

    public static u1 i(e0 e0Var) {
        if (e0Var != null) {
            return j(e0Var, false);
        }
        a(2);
        throw null;
    }

    public static u1 j(e0 e0Var, boolean z) {
        if (e0Var != null) {
            u1 M0 = e0Var.L0().M0(z);
            if (M0 != null) {
                return M0;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static e0 k(e0 e0Var, boolean z) {
        if (e0Var != null) {
            if (z) {
                return j(e0Var, true);
            }
            return e0Var;
        }
        a(8);
        throw null;
    }

    public static m0 l(m0 m0Var, boolean z) {
        if (m0Var != null) {
            if (z) {
                m0 M0 = m0Var.M0(true);
                if (M0 != null) {
                    return M0;
                }
                a(6);
                throw null;
            } else if (m0Var != null) {
                return m0Var;
            } else {
                a(7);
                throw null;
            }
        }
        a(5);
        throw null;
    }

    public static s0 m(com.amazon.aps.iva.oc0.y0 y0Var) {
        if (y0Var != null) {
            return new s0(y0Var);
        }
        a(45);
        throw null;
    }

    public static k1 n(com.amazon.aps.iva.oc0.y0 y0Var, x xVar) {
        if (y0Var != null) {
            if (xVar.b() == r1.SUPERTYPE) {
                return new l1(com.amazon.aps.iva.a0.k.l(y0Var));
            }
            return new s0(y0Var);
        }
        a(46);
        throw null;
    }

    public static m0 o(c1 c1Var, com.amazon.aps.iva.xd0.i iVar, com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> lVar) {
        if (c1Var != null) {
            if (iVar != null) {
                if (lVar != null) {
                    List<j1> e = e(c1Var.getParameters());
                    a1.c.getClass();
                    return f0.g(a1.d, c1Var, e, false, iVar, lVar);
                }
                a(14);
                throw null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static m0 p(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.xd0.i iVar, com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> lVar) {
        if (com.amazon.aps.iva.ge0.k.f(hVar)) {
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        }
        return o(hVar.h(), iVar, lVar);
    }

    public static boolean q(e0 e0Var) {
        if (e0Var != null) {
            if (e0Var != c && e0Var != d) {
                return false;
            }
            return true;
        }
        a(0);
        throw null;
    }
}
