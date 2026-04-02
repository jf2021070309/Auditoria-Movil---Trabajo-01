package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzczz implements zzgla<zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav>> {
    private final zzgln<Context> zza;
    private final zzgln<zzcgz> zzb;
    private final zzgln<zzfar> zzc;

    public zzczz(zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2, zzgln<zzfar> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.zza.zzb();
        final zzcgz zza = ((zzcox) this.zzb).zza();
        final zzfar zza2 = ((zzdat) this.zzc).zza();
        return new zzfln(zzb, zza, zza2) { // from class: com.google.android.gms.internal.ads.zzczy
            private final Context zza;
            private final zzcgz zzb;
            private final zzfar zzc;

            {
                this.zza = zzb;
                this.zzb = zza;
                this.zzc = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                Context context = this.zza;
                zzcgz zzcgzVar = this.zzb;
                zzfar zzfarVar = this.zzc;
                zzezz zzezzVar = (zzezz) obj;
                com.google.android.gms.ads.internal.util.zzav zzavVar = new com.google.android.gms.ads.internal.util.zzav(context);
                zzavVar.zze(zzezzVar.zzB);
                zzavVar.zzf(zzezzVar.zzC.toString());
                zzavVar.zzd(zzcgzVar.zza);
                zzavVar.zzc(zzfarVar.zzf);
                return zzavVar;
            }
        };
    }
}
