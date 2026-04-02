package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdtz implements zzgla<Set<zzdih<zzfet>>> {
    private final zzgln<Executor> zza;
    private final zzgln<zzdur> zzb;

    public zzdtz(zzgln<Executor> zzglnVar, zzgln<zzdur> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzdur zzb = ((zzdus) this.zzb).zzb();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdo)).booleanValue()) {
            emptySet = Collections.singleton(new zzdih(zzb, zzfsnVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgli.zzb(emptySet);
        return emptySet;
    }
}
