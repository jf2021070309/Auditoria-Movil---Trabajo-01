package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdrb implements zzbcv, zzbor, com.google.android.gms.ads.internal.overlay.zzo, zzbot, com.google.android.gms.ads.internal.overlay.zzv {
    private zzbcv zza;
    private zzbor zzb;
    private com.google.android.gms.ads.internal.overlay.zzo zzc;
    private zzbot zzd;
    private com.google.android.gms.ads.internal.overlay.zzv zze;

    private zzdrb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdrb(zzdre zzdreVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzi(zzbcv zzbcvVar, zzbor zzborVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbot zzbotVar, com.google.android.gms.ads.internal.overlay.zzv zzvVar) {
        this.zza = zzbcvVar;
        this.zzb = zzborVar;
        this.zzc = zzoVar;
        this.zzd = zzbotVar;
        this.zze = zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final synchronized void onAdClicked() {
        zzbcv zzbcvVar = this.zza;
        if (zzbcvVar != null) {
            zzbcvVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final synchronized void zza(String str, Bundle bundle) {
        zzbor zzborVar = this.zzb;
        if (zzborVar != null) {
            zzborVar.zza(str, bundle);
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
    public final synchronized void zzbs(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzc;
        if (zzoVar != null) {
            zzoVar.zzbs(i);
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
