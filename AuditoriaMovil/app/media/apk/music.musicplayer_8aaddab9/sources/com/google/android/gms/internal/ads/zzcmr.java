package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcmr implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcml zza;
    private final com.google.android.gms.ads.internal.overlay.zzo zzb;

    public zzcmr(zzcml zzcmlVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zza = zzcmlVar;
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbp();
        }
        this.zza.zzK();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i2) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbs(i2);
        }
        this.zza.zzI();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }
}
