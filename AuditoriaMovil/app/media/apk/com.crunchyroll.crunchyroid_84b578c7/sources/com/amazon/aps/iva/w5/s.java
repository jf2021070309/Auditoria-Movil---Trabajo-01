package com.amazon.aps.iva.w5;

import com.amazon.aps.iva.ed0.b0;
import com.amazon.aps.iva.yc0.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: HttpDataSource.java */
/* loaded from: classes.dex */
public final class s {
    public final Object a;
    public Object b;

    public s(com.amazon.aps.iva.ad0.f fVar) {
        h.a aVar = com.amazon.aps.iva.yc0.h.a;
        this.a = fVar;
        this.b = aVar;
    }

    public final synchronized Map a() {
        try {
            if (((Map) this.b) == null) {
                this.b = Collections.unmodifiableMap(new HashMap((Map) this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.b;
    }

    public final com.amazon.aps.iva.oc0.e b(com.amazon.aps.iva.ed0.g gVar) {
        com.amazon.aps.iva.xd0.i iVar;
        com.amazon.aps.iva.oc0.h hVar;
        com.amazon.aps.iva.nd0.c c = gVar.c();
        if (c != null) {
            gVar.K();
            if (b0.SOURCE == null) {
                ((h.a) ((com.amazon.aps.iva.yc0.h) this.b)).getClass();
                return null;
            }
        }
        com.amazon.aps.iva.uc0.r o = gVar.o();
        if (o != null) {
            com.amazon.aps.iva.oc0.e b = b(o);
            if (b != null) {
                iVar = b.Q();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                hVar = iVar.g(gVar.getName(), com.amazon.aps.iva.wc0.d.FROM_JAVA_LOADER);
            } else {
                hVar = null;
            }
            if (!(hVar instanceof com.amazon.aps.iva.oc0.e)) {
                return null;
            }
            return (com.amazon.aps.iva.oc0.e) hVar;
        } else if (c == null) {
            return null;
        } else {
            com.amazon.aps.iva.nd0.c e = c.e();
            com.amazon.aps.iva.yb0.j.e(e, "fqName.parent()");
            com.amazon.aps.iva.bd0.m mVar = (com.amazon.aps.iva.bd0.m) com.amazon.aps.iva.lb0.x.v0(((com.amazon.aps.iva.ad0.f) this.a).c(e));
            if (mVar == null) {
                return null;
            }
            com.amazon.aps.iva.bd0.n nVar = mVar.l.d;
            nVar.getClass();
            return nVar.w(gVar.getName(), gVar);
        }
    }

    public s(com.amazon.aps.iva.p8.g gVar) {
        this.a = Collections.newSetFromMap(new IdentityHashMap());
        this.b = gVar;
    }

    public s(com.amazon.aps.iva.eb0.i iVar, com.amazon.aps.iva.ab0.a aVar, com.amazon.aps.iva.db0.b bVar) {
        com.amazon.aps.iva.eb0.a aVar2 = new com.amazon.aps.iva.eb0.a(aVar, bVar, new com.amazon.aps.iva.eb0.e(new com.amazon.aps.iva.eb0.d()));
        this.a = iVar;
        this.b = aVar2;
    }

    public s() {
        this.a = new HashMap();
    }
}
