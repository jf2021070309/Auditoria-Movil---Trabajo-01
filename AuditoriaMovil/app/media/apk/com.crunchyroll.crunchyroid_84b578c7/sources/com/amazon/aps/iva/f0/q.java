package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.s1.g1;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
public final class q implements g1 {
    public final m a;
    public final LinkedHashMap b;

    public q(m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "factory");
        this.a = mVar;
        this.b = new LinkedHashMap();
    }

    @Override // com.amazon.aps.iva.s1.g1
    public final void a(g1.a aVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(aVar, "slotIds");
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object b = this.a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(b);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b, Integer.valueOf(i + 1));
            }
        }
    }

    @Override // com.amazon.aps.iva.s1.g1
    public final boolean b(Object obj, Object obj2) {
        m mVar = this.a;
        return com.amazon.aps.iva.yb0.j.a(mVar.b(obj), mVar.b(obj2));
    }
}
