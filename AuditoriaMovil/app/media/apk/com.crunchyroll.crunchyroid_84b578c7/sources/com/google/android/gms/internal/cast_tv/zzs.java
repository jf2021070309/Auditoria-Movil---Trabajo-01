package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzs extends zza implements zzu {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.media.internal.IStoreSessionDefaultHandler");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzu
    public final zzbt zze() throws RemoteException {
        Parcel zzF = zzF(1, zza());
        zzbt zzbtVar = (zzbt) zzc.zza(zzF, zzbt.CREATOR);
        zzF.recycle();
        return zzbtVar;
    }
}
