package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcys implements zzgla<zzcfy> {
    private final zzgln<Clock> zza;
    private final zzgln<zzcgi> zzb;
    private final zzgln<zzfar> zzc;

    public zzcys(zzgln<Clock> zzglnVar, zzgln<zzcgi> zzglnVar2, zzgln<zzfar> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfbw) this.zzb).zzb().zzi(this.zza.zzb(), ((zzdat) this.zzc).zza().zzf);
    }
}
