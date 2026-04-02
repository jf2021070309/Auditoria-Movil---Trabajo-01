package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzcwa implements zzgla<zzdih<zzawd>> {
    private final zzcvo zza;
    private final zzgln<zzcxc> zzb;
    private final zzgln<Executor> zzc;

    public zzcwa(zzcvo zzcvoVar, zzgln<zzcxc> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzcvoVar;
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
