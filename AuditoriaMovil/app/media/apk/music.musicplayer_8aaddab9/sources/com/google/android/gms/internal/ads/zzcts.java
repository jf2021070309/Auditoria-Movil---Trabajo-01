package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzcts implements zzgla<zzctl> {
    private final zzgln<zzavz> zza;
    private final zzgln<zzbup> zzb;
    private final zzgln<Executor> zzc;

    public zzcts(zzgln<zzavz> zzglnVar, zzgln<zzbup> zzglnVar2, zzgln<Executor> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zza = zzfdg.zza();
        zzgli.zzb(zza);
        return new zzctl(this.zza.zzb().zzd(), this.zzb.zzb(), zza);
    }
}
