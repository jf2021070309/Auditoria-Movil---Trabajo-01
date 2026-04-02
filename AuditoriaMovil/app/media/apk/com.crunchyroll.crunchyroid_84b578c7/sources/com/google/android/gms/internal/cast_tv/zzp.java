package com.google.android.gms.internal.cast_tv;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzp extends zza implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannelImpl");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final MediaStatus zze() throws RemoteException {
        Parcel zzF = zzF(11, zza());
        MediaStatus mediaStatus = (MediaStatus) zzc.zza(zzF, MediaStatus.CREATOR);
        zzF.recycle();
        return mediaStatus;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final MediaStatus zzf() throws RemoteException {
        Parcel zzF = zzF(10, zza());
        MediaStatus mediaStatus = (MediaStatus) zzc.zza(zzF, MediaStatus.CREATOR);
        zzF.recycle();
        return mediaStatus;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzG(4, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzh(MediaLoadRequestData mediaLoadRequestData) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, mediaLoadRequestData);
        zzG(9, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzi(String str, MediaError mediaError) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, mediaError);
        zzG(8, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzj(com.google.android.gms.cast.tv.media.zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzmVar);
        zzG(7, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzk(String str, String str2, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzf(zza, zzeqVar);
        zzG(1, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzl(String str, com.google.android.gms.cast.tv.media.zzo zzoVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzoVar);
        zzG(5, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzm(String str, com.google.android.gms.cast.tv.media.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzrVar);
        zzG(6, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzn(String str, StoreSessionResponseData storeSessionResponseData) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, storeSessionResponseData);
        zzG(12, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzo(MediaSession.Token token) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, token);
        zzG(3, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final boolean zzp(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, intent);
        Parcel zzF = zzF(2, zza);
        int readInt = zzF.readInt();
        zzF.recycle();
        if (readInt != 0) {
            return true;
        }
        return false;
    }
}
