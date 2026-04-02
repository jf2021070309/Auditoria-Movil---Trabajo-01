package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public final class zzfkl extends zzadj implements IInterface {
    public zzfkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final void zze() throws RemoteException {
        zzbj(3, zza());
    }

    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbj(4, zza);
    }

    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbj(5, zza);
    }

    public final void zzh(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbj(6, zza);
    }

    public final void zzi(int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i2);
        zzbj(7, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzbj(8, zza);
    }
}
