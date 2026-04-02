package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzeha extends zzbxg {
    final /* synthetic */ zzehc zza;
    private final zzeef<zzbxn, zzefy> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeha(zzehc zzehcVar, zzeef zzeefVar, zzehb zzehbVar) {
        this.zza = zzehcVar;
        this.zzb = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbvv zzbvvVar) throws RemoteException {
        zzehc.zzc(this.zza, zzbvvVar);
        this.zzb.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(String str) throws RemoteException {
        this.zzb.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        this.zzb.zzc.zzx(zzbczVar);
    }
}
