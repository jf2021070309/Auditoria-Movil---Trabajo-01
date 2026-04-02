package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class zzete implements zzgla<zzetc> {
    private final zzgln<zzcfw> zza;
    private final zzgln<Integer> zzb;
    private final zzgln<Context> zzc;
    private final zzgln<zzcge> zzd;
    private final zzgln<ScheduledExecutorService> zze;
    private final zzgln<Executor> zzf;
    private final zzgln<String> zzg;

    public zzete(zzgln<zzcfw> zzglnVar, zzgln<Integer> zzglnVar2, zzgln<Context> zzglnVar3, zzgln<zzcge> zzglnVar4, zzgln<ScheduledExecutorService> zzglnVar5, zzgln<Executor> zzglnVar6, zzgln<String> zzglnVar7) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
        this.zzg = zzglnVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzetc(new zzcfw(), ((zzetz) this.zzb).zzb().intValue(), ((zzcoo) this.zzc).zza(), this.zzd.zzb(), this.zze.zzb(), zzfsnVar, ((zzety) this.zzg).zza(), null);
    }
}
