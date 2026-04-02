package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzdwv extends zzccy {
    public final /* synthetic */ zzdwx zza;

    public zzdwv(zzdwx zzdwxVar) {
        this.zza = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        zzdwm zzdwmVar;
        long j2;
        zzdwmVar = this.zza.zzc;
        j2 = this.zza.zza;
        zzdwmVar.zzk(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i2) throws RemoteException {
        zzdwm zzdwmVar;
        long j2;
        zzdwmVar = this.zza.zzc;
        j2 = this.zza.zza;
        zzdwmVar.zzl(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        zzdwm zzdwmVar;
        long j2;
        zzdwmVar = this.zza.zzc;
        j2 = this.zza.zza;
        zzdwmVar.zzl(j2, zzbczVar.zza);
    }
}
