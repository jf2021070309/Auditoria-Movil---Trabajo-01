package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcee implements zzgla<zzced> {
    private final zzgln<Clock> zza;
    private final zzgln<zzceb> zzb;

    public zzcee(zzgln<Clock> zzglnVar, zzgln<zzceb> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzced zzb() {
        return new zzced(this.zza.zzb(), this.zzb.zzb());
    }
}
