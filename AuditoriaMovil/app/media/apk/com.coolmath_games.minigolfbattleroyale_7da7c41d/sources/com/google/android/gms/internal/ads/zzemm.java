package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzemm implements zzgla<zzemk> {
    private final zzgln<Clock> zza;
    private final zzgln<zzfar> zzb;

    public zzemm(zzgln<Clock> zzglnVar, zzgln<zzfar> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemk(this.zza.zzb(), ((zzdat) this.zzb).zza());
    }
}
