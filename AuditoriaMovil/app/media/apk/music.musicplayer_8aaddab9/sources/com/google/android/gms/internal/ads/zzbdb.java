package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
/* loaded from: classes.dex */
public final class zzbdb extends zzbez {
    private final AdListener zza;

    public zzbdb(AdListener adListener) {
        this.zza = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zzbcz zzbczVar) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzbczVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzf() {
        if (this.zza != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzh() {
        if (this.zza != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final AdListener zzj() {
        return this.zza;
    }
}
