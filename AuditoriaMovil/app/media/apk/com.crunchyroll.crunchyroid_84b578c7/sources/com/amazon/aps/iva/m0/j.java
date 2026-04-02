package com.amazon.aps.iva.m0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class j {
    public static final Object a(Map map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = floatValue - f;
                    } else {
                        f2 = f - floatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        Object next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = floatValue2 - f;
                        } else {
                            f3 = f - floatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                    return ((Map.Entry) next).getKey();
                }
                return ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    public static final Object b(float f, k kVar, Object obj, com.amazon.aps.iva.ob0.d dVar) {
        h hVar = new h(f, kVar, obj, null);
        com.amazon.aps.iva.a0.g1 g1Var = com.amazon.aps.iva.a0.g1.Default;
        kVar.getClass();
        Object p = com.amazon.aps.iva.e.z.p(new n(obj, kVar, g1Var, hVar, null), dVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (p != aVar) {
            p = com.amazon.aps.iva.kb0.q.a;
        }
        if (p != aVar) {
            p = com.amazon.aps.iva.kb0.q.a;
        }
        if (p == aVar) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
