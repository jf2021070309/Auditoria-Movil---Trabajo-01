package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzbrz extends zzadk implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbsd zzbsbVar;
        if (i2 == 3) {
            zzbhc zzb = zzb();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzb);
            return true;
        } else if (i2 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        } else if (i2 == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbsbVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsbVar = queryLocalInterface instanceof zzbsd ? (zzbsd) queryLocalInterface : new zzbsb(readStrongBinder);
            }
            zzd(asInterface, zzbsbVar);
            parcel2.writeNoException();
            return true;
        } else if (i2 == 6) {
            zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        } else if (i2 != 7) {
            return false;
        } else {
            zzbme zzf = zzf();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zzf);
            return true;
        }
    }
}
