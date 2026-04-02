package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbgv extends zzadk implements zzbgw {
    public zzbgv() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzbgw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzbgw) {
            return (zzbgw) queryLocalInterface;
        }
        return new zzbgu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((zzbdn) zzadl.zzc(parcel, zzbdn.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
