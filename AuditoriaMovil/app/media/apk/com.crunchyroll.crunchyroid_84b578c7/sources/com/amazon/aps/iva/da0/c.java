package com.amazon.aps.iva.da0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public class c implements f {
    public int a = 0;
    public ConcurrentHashMap<Integer, g> b = new ConcurrentHashMap<>();
    public HashSet<Integer> c = new HashSet<>();

    @Override // com.amazon.aps.iva.da0.f
    public void a(e eVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.a; i++) {
            g gVar = this.b.get(Integer.valueOf(i));
            if (gVar != null) {
                gVar.b(eVar);
                int id = gVar.getId();
                if (this.c.contains(Integer.valueOf(id))) {
                    arrayList.add(Integer.valueOf(id));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.remove(Integer.valueOf(((Integer) it.next()).intValue()));
        }
    }

    public final void b(g gVar) {
        gVar.a(this.a);
        ConcurrentHashMap<Integer, g> concurrentHashMap = this.b;
        int i = this.a;
        this.a = i + 1;
        concurrentHashMap.put(Integer.valueOf(i), gVar);
    }
}
