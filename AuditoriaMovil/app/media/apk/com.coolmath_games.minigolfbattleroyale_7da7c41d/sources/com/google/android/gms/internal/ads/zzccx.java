package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzccx extends zzadj implements zzccz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbj(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzd(zza, zzbczVar);
        zzbj(3, zza);
    }
}
