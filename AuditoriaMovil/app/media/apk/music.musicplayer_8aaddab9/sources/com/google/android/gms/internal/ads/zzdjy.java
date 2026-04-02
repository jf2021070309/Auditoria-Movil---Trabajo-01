package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdjy implements zzgla<zzdih<zzdfs>> {
    private final zzdjm zza;
    private final zzgln<Executor> zzb;

    public zzdjy(zzdjm zzdjmVar, zzgln<Executor> zzglnVar) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg(this.zzb.zzb());
    }
}
