package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.e4.l1;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes4.dex */
public final class m0 extends l1 {
    public static final LinkedHashSet O(Set set, Object obj) {
        com.amazon.aps.iva.yb0.j.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(com.amazon.aps.iva.aq.k.w(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && com.amazon.aps.iva.yb0.j.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final Set P(Set set, AbstractCollection abstractCollection) {
        Collection<?> f0 = t.f0(abstractCollection);
        if (f0.isEmpty()) {
            return x.c1(set);
        }
        if (f0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!f0.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(f0);
        return linkedHashSet2;
    }

    public static final LinkedHashSet Q(Set set, Iterable iterable) {
        Integer num;
        int size;
        com.amazon.aps.iva.yb0.j.f(set, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable, "elements");
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(com.amazon.aps.iva.aq.k.w(size));
        linkedHashSet.addAll(set);
        t.d0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final LinkedHashSet R(Set set, Object obj) {
        com.amazon.aps.iva.yb0.j.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(com.amazon.aps.iva.aq.k.w(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
