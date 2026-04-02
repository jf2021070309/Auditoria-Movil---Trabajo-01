package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefe implements zzgla<zzefd> {
    private final zzgln<zzcwe> zza;
    private final zzgln<Context> zzb;
    private final zzgln<Executor> zzc;
    private final zzgln<zzdss> zzd;
    private final zzgln<zzfar> zze;
    private final zzgln<zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav>> zzf;

    public zzefe(zzgln<zzcwe> zzglnVar, zzgln<Context> zzglnVar2, zzgln<Executor> zzglnVar3, zzgln<zzdss> zzglnVar4, zzgln<zzfar> zzglnVar5, zzgln<zzfln<zzezz, com.google.android.gms.ads.internal.util.zzav>> zzglnVar6) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
        this.zzf = zzglnVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzefd zzb() {
        return new zzefd(this.zza.zzb(), this.zzb.zzb(), this.zzc.zzb(), this.zzd.zzb(), ((zzdat) this.zze).zza(), this.zzf.zzb());
    }
}
