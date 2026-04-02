package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.gd0.p;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.qd0.j;
import java.util.Iterator;
import java.util.List;
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes4.dex */
public final class u implements com.amazon.aps.iva.qd0.j {

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean a(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
            com.amazon.aps.iva.yb0.j.f(aVar, "superDescriptor");
            com.amazon.aps.iva.yb0.j.f(aVar2, "subDescriptor");
            if ((aVar2 instanceof com.amazon.aps.iva.zc0.e) && (aVar instanceof com.amazon.aps.iva.oc0.v)) {
                com.amazon.aps.iva.zc0.e eVar = (com.amazon.aps.iva.zc0.e) aVar2;
                eVar.f().size();
                com.amazon.aps.iva.oc0.v vVar = (com.amazon.aps.iva.oc0.v) aVar;
                vVar.f().size();
                List<c1> f = eVar.a().f();
                com.amazon.aps.iva.yb0.j.e(f, "subDescriptor.original.valueParameters");
                List<c1> f2 = vVar.a().f();
                com.amazon.aps.iva.yb0.j.e(f2, "superDescriptor.original.valueParameters");
                Iterator it = com.amazon.aps.iva.lb0.x.e1(f, f2).iterator();
                while (it.hasNext()) {
                    com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
                    c1 c1Var = (c1) jVar.b;
                    c1 c1Var2 = (c1) jVar.c;
                    com.amazon.aps.iva.yb0.j.e(c1Var, "subParameter");
                    boolean z = b((com.amazon.aps.iva.oc0.v) aVar2, c1Var) instanceof p.c;
                    com.amazon.aps.iva.yb0.j.e(c1Var2, "superParameter");
                    if (z != (b(vVar, c1Var2) instanceof p.c)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.gd0.p b(com.amazon.aps.iva.oc0.v r6, com.amazon.aps.iva.oc0.c1 r7) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xc0.u.a.b(com.amazon.aps.iva.oc0.v, com.amazon.aps.iva.oc0.c1):com.amazon.aps.iva.gd0.p");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (com.amazon.aps.iva.xc0.j0.k.contains(r2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r0, com.amazon.aps.iva.gd0.x.a(r2, 2)) != false) goto L41;
     */
    @Override // com.amazon.aps.iva.qd0.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.qd0.j.b a(com.amazon.aps.iva.oc0.a r8, com.amazon.aps.iva.oc0.a r9, com.amazon.aps.iva.oc0.e r10) {
        /*
            r7 = this;
            java.lang.String r0 = "superDescriptor"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "subDescriptor"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            boolean r0 = r8 instanceof com.amazon.aps.iva.oc0.b
            r1 = 0
            if (r0 == 0) goto Lad
            boolean r0 = r9 instanceof com.amazon.aps.iva.oc0.v
            if (r0 == 0) goto Lad
            boolean r0 = com.amazon.aps.iva.lc0.k.A(r9)
            if (r0 == 0) goto L1b
            goto Lad
        L1b:
            int r0 = com.amazon.aps.iva.xc0.h.m
            r0 = r9
            com.amazon.aps.iva.oc0.v r0 = (com.amazon.aps.iva.oc0.v) r0
            com.amazon.aps.iva.nd0.f r2 = r0.getName()
            java.lang.String r3 = "subDescriptor.name"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            boolean r2 = com.amazon.aps.iva.xc0.h.b(r2)
            if (r2 != 0) goto L42
            com.amazon.aps.iva.xc0.j0$a r2 = com.amazon.aps.iva.xc0.j0.a
            com.amazon.aps.iva.nd0.f r2 = r0.getName()
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.util.ArrayList r3 = com.amazon.aps.iva.xc0.j0.k
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L42
            goto Lad
        L42:
            r2 = r8
            com.amazon.aps.iva.oc0.b r2 = (com.amazon.aps.iva.oc0.b) r2
            com.amazon.aps.iva.oc0.b r2 = com.amazon.aps.iva.xc0.i0.c(r2)
            boolean r3 = r8 instanceof com.amazon.aps.iva.oc0.v
            if (r3 == 0) goto L51
            r4 = r8
            com.amazon.aps.iva.oc0.v r4 = (com.amazon.aps.iva.oc0.v) r4
            goto L52
        L51:
            r4 = 0
        L52:
            r5 = 1
            if (r4 == 0) goto L61
            boolean r6 = r0.y0()
            boolean r4 = r4.y0()
            if (r6 != r4) goto L61
            r4 = r5
            goto L62
        L61:
            r4 = r1
        L62:
            r4 = r4 ^ r5
            if (r4 == 0) goto L6e
            if (r2 == 0) goto Lac
            boolean r4 = r0.y0()
            if (r4 != 0) goto L6e
            goto Lac
        L6e:
            boolean r4 = r10 instanceof com.amazon.aps.iva.zc0.c
            if (r4 == 0) goto Lad
            com.amazon.aps.iva.oc0.v r4 = r0.m0()
            if (r4 == 0) goto L79
            goto Lad
        L79:
            if (r2 == 0) goto Lad
            boolean r10 = com.amazon.aps.iva.xc0.i0.d(r10, r2)
            if (r10 == 0) goto L82
            goto Lad
        L82:
            boolean r10 = r2 instanceof com.amazon.aps.iva.oc0.v
            if (r10 == 0) goto Lac
            if (r3 == 0) goto Lac
            com.amazon.aps.iva.oc0.v r2 = (com.amazon.aps.iva.oc0.v) r2
            com.amazon.aps.iva.oc0.v r10 = com.amazon.aps.iva.xc0.h.a(r2)
            if (r10 == 0) goto Lac
            r10 = 2
            java.lang.String r0 = com.amazon.aps.iva.gd0.x.a(r0, r10)
            r2 = r8
            com.amazon.aps.iva.oc0.v r2 = (com.amazon.aps.iva.oc0.v) r2
            com.amazon.aps.iva.oc0.v r2 = r2.a()
            java.lang.String r3 = "superDescriptor.original"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.lang.String r10 = com.amazon.aps.iva.gd0.x.a(r2, r10)
            boolean r10 = com.amazon.aps.iva.yb0.j.a(r0, r10)
            if (r10 == 0) goto Lac
            goto Lad
        Lac:
            r1 = r5
        Lad:
            if (r1 == 0) goto Lb2
            com.amazon.aps.iva.qd0.j$b r8 = com.amazon.aps.iva.qd0.j.b.INCOMPATIBLE
            return r8
        Lb2:
            boolean r8 = com.amazon.aps.iva.xc0.u.a.a(r8, r9)
            if (r8 == 0) goto Lbb
            com.amazon.aps.iva.qd0.j$b r8 = com.amazon.aps.iva.qd0.j.b.INCOMPATIBLE
            return r8
        Lbb:
            com.amazon.aps.iva.qd0.j$b r8 = com.amazon.aps.iva.qd0.j.b.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xc0.u.a(com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.e):com.amazon.aps.iva.qd0.j$b");
    }

    @Override // com.amazon.aps.iva.qd0.j
    public j.a b() {
        return j.a.CONFLICTS_ONLY;
    }
}
