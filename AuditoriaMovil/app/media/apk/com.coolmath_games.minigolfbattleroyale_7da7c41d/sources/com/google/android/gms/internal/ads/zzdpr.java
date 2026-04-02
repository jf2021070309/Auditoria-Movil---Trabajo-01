package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdpr implements zzgla<zzdpq> {
    private final zzgln<Executor> zza;
    private final zzgln<zzdpl> zzb;

    public zzdpr(zzgln<Executor> zzglnVar, zzgln<zzdpl> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzdpq zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdpq(zzfsnVar, ((zzdpm) this.zzb).zzb());
    }
}
