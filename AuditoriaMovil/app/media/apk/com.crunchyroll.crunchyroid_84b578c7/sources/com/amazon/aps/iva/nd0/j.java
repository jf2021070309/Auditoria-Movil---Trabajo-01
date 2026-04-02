package com.amazon.aps.iva.nd0;

import com.amazon.aps.iva.lb0.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: StandardClassIds.kt */
/* loaded from: classes4.dex */
public final class j {
    static {
        new c("java.lang").c(f.h("annotation"));
    }

    public static final b a(String str) {
        c cVar = i.a;
        return new b(i.a, f.h(str));
    }

    public static final b b(String str) {
        c cVar = i.a;
        return new b(i.c, f.h(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int w = com.amazon.aps.iva.aq.k.w(r.Y(entrySet));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final b d(f fVar) {
        c cVar = i.a;
        b bVar = i.i;
        c h = bVar.h();
        return new b(h, f.h(fVar.c() + bVar.j().c()));
    }

    public static final void e(String str) {
        c cVar = i.a;
        new b(i.d, f.h(str));
    }

    public static final b f(String str) {
        c cVar = i.a;
        return new b(i.b, f.h(str));
    }

    public static final b g(b bVar) {
        c cVar = i.a;
        c cVar2 = i.a;
        return new b(cVar2, f.h("U" + bVar.j().c()));
    }
}
