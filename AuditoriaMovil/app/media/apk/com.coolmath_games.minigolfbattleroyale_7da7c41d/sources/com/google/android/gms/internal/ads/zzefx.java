package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefx implements zzgla<zzefw> {
    private final zzgln<zzcwe> zza;
    private final zzgln<zzefd> zzb;
    private final zzgln<zzdbe> zzc;
    private final zzgln<ScheduledExecutorService> zzd;
    private final zzgln<zzfsn> zze;

    public zzefx(zzgln<zzcwe> zzglnVar, zzgln<zzefd> zzglnVar2, zzgln<zzdbe> zzglnVar3, zzgln<ScheduledExecutorService> zzglnVar4, zzgln<zzfsn> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzefw zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzefw(this.zza.zzb(), ((zzefe) this.zzb).zzb(), this.zzc.zzb(), this.zzd.zzb(), zzfsnVar);
    }
}
