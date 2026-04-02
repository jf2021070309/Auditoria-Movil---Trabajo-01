package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeoc implements zzgla<zzeoa> {
    private final zzgln<zzfsn> zza;
    private final zzgln<Context> zzb;

    public zzeoc(zzgln<zzfsn> zzglnVar, zzgln<Context> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzeoa zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeoa(zzfsnVar, ((zzcoo) this.zzb).zza());
    }
}
