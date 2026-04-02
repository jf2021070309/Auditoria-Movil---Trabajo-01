package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzaa {
    private String zza;
    private final long zzb;
    private final Map<String, Object> zzc;

    public zzaa(String str, long j2, Map<String, Object> map) {
        this.zza = str;
        this.zzb = j2;
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            if (this.zzb == zzaaVar.zzb && this.zza.equals(zzaaVar.zza)) {
                return this.zzc.equals(zzaaVar.zzc);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        long j2 = this.zzb;
        return this.zzc.hashCode() + (((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.zza;
        long j2 = this.zzb;
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(obj.length() + String.valueOf(str).length() + 55);
        a.L(sb, "Event{name='", str, "', timestamp=");
        sb.append(j2);
        sb.append(", params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public final long zza() {
        return this.zzb;
    }

    /* renamed from: zzb */
    public final zzaa clone() {
        return new zzaa(this.zza, this.zzb, new HashMap(this.zzc));
    }

    public final Object zzc(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.zza;
    }

    public final Map<String, Object> zze() {
        return this.zzc;
    }

    public final void zzf(String str) {
        this.zza = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, obj);
        }
    }
}
