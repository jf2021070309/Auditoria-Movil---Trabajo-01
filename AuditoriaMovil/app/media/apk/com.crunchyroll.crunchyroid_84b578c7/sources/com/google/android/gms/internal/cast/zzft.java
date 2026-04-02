package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.q.c0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzft implements Map, Serializable {
    private transient zzfu zza;
    private transient zzfu zzb;
    private transient zzfm zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzft zzc(Iterable iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = iterable.size();
        } else {
            i = 4;
        }
        zzfs zzfsVar = new zzfs(i);
        zzfsVar.zza(iterable);
        zzfr zzfrVar = zzfsVar.zzc;
        if (zzfrVar == null) {
            zzgc zzh = zzgc.zzh(zzfsVar.zzb, zzfsVar.zza, zzfsVar);
            zzfr zzfrVar2 = zzfsVar.zzc;
            if (zzfrVar2 == null) {
                return zzh;
            }
            throw zzfrVar2.zza();
        }
        throw zzfrVar.zza();
    }

    public static zzft zzd() {
        return zzgc.zza;
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
        return zzge.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfu zzfuVar = this.zzb;
        if (zzfuVar == null) {
            zzfu zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzfuVar;
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
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
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
        throw new IllegalArgumentException(c0.a("size cannot be negative but was: ", size));
    }

    public abstract zzfm zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfm values() {
        zzfm zzfmVar = this.zzc;
        if (zzfmVar == null) {
            zzfm zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfmVar;
    }

    public abstract zzfu zze();

    public abstract zzfu zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzfu entrySet() {
        zzfu zzfuVar = this.zza;
        if (zzfuVar == null) {
            zzfu zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzfuVar;
    }
}
