package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzeo extends zza implements zzeq {
    public zzeo(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.cast.tv.tvlibrary.aidl.IMessageResultCallback");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzeq
    public final void zze(zzew zzewVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzewVar);
        zzH(1, zza);
    }
}
