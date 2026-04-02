package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzob extends zzmr implements zzoc {
    public zzob() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
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
            zzc((Bundle) zzms.zza(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
