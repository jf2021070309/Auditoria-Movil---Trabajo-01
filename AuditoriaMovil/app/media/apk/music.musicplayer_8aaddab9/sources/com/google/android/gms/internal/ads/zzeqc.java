package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
/* loaded from: classes.dex */
public final class zzeqc implements zzgla<zzeqa> {
    private final zzgln<zzfsn> zza;
    private final zzgln<zzfar> zzb;
    private final zzgln<PackageInfo> zzc;
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zzd;

    public zzeqc(zzgln<zzfsn> zzglnVar, zzgln<zzfar> zzglnVar2, zzgln<PackageInfo> zzglnVar3, zzgln<com.google.android.gms.ads.internal.util.zzg> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeqa(zzfsnVar, ((zzdat) this.zzb).zza(), this.zzc.zzb(), ((zzfbu) this.zzd).zzb());
    }
}
