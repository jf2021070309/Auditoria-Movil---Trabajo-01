package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeqo implements zzgla<zzeqm> {
    private final zzgln<zzfsn> zza;
    private final zzgln<Bundle> zzb;

    public zzeqo(zzgln<zzfsn> zzglnVar, zzgln<Bundle> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeqm(zzfsnVar, ((zzdaq) this.zzb).zza());
    }
}
