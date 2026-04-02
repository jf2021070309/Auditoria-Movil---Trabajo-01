package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.tv.media.UserActionRequestData;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.cac.internal.IReceiverCacChannel");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final List zzb() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final void zzc(String str, UserActionRequestData userActionRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, userActionRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(3, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final void zzd(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzG(4, zza);
    }
}
