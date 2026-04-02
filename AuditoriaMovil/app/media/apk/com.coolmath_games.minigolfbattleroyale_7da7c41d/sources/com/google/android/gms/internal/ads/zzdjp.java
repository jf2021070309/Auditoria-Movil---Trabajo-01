package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdjp implements zzgla<Set<zzdih<zzdfx>>> {
    private final zzdjm zza;
    private final zzgln<zzdac> zzb;

    public zzdjp(zzdjm zzdjmVar, zzgln<zzdac> zzglnVar) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdih(this.zzb.zzb(), zzchg.zzf));
        zzgli.zzb(singleton);
        return singleton;
    }
}
