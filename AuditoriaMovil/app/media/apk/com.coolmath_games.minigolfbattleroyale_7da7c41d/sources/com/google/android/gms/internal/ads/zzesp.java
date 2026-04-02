package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzesp implements zzgla<zzesn> {
    private final zzgln<zzcfw> zza;
    private final zzgln<Context> zzb;
    private final zzgln<ScheduledExecutorService> zzc;
    private final zzgln<Executor> zzd;
    private final zzgln<Integer> zze;

    public zzesp(zzgln<zzcfw> zzglnVar, zzgln<Context> zzglnVar2, zzgln<ScheduledExecutorService> zzglnVar3, zzgln<Executor> zzglnVar4, zzgln<Integer> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzesn(new zzcfw(), ((zzcoo) this.zzb).zza(), this.zzc.zzb(), zzfsnVar, ((zzetz) this.zze).zzb().intValue(), null);
    }
}
