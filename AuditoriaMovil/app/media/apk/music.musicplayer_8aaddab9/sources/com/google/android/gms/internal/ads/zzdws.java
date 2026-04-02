package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzdws extends zzbez {
    public final /* synthetic */ zzdwm zza;
    public final /* synthetic */ zzdwt zzb;

    public zzdws(zzdwt zzdwtVar, zzdwm zzdwmVar) {
        this.zzb = zzdwtVar;
        this.zza = zzdwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb() throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zzi(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i2) throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zzf(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zzbcz zzbczVar) throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zzf(j2, zzbczVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzf() throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzg() throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzh() throws RemoteException {
        long j2;
        zzdwm zzdwmVar = this.zza;
        j2 = this.zzb.zza;
        zzdwmVar.zzh(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzi() {
    }
}
