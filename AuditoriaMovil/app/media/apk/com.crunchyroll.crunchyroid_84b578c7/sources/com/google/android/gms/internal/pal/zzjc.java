package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.q.c0;
import java.io.Serializable;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzjc implements Map, Serializable {
    private transient zzjd zza;
    private transient zzjd zzb;
    private transient zziw zzc;

    public static zzjc zzc() {
        return zzjj.zza;
    }

    public static zzjc zzd(Object obj, Object obj2) {
        zziu.zza(obj, obj2);
        return zzjj.zzk(1, new Object[]{obj, obj2}, null);
    }

    public static zzjc zze(Object obj, Object obj2, Object obj3, Object obj4) {
        zziu.zza(obj, obj2);
        zziu.zza(obj3, obj4);
        return zzjj.zzk(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static zzjc zzf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zziu.zza(obj, obj2);
        zziu.zza(obj3, obj4);
        zziu.zza(obj5, obj6);
        return zzjj.zzk(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
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
        return zzjk.zza(entrySet());
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

    public abstract zziw zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zziw values() {
        zziw zziwVar = this.zzc;
        if (zziwVar == null) {
            zziw zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zziwVar;
    }

    public abstract zzjd zzg();

    public abstract zzjd zzh();

    @Override // java.util.Map
    /* renamed from: zzi */
    public final zzjd entrySet() {
        zzjd zzjdVar = this.zza;
        if (zzjdVar == null) {
            zzjd zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzjdVar;
    }

    @Override // java.util.Map
    /* renamed from: zzj */
    public final zzjd keySet() {
        zzjd zzjdVar = this.zzb;
        if (zzjdVar == null) {
            zzjd zzh = zzh();
            this.zzb = zzh;
            return zzh;
        }
        return zzjdVar;
    }
}
