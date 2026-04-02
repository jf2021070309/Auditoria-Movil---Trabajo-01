package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzaxv extends zzadk implements zzaxw {
    public zzaxv() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaya zzayaVar = null;
        zzayd zzaydVar = null;
        switch (i2) {
            case 2:
                zzbfn zze = zze();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzayaVar = queryLocalInterface instanceof zzaya ? (zzaya) queryLocalInterface : new zzaya(readStrongBinder);
                }
                zzj(zzayaVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzaydVar = queryLocalInterface2 instanceof zzayd ? (zzayd) queryLocalInterface2 : new zzayb(readStrongBinder2);
                }
                zzf(asInterface, zzaydVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbgz zzg = zzg();
                parcel2.writeNoException();
                zzadl.zzf(parcel2, zzg);
                return true;
            case 6:
                zzh(zzadl.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                zzi(zzbgv.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
