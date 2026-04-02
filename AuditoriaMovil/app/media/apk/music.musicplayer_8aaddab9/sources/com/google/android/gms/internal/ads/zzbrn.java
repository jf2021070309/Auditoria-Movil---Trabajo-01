package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class zzbrn extends zzadj implements zzbrp {
    public zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze() throws RemoteException {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbj(3, zza);
    }
}
