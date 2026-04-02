package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzsr<K, V> implements Map<K, V>, Serializable {
    private transient zzst zza;
    private transient zzst zzb;
    private transient zzsk zzc;

    public static zzsr zzc(Map map) {
        int i;
        if ((map instanceof zzsr) && !(map instanceof SortedMap)) {
            zzsr zzsrVar = (zzsr) map;
            if (!zzsrVar.zzi()) {
                return zzsrVar;
            }
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        zzsq zzsqVar = new zzsq(i);
        zzsqVar.zzb(entrySet);
        return zzsqVar.zzc();
    }

    public static zzsr zzd(Object obj, Object obj2) {
        zzrv.zzb("adBreakTime", obj2);
        return zztn.zzj(1, new Object[]{"adBreakTime", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzts.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzrv.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzsk zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public zzsk values() {
        zzsk zzskVar = this.zzc;
        if (zzskVar == null) {
            zzsk zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzskVar;
    }

    public abstract zzst zze();

    public abstract zzst zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzst entrySet() {
        zzst zzstVar = this.zza;
        if (zzstVar == null) {
            zzst zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzstVar;
    }

    @Override // java.util.Map
    /* renamed from: zzh */
    public zzst keySet() {
        zzst zzstVar = this.zzb;
        if (zzstVar == null) {
            zzst zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzstVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzi();
}
