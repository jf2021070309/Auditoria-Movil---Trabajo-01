package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbfz extends zzadj implements zzbgb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzb(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzc() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzd() throws RemoteException {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zze() throws RemoteException {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzf() throws RemoteException {
        zzbj(5, zza());
    }
}
