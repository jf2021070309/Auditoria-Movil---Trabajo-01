package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzdwv extends zzccy {
    final /* synthetic */ zzdwx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwv(zzdwx zzdwxVar) {
        this.zza = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        zzdwm zzdwmVar;
        long j;
        zzdwmVar = this.zza.zzc;
        j = this.zza.zza;
        zzdwmVar.zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i) throws RemoteException {
        zzdwm zzdwmVar;
        long j;
        zzdwmVar = this.zza.zzc;
        j = this.zza.zza;
        zzdwmVar.zzl(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        zzdwm zzdwmVar;
        long j;
        zzdwmVar = this.zza.zzc;
        j = this.zza.zza;
        zzdwmVar.zzl(j, zzbczVar.zza);
    }
}
