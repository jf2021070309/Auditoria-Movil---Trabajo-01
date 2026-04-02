package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdnm implements zzgla<zzdnl> {
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zza;
    private final zzgln<zzfar> zzb;
    private final zzgln<zzdmr> zzc;
    private final zzgln<zzdmm> zzd;
    private final zzgln<zzdnw> zze;
    private final zzgln<zzdoe> zzf;
    private final zzgln<Executor> zzg;
    private final zzgln<Executor> zzh;
    private final zzgln<zzdmj> zzi;

    public zzdnm(zzgln<com.google.android.gms.ads.internal.util.zzg> zzglnVar, zzgln<zzfar> zzglnVar2, zzgln<zzdmr> zzglnVar3, zzgln<zzdmm> zzglnVar4, zzgln<zzdnw> zzglnVar5, zzgln<zzdoe> zzglnVar6, zzgln<Executor> zzglnVar7, zzgln<Executor> zzglnVar8, zzgln<zzdmj> zzglnVar9) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
        this.zzg = zzglnVar7;
        this.zzh = zzglnVar8;
        this.zzi = zzglnVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzdnl zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdnl(((zzfbu) this.zza).zzb(), ((zzdat) this.zzb).zza(), this.zzc.zzb(), ((zzdne) this.zzd).zza(), this.zze.zzb(), this.zzf.zzb(), this.zzg.zzb(), zzfsnVar, this.zzi.zzb());
    }
}
