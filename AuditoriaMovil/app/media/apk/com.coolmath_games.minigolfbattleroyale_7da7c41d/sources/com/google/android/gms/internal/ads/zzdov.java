package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdov implements zzgla<zzdou> {
    private final zzgln<com.google.android.gms.ads.internal.util.zzbr> zza;
    private final zzgln<Clock> zzb;
    private final zzgln<Executor> zzc;

    public zzdov(zzgln<com.google.android.gms.ads.internal.util.zzbr> zzglnVar, zzgln<Clock> zzglnVar2, zzgln<Executor> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzdou(this.zza.zzb(), this.zzb.zzb(), zzfsnVar);
    }
}
