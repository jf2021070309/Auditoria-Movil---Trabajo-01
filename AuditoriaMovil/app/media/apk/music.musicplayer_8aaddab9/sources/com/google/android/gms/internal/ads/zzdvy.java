package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdvy implements zzgla<Set<zzdih<zzdbx>>> {
    private final zzdvv zza;
    private final zzgln<zzdwf> zzb;
    private final zzgln<Executor> zzc;

    public zzdvy(zzdvv zzdvvVar, zzgln<zzdwf> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzdvvVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        Set<zzdih<zzdbx>> zzc = zzdvv.zzc(this.zzb.zzb(), zzfsnVar);
        zzgli.zzb(zzc);
        return zzc;
    }
}
