package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzedc implements zzgla<zzedb> {
    private final zzgln<Context> zza;
    private final zzgln<zzdai> zzb;
    private final zzgln<zzecu> zzc;
    private final zzgln<zzecq> zzd;
    private final zzgln<com.google.android.gms.ads.internal.util.zzg> zze;

    public zzedc(zzgln<Context> zzglnVar, zzgln<zzdai> zzglnVar2, zzgln<zzecu> zzglnVar3, zzgln<zzecq> zzglnVar4, zzgln<com.google.android.gms.ads.internal.util.zzg> zzglnVar5) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
        this.zzd = zzglnVar4;
        this.zze = zzglnVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzedb zzb() {
        return new zzedb(((zzfbv) this.zza).zza(), ((zzdaj) this.zzb).zzb(), this.zzc.zzb(), ((zzecr) this.zzd).zzb(), ((zzfbu) this.zze).zzb());
    }
}
