package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzbsb extends zzadj implements zzbsd {
    public zzbsb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zze() throws RemoteException {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzf(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbj(2, zza);
    }
}
