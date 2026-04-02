package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzdrk implements zzbcv, zzbor, com.google.android.gms.ads.internal.overlay.zzo, zzbot, com.google.android.gms.ads.internal.overlay.zzv, zzdio {
    private zzbcv zza;
    private zzbor zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbot zzd;
    private com.google.android.gms.ads.internal.overlay.zzv zze;
    private zzdio zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzi(zzbcv zzbcvVar, zzbor zzborVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbot zzbotVar, com.google.android.gms.ads.internal.overlay.zzv zzvVar, zzdio zzdioVar) {
        this.zza = zzbcvVar;
        this.zzb = zzborVar;
        this.zzc = zzoVar;
        this.zzd = zzbotVar;
        this.zze = zzvVar;
        this.zzf = zzdioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final synchronized void onAdClicked() {
        if (this.zza != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final synchronized void zza(String str, Bundle bundle) {
        zzbor zzborVar = this.zzb;
        if (zzborVar != null) {
            zzborVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final synchronized void zzb() {
        zzdio zzdioVar = this.zzf;
        if (zzdioVar != null) {
            zzdioVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final synchronized void zzbA(String str, String str2) {
        zzbot zzbotVar = this.zzd;
        if (zzbotVar != null) {
            zzbotVar.zzbA(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbp() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbq() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbs(int i2) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbs(i2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzd() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzv
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zze;
        if (zzvVar != null) {
            zzvVar.zzg();
        }
    }
}
