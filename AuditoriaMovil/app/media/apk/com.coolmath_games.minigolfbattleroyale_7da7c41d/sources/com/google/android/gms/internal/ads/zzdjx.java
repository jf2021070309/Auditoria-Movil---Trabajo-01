package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdjx implements zzgla<Set<zzdih<zzdkq>>> {
    private final zzgln<zzdkq> zza;

    public zzdjx(zzgln<zzdkq> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdih(this.zza.zzb(), zzchg.zzf));
        zzgli.zzb(singleton);
        return singleton;
    }
}
