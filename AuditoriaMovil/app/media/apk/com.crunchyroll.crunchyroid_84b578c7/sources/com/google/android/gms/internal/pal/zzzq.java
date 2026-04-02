package com.google.android.gms.internal.pal;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzzq implements Map.Entry {
    zzzq zza;
    zzzq zzb;
    zzzq zzc;
    zzzq zzd;
    zzzq zze;
    final Object zzf;
    Object zzg;
    int zzh;

    public zzzq() {
        this.zzf = null;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzg;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzg;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object obj = this.zzf;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.zzg;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.zzg;
        this.zzg = obj;
        return obj2;
    }

    public final String toString() {
        return this.zzf + "=" + this.zzg;
    }

    public zzzq(zzzq zzzqVar, Object obj, zzzq zzzqVar2, zzzq zzzqVar3) {
        this.zza = zzzqVar;
        this.zzf = obj;
        this.zzh = 1;
        this.zzd = zzzqVar2;
        this.zze = zzzqVar3;
        zzzqVar3.zzd = this;
        zzzqVar2.zze = this;
    }
}
