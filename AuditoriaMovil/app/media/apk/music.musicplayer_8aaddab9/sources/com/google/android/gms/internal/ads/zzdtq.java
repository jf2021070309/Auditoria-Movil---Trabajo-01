package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdtq implements zzgla<zzdih<zzdbf>> {
    private final zzgln<zzdue> zza;
    private final zzgln<Executor> zzb;

    public zzdtq(zzgln<zzdue> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdih(this.zza.zzb(), zzfsnVar);
    }
}
