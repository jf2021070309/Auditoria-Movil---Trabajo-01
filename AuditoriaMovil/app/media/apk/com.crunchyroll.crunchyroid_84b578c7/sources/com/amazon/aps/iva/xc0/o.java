package com.amazon.aps.iva.xc0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: FakePureImplementationsProvider.kt */
/* loaded from: classes4.dex */
public final class o {
    public static final LinkedHashMap a;
    public static final Map<com.amazon.aps.iva.nd0.c, com.amazon.aps.iva.nd0.c> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(com.amazon.aps.iva.nd0.i.r, a("java.util.ArrayList", "java.util.LinkedList"));
        b(com.amazon.aps.iva.nd0.i.s, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(com.amazon.aps.iva.nd0.i.t, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(((com.amazon.aps.iva.nd0.b) entry.getKey()).b(), ((com.amazon.aps.iva.nd0.b) entry.getValue()).b()));
        }
        b = com.amazon.aps.iva.lb0.i0.Z(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(str)));
        }
        return arrayList;
    }

    public static void b(com.amazon.aps.iva.nd0.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            com.amazon.aps.iva.nd0.b bVar2 = (com.amazon.aps.iva.nd0.b) obj;
            a.put(obj, bVar);
        }
    }
}
