package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbgv extends zzadk implements zzbgw {
    public zzbgv() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzbgw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzbgw ? (zzbgw) queryLocalInterface : new zzbgu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze((zzbdn) zzadl.zzc(parcel, zzbdn.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
