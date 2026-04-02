package com.amazon.aps.iva.c4;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: SharedPreferencesMigration.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements q<com.amazon.aps.iva.b4.d, com.amazon.aps.iva.d4.d, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d>, Object> {
    public /* synthetic */ com.amazon.aps.iva.b4.d h;
    public /* synthetic */ com.amazon.aps.iva.d4.d i;

    public h(com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(3, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.b4.d dVar, com.amazon.aps.iva.d4.d dVar2, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d> dVar3) {
        h hVar = new h(dVar3);
        hVar.h = dVar;
        hVar.i = dVar2;
        return hVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.b4.d dVar = this.h;
        com.amazon.aps.iva.d4.d dVar2 = this.i;
        Set<d.a<?>> keySet = dVar2.a().keySet();
        ArrayList arrayList = new ArrayList(r.Y(keySet));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((d.a) it.next()).a);
        }
        Map<String, ?> all = dVar.a.getAll();
        com.amazon.aps.iva.yb0.j.e(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set<String> set = dVar.b;
            if (set != null) {
                z = set.contains(key);
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k.w(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = com.amazon.aps.iva.lb0.x.c1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (Boolean.valueOf(!arrayList.contains((String) entry2.getKey())).booleanValue()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        com.amazon.aps.iva.d4.a d = dVar2.d();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                d.h(new d.a<>(str), value2);
            } else if (value2 instanceof Float) {
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                d.h(new d.a<>(str), value2);
            } else if (value2 instanceof Integer) {
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                d.h(new d.a<>(str), value2);
            } else if (value2 instanceof Long) {
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                d.h(new d.a<>(str), value2);
            } else if (value2 instanceof String) {
                d.h(com.amazon.aps.iva.cq.b.n0(str), value2);
            } else if (value2 instanceof Set) {
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                d.a<?> aVar2 = new d.a<>(str);
                if (value2 != null) {
                    d.h(aVar2, (Set) value2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                }
            } else {
                continue;
            }
        }
        return d.e();
    }
}
