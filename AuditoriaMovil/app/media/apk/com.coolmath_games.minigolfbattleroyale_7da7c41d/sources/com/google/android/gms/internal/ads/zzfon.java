package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfon<K, V> implements Map<K, V>, Serializable {
    @CheckForNull
    private transient zzfot<Map.Entry<K, V>> zza;
    @CheckForNull
    private transient zzfot<K> zzb;
    @CheckForNull
    private transient zzfoe<V> zzc;

    public static <K, V> zzfon<K, V> zza() {
        return (zzfon<K, V>) zzfqc.zza;
    }

    public static <K, V> zzfon<K, V> zzb(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        zzfom zzfomVar = new zzfom(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfomVar.zzb(entrySet);
        return zzfomVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfqh.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfot<K> zzfotVar = this.zzb;
        if (zzfotVar == null) {
            zzfot<K> zze = zze();
            this.zzb = zze;
            return zze;
        }
        return zzfotVar;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfni.zzb(size, "size");
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

    @Override // java.util.Map
    /* renamed from: zzc */
    public final zzfot<Map.Entry<K, V>> entrySet() {
        zzfot<Map.Entry<K, V>> zzfotVar = this.zza;
        if (zzfotVar == null) {
            zzfot<Map.Entry<K, V>> zzd = zzd();
            this.zza = zzd;
            return zzd;
        }
        return zzfotVar;
    }

    abstract zzfot<Map.Entry<K, V>> zzd();

    abstract zzfot<K> zze();

    @Override // java.util.Map
    /* renamed from: zzf */
    public final zzfoe<V> values() {
        zzfoe<V> zzfoeVar = this.zzc;
        if (zzfoeVar == null) {
            zzfoe<V> zzg = zzg();
            this.zzc = zzg;
            return zzg;
        }
        return zzfoeVar;
    }

    abstract zzfoe<V> zzg();
}
