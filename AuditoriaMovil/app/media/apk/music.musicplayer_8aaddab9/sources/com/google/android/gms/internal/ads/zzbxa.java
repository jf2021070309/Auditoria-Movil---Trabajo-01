package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzbxa extends zzadk implements zzbxb {
    public zzbxa() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            zzf(parcel.readString());
        } else if (i2 == 3) {
            zzg((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        } else if (i2 != 4) {
            return false;
        } else {
            zzh(zzbvo.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
