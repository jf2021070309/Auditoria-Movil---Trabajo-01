package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbgh extends zzadk implements zzbgi {
    public zzbgh() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static zzbgi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof zzbgi ? (zzbgi) queryLocalInterface : new zzbgg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
