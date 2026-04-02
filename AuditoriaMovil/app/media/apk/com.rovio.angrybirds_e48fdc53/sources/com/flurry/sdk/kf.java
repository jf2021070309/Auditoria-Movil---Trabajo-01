package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class kf<K, V> {
    public final Map<K, List<V>> a;
    private int b;

    public kf() {
        this.a = new HashMap();
    }

    public kf(Map<K, List<V>> map) {
        this.a = map;
    }

    public final void a() {
        this.a.clear();
    }

    public final List<V> a(K k) {
        if (k == null) {
            return Collections.emptyList();
        }
        List<V> a = a((kf<K, V>) k, false);
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public final List<V> a(K k, boolean z) {
        List<V> list = this.a.get(k);
        if (z && list == null) {
            if (this.b > 0) {
                list = new ArrayList<>(this.b);
            } else {
                list = new ArrayList<>();
            }
            this.a.put(k, list);
        }
        return list;
    }

    public final void a(K k, V v) {
        if (k != null) {
            a((kf<K, V>) k, true).add(v);
        }
    }

    public final void a(kf<K, V> kfVar) {
        if (kfVar != null) {
            for (Map.Entry<K, List<V>> entry : kfVar.a.entrySet()) {
                a((kf<K, V>) entry.getKey(), true).addAll(entry.getValue());
            }
        }
    }

    public final boolean b(K k, V v) {
        List<V> a;
        boolean z = false;
        if (k != null && (a = a((kf<K, V>) k, false)) != null) {
            z = a.remove(v);
            if (a.size() == 0) {
                this.a.remove(k);
            }
        }
        return z;
    }

    public final boolean b(K k) {
        return (k == null || this.a.remove(k) == null) ? false : true;
    }

    public final Collection<Map.Entry<K, V>> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, List<V>> entry : this.a.entrySet()) {
            for (V v : entry.getValue()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), v));
            }
        }
        return arrayList;
    }

    public final Set<K> c() {
        return this.a.keySet();
    }

    public final Collection<V> d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, List<V>> entry : this.a.entrySet()) {
            arrayList.addAll(entry.getValue());
        }
        return arrayList;
    }

    public final int e() {
        int i = 0;
        Iterator<Map.Entry<K, List<V>>> it = this.a.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = it.next().getValue().size() + i2;
            } else {
                return i2;
            }
        }
    }
}
