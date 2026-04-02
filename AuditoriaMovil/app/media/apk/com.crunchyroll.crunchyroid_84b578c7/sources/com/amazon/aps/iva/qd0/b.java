package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.xd0.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: SealedClassInheritorsProvider.kt */
/* loaded from: classes4.dex */
public final class b extends com.amazon.aps.iva.ab.a {
    public static final void s(com.amazon.aps.iva.ce0.d dVar, LinkedHashSet linkedHashSet, com.amazon.aps.iva.xd0.i iVar, boolean z) {
        boolean z2;
        for (com.amazon.aps.iva.oc0.k kVar : l.a.a(iVar, com.amazon.aps.iva.xd0.d.o, 2)) {
            if (kVar instanceof com.amazon.aps.iva.oc0.e) {
                com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) kVar;
                if (eVar.g0()) {
                    com.amazon.aps.iva.nd0.f name = eVar.getName();
                    com.amazon.aps.iva.yb0.j.e(name, "descriptor.name");
                    com.amazon.aps.iva.oc0.h g = iVar.g(name, com.amazon.aps.iva.wc0.d.WHEN_GET_ALL_DESCRIPTORS);
                    if (g instanceof com.amazon.aps.iva.oc0.e) {
                        eVar = (com.amazon.aps.iva.oc0.e) g;
                    } else if (g instanceof x0) {
                        eVar = ((x0) g).q();
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null) {
                    int i = i.a;
                    Iterator<e0> it = eVar.h().g().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (i.p(it.next(), dVar)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        linkedHashSet.add(eVar);
                    }
                    if (z) {
                        com.amazon.aps.iva.xd0.i Q = eVar.Q();
                        com.amazon.aps.iva.yb0.j.e(Q, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        s(dVar, linkedHashSet, Q, z);
                    }
                }
            }
        }
    }
}
