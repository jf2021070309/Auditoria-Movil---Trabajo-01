package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* loaded from: classes.dex */
public final class zzege implements zzdkn {
    private final Context zza;
    private final zzcgz zzb;
    private final zzfsm<zzdjj> zzc;
    private final zzezz zzd;
    private final zzcml zze;
    private final zzfar zzf;
    private final zzbpu zzg;
    private final boolean zzh;

    public zzege(Context context, zzcgz zzcgzVar, zzfsm<zzdjj> zzfsmVar, zzezz zzezzVar, zzcml zzcmlVar, zzfar zzfarVar, boolean z, zzbpu zzbpuVar) {
        this.zza = context;
        this.zzb = zzcgzVar;
        this.zzc = zzfsmVar;
        this.zzd = zzezzVar;
        this.zze = zzcmlVar;
        this.zzf = zzfarVar;
        this.zzg = zzbpuVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zza(boolean z, Context context, zzdbp zzdbpVar) {
        zzdjj zzdjjVar = (zzdjj) zzfsd.zzr(this.zzc);
        this.zze.zzag(true);
        boolean zzc = this.zzh ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zzc, com.google.android.gms.ads.internal.util.zzs.zzL(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zze() : 0.0f, -1, z, this.zzd.zzK, false);
        if (zzdbpVar != null) {
            zzdbpVar.zze();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdkc zzj = zzdjjVar.zzj();
        zzcml zzcmlVar = this.zze;
        zzezz zzezzVar = this.zzd;
        int i2 = zzezzVar.zzM;
        zzcgz zzcgzVar = this.zzb;
        String str = zzezzVar.zzB;
        zzfae zzfaeVar = zzezzVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzbcv) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcmlVar, i2, zzcgzVar, str, zzjVar, zzfaeVar.zzb, zzfaeVar.zza, this.zzf.zzf, zzdbpVar), true);
    }
}
