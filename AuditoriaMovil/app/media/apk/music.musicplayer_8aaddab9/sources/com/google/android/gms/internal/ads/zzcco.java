package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzcco extends zzadk implements zzccp {
    public zzcco() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzccp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof zzccp ? (zzccp) queryLocalInterface : new zzccn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i2 != 2) {
            return false;
        } else {
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }
}
