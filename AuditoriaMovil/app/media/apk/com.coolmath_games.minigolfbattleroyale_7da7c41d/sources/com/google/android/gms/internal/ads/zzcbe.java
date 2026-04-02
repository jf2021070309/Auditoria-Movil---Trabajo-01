package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzcbe extends zzadk implements zzcbf {
    public zzcbe() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    protected final boolean zzbz(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((ParcelFileDescriptor) zzadl.zzc(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzf((com.google.android.gms.ads.internal.util.zzbc) zzadl.zzc(parcel, com.google.android.gms.ads.internal.util.zzbc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
