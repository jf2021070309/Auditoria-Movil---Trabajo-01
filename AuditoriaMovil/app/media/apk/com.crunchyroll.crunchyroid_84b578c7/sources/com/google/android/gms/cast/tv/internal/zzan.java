package com.google.android.gms.cast.tv.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast_tv.zzdx;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzan extends com.google.android.gms.internal.cast_tv.zza implements zzap {
    public zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.internal.IUmaEventSink");
    }

    @Override // com.google.android.gms.cast.tv.internal.zzap
    public final void zzb(zzdx zzdxVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, zzdxVar);
        zzG(1, zza);
    }
}
