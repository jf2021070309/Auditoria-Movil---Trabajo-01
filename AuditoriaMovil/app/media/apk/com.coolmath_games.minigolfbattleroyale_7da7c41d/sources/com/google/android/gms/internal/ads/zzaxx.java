package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaxx extends zzadj implements zzaxz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzb(zzaxw zzaxwVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, zzaxwVar);
        zzbj(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzc(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbj(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzd(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(3, zza);
    }
}
