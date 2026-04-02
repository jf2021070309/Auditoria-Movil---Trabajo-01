package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdva implements zzgla<zzdih<zzdcq>> {
    private final zzgln<zzduv> zza;
    private final zzgln<Executor> zzb;
    private final zzgln<zzeca> zzc;

    public zzdva(zzgln<zzduv> zzglnVar, zzgln<Executor> zzglnVar2, zzgln<zzeca> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzduv zzb = this.zza.zzb();
        zzfsn zzfsnVar = zzchg.zza;
        zzgli.zzb(zzfsnVar);
        zzeca zzb2 = this.zzc.zzb();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            return new zzdih(zzb2, zzfsnVar);
        }
        return new zzdih(zzb, zzfsnVar);
    }
}
