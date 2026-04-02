package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: UnsignedType.kt */
/* loaded from: classes4.dex */
public final class s {
    public static final Set<com.amazon.aps.iva.nd0.f> a;
    public static final Set<com.amazon.aps.iva.nd0.f> b;
    public static final HashMap<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> c;
    public static final HashMap<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> d;
    public static final LinkedHashSet e;

    static {
        r[] values;
        r[] values2 = r.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (r rVar : values2) {
            arrayList.add(rVar.getTypeName());
        }
        a = x.c1(arrayList);
        q[] values3 = q.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (q qVar : values3) {
            arrayList2.add(qVar.getTypeName());
        }
        b = x.c1(arrayList2);
        c = new HashMap<>();
        d = new HashMap<>();
        i0.T(new com.amazon.aps.iva.kb0.j(q.UBYTEARRAY, com.amazon.aps.iva.nd0.f.h("ubyteArrayOf")), new com.amazon.aps.iva.kb0.j(q.USHORTARRAY, com.amazon.aps.iva.nd0.f.h("ushortArrayOf")), new com.amazon.aps.iva.kb0.j(q.UINTARRAY, com.amazon.aps.iva.nd0.f.h("uintArrayOf")), new com.amazon.aps.iva.kb0.j(q.ULONGARRAY, com.amazon.aps.iva.nd0.f.h("ulongArrayOf")));
        r[] values4 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : values4) {
            linkedHashSet.add(rVar2.getArrayClassId().j());
        }
        e = linkedHashSet;
        for (r rVar3 : r.values()) {
            c.put(rVar3.getArrayClassId(), rVar3.getClassId());
            d.put(rVar3.getClassId(), rVar3.getArrayClassId());
        }
    }

    public static final boolean a(e0 e0Var) {
        com.amazon.aps.iva.oc0.h k;
        if (s1.q(e0Var) || (k = e0Var.I0().k()) == null) {
            return false;
        }
        com.amazon.aps.iva.oc0.k d2 = k.d();
        if (!(d2 instanceof f0) || !com.amazon.aps.iva.yb0.j.a(((f0) d2).c(), o.k) || !a.contains(k.getName())) {
            return false;
        }
        return true;
    }
}
