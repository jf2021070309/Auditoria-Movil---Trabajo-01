package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzedr implements zzgla<zzedq> {
    private final zzgln<Context> zza;
    private final zzgln<zzfsn> zzb;

    public zzedr(zzgln<Context> zzglnVar, zzgln<zzfsn> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcoo) this.zza).zza();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzedq(zza, zzfsnVar);
    }
}
