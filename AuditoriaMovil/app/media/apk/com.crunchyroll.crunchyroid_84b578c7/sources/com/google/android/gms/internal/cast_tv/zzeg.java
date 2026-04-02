package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzeg extends zza implements zzeh {
    public zzeg(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.cast.tv.tvlibrary.aidl.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzeh
    public final void zze(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzH(1, zza);
    }
}
