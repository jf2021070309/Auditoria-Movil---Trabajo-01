package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdnp implements zzgla<zzdno> {
    private final zzgln<zzdrh> zza;
    private final zzgln<Clock> zzb;

    public zzdnp(zzgln<zzdrh> zzglnVar, zzgln<Clock> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdno(((zzdlt) this.zza).zza(), this.zzb.zzb());
    }
}
