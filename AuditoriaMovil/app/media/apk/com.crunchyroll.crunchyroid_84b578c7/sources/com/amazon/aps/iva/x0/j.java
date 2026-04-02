package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.x0.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SaveableStateRegistry.kt */
/* loaded from: classes.dex */
public final class j implements i {
    public final com.amazon.aps.iva.xb0.l<Object, Boolean> a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    /* compiled from: SaveableStateRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a {
        public final /* synthetic */ String b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<Object> c;

        public a(String str, com.amazon.aps.iva.xb0.a<? extends Object> aVar) {
            this.b = str;
            this.c = aVar;
        }

        @Override // com.amazon.aps.iva.x0.i.a
        public final void unregister() {
            j jVar = j.this;
            LinkedHashMap linkedHashMap = jVar.c;
            String str = this.b;
            List list = (List) linkedHashMap.remove(str);
            if (list != null) {
                list.remove(this.c);
            }
            if (list != null && (!list.isEmpty())) {
                jVar.c.put(str, list);
            }
        }
    }

    public j(Map<String, ? extends List<? extends Object>> map, com.amazon.aps.iva.xb0.l<Object, Boolean> lVar) {
        LinkedHashMap linkedHashMap;
        com.amazon.aps.iva.yb0.j.f(lVar, "canBeSaved");
        this.a = lVar;
        if (map != null) {
            linkedHashMap = i0.b0(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.b = linkedHashMap;
        this.c = new LinkedHashMap();
    }

    @Override // com.amazon.aps.iva.x0.i
    public final boolean a(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        return this.a.invoke(obj).booleanValue();
    }

    @Override // com.amazon.aps.iva.x0.i
    public final i.a b(String str, com.amazon.aps.iva.xb0.a<? extends Object> aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        if (!com.amazon.aps.iva.oe0.m.b0(str)) {
            LinkedHashMap linkedHashMap = this.c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(aVar);
            return new a(str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Map<String, List<Object>> d() {
        LinkedHashMap b0 = i0.b0(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((com.amazon.aps.iva.xb0.a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    b0.put(str, f1.j(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = ((com.amazon.aps.iva.xb0.a) list.get(i)).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                b0.put(str, arrayList);
            }
        }
        return b0;
    }

    @Override // com.amazon.aps.iva.x0.i
    public final Object e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        LinkedHashMap linkedHashMap = this.b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null && (!list.isEmpty())) {
            if (list.size() > 1) {
                linkedHashMap.put(str, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }
}
