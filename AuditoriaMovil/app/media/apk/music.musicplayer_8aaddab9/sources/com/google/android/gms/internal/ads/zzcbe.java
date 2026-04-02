package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzcbe extends zzadk implements zzcbf {
    public zzcbe() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze((ParcelFileDescriptor) zzadl.zzc(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            zzf((com.google.android.gms.ads.internal.util.zzbc) zzadl.zzc(parcel, com.google.android.gms.ads.internal.util.zzbc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
