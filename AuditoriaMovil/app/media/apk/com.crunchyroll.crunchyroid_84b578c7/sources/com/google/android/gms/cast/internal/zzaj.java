package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaj extends com.google.android.gms.internal.cast.zza {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void zze(IStatusCallback iStatusCallback, String[] strArr, String str, List list) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, iStatusCallback);
        zza.writeStringArray(strArr);
        zza.writeString(str);
        zza.writeTypedList(null);
        zzd(2, zza);
    }

    public final void zzf(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(5, zza);
    }

    public final void zzg(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(7, zza);
    }

    public final void zzh(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzafVar);
        zza.writeStringArray(strArr);
        zzd(6, zza);
    }
}
