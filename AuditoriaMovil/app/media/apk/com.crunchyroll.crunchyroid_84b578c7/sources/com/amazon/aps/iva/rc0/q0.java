package com.amazon.aps.iva.rc0;

import java.util.Set;
/* compiled from: SubpackagesScope.kt */
/* loaded from: classes4.dex */
public final class q0 extends com.amazon.aps.iva.xd0.j {
    public final com.amazon.aps.iva.oc0.c0 b;
    public final com.amazon.aps.iva.nd0.c c;

    public q0(g0 g0Var, com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "moduleDescriptor");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        this.b = g0Var;
        this.c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3.isEmpty() != false) goto L23;
     */
    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d r6, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            java.lang.String r0 = "nameFilter"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            int r0 = com.amazon.aps.iva.xd0.d.h
            boolean r0 = r6.a(r0)
            com.amazon.aps.iva.lb0.z r1 = com.amazon.aps.iva.lb0.z.b
            if (r0 != 0) goto L15
            return r1
        L15:
            com.amazon.aps.iva.nd0.c r0 = r5.c
            boolean r2 = r0.d()
            if (r2 == 0) goto L28
            com.amazon.aps.iva.xd0.c$b r2 = com.amazon.aps.iva.xd0.c.b.a
            java.util.List<com.amazon.aps.iva.xd0.c> r6 = r6.a
            boolean r6 = r6.contains(r2)
            if (r6 == 0) goto L28
            return r1
        L28:
            com.amazon.aps.iva.oc0.c0 r6 = r5.b
            java.util.Collection r1 = r6.r(r0, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r1.next()
            com.amazon.aps.iva.nd0.c r3 = (com.amazon.aps.iva.nd0.c) r3
            com.amazon.aps.iva.nd0.f r3 = r3.f()
            java.lang.String r4 = "subFqName.shortName()"
            com.amazon.aps.iva.yb0.j.e(r3, r4)
            java.lang.Object r4 = r7.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3b
            boolean r4 = r3.c
            if (r4 == 0) goto L61
            goto L6f
        L61:
            com.amazon.aps.iva.nd0.c r3 = r0.c(r3)
            com.amazon.aps.iva.oc0.j0 r3 = r6.y(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L70
        L6f:
            r3 = 0
        L70:
            com.amazon.aps.iva.a60.b.i(r2, r3)
            goto L3b
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.q0.e(com.amazon.aps.iva.xd0.d, com.amazon.aps.iva.xb0.l):java.util.Collection");
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        return com.amazon.aps.iva.lb0.b0.b;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
