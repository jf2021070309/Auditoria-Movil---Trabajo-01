package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzgs extends zzfk implements zzgt {
    public zzgs() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzfl.zzb(parcel);
            zzb(readInt);
        } else {
            zzfl.zzb(parcel);
            zzc((Bundle) zzfl.zza(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
