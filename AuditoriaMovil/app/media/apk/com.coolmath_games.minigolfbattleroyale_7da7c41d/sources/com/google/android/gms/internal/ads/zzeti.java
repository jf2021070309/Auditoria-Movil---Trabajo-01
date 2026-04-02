package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeti implements zzgla<zzetg> {
    private final zzgln<zzayq> zza;
    private final zzgln<zzfsn> zzb;
    private final zzgln<Context> zzc;

    public zzeti(zzgln<zzayq> zzglnVar, zzgln<zzfsn> zzglnVar2, zzgln<Context> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayq zzayqVar = new zzayq();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzetg(zzayqVar, zzfsnVar, ((zzcoo) this.zzc).zza(), null);
    }
}
