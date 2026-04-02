package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdqe implements zzgla<zzdqc> {
    private final zzgln<Executor> zza;
    private final zzgln<zzcua> zzb;
    private final zzgln<zzdij> zzc;

    public zzdqe(zzgln<Executor> zzglnVar, zzgln<zzcua> zzglnVar2, zzgln<zzdij> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqc(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
