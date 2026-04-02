package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdws extends zzbez {
    final /* synthetic */ zzdwm zza;
    final /* synthetic */ zzdwt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdws(zzdwt zzdwtVar, zzdwm zzdwmVar) {
        this.zzb = zzdwtVar;
        this.zza = zzdwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb() throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zzi(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i) throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zzf(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(zzbcz zzbczVar) throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zzf(j, zzbczVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzf() throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzg() throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzh() throws RemoteException {
        long j;
        zzdwm zzdwmVar = this.zza;
        j = this.zzb.zza;
        zzdwmVar.zzh(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzi() {
    }
}
