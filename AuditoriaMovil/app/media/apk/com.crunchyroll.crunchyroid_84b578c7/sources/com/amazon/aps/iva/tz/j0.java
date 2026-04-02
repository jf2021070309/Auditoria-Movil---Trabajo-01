package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: BrowseAllUiByNewestMapper.kt */
/* loaded from: classes2.dex */
public final class j0 implements i0 {
    public final LinkedHashSet a = new LinkedHashSet();

    public static ArrayList b(List list, com.amazon.aps.iva.a00.c cVar) {
        ArrayList arrayList;
        if (cVar == com.amazon.aps.iva.a00.c.EARLIER) {
            List<Panel> list2 = list;
            arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
            for (Panel panel : list2) {
                arrayList.add(new h.c.C0774c(panel));
            }
        } else {
            List<Panel> list3 = list;
            arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (Panel panel2 : list3) {
                arrayList.add(new h.c.b(panel2));
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.tz.i0
    public final ArrayList a(List list) {
        ArrayList L0;
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            com.amazon.aps.iva.a00.c a = k0.a((Panel) obj);
            Object obj2 = linkedHashMap.get(a);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() == null) {
                Iterable<Panel> iterable = (Iterable) entry.getValue();
                L0 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(iterable));
                for (Panel panel : iterable) {
                    L0.add(new h.c.C0774c(panel));
                }
            } else {
                Object key = entry.getKey();
                com.amazon.aps.iva.a00.c cVar = com.amazon.aps.iva.a00.c.EARLIER;
                LinkedHashSet linkedHashSet = this.a;
                if ((key == cVar && linkedHashSet.isEmpty()) || linkedHashSet.contains(entry.getKey())) {
                    Object key2 = entry.getKey();
                    com.amazon.aps.iva.yb0.j.c(key2);
                    L0 = b((List) entry.getValue(), (com.amazon.aps.iva.a00.c) key2);
                } else {
                    linkedHashSet.add(entry.getKey());
                    Object key3 = entry.getKey();
                    com.amazon.aps.iva.yb0.j.c(key3);
                    Object key4 = entry.getKey();
                    com.amazon.aps.iva.yb0.j.c(key4);
                    L0 = com.amazon.aps.iva.lb0.x.L0(b((List) entry.getValue(), (com.amazon.aps.iva.a00.c) key4), com.amazon.aps.iva.ee0.f1.J(new h.b(((com.amazon.aps.iva.a00.c) key3).getResId())));
                }
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList, L0);
        }
        return arrayList;
    }
}
