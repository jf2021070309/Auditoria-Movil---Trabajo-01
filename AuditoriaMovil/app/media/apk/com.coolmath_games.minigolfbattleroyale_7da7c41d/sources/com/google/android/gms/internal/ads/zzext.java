package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzext implements zzgla<zzexo<zzdsb, zzdrw>> {
    private final zzgln<Context> zza;
    private final zzgln<zzfby> zzb;
    private final zzgln<zzfcq> zzc;

    public zzext(zzgln<Context> zzglnVar, zzgln<zzfby> zzglnVar2, zzgln<zzfcq> zzglnVar3) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
        this.zzc = zzglnVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzexo<zzdsb, zzdrw> zzb() {
        zzcfz zzo;
        Context zzb = this.zza.zzb();
        zzfby zzb2 = this.zzb.zzb();
        zzfcq zzb3 = this.zzc.zzb();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeF)).booleanValue()) {
            zzo = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn();
        } else {
            zzo = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzo();
        }
        boolean z = false;
        if (zzo != null && zzo.zzi()) {
            z = true;
        }
        if (((Integer) zzbet.zzc().zzc(zzbjl.zzeH)).intValue() > 0) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeE)).booleanValue() || z) {
                zzfcp zza = zzb3.zza(zzfcg.Rewarded, zzb, zzb2, new zzews(new zzewp()));
                return new zzewu(new zzexe(new zzexd()), new zzexa(zza.zza, zzchg.zza), zza.zzb, zza.zza.zze().zzf, zzchg.zza);
            }
        }
        return new zzexd();
    }
}
