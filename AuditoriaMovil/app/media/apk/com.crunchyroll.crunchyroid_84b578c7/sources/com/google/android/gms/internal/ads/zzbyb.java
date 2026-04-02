package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbyb extends zzatk implements zzbyc {
    public zzbyb() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzatl.zzc(parcel);
                zzc(parcel.readString(), parcel.readString(), (Bundle) zzatl.zza(parcel, Bundle.CREATOR));
            } else {
                String readString = parcel.readString();
                zzatl.zzc(parcel);
                zzb(readString);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzatl.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
