package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdvm implements zzgla<zzdvl> {
    private final zzgln<zzdve> zza;
    private final zzgln<Set<zzdvk>> zzb;
    private final zzgln<Clock> zzc;

    public zzdvm(zzgln<zzdve> zzglnVar, zzgln<Set<zzdvk>> zzglnVar2, zzgln<Clock> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvl(this.zza.zzb(), ((zzgll) this.zzb).zzb(), this.zzc.zzb());
    }
}
