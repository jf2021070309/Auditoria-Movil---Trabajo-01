package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdlx implements zzgla<zzcua> {
    private final zzgln<zzavz> zza;
    private final zzgln<Executor> zzb;
    private final zzgln<Context> zzc;
    private final zzgln<Clock> zzd;

    public zzdlx(zzgln<zzavz> zzglnVar, zzgln<Executor> zzglnVar2, zzgln<Context> zzglnVar3, zzgln<Clock> zzglnVar4) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcua(this.zzb.zzb(), new zzctm(this.zzc.zzb(), this.zza.zzb()), this.zzd.zzb());
    }
}
