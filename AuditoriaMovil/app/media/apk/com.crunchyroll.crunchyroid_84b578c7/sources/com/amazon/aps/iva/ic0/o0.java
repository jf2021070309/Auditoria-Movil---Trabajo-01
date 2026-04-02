package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ad0.d;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fe0.l;
import com.amazon.aps.iva.gd0.y;
import com.amazon.aps.iva.nc0.g;
import com.amazon.aps.iva.oc0.w0;
import com.amazon.aps.iva.qc0.a;
import com.amazon.aps.iva.qc0.c;
import com.amazon.aps.iva.wc0.c;
import com.amazon.aps.iva.xc0.r;
import com.amazon.aps.iva.yc0.g;
import com.amazon.aps.iva.yc0.k;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: moduleByClassLoader.kt */
/* loaded from: classes4.dex */
public final class o0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final com.amazon.aps.iva.tc0.h a(Class<?> cls) {
        com.amazon.aps.iva.nc0.g gVar;
        com.amazon.aps.iva.qc0.a aVar;
        com.amazon.aps.iva.qc0.c cVar;
        com.amazon.aps.iva.yb0.j.f(cls, "<this>");
        ClassLoader d = com.amazon.aps.iva.uc0.d.d(cls);
        w0 w0Var = new w0(d);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(w0Var);
        if (weakReference != null) {
            com.amazon.aps.iva.tc0.h hVar = (com.amazon.aps.iva.tc0.h) weakReference.get();
            if (hVar != null) {
                return hVar;
            }
            concurrentHashMap.remove(w0Var, weakReference);
        }
        com.amazon.aps.iva.tc0.f fVar = new com.amazon.aps.iva.tc0.f(d);
        ClassLoader classLoader = com.amazon.aps.iva.kb0.q.class.getClassLoader();
        com.amazon.aps.iva.yb0.j.e(classLoader, "Unit::class.java.classLoader");
        com.amazon.aps.iva.tc0.f fVar2 = new com.amazon.aps.iva.tc0.f(classLoader);
        com.amazon.aps.iva.tc0.d dVar = new com.amazon.aps.iva.tc0.d(d);
        String str = "runtime module for " + d;
        f1 f1Var = f1.c;
        com.amazon.aps.iva.tc0.i iVar = com.amazon.aps.iva.tc0.i.a;
        com.amazon.aps.iva.yb0.j.f(str, "moduleName");
        com.amazon.aps.iva.de0.c cVar2 = new com.amazon.aps.iva.de0.c("DeserializationComponentsForJava.ModuleData");
        com.amazon.aps.iva.nc0.g gVar2 = new com.amazon.aps.iva.nc0.g(cVar2, g.a.FROM_DEPENDENCIES);
        com.amazon.aps.iva.rc0.g0 g0Var = new com.amazon.aps.iva.rc0.g0(com.amazon.aps.iva.nd0.f.j("<" + str + '>'), cVar2, gVar2, 56);
        cVar2.j(new com.amazon.aps.iva.lc0.j(gVar2, g0Var));
        gVar2.f = new com.amazon.aps.iva.nc0.j(g0Var);
        com.amazon.aps.iva.gd0.l lVar = new com.amazon.aps.iva.gd0.l();
        com.amazon.aps.iva.ad0.i iVar2 = new com.amazon.aps.iva.ad0.i();
        w0 w0Var2 = w0Var;
        com.amazon.aps.iva.oc0.e0 e0Var = new com.amazon.aps.iva.oc0.e0(cVar2, g0Var);
        y.a aVar2 = y.a.a;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        k.a aVar3 = com.amazon.aps.iva.yc0.k.a;
        g.a aVar4 = g.a.a;
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        com.amazon.aps.iva.wd0.b bVar = new com.amazon.aps.iva.wd0.b(cVar2);
        w0.a aVar5 = w0.a.a;
        c.a aVar6 = c.a.a;
        com.amazon.aps.iva.lc0.m mVar = new com.amazon.aps.iva.lc0.m(g0Var, e0Var);
        com.amazon.aps.iva.xc0.y yVar = com.amazon.aps.iva.xc0.y.d;
        com.amazon.aps.iva.xc0.e eVar = new com.amazon.aps.iva.xc0.e(yVar);
        d.a aVar7 = d.a.a;
        com.amazon.aps.iva.fd0.t tVar = new com.amazon.aps.iva.fd0.t(new com.amazon.aps.iva.fd0.g());
        r.a aVar8 = r.a.a;
        com.amazon.aps.iva.fe0.l.b.getClass();
        com.amazon.aps.iva.fe0.m mVar2 = l.a.b;
        com.amazon.aps.iva.ad0.f fVar3 = new com.amazon.aps.iva.ad0.f(new com.amazon.aps.iva.ad0.c(cVar2, dVar, fVar, lVar, aVar3, f1Var, aVar4, bVar, iVar, iVar2, aVar2, aVar5, aVar6, g0Var, mVar, eVar, tVar, aVar8, aVar7, mVar2, yVar, new com.amazon.aps.iva.gd0.j()));
        com.amazon.aps.iva.md0.e eVar2 = com.amazon.aps.iva.md0.e.g;
        com.amazon.aps.iva.yb0.j.f(eVar2, "jvmMetadataVersion");
        com.amazon.aps.iva.gd0.m mVar3 = new com.amazon.aps.iva.gd0.m(fVar, lVar);
        com.amazon.aps.iva.gd0.h hVar2 = new com.amazon.aps.iva.gd0.h(g0Var, e0Var, cVar2, fVar);
        hVar2.f = eVar2;
        List J = f1.J(com.amazon.aps.iva.ee0.p.a);
        com.amazon.aps.iva.lc0.k kVar = g0Var.e;
        if (kVar instanceof com.amazon.aps.iva.nc0.g) {
            gVar = (com.amazon.aps.iva.nc0.g) kVar;
        } else {
            gVar = null;
        }
        com.amazon.aps.iva.gd0.n nVar = com.amazon.aps.iva.gd0.n.a;
        if (gVar == null || (aVar = gVar.M()) == null) {
            aVar = a.C0644a.a;
        }
        com.amazon.aps.iva.qc0.a aVar9 = aVar;
        if (gVar == null || (cVar = gVar.M()) == null) {
            cVar = c.b.a;
        }
        com.amazon.aps.iva.ae0.l lVar2 = new com.amazon.aps.iva.ae0.l(cVar2, g0Var, mVar3, hVar2, fVar3, f1Var, nVar, zVar, e0Var, aVar9, cVar, com.amazon.aps.iva.md0.h.a, mVar2, new com.amazon.aps.iva.wd0.b(cVar2), J, 262144);
        lVar.a = lVar2;
        iVar2.a = new com.amazon.aps.iva.w5.s(fVar3);
        com.amazon.aps.iva.nc0.t tVar2 = new com.amazon.aps.iva.nc0.t(cVar2, fVar2, g0Var, e0Var, gVar2.M(), gVar2.M(), mVar2, new com.amazon.aps.iva.wd0.b(cVar2));
        g0Var.h = new com.amazon.aps.iva.rc0.d0(com.amazon.aps.iva.lb0.o.b0(new com.amazon.aps.iva.rc0.g0[]{g0Var}));
        g0Var.i = new com.amazon.aps.iva.rc0.o(f1.K(fVar3, tVar2), "CompositeProvider@RuntimeModuleData for " + g0Var);
        com.amazon.aps.iva.tc0.h hVar3 = new com.amazon.aps.iva.tc0.h(lVar2, new com.amazon.aps.iva.tc0.a(lVar, fVar));
        while (true) {
            w0 w0Var3 = w0Var2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(w0Var3, new WeakReference(hVar3));
            if (weakReference2 == null) {
                return hVar3;
            }
            com.amazon.aps.iva.tc0.h hVar4 = (com.amazon.aps.iva.tc0.h) weakReference2.get();
            if (hVar4 != null) {
                return hVar4;
            }
            concurrentHashMap3.remove(w0Var3, weakReference2);
            w0Var2 = w0Var3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
