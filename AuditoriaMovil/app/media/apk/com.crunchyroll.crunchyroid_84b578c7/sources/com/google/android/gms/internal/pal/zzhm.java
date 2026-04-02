package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzhm extends zzfj {
    public zzhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzhk zze(zzhi zzhiVar) throws RemoteException {
        Parcel zza = zza();
        zzfl.zzd(zza, zzhiVar);
        Parcel zzt = zzt(1, zza);
        zzhk zzhkVar = (zzhk) zzfl.zza(zzt, zzhk.CREATOR);
        zzt.recycle();
        return zzhkVar;
    }
}
