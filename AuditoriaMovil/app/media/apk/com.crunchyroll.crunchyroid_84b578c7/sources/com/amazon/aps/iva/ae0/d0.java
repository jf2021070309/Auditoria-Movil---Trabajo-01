package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.oc0.t0;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes4.dex */
public final class d0 implements i {
    public final com.amazon.aps.iva.kd0.c a;
    public final com.amazon.aps.iva.kd0.a b;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.b, t0> c;
    public final LinkedHashMap d;

    public d0(com.amazon.aps.iva.id0.l lVar, com.amazon.aps.iva.kd0.d dVar, com.amazon.aps.iva.kd0.a aVar, q qVar) {
        this.a = dVar;
        this.b = aVar;
        this.c = qVar;
        List<com.amazon.aps.iva.id0.b> list = lVar.h;
        com.amazon.aps.iva.yb0.j.e(list, "proto.class_List");
        List<com.amazon.aps.iva.id0.b> list2 = list;
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
        for (Object obj : list2) {
            linkedHashMap.put(com.amazon.aps.iva.aq.j.s(this.a, ((com.amazon.aps.iva.id0.b) obj).f), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // com.amazon.aps.iva.ae0.i
    public final h a(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        com.amazon.aps.iva.id0.b bVar2 = (com.amazon.aps.iva.id0.b) this.d.get(bVar);
        if (bVar2 == null) {
            return null;
        }
        return new h(this.a, bVar2, this.b, this.c.invoke(bVar));
    }
}
