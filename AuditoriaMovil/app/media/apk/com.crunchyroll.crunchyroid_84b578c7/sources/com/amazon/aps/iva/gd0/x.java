package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.s0;
/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes4.dex */
public final class x {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if ((r6 instanceof com.amazon.aps.iva.oc0.o0) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(com.amazon.aps.iva.oc0.v r6, int r7) {
        /*
            r0 = r7 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r7 = r7 & 2
            if (r7 == 0) goto Lf
            r7 = r2
            goto L10
        Lf:
            r7 = r1
        L10:
            java.lang.String r3 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r7 == 0) goto L33
            boolean r7 = r6 instanceof com.amazon.aps.iva.oc0.j
            if (r7 == 0) goto L23
            java.lang.String r7 = "<init>"
            goto L30
        L23:
            com.amazon.aps.iva.nd0.f r7 = r6.getName()
            java.lang.String r7 = r7.b()
            java.lang.String r4 = "name.asString()"
            com.amazon.aps.iva.yb0.j.e(r7, r4)
        L30:
            r3.append(r7)
        L33:
            java.lang.String r7 = "("
            r3.append(r7)
            com.amazon.aps.iva.oc0.q0 r7 = r6.M()
            if (r7 == 0) goto L4e
            com.amazon.aps.iva.ee0.e0 r7 = r7.getType()
            java.lang.String r4 = "it.type"
            com.amazon.aps.iva.yb0.j.e(r7, r4)
            com.amazon.aps.iva.gd0.p r7 = c(r7)
            r3.append(r7)
        L4e:
            java.util.List r7 = r6.f()
            java.util.Iterator r7 = r7.iterator()
        L56:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L73
            java.lang.Object r4 = r7.next()
            com.amazon.aps.iva.oc0.c1 r4 = (com.amazon.aps.iva.oc0.c1) r4
            com.amazon.aps.iva.ee0.e0 r4 = r4.getType()
            java.lang.String r5 = "parameter.type"
            com.amazon.aps.iva.yb0.j.e(r4, r5)
            com.amazon.aps.iva.gd0.p r4 = c(r4)
            r3.append(r4)
            goto L56
        L73:
            java.lang.String r7 = ")"
            r3.append(r7)
            if (r0 == 0) goto Lb8
            boolean r7 = r6 instanceof com.amazon.aps.iva.oc0.j
            if (r7 == 0) goto L7f
            goto La1
        L7f:
            com.amazon.aps.iva.ee0.e0 r7 = r6.getReturnType()
            com.amazon.aps.iva.yb0.j.c(r7)
            com.amazon.aps.iva.nd0.f r0 = com.amazon.aps.iva.lc0.k.e
            com.amazon.aps.iva.nd0.d r0 = com.amazon.aps.iva.lc0.o.a.d
            boolean r7 = com.amazon.aps.iva.lc0.k.E(r7, r0)
            if (r7 == 0) goto La2
            com.amazon.aps.iva.ee0.e0 r7 = r6.getReturnType()
            com.amazon.aps.iva.yb0.j.c(r7)
            boolean r7 = com.amazon.aps.iva.ee0.s1.g(r7)
            if (r7 != 0) goto La2
            boolean r7 = r6 instanceof com.amazon.aps.iva.oc0.o0
            if (r7 != 0) goto La2
        La1:
            r1 = r2
        La2:
            if (r1 == 0) goto Laa
            java.lang.String r6 = "V"
            r3.append(r6)
            goto Lb8
        Laa:
            com.amazon.aps.iva.ee0.e0 r6 = r6.getReturnType()
            com.amazon.aps.iva.yb0.j.c(r6)
            com.amazon.aps.iva.gd0.p r6 = c(r6)
            r3.append(r6)
        Lb8:
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "StringBuilder().apply(builderAction).toString()"
            com.amazon.aps.iva.yb0.j.e(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gd0.x.a(com.amazon.aps.iva.oc0.v, int):java.lang.String");
    }

    public static final String b(com.amazon.aps.iva.oc0.a aVar) {
        com.amazon.aps.iva.oc0.e eVar;
        s0 s0Var;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        if (com.amazon.aps.iva.qd0.i.o(aVar)) {
            return null;
        }
        com.amazon.aps.iva.oc0.k d = aVar.d();
        if (d instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) d;
        } else {
            eVar = null;
        }
        if (eVar == null || eVar.getName().c) {
            return null;
        }
        com.amazon.aps.iva.oc0.a a = aVar.a();
        if (a instanceof s0) {
            s0Var = (s0) a;
        } else {
            s0Var = null;
        }
        if (s0Var == null) {
            return null;
        }
        return com.amazon.aps.iva.aq.k.F(eVar, a(s0Var, 3));
    }

    public static final p c(e0 e0Var) {
        return (p) com.amazon.aps.iva.ab.t.s(e0Var, b0.k, com.amazon.aps.iva.me0.b.b);
    }
}
