package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzem extends zzb implements zzen {
    public zzem() {
        super("com.google.android.libraries.cast.tv.tvlibrary.aidl.IGetCastHeadersResultCallback");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc.zzc(parcel);
            zzb((zzef) zzc.zza(parcel, zzef.CREATOR));
            return true;
        }
        return false;
    }
}
