package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbkl implements zzgla<zzbkk> {
    private final zzgln<Context> zza;
    private final zzgln<ScheduledExecutorService> zzb;
    private final zzgln<zzbkm> zzc;

    public zzbkl(zzgln<Context> zzglnVar, zzgln<ScheduledExecutorService> zzglnVar2, zzgln<zzbkm> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbkk(((zzfbv) this.zza).zza(), this.zzb.zzb(), new zzbkm(), null);
    }
}
