package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzep extends zzb implements zzeq {
    public zzep() {
        super("com.google.android.libraries.cast.tv.tvlibrary.aidl.IMessageResultCallback");
    }

    public static zzeq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.cast.tv.tvlibrary.aidl.IMessageResultCallback");
        if (queryLocalInterface instanceof zzeq) {
            return (zzeq) queryLocalInterface;
        }
        return new zzeo(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc.zzc(parcel);
            zze((zzew) zzc.zza(parcel, zzew.CREATOR));
            return true;
        }
        return false;
    }
}
