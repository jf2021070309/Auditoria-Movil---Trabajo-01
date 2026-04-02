package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzczf implements zzgla<zzdih<zzbcv>> {
    private final zzgln<zzdfm> zza;
    private final zzgln<Executor> zzb;

    public zzczf(zzgln<zzdfm> zzglnVar, zzgln<Executor> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdih(this.zza.zzb(), this.zzb.zzb());
    }
}
