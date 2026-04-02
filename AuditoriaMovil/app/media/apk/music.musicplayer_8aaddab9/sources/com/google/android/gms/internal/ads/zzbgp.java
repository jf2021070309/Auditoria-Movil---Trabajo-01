package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzbgp extends zzadk implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean zzbz(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zze((zzbcz) zzadl.zzc(parcel, zzbcz.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
