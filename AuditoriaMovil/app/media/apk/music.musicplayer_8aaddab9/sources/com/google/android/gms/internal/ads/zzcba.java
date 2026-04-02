package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzcba extends zzadk implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcbf zzcbfVar = null;
        if (i2 == 1) {
            zzcav zzcavVar = (zzcav) zzadl.zzc(parcel, zzcav.CREATOR);
            parcel2.writeNoException();
            zzadl.zze(parcel2, null);
        } else if (i2 == 2) {
            zzcav zzcavVar2 = (zzcav) zzadl.zzc(parcel, zzcav.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzcbc) {
                    zzcbc zzcbcVar = (zzcbc) queryLocalInterface;
                } else {
                    new zzcbc(readStrongBinder);
                }
            }
            parcel2.writeNoException();
        } else if (i2 == 4) {
            zzcbj zzcbjVar = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbfVar = queryLocalInterface2 instanceof zzcbf ? (zzcbf) queryLocalInterface2 : new zzcbd(readStrongBinder2);
            }
            zze(zzcbjVar, zzcbfVar);
            parcel2.writeNoException();
        } else if (i2 == 5) {
            zzcbj zzcbjVar2 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbfVar = queryLocalInterface3 instanceof zzcbf ? (zzcbf) queryLocalInterface3 : new zzcbd(readStrongBinder3);
            }
            zzf(zzcbjVar2, zzcbfVar);
            parcel2.writeNoException();
        } else if (i2 == 6) {
            zzcbj zzcbjVar3 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbfVar = queryLocalInterface4 instanceof zzcbf ? (zzcbf) queryLocalInterface4 : new zzcbd(readStrongBinder4);
            }
            zzg(zzcbjVar3, zzcbfVar);
            parcel2.writeNoException();
        } else if (i2 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcbfVar = queryLocalInterface5 instanceof zzcbf ? (zzcbf) queryLocalInterface5 : new zzcbd(readStrongBinder5);
            }
            zzh(readString, zzcbfVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
