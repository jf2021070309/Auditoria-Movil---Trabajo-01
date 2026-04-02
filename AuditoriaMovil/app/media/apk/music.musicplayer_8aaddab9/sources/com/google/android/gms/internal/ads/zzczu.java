package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzczu implements zzddx {
    private final Context zza;
    private final zzfar zzb;
    private final zzcgz zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdxk zze;

    public zzczu(Context context, zzfar zzfarVar, zzcgz zzcgzVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdxk zzdxkVar) {
        this.zza = context;
        this.zzb = zzfarVar;
        this.zzc = zzcgzVar;
        this.zzd = zzgVar;
        this.zze = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzbG(zzcbj zzcbjVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzk().zzb(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzn());
        }
        this.zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzq(zzfal zzfalVar) {
    }
}
