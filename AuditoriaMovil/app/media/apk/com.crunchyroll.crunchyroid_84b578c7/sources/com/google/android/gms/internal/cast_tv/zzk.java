package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzk extends zzb implements zzl {
    public zzk() {
        super("com.google.android.gms.cast.tv.media.internal.IDefaultCommandHandler");
    }

    public static zzl zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.media.internal.IDefaultCommandHandler");
        if (queryLocalInterface instanceof zzl) {
            return (zzl) queryLocalInterface;
        }
        return new zzj(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbr zze = zze();
            parcel2.writeNoException();
            zzc.zze(parcel2, zze);
            return true;
        }
        return false;
    }
}
