package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzdu extends zzb implements zzdv {
    public zzdu() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzb(readInt);
            return true;
        }
        return false;
    }
}
