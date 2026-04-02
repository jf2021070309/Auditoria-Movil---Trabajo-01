package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbxd extends zzadk implements zzbxe {
    public zzbxd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            zze();
        } else if (i2 == 3) {
            zzf(parcel.readString());
        } else if (i2 != 4) {
            return false;
        } else {
            zzg((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
