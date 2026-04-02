package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzar extends com.google.android.gms.internal.cast.zza implements zzat {
    public zzar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final int zze(Intent intent, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, intent);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(2, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final IBinder zzf(Intent intent) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, intent);
        Parcel zzb = zzb(3, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        zzb.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final void zzg() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.cast.framework.zzat
    public final void zzh() throws RemoteException {
        zzc(4, zza());
    }
}
