package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ic0.f;
import com.amazon.aps.iva.ic0.g;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.od0.h;
import java.lang.reflect.Method;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes4.dex */
public final class t0 {
    public static final com.amazon.aps.iva.nd0.b a = com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("java.lang.Void"));

    public static f.e a(com.amazon.aps.iva.oc0.v vVar) {
        String a2 = com.amazon.aps.iva.xc0.i0.a(vVar);
        if (a2 == null) {
            if (vVar instanceof com.amazon.aps.iva.oc0.o0) {
                String b = com.amazon.aps.iva.ud0.b.k(vVar).getName().b();
                com.amazon.aps.iva.yb0.j.e(b, "descriptor.propertyIfAccessor.name.asString()");
                a2 = com.amazon.aps.iva.xc0.c0.a(b);
            } else if (vVar instanceof com.amazon.aps.iva.oc0.p0) {
                String b2 = com.amazon.aps.iva.ud0.b.k(vVar).getName().b();
                com.amazon.aps.iva.yb0.j.e(b2, "descriptor.propertyIfAccessor.name.asString()");
                a2 = com.amazon.aps.iva.xc0.c0.b(b2);
            } else {
                a2 = vVar.getName().b();
                com.amazon.aps.iva.yb0.j.e(a2, "descriptor.name.asString()");
            }
        }
        return new f.e(new d.b(a2, com.amazon.aps.iva.gd0.x.a(vVar, 1)));
    }

    public static g b(com.amazon.aps.iva.oc0.n0 n0Var) {
        com.amazon.aps.iva.dd0.a aVar;
        com.amazon.aps.iva.uc0.v vVar;
        com.amazon.aps.iva.oc0.t0 t0Var;
        com.amazon.aps.iva.dd0.a aVar2;
        com.amazon.aps.iva.uc0.v vVar2;
        com.amazon.aps.iva.uc0.a0 a0Var;
        com.amazon.aps.iva.yb0.j.f(n0Var, "possiblyOverriddenProperty");
        com.amazon.aps.iva.oc0.n0 a2 = ((com.amazon.aps.iva.oc0.n0) com.amazon.aps.iva.qd0.i.u(n0Var)).a();
        com.amazon.aps.iva.yb0.j.e(a2, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        f.e eVar = null;
        if (a2 instanceof com.amazon.aps.iva.ce0.n) {
            com.amazon.aps.iva.ce0.n nVar = (com.amazon.aps.iva.ce0.n) a2;
            h.f<com.amazon.aps.iva.id0.m, a.c> fVar = com.amazon.aps.iva.ld0.a.d;
            com.amazon.aps.iva.yb0.j.e(fVar, "propertySignature");
            com.amazon.aps.iva.id0.m mVar = nVar.C;
            a.c cVar = (a.c) com.amazon.aps.iva.kd0.e.a(mVar, fVar);
            if (cVar != null) {
                return new g.c(a2, mVar, cVar, nVar.D, nVar.E);
            }
        } else if (a2 instanceof com.amazon.aps.iva.zc0.f) {
            com.amazon.aps.iva.oc0.t0 g = ((com.amazon.aps.iva.zc0.f) a2).g();
            if (g instanceof com.amazon.aps.iva.dd0.a) {
                aVar = (com.amazon.aps.iva.dd0.a) g;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                vVar = aVar.c();
            } else {
                vVar = null;
            }
            if (vVar instanceof com.amazon.aps.iva.uc0.x) {
                return new g.a(((com.amazon.aps.iva.uc0.x) vVar).a);
            }
            if (vVar instanceof com.amazon.aps.iva.uc0.a0) {
                Method method2 = ((com.amazon.aps.iva.uc0.a0) vVar).a;
                com.amazon.aps.iva.oc0.p0 setter = a2.getSetter();
                if (setter != null) {
                    t0Var = setter.g();
                } else {
                    t0Var = null;
                }
                if (t0Var instanceof com.amazon.aps.iva.dd0.a) {
                    aVar2 = (com.amazon.aps.iva.dd0.a) t0Var;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    vVar2 = aVar2.c();
                } else {
                    vVar2 = null;
                }
                if (vVar2 instanceof com.amazon.aps.iva.uc0.a0) {
                    a0Var = (com.amazon.aps.iva.uc0.a0) vVar2;
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    method = a0Var.a;
                }
                return new g.b(method2, method);
            }
            throw new com.amazon.aps.iva.wb0.a("Incorrect resolution sequence for Java field " + a2 + " (source = " + vVar + ')');
        }
        com.amazon.aps.iva.rc0.m0 getter = a2.getGetter();
        com.amazon.aps.iva.yb0.j.c(getter);
        f.e a3 = a(getter);
        com.amazon.aps.iva.oc0.p0 setter2 = a2.getSetter();
        if (setter2 != null) {
            eVar = a(setter2);
        }
        return new g.d(a3, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
        if (r0.f().isEmpty() != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.ic0.f c(com.amazon.aps.iva.oc0.v r6) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ic0.t0.c(com.amazon.aps.iva.oc0.v):com.amazon.aps.iva.ic0.f");
    }
}
