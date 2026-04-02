package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannelImpl");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzb(String str, String str2, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzf(zza, zzeqVar);
        zzG(1, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzc(String str, MediaError mediaError) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, mediaError);
        zzG(3, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzd(String str, long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzG(2, zza);
    }
}
