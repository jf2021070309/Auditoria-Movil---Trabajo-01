package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.rc0.n;
/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes4.dex */
public final class a extends n {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.amazon.aps.iva.nd0.f r19) {
        /*
            r18 = this;
            com.amazon.aps.iva.ge0.k r0 = com.amazon.aps.iva.ge0.k.a
            com.amazon.aps.iva.ge0.d r2 = com.amazon.aps.iva.ge0.k.b
            com.amazon.aps.iva.oc0.b0 r4 = com.amazon.aps.iva.oc0.b0.OPEN
            com.amazon.aps.iva.oc0.f r5 = com.amazon.aps.iva.oc0.f.CLASS
            com.amazon.aps.iva.lb0.z r10 = com.amazon.aps.iva.lb0.z.b
            com.amazon.aps.iva.oc0.t0$a r17 = com.amazon.aps.iva.oc0.t0.a
            com.amazon.aps.iva.de0.c$a r7 = com.amazon.aps.iva.de0.c.e
            r1 = r18
            r3 = r19
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.pc0.h$a$a r14 = com.amazon.aps.iva.pc0.h.a.a
            r15 = 1
            com.amazon.aps.iva.rc0.l r0 = new com.amazon.aps.iva.rc0.l
            r13 = 0
            com.amazon.aps.iva.oc0.b$a r16 = com.amazon.aps.iva.oc0.b.a.DECLARATION
            r11 = r0
            r12 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            com.amazon.aps.iva.oc0.q$g r1 = com.amazon.aps.iva.oc0.q.d
            r0.R0(r10, r1)
            com.amazon.aps.iva.ge0.g r1 = com.amazon.aps.iva.ge0.g.SCOPE_FOR_ERROR_CLASS
            com.amazon.aps.iva.nd0.f r2 = r0.getName()
            java.lang.String r2 = r2.b
            java.lang.String r3 = "errorConstructor.name.toString()"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.lang.String r3 = ""
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            com.amazon.aps.iva.ge0.f r1 = com.amazon.aps.iva.ge0.k.b(r1, r2)
            com.amazon.aps.iva.ge0.h r2 = new com.amazon.aps.iva.ge0.h
            com.amazon.aps.iva.ge0.j r9 = com.amazon.aps.iva.ge0.j.ERROR_CLASS
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            com.amazon.aps.iva.ge0.i r7 = com.amazon.aps.iva.ge0.k.d(r9, r4)
            java.lang.String[] r12 = new java.lang.String[r3]
            r11 = 0
            r6 = r2
            r8 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.O0(r2)
            java.util.Set r2 = com.amazon.aps.iva.e4.l1.H(r0)
            r3 = r18
            r3.G0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ge0.a.<init>(com.amazon.aps.iva.nd0.f):void");
    }

    @Override // com.amazon.aps.iva.rc0.b
    public final com.amazon.aps.iva.oc0.e E0(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.b, com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.l b(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.b, com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i d0(m1 m1Var, com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(m1Var, "typeSubstitution");
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        g gVar = g.SCOPE_FOR_ERROR_CLASS;
        String str = getName().b;
        com.amazon.aps.iva.yb0.j.e(str, "name.toString()");
        return k.b(gVar, str, m1Var.toString());
    }

    @Override // com.amazon.aps.iva.rc0.n
    public final String toString() {
        String b = getName().b();
        com.amazon.aps.iva.yb0.j.e(b, "name.asString()");
        return b;
    }
}
