package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzean implements zzgla<zzeam> {
    private final zzgln<Map<String, zzgln<zzeao>>> zza;
    private final zzgln<zzfsn> zzb;
    private final zzgln<zzddv> zzc;

    public zzean(zzgln<Map<String, zzgln<zzeao>>> zzglnVar, zzgln<zzfsn> zzglnVar2, zzgln<zzddv> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzeam zzb() {
        Map zzd = ((zzglh) this.zza).zzd();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        return new zzeam(zzd, zzfsnVar, ((zzddw) this.zzc).zzb());
    }
}
