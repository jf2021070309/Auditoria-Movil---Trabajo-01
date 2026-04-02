package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcec implements zzgla<zzceb> {
    private final zzgln<Clock> zza;
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zzb;
    private final zzgln<zzcfa> zzc;

    public zzcec(zzgln<Clock> zzglnVar, zzgln<com.google.android.gms.ads.internal.util.zzg> zzglnVar2, zzgln<zzcfa> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzceb(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb());
    }
}
