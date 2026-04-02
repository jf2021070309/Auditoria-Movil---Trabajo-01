package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzecx implements zzfet {
    private final zzecu zza;

    public zzecx(zzecu zzecuVar) {
        this.zza = zzecuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbE(zzfem zzfemVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzbF(zzfem zzfemVar, String str) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && zzfem.RENDERER == zzfemVar) {
            this.zza.zze(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzc(zzfem zzfemVar, String str, Throwable th) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && zzfem.RENDERER == zzfemVar && this.zza.zzf() != 0) {
            this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zza.zzf());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfet
    public final void zzd(zzfem zzfemVar, String str) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && zzfem.RENDERER == zzfemVar && this.zza.zzf() != 0) {
            this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime() - this.zza.zzf());
        }
    }
}
