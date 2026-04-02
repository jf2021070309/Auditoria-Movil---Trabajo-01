package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdbr implements zzgla<zzdbp> {
    private final zzgln<zzdbo> zza;
    private final zzgln<Set<zzdih<zzdbg>>> zzb;
    private final zzgln<Executor> zzc;
    private final zzgln<ScheduledExecutorService> zzd;

    public zzdbr(zzgln<zzdbo> zzglnVar, zzgln<Set<zzdih<zzdbg>>> zzglnVar2, zzgln<Executor> zzglnVar3, zzgln<ScheduledExecutorService> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdbo zzb = ((zzdbq) this.zza).zzb();
        Set zzb2 = ((zzgll) this.zzb).zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdbp(zzb, zzb2, zzfsnVar, this.zzd.zzb());
    }
}
