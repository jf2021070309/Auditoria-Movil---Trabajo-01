package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzecs implements zzdcq, zzdbf {
    private static final Object zza = new Object();
    private static int zzb = 0;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzedb zzd;

    public zzecs(zzedb zzedbVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzedbVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && !this.zzc.zzC()) {
            synchronized (zza) {
                i = zzb;
                intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzey)).intValue();
            }
            if (i >= intValue) {
                return;
            }
            this.zzd.zzf(z);
            synchronized (zza) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzbD(zzbcz zzbczVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf() {
        zzb(true);
    }
}
