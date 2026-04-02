package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class zzdad implements zzgla<zzdac> {
    private final zzgln<zzdbu> zza;
    private final zzgln<zzezz> zzb;
    private final zzgln<ScheduledExecutorService> zzc;
    private final zzgln<Executor> zzd;

    public zzdad(zzgln<zzdbu> zzglnVar, zzgln<zzezz> zzglnVar2, zzgln<ScheduledExecutorService> zzglnVar3, zzgln<Executor> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdac(this.zza.zzb(), ((zzcxw) this.zzb).zza(), this.zzc.zzb(), zzfsnVar);
    }
}
