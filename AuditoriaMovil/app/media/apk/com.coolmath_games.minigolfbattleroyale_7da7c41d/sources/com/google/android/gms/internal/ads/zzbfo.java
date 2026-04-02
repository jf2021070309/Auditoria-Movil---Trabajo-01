package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbfo extends zzadj implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzbdl zzbdlVar, String str, zzbvg zzbvgVar, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zzadl.zzf(zza, iObjectWrapper);
        zzadl.zzd(zza, zzbdlVar);
        zza.writeString(str);
        zzadl.zzf(zza, zzbvgVar);
        zza.writeInt(213806000);
        zza.writeInt(i2);
        Parcel zzbi = zzbi(2, zza);
        IBinder readStrongBinder = zzbi.readStrongBinder();
        zzbi.recycle();
        return readStrongBinder;
    }
}
