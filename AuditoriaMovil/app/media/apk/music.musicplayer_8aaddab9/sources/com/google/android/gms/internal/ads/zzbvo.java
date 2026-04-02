package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzbvo extends zzadk implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbvp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbvp ? (zzbvp) queryLocalInterface : new zzbvn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzadl.zzf(parcel2, zze);
        } else if (i2 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            zzadl.zzb(parcel2, zzf);
        }
        return true;
    }
}
