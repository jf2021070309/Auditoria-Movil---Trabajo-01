package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.od0.h;
/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes4.dex */
public final class o implements com.amazon.aps.iva.ce0.j {
    public final com.amazon.aps.iva.vd0.b b;
    public final com.amazon.aps.iva.vd0.b c;
    public final t d;

    public o() {
        throw null;
    }

    public o(t tVar, com.amazon.aps.iva.id0.k kVar, com.amazon.aps.iva.md0.f fVar, com.amazon.aps.iva.ce0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "kotlinClass");
        com.amazon.aps.iva.yb0.j.f(kVar, "packageProto");
        com.amazon.aps.iva.yb0.j.f(fVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(iVar, "abiStability");
        com.amazon.aps.iva.vd0.b b = com.amazon.aps.iva.vd0.b.b(tVar.i());
        com.amazon.aps.iva.hd0.a b2 = tVar.b();
        com.amazon.aps.iva.vd0.b bVar = null;
        String str = b2.a == a.EnumC0334a.MULTIFILE_CLASS_PART ? b2.f : null;
        if (str != null) {
            if (str.length() > 0) {
                bVar = com.amazon.aps.iva.vd0.b.d(str);
            }
        }
        this.b = b;
        this.c = bVar;
        this.d = tVar;
        h.f<com.amazon.aps.iva.id0.k, Integer> fVar2 = com.amazon.aps.iva.ld0.a.m;
        com.amazon.aps.iva.yb0.j.e(fVar2, "packageModuleName");
        Integer num = (Integer) com.amazon.aps.iva.kd0.e.a(kVar, fVar2);
        if (num != null) {
            fVar.getString(num.intValue());
        }
    }

    @Override // com.amazon.aps.iva.ce0.j
    public final String a() {
        return "Class '" + d().b().b() + '\'';
    }

    public final com.amazon.aps.iva.nd0.b d() {
        com.amazon.aps.iva.nd0.c cVar;
        com.amazon.aps.iva.vd0.b bVar = this.b;
        String str = bVar.a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = com.amazon.aps.iva.nd0.c.c;
            if (cVar == null) {
                com.amazon.aps.iva.vd0.b.a(7);
                throw null;
            }
        } else {
            cVar = new com.amazon.aps.iva.nd0.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String e = bVar.e();
        com.amazon.aps.iva.yb0.j.e(e, "className.internalName");
        return new com.amazon.aps.iva.nd0.b(cVar, com.amazon.aps.iva.nd0.f.h(com.amazon.aps.iva.oe0.q.K0('/', e, e)));
    }

    public final String toString() {
        return o.class.getSimpleName() + ": " + this.b;
    }

    @Override // com.amazon.aps.iva.oc0.t0
    public final void b() {
    }
}
