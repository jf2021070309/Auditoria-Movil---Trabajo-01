package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzctt implements zzgla<Set<zzdih<zzdbw>>> {
    private final zzgln<zzctq> zza;
    private final zzgln<Executor> zzb;
    private final zzgln<JSONObject> zzc;

    public zzctt(zzgln<zzctq> zzglnVar, zzgln<Executor> zzglnVar2, zzgln<JSONObject> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzctq zzb = this.zza.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        if (this.zzc.zzb() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdih(zzb, zzfsnVar));
        }
        zzgli.zzb(singleton);
        return singleton;
    }
}
