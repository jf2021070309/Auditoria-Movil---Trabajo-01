package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfok<K, V> extends zzfop<K, V> {
    public final zzfok<K, V> zza(K k, V... vArr) {
        List<V> asList = Arrays.asList(vArr);
        Collection<V> collection = this.zza.get(k);
        if (collection != null) {
            for (V v : asList) {
                zzfni.zza(k, v);
                collection.add(v);
            }
        } else {
            Iterator it = asList.iterator();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next = it.next();
                    zzfni.zza(k, next);
                    arrayList.add(next);
                }
                this.zza.put(k, arrayList);
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
        int i = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            zzfoj zzp = zzfoj.zzp(entry.getValue());
            if (!zzp.isEmpty()) {
                zzfomVar.zza(key, zzp);
                i += zzp.size();
            }
        }
        return new zzfol<>(zzfomVar.zzc(), i);
    }
}
