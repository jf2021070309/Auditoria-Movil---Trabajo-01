package com.google.android.gms.internal.ads;

import c.f.h;
/* loaded from: classes.dex */
public final class zzdmv {
    public zzbni zza;
    public zzbnf zzb;
    public zzbnv zzc;
    public zzbns zzd;
    public zzbsg zze;
    public final h<String, zzbno> zzf = new h<>();
    public final h<String, zzbnl> zzg = new h<>();

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
