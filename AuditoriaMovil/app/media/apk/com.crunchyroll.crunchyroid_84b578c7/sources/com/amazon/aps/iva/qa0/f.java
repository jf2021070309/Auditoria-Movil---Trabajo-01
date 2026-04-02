package com.amazon.aps.iva.qa0;

import com.amazon.aps.iva.qa0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class f implements a {
    public final HashMap a = new HashMap();

    public static void a(List list, b bVar, Map map) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0639a) it.next()).b(bVar, map);
            }
        }
    }

    public final void b(b bVar, a.InterfaceC0639a interfaceC0639a) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(bVar)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(interfaceC0639a);
            hashMap.put(bVar, arrayList);
            return;
        }
        ((List) hashMap.get(bVar)).add(interfaceC0639a);
    }

    public final void c(b bVar, Map<String, ?> map) {
        if (bVar == null) {
            return;
        }
        HashMap hashMap = this.a;
        a((List) hashMap.get(null), bVar, map);
        a((List) hashMap.get(bVar), bVar, map);
    }
}
