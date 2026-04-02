package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzayc extends zzadk implements zzayd {
    public zzayc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzc();
        } else if (i2 == 2) {
            zzd();
        } else if (i2 == 3) {
            zze((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
        } else if (i2 == 4) {
            zzf();
        } else if (i2 != 5) {
            return false;
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
