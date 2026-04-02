package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzccx extends zzadj implements zzccz {
    public zzccx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbj(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(3, zza);
    }
}
