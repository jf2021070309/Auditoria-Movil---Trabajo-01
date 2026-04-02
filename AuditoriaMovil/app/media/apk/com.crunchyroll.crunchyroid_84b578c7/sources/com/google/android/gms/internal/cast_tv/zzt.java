package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzt extends zzb implements zzu {
    public zzt() {
        super("com.google.android.gms.cast.tv.media.internal.IStoreSessionDefaultHandler");
    }

    public static zzu zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.media.internal.IStoreSessionDefaultHandler");
        if (queryLocalInterface instanceof zzu) {
            return (zzu) queryLocalInterface;
        }
        return new zzs(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbt zze = zze();
            parcel2.writeNoException();
            zzc.zze(parcel2, zze);
            return true;
        }
        return false;
    }
}
