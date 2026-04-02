package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lc0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final LinkedHashSet a;

    static {
        Set<l> set = l.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(set));
        for (l lVar : set) {
            com.amazon.aps.iva.yb0.j.f(lVar, "primitiveType");
            arrayList.add(o.k.c(lVar.getTypeName()));
        }
        com.amazon.aps.iva.nd0.c h = o.a.f.h();
        com.amazon.aps.iva.yb0.j.e(h, "string.toSafe()");
        ArrayList M0 = x.M0(arrayList, h);
        com.amazon.aps.iva.nd0.c h2 = o.a.h.h();
        com.amazon.aps.iva.yb0.j.e(h2, "_boolean.toSafe()");
        ArrayList M02 = x.M0(M0, h2);
        com.amazon.aps.iva.nd0.c h3 = o.a.j.h();
        com.amazon.aps.iva.yb0.j.e(h3, "_enum.toSafe()");
        ArrayList M03 = x.M0(M02, h3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = M03.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(com.amazon.aps.iva.nd0.b.l((com.amazon.aps.iva.nd0.c) it.next()));
        }
        a = linkedHashSet;
    }
}
