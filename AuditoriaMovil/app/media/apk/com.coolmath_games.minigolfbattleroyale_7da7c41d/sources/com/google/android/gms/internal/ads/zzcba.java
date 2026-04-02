package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzcba extends zzadk implements zzcbb {
    public zzcba() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcbf zzcbfVar = null;
        if (i == 1) {
            zzcav zzcavVar = (zzcav) zzadl.zzc(parcel, zzcav.CREATOR);
            parcel2.writeNoException();
            zzadl.zze(parcel2, null);
        } else if (i == 2) {
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
        } else if (i == 4) {
            zzcbj zzcbjVar = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface2 instanceof zzcbf) {
                    zzcbfVar = (zzcbf) queryLocalInterface2;
                } else {
                    zzcbfVar = new zzcbd(readStrongBinder2);
                }
            }
            zze(zzcbjVar, zzcbfVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcbj zzcbjVar2 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface3 instanceof zzcbf) {
                    zzcbfVar = (zzcbf) queryLocalInterface3;
                } else {
                    zzcbfVar = new zzcbd(readStrongBinder3);
                }
            }
            zzf(zzcbjVar2, zzcbfVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcbj zzcbjVar3 = (zzcbj) zzadl.zzc(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface4 instanceof zzcbf) {
                    zzcbfVar = (zzcbf) queryLocalInterface4;
                } else {
                    zzcbfVar = new zzcbd(readStrongBinder4);
                }
            }
            zzg(zzcbjVar3, zzcbfVar);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface5 instanceof zzcbf) {
                    zzcbfVar = (zzcbf) queryLocalInterface5;
                } else {
                    zzcbfVar = new zzcbd(readStrongBinder5);
                }
            }
            zzh(readString, zzcbfVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
