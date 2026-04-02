package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzbzd extends zzadk implements zzbze {
    public zzbzd() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbze ? (zzbze) queryLocalInterface : new zzbzc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze((Intent) zzadl.zzc(parcel, Intent.CREATOR));
        } else if (i2 == 2) {
            zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i2 != 3) {
            return false;
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
