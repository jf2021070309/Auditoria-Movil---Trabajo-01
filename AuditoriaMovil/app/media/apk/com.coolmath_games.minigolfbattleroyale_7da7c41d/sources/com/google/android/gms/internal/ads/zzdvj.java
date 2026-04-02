package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdvj implements zzgla<zzdvi> {
    private final zzgln<zzdvn> zza;
    private final zzgln<Executor> zzb;

    public zzdvj(zzgln<zzdvn> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdvi(this.zza.zzb(), zzfsnVar);
    }
}
