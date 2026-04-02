package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzfok<K, V> extends zzfop<K, V> {
    public final zzfok<K, V> zza(K k2, V... vArr) {
        List<V> asList = Arrays.asList(vArr);
        Collection<V> collection = this.zza.get(k2);
        if (collection != null) {
            for (V v : asList) {
                zzfni.zza(k2, v);
                collection.add(v);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    zzfni.zza(k2, next);
                    arrayList.add(next);
                }
                this.zza.put(k2, arrayList);
            }
        }
        return this;
    }

    public final zzfol<K, V> zzb() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.zza.entrySet();
        if (entrySet.isEmpty()) {
            return zzfnz.zza;
        }
        zzfom zzfomVar = new zzfom(entrySet.size());
        int i2 = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            zzfoj zzp = zzfoj.zzp(entry.getValue());
            if (!zzp.isEmpty()) {
                zzfomVar.zza(key, zzp);
                i2 += zzp.size();
            }
        }
        return new zzfol<>(zzfomVar.zzc(), i2);
    }
}
