package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdjq implements zzgla<zzdih<zzdcq>> {
    private final zzdjm zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzcgz> zzc;
    private final zzgln<zzezz> zzd;
    private final zzgln<zzfar> zze;

    public zzdjq(zzdjm zzdjmVar, zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<zzezz> zzglnVar3, zzgln<zzfar> zzglnVar4) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
        this.zzd = zzglnVar3;
        this.zze = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.zzb.zzb();
        final zzcgz zza = ((zzcox) this.zzc).zza();
        final zzezz zza2 = ((zzcxw) this.zzd).zza();
        final zzfar zza3 = ((zzdat) this.zze).zza();
        return new zzdih(new zzdcq(zzb, zza, zza2, zza3) { // from class: com.google.android.gms.internal.ads.zzdjk
            private final Context zza;
            private final zzcgz zzb;
            private final zzezz zzc;
            private final zzfar zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
                this.zzb = zza;
                this.zzc = zza2;
                this.zzd = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdcq
            public final void zzf() {
                com.google.android.gms.ads.internal.zzt.zzm().zzg(this.zza, this.zzb.zza, this.zzc.zzC.toString(), this.zzd.zzf);
            }
        }, zzchg.zzf);
    }
}
