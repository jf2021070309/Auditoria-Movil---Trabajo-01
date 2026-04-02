package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zznz extends zzmr implements zzoa {
    public zznz() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzms.zzb(parcel);
            zzb(readInt);
        } else {
            zzms.zzb(parcel);
            zzc((zzoi) zzms.zza(parcel, zzoi.CREATOR));
        }
        return true;
    }
}
