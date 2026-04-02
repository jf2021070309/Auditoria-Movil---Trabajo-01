package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.o0.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: FontVariation.kt */
/* loaded from: classes.dex */
public final class x {
    public final ArrayList a;

    public x(w... wVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (w wVar : wVarArr) {
            String c = wVar.c();
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(wVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                com.amazon.aps.iva.lb0.t.d0(arrayList, list);
            } else {
                throw new IllegalArgumentException(t1.b(com.amazon.aps.iva.k.q.c("'", str, "' must be unique. Actual [ ["), com.amazon.aps.iva.lb0.x.B0(list, null, null, null, null, 63), ']').toString());
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        int size = arrayList2.size();
        for (int i = 0; i < size && !((w) arrayList2.get(i)).a(); i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && com.amazon.aps.iva.yb0.j.a(this.a, ((x) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
