package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public final class zzbfo extends zzadj implements IInterface {
    public zzbfo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i2, int i3) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zzadl.zzd(zza, zzbdlVar);
        zza.writeString(str);
        zzadl.zzf(zza, zzbvgVar);
        zza.writeInt(213806000);
        zza.writeInt(i3);
        Parcel zzbi = zzbi(2, zza);
        IBinder readStrongBinder = zzbi.readStrongBinder();
        zzbi.recycle();
        return readStrongBinder;
    }
}
