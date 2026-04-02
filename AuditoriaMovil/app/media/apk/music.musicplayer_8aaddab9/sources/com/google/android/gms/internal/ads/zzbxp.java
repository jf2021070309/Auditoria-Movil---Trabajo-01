package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbxp extends zzadk implements zzbxq {
    public zzbxp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze(parcel.readString());
        } else if (i2 == 2) {
            zzf(parcel.readString());
        } else if (i2 != 3) {
            return false;
        } else {
            zzg((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
