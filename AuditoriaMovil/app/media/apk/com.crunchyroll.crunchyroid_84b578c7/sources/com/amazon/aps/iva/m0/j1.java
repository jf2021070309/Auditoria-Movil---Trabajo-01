package com.amazon.aps.iva.m0;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.m0.k;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.u1.e;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class j1 {
    public static final float a = 56;
    public static final float b = 125;
    public static final float c = 640;

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f2 h;
        public final /* synthetic */ com.amazon.aps.iva.o2.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f2 f2Var, com.amazon.aps.iva.o2.c cVar) {
            super(0);
            this.h = f2Var;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.d = this.i;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.k, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ f2 i;
        public final /* synthetic */ com.amazon.aps.iva.b0.f0 j;
        public final /* synthetic */ com.amazon.aps.iva.f1.u0 k;
        public final /* synthetic */ long l;
        public final /* synthetic */ long m;
        public final /* synthetic */ float n;
        public final /* synthetic */ int o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> p;
        public final /* synthetic */ long q;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 r;
        public final /* synthetic */ k.a<g2> s;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, f2 f2Var, com.amazon.aps.iva.b0.f0 f0Var, com.amazon.aps.iva.f1.u0 u0Var, long j, long j2, float f, int i, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, long j3, com.amazon.aps.iva.se0.g0 g0Var, k.a<g2> aVar, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.o, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar) {
            super(3);
            this.h = z;
            this.i = f2Var;
            this.j = f0Var;
            this.k = u0Var;
            this.l = j;
            this.m = j2;
            this.n = f;
            this.o = i;
            this.p = pVar;
            this.q = j3;
            this.r = g0Var;
            this.s = aVar;
            this.t = qVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.d0.k kVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f fVar;
            boolean z;
            boolean z2;
            int i;
            com.amazon.aps.iva.d0.k kVar2 = kVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(kVar2, "$this$BoxWithConstraints");
            if ((intValue & 14) == 0) {
                if (iVar2.H(kVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                float g = com.amazon.aps.iva.o2.a.g(kVar2.b());
                com.amazon.aps.iva.a1.f fVar2 = f.a.c;
                com.amazon.aps.iva.a1.f d = androidx.compose.foundation.layout.e.d(fVar2);
                long j = this.q;
                iVar2.s(733328855);
                boolean z3 = false;
                com.amazon.aps.iva.s1.d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                com.amazon.aps.iva.o0.c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(d);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        com.amazon.aps.iva.d0.b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new com.amazon.aps.iva.o0.x2(iVar2), iVar2, 2058660585);
                    int i2 = this.o;
                    this.p.invoke(iVar2, Integer.valueOf((i2 >> 27) & 14));
                    f2 f2Var = this.i;
                    com.amazon.aps.iva.se0.g0 g0Var = this.r;
                    l1 l1Var = new l1(f2Var, g0Var);
                    Object value = f2Var.c.h.getValue();
                    g2 g2Var = g2.Hidden;
                    if (value != g2Var) {
                        z3 = true;
                    }
                    j1.b(j, l1Var, z3, iVar2, (i2 >> 24) & 14);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                    com.amazon.aps.iva.a1.f e = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.m(kVar2.c(fVar2, a.C0097a.b), 0.0f, j1.c, 1));
                    iVar2.s(1241536180);
                    k<g2> kVar3 = f2Var.c;
                    com.amazon.aps.iva.b0.f0 f0Var = this.j;
                    boolean z4 = this.h;
                    if (z4) {
                        iVar2.s(511388516);
                        boolean H = iVar2.H(kVar3) | iVar2.H(f0Var);
                        Object t = iVar2.t();
                        if (H || t == i.a.a) {
                            t = new f1(kVar3, f0Var);
                            iVar2.n(t);
                        }
                        iVar2.G();
                        fVar = androidx.compose.ui.input.nestedscroll.a.a(fVar2, (com.amazon.aps.iva.o1.a) t, null);
                    } else {
                        fVar = fVar2;
                    }
                    iVar2.G();
                    com.amazon.aps.iva.a1.f a2 = androidx.compose.foundation.layout.c.a(e.o(fVar), new m1(f2Var));
                    if (z4 && kVar3.c() != g2Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.yb0.j.f(a2, "<this>");
                    com.amazon.aps.iva.yb0.j.f(kVar3, "state");
                    com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
                    if (kVar3.n.getValue() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    g gVar = new g(kVar3, null);
                    com.amazon.aps.iva.b0.o oVar = new com.amazon.aps.iva.b0.o(null);
                    p pVar = kVar3.f;
                    com.amazon.aps.iva.yb0.j.f(pVar, "state");
                    com.amazon.aps.iva.a1.f K = com.amazon.aps.iva.e.z.K(a2.o(new DraggableElement(pVar, com.amazon.aps.iva.b0.p.h, f0Var, z, null, new com.amazon.aps.iva.b0.q(z2), oVar, new com.amazon.aps.iva.b0.r(gVar, f0Var, null), false)), new n1(f2Var, this.s, g));
                    if (z4) {
                        fVar2 = com.amazon.aps.iva.a2.o.a(fVar2, false, new u1(f2Var, g0Var));
                    }
                    int i3 = i2 >> 12;
                    c3.a(K.o(fVar2), this.k, this.l, this.m, null, this.n, com.amazon.aps.iva.v0.b.b(iVar2, 1552994302, new v1(this.t, i2)), iVar2, (i2 & 458752) | ((i2 >> 9) & 112) | 1572864 | (i3 & 896) | (i3 & 7168), 16);
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.d0.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ f2 j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ com.amazon.aps.iva.f1.u0 l;
        public final /* synthetic */ float m;
        public final /* synthetic */ long n;
        public final /* synthetic */ long o;
        public final /* synthetic */ long p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.o, ? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> qVar, com.amazon.aps.iva.a1.f fVar, f2 f2Var, boolean z, com.amazon.aps.iva.f1.u0 u0Var, float f, long j, long j2, long j3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = qVar;
            this.i = fVar;
            this.j = f2Var;
            this.k = z;
            this.l = u0Var;
            this.m = f;
            this.n = j;
            this.o = j2;
            this.p = j3;
            this.q = pVar;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            j1.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.d0.o, ? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r36, com.amazon.aps.iva.a1.f r37, com.amazon.aps.iva.m0.f2 r38, boolean r39, com.amazon.aps.iva.f1.u0 r40, float r41, long r42, long r44, long r46, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r48, com.amazon.aps.iva.o0.i r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.j1.a(com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.m0.f2, boolean, com.amazon.aps.iva.f1.u0, float, long, long, long, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
        if (r11 == r10) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.amazon.aps.iva.z.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r19, com.amazon.aps.iva.xb0.a r21, boolean r22, com.amazon.aps.iva.o0.i r23, int r24) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.j1.b(long, com.amazon.aps.iva.xb0.a, boolean, com.amazon.aps.iva.o0.i, int):void");
    }

    public static final f2 c(g2 g2Var, com.amazon.aps.iva.z.u0 u0Var, boolean z, com.amazon.aps.iva.o0.i iVar, int i) {
        b2 b2Var;
        com.amazon.aps.iva.yb0.j.f(g2Var, "initialValue");
        iVar.s(-126412120);
        if ((i & 2) != 0) {
            u0Var = d3.a;
        }
        com.amazon.aps.iva.z.u0 u0Var2 = u0Var;
        if ((i & 4) != 0) {
            b2Var = b2.h;
        } else {
            b2Var = null;
        }
        b2 b2Var2 = b2Var;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar.i(com.amazon.aps.iva.v1.d1.e);
        iVar.y(170051607, g2Var);
        com.amazon.aps.iva.yb0.j.f(u0Var2, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(b2Var2, "confirmValueChange");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        f2 f2Var = (f2) defpackage.i.A(new Object[]{g2Var, u0Var2, Boolean.valueOf(z2), b2Var2, cVar}, com.amazon.aps.iva.x0.m.a(d2.h, new e2(u0Var2, cVar, b2Var2, z2)), new c2(g2Var, cVar, u0Var2, b2Var2, z2), iVar, 4);
        iVar.F();
        iVar.G();
        return f2Var;
    }
}
