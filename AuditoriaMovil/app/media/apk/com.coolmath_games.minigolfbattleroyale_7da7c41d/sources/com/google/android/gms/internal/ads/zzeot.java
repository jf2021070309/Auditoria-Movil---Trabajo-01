package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeot implements zzgla<zzeos> {
    private final zzgln<Context> zza;
    private final zzgln<zzfsn> zzb;

    public zzeot(zzgln<Context> zzglnVar, zzgln<zzfsn> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzfbv) this.zza).zza();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeos(zza, zzfsnVar);
    }
}
