package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzccy extends zzadk implements zzccz {
    public zzccy() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze();
        } else if (i2 == 2) {
            zzf(parcel.readInt());
        } else if (i2 != 3) {
            return false;
        } else {
            zzg((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
