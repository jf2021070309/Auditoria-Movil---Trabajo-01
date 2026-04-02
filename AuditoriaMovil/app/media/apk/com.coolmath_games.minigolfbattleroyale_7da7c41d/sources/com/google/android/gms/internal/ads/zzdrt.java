package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdrt implements zzbqg {
    private final zzdcj zza;
    private final zzccl zzb;
    private final String zzc;
    private final String zzd;

    public zzdrt(zzdcj zzdcjVar, zzezz zzezzVar) {
        this.zza = zzdcjVar;
        this.zzb = zzezzVar.zzm;
        this.zzc = zzezzVar.zzk;
        this.zzd = zzezzVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    @ParametersAreNonnullByDefault
    public final void zzb(zzccl zzcclVar) {
        int i;
        String str;
        zzccl zzcclVar2 = this.zzb;
        if (zzcclVar2 != null) {
            zzcclVar = zzcclVar2;
        }
        if (zzcclVar != null) {
            str = zzcclVar.zza;
            i = zzcclVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zze(new zzcbw(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzc() {
        this.zza.zzf();
    }
}
