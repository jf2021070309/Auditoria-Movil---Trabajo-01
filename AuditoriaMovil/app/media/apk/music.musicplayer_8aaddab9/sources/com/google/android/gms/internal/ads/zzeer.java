package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* loaded from: classes.dex */
public final class zzeer implements zzdkn {
    private final zzcgz zza;
    private final zzfsm<zzcus> zzb;
    private final zzezz zzc;
    private final zzcml zzd;
    private final zzfar zze;
    private final zzbpu zzf;
    private final boolean zzg;

    public zzeer(zzcgz zzcgzVar, zzfsm<zzcus> zzfsmVar, zzezz zzezzVar, zzcml zzcmlVar, zzfar zzfarVar, boolean z, zzbpu zzbpuVar) {
        this.zza = zzcgzVar;
        this.zzb = zzfsmVar;
        this.zzc = zzezzVar;
        this.zzd = zzcmlVar;
        this.zze = zzfarVar;
        this.zzg = z;
        this.zzf = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zza(boolean z, Context context, zzdbp zzdbpVar) {
        int i2;
        zzcus zzcusVar = (zzcus) zzfsd.zzr(this.zzb);
        this.zzd.zzag(true);
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(this.zzg ? this.zzf.zzc(true) : true, true, this.zzg ? this.zzf.zzd() : false, this.zzg ? this.zzf.zze() : 0.0f, -1, z, this.zzc.zzK, false);
        if (zzdbpVar != null) {
            zzdbpVar.zze();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdkc zzj = zzcusVar.zzj();
        zzcml zzcmlVar = this.zzd;
        int i3 = this.zzc.zzM;
        if (i3 == -1) {
            zzbdr zzbdrVar = this.zze.zzj;
            if (zzbdrVar != null) {
                int i4 = zzbdrVar.zza;
                if (i4 == 1) {
                    i2 = 7;
                } else if (i4 == 2) {
                    i2 = 6;
                }
                zzcgz zzcgzVar = this.zza;
                zzezz zzezzVar = this.zzc;
                String str = zzezzVar.zzB;
                zzfae zzfaeVar = zzezzVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzbcv) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcmlVar, i2, zzcgzVar, str, zzjVar, zzfaeVar.zzb, zzfaeVar.zza, this.zze.zzf, zzdbpVar), true);
            }
            zzcgt.zzd("Error setting app open orientation; no targeting orientation available.");
            i3 = this.zzc.zzM;
        }
        i2 = i3;
        zzcgz zzcgzVar2 = this.zza;
        zzezz zzezzVar2 = this.zzc;
        String str2 = zzezzVar2.zzB;
        zzfae zzfaeVar2 = zzezzVar2.zzs;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzbcv) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcmlVar, i2, zzcgzVar2, str2, zzjVar, zzfaeVar2.zzb, zzfaeVar2.zza, this.zze.zzf, zzdbpVar), true);
    }
}
