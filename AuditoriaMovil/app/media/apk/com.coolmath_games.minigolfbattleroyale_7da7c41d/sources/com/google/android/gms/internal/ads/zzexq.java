package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzexq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzexo<zzcuk, zzcuq> zza(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        return zzc(context, zzfbyVar, zzfcqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzexo<zzcuv, zzcva> zzb(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        return zzc(context, zzfbyVar, zzfcqVar);
    }

    private static <AppOpenAdRequestComponent extends zzdal<AppOpenAd>, AppOpenAd extends zzcxg> zzexo<AppOpenAdRequestComponent, AppOpenAd> zzc(Context context, zzfby zzfbyVar, zzfcq zzfcqVar) {
        zzcfz zzo;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeF)).booleanValue()) {
            zzo = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn();
        } else {
            zzo = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzo();
        }
        boolean z = false;
        if (zzo != null && zzo.zzi()) {
            z = true;
        }
        if (((Integer) zzbet.zzc().zzc(zzbjl.zzeV)).intValue() > 0) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzeE)).booleanValue() || z) {
                zzfcp zza = zzfcqVar.zza(zzfcg.AppOpen, context, zzfbyVar, new zzews(new zzewp()));
                return new zzewu(new zzexe(new zzexd()), new zzexa(zza.zza, zzchg.zza), zza.zzb, zza.zza.zze().zzf, zzchg.zza);
            }
        }
        return new zzexd();
    }
}
