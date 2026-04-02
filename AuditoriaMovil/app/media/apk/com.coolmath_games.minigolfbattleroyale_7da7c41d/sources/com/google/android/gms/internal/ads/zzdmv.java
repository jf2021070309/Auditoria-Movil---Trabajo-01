package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdmv {
    zzbni zza;
    zzbnf zzb;
    zzbnv zzc;
    zzbns zzd;
    zzbsg zze;
    final SimpleArrayMap<String, zzbno> zzf = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzbnl> zzg = new SimpleArrayMap<>();

    public final zzdmv zza(zzbni zzbniVar) {
        this.zza = zzbniVar;
        return this;
    }

    public final zzdmv zzb(zzbnf zzbnfVar) {
        this.zzb = zzbnfVar;
        return this;
    }

    public final zzdmv zzc(zzbnv zzbnvVar) {
        this.zzc = zzbnvVar;
        return this;
    }

    public final zzdmv zzd(zzbns zzbnsVar) {
        this.zzd = zzbnsVar;
        return this;
    }

    public final zzdmv zze(zzbsg zzbsgVar) {
        this.zze = zzbsgVar;
        return this;
    }

    public final zzdmv zzf(String str, zzbno zzbnoVar, zzbnl zzbnlVar) {
        this.zzf.put(str, zzbnoVar);
        if (zzbnlVar != null) {
            this.zzg.put(str, zzbnlVar);
        }
        return this;
    }

    public final zzdmx zzg() {
        return new zzdmx(this);
    }
}
