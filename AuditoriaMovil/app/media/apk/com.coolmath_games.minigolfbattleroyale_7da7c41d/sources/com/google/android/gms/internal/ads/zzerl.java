package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzerl implements zzgla<zzerj> {
    private final zzgln<zzcfa> zza;
    private final zzgln<zzfsn> zzb;
    private final zzgln<Context> zzc;

    public zzerl(zzgln<zzcfa> zzglnVar, zzgln<zzfsn> zzglnVar2, zzgln<Context> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzerj(this.zza.zzb(), zzfsnVar, ((zzfbv) this.zzc).zza());
    }
}
