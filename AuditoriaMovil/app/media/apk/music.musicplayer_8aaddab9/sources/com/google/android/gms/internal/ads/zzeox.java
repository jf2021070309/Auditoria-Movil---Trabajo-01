package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzeox implements zzgla<zzeov> {
    private final zzgln<Context> zza;
    private final zzgln<zzfsn> zzb;

    public zzeox(zzgln<Context> zzglnVar, zzgln<zzfsn> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeov(this.zza.zzb(), zzfsnVar);
    }
}
