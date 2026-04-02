package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzj extends zza implements zzl {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.media.internal.IDefaultCommandHandler");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzl
    public final zzbr zze() throws RemoteException {
        Parcel zzF = zzF(1, zza());
        zzbr zzbrVar = (zzbr) zzc.zza(zzF, zzbr.CREATOR);
        zzF.recycle();
        return zzbrVar;
    }
}
