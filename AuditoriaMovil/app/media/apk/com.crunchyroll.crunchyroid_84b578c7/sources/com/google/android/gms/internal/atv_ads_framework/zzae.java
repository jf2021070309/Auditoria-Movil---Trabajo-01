package com.google.android.gms.internal.atv_ads_framework;

import com.amazon.aps.iva.q.c0;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public abstract class zzae implements Map, Serializable {
    private transient zzaf zza;
    private transient zzaf zzb;
    private transient zzy zzc;

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
        return zzam.zza(entrySet());
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
        zzaf zzafVar = this.zzb;
        if (zzafVar == null) {
            zzaf zzd = zzd();
            this.zzb = zzd;
            return zzd;
        }
        return zzafVar;
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

    public abstract zzy zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzy values() {
        zzy zzyVar = this.zzc;
        if (zzyVar == null) {
            zzy zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzyVar;
    }

    public abstract zzaf zzc();

    public abstract zzaf zzd();

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzaf entrySet() {
        zzaf zzafVar = this.zza;
        if (zzafVar == null) {
            zzaf zzc = zzc();
            this.zza = zzc;
            return zzc;
        }
        return zzafVar;
    }
}
