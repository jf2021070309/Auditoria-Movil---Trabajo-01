package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.de0.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes4.dex */
public final class g0<T> implements f0<T> {
    public final Map<com.amazon.aps.iva.nd0.c, T> b;
    public final c.j c = new com.amazon.aps.iva.de0.c("Java nullability annotation states").h(new a(this));

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, T> {
        public final /* synthetic */ g0<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0<T> g0Var) {
            super(1);
            this.h = g0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.nd0.c cVar) {
            T next;
            com.amazon.aps.iva.nd0.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.e(cVar2, "it");
            Map<com.amazon.aps.iva.nd0.c, T> map = this.h.b;
            com.amazon.aps.iva.yb0.j.f(map, "values");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<com.amazon.aps.iva.nd0.c, T>> it = map.entrySet().iterator();
            while (true) {
                boolean z = true;
                com.amazon.aps.iva.nd0.c cVar3 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<com.amazon.aps.iva.nd0.c, T> next2 = it.next();
                com.amazon.aps.iva.nd0.c key = next2.getKey();
                if (!com.amazon.aps.iva.yb0.j.a(cVar2, key)) {
                    com.amazon.aps.iva.yb0.j.f(key, "packageName");
                    if (!cVar2.d()) {
                        cVar3 = cVar2.e();
                    }
                    if (!com.amazon.aps.iva.yb0.j.a(cVar3, key)) {
                        z = false;
                    }
                }
                if (z) {
                    linkedHashMap.put(next2.getKey(), next2.getValue());
                }
            }
            if (!(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                return null;
            }
            Iterator<T> it2 = linkedHashMap.entrySet().iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int length = com.amazon.aps.iva.nd0.e.a((com.amazon.aps.iva.nd0.c) ((Map.Entry) next).getKey(), cVar2).b().length();
                    do {
                        T next3 = it2.next();
                        int length2 = com.amazon.aps.iva.nd0.e.a((com.amazon.aps.iva.nd0.c) ((Map.Entry) next3).getKey(), cVar2).b().length();
                        if (length > length2) {
                            next = next3;
                            length = length2;
                        }
                    } while (it2.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(Map<com.amazon.aps.iva.nd0.c, ? extends T> map) {
        this.b = map;
    }
}
