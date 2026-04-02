package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzcyw implements zzgla<zzdih<zzbcv>> {
    private final zzgln<zzctf> zza;
    private final zzgln<Executor> zzb;

    public zzcyw(zzgln<zzctf> zzglnVar, zzgln<Executor> zzglnVar2) {
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
