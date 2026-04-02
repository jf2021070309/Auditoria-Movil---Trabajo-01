package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcvy implements zzgla<Set<zzdih<zzawd>>> {
    private final zzcvo zza;
    private final zzgln<zzcwy> zzb;

    public zzcvy(zzcvo zzcvoVar, zzgln<zzcwy> zzglnVar) {
        this.zza = zzcvoVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdih(this.zzb.zzb(), zzchg.zzf));
        zzgli.zzb(singleton);
        return singleton;
    }
}
