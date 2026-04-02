package com.amazon.aps.iva.lb0;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: _MapsJvm.kt */
/* loaded from: classes4.dex */
public class i0 extends com.amazon.aps.iva.aq.k {
    public static final Object S(Object obj, Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        if (map instanceof g0) {
            return ((g0) map).f();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static final HashMap T(com.amazon.aps.iva.kb0.j... jVarArr) {
        HashMap hashMap = new HashMap(com.amazon.aps.iva.aq.k.w(jVarArr.length));
        Y(hashMap, jVarArr);
        return hashMap;
    }

    public static final Map U(com.amazon.aps.iva.kb0.j... jVarArr) {
        if (jVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(jVarArr.length));
            Y(linkedHashMap, jVarArr);
            return linkedHashMap;
        }
        return a0.b;
    }

    public static final LinkedHashMap V(com.amazon.aps.iva.kb0.j... jVarArr) {
        com.amazon.aps.iva.yb0.j.f(jVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(jVarArr.length));
        Y(linkedHashMap, jVarArr);
        return linkedHashMap;
    }

    public static final LinkedHashMap W(Map map, Map map2) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        com.amazon.aps.iva.yb0.j.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void X(Iterable iterable, Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
            map.put(jVar.b, jVar.c);
        }
    }

    public static final void Y(HashMap hashMap, com.amazon.aps.iva.kb0.j[] jVarArr) {
        com.amazon.aps.iva.yb0.j.f(jVarArr, "pairs");
        for (com.amazon.aps.iva.kb0.j jVar : jVarArr) {
            hashMap.put(jVar.b, jVar.c);
        }
    }

    public static final Map Z(Iterable iterable) {
        Object next;
        boolean z = iterable instanceof Collection;
        a0 a0Var = a0.b;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(com.amazon.aps.iva.aq.k.w(collection.size()));
                    X(iterable, linkedHashMap);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return com.amazon.aps.iva.aq.k.x((com.amazon.aps.iva.kb0.j) next);
            }
            return a0Var;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        X(iterable, linkedHashMap2);
        int size2 = linkedHashMap2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashMap2;
            }
            return com.amazon.aps.iva.aq.k.N(linkedHashMap2);
        }
        return a0Var;
    }

    public static final Map a0(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return b0(map);
            }
            return com.amazon.aps.iva.aq.k.N(map);
        }
        return a0.b;
    }

    public static final LinkedHashMap b0(Map map) {
        com.amazon.aps.iva.yb0.j.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
