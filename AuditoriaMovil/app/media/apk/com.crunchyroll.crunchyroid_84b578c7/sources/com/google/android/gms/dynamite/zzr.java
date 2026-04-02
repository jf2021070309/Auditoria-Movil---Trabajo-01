package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.aps.iva.d0.b2;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return b2.a(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zzf(zza, iObjectWrapper2);
        return b2.a(zzB(3, zza));
    }
}
