package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzfph<K, V> extends AbstractMap<K, V> {
    @CheckForNull
    private transient Set<Map.Entry<K, V>> zza;
    @CheckForNull
    private transient Set<K> zzb;
    @CheckForNull
    private transient Collection<V> zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zza;
        if (set == null) {
            Set<Map.Entry<K, V>> zza = zza();
            this.zza = zza;
            return zza;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.zzb;
        if (set == null) {
            Set<K> zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzc;
        if (collection == null) {
            zzfpg zzfpgVar = new zzfpg(this);
            this.zzc = zzfpgVar;
            return zzfpgVar;
        }
        return collection;
    }

    abstract Set<Map.Entry<K, V>> zza();

    Set<K> zzh() {
        return new zzfpf(this);
    }
}
