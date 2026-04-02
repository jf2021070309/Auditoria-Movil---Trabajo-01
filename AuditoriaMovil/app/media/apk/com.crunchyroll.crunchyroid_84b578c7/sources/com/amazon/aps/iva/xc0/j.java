package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.lc0.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: BuiltinSpecialProperties.kt */
/* loaded from: classes4.dex */
public final class j {
    public static final Map<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.f> a;
    public static final LinkedHashMap b;
    public static final Set<com.amazon.aps.iva.nd0.c> c;
    public static final Set<com.amazon.aps.iva.nd0.f> d;

    static {
        com.amazon.aps.iva.nd0.d dVar = o.a.j;
        com.amazon.aps.iva.kb0.j jVar = new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.a60.b.g(dVar, AppMeasurementSdk.ConditionalUserProperty.NAME), com.amazon.aps.iva.nd0.f.h(AppMeasurementSdk.ConditionalUserProperty.NAME));
        com.amazon.aps.iva.kb0.j jVar2 = new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.a60.b.g(dVar, "ordinal"), com.amazon.aps.iva.nd0.f.h("ordinal"));
        com.amazon.aps.iva.kb0.j jVar3 = new com.amazon.aps.iva.kb0.j(o.a.B.c(com.amazon.aps.iva.nd0.f.h("size")), com.amazon.aps.iva.nd0.f.h("size"));
        com.amazon.aps.iva.nd0.c cVar = o.a.F;
        Map<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.f> U = com.amazon.aps.iva.lb0.i0.U(jVar, jVar2, jVar3, new com.amazon.aps.iva.kb0.j(cVar.c(com.amazon.aps.iva.nd0.f.h("size")), com.amazon.aps.iva.nd0.f.h("size")), new com.amazon.aps.iva.kb0.j(com.amazon.aps.iva.a60.b.g(o.a.e, "length"), com.amazon.aps.iva.nd0.f.h("length")), new com.amazon.aps.iva.kb0.j(cVar.c(com.amazon.aps.iva.nd0.f.h("keys")), com.amazon.aps.iva.nd0.f.h("keySet")), new com.amazon.aps.iva.kb0.j(cVar.c(com.amazon.aps.iva.nd0.f.h("values")), com.amazon.aps.iva.nd0.f.h("values")), new com.amazon.aps.iva.kb0.j(cVar.c(com.amazon.aps.iva.nd0.f.h("entries")), com.amazon.aps.iva.nd0.f.h("entrySet")));
        a = U;
        Set<Map.Entry<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.f>> entrySet = U.entrySet();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(entrySet));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new com.amazon.aps.iva.kb0.j(((com.amazon.aps.iva.nd0.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar4 = (com.amazon.aps.iva.kb0.j) it2.next();
            com.amazon.aps.iva.nd0.f fVar = (com.amazon.aps.iva.nd0.f) jVar4.c;
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((com.amazon.aps.iva.nd0.f) jVar4.b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), com.amazon.aps.iva.lb0.x.n0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Set<com.amazon.aps.iva.nd0.c> keySet = a.keySet();
        c = keySet;
        Set<com.amazon.aps.iva.nd0.c> set = keySet;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(set));
        for (com.amazon.aps.iva.nd0.c cVar2 : set) {
            arrayList2.add(cVar2.f());
        }
        d = com.amazon.aps.iva.lb0.x.c1(arrayList2);
    }
}
