package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzcfm extends zzadk implements zzcfn {
    public zzcfm() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcfn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcfn ? (zzcfn) queryLocalInterface : new zzcfl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcfk zzcfkVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcfr zzcfrVar = (zzcfr) zzadl.zzc(parcel, zzcfr.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcfkVar = queryLocalInterface instanceof zzcfk ? (zzcfk) queryLocalInterface : new zzcfi(readStrongBinder);
                }
                zze(asInterface, zzcfrVar, zzcfkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel2.writeNoException();
                zzadl.zzf(parcel2, null);
                return true;
            case 5:
                zzg(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzcae.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzh(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzcae.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zzi((zzcam) zzadl.zzc(parcel, zzcam.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
