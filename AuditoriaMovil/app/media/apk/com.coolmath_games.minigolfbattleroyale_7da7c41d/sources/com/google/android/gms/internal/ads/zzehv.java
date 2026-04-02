package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzehv<AdT> implements zzgla<zzehu<AdT>> {
    private final zzgln<zzfes> zza;
    private final zzgln<zzehp> zzb;
    private final zzgln<zzdbe> zzc;
    private final zzgln<zzffr> zzd;
    private final zzgln<zzffu> zze;
    private final zzgln<zzcxj<AdT>> zzf;
    private final zzgln<Executor> zzg;
    private final zzgln<ScheduledExecutorService> zzh;
    private final zzgln<zzeeh> zzi;

    public zzehv(zzgln<zzfes> zzglnVar, zzgln<zzehp> zzglnVar2, zzgln<zzdbe> zzglnVar3, zzgln<zzffr> zzglnVar4, zzgln<zzffu> zzglnVar5, zzgln<zzcxj<AdT>> zzglnVar6, zzgln<Executor> zzglnVar7, zzgln<ScheduledExecutorService> zzglnVar8, zzgln<zzeeh> zzglnVar9) {
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
    public final zzehu<AdT> zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzehu<>(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), this.zze.zzb(), this.zzf.zzb(), zzfsnVar, this.zzh.zzb(), this.zzi.zzb());
    }
}
