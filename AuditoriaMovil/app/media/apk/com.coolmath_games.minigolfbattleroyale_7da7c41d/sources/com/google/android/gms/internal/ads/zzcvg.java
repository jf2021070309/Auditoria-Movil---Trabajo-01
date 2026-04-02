package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcvg implements zzgla<zzddr> {
    private final zzgln<ScheduledExecutorService> zza;
    private final zzgln<Clock> zzb;

    public zzcvg(zzgln<ScheduledExecutorService> zzglnVar, zzgln<Clock> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzddr zzb() {
        return new zzddr(this.zza.zzb(), this.zzb.zzb());
    }
}
