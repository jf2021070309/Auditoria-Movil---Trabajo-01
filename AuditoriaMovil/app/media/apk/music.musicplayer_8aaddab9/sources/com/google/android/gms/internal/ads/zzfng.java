package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfng<K, V> implements zzfpj<K, V> {
    @CheckForNull
    private transient Set<K> zza;
    @CheckForNull
    private transient Collection<V> zzb;
    @CheckForNull
    private transient Map<K, Collection<V>> zzc;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpj) {
            return zzu().equals(((zzfpj) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public boolean zzh(K k2, V v) {
        throw null;
    }

    public abstract Set<K> zzk();

    public abstract Collection<V> zzn();

    public Iterator<V> zzo() {
        throw null;
    }

    public abstract Map<K, Collection<V>> zzp();

    public boolean zzr(@CheckForNull Object obj) {
        for (Collection<V> collection : zzu().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<K> zzs() {
        Set<K> set = this.zza;
        if (set == null) {
            Set<K> zzk = zzk();
            this.zza = zzk;
            return zzk;
        }
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public Collection<V> zzt() {
        Collection<V> collection = this.zzb;
        if (collection == null) {
            Collection<V> zzn = zzn();
            this.zzb = zzn;
            return zzn;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public Map<K, Collection<V>> zzu() {
        Map<K, Collection<V>> map = this.zzc;
        if (map == null) {
            Map<K, Collection<V>> zzp = zzp();
            this.zzc = zzp;
            return zzp;
        }
        return map;
    }
}
