package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzbgy extends zzadk implements zzbgz {
    public zzbgy() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzbgz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzbgz ? (zzbgz) queryLocalInterface : new zzbgx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i2 == 2) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i2 != 3) {
            return false;
        } else {
            List<zzbdp> zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeTypedList(zzg);
        }
        return true;
    }
}
