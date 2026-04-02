package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdjw implements zzgla<zzdih<zzdbc>> {
    private final zzdjm zza;
    private final zzgln<zzdks> zzb;
    private final zzgln<Executor> zzc;

    public zzdjw(zzdjm zzdjmVar, zzgln<zzdks> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdih(this.zzb.zzb(), zzfsnVar);
    }
}
