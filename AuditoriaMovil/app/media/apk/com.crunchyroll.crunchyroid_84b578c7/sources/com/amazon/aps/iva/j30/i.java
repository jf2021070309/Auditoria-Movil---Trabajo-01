package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.a30.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: UpsellV2Interactor.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.wy.a implements h {
    public final com.amazon.aps.iva.q20.a b;
    public final b c;

    public i(com.amazon.aps.iva.q20.b bVar, b bVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar2, "tierLabelProvider");
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // com.amazon.aps.iva.j30.h
    public final ArrayList B0(List list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num;
        com.amazon.aps.iva.yb0.j.f(list, "products");
        List<com.amazon.aps.iva.b30.c> list2 = list;
        boolean z5 = list2 instanceof Collection;
        if (!z5 || !list2.isEmpty()) {
            for (com.amazon.aps.iva.b30.c cVar : list2) {
                if (com.amazon.aps.iva.yb0.j.a(cVar.b, "crunchyroll.google.fanpack.annually") && cVar.i != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        ArrayList arrayList = new ArrayList();
        for (com.amazon.aps.iva.b30.c cVar2 : list2) {
            com.amazon.aps.iva.lb0.t.d0(arrayList, cVar2.g);
        }
        List n0 = com.amazon.aps.iva.lb0.x.n0(arrayList);
        LinkedHashMap<String, String> a = this.b.a(z2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : a.entrySet()) {
            if (n0.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!z5 || !list2.isEmpty()) {
            for (com.amazon.aps.iva.b30.c cVar3 : list2) {
                if (cVar3.i != null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.b30.c cVar4 = (com.amazon.aps.iva.b30.c) it.next();
            List<String> list3 = cVar4.g;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (list3.contains((String) entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str = (String) entry3.getKey();
                List<String> list4 = list3;
                ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list4));
                for (String str2 : list4) {
                    arrayList3.add(com.amazon.aps.iva.oe0.q.M0(str2, "."));
                }
                if (!arrayList3.contains(com.amazon.aps.iva.oe0.q.M0(str, "."))) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : linkedHashMap3.entrySet()) {
                if (hashSet.add(com.amazon.aps.iva.oe0.q.M0((String) ((Map.Entry) obj).getKey(), "."))) {
                    arrayList4.add(obj);
                }
            }
            com.amazon.aps.iva.a30.d.Companion.getClass();
            String str3 = cVar4.b;
            com.amazon.aps.iva.a30.d a2 = d.a.a(str3);
            String str4 = cVar4.b;
            String str5 = cVar4.c;
            com.amazon.aps.iva.n20.e eVar = cVar4.e;
            com.amazon.aps.iva.rs.m mVar = cVar4.i;
            ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                arrayList5.add(new com.amazon.aps.iva.o20.c((String) entry4.getValue(), true));
                it = it;
            }
            Iterator it2 = it;
            ArrayList arrayList6 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList4));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList6.add(new com.amazon.aps.iva.o20.c((String) ((Map.Entry) it3.next()).getValue(), false));
            }
            ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(arrayList6, arrayList5);
            int imageResId = a2.getImageResId();
            if (!z4) {
                num = this.c.a(str3);
            } else {
                num = null;
            }
            arrayList2.add(new com.amazon.aps.iva.n20.f(str4, str5, eVar, mVar, L0, imageResId, num));
            it = it2;
        }
        return arrayList2;
    }
}
