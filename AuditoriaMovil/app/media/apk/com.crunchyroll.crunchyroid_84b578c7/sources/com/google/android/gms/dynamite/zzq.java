package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        return b2.a(zzB(2, zza));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return b2.a(zzB(8, zza));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        return b2.a(zzB(4, zza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        com.google.android.gms.internal.common.zzc.zzc(zza, z);
        zza.writeLong(j);
        return b2.a(zzB(7, zza));
    }
}
