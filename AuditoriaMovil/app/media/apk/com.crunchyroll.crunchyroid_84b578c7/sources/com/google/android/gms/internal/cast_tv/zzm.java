package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import com.google.android.gms.cast.tv.media.EditTracksInfoData;
import com.google.android.gms.cast.tv.media.FetchItemsRequestData;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
import com.google.android.gms.cast.tv.media.QueueInsertRequestData;
import com.google.android.gms.cast.tv.media.QueueRemoveRequestData;
import com.google.android.gms.cast.tv.media.QueueReorderRequestData;
import com.google.android.gms.cast.tv.media.QueueUpdateRequestData;
import com.google.android.gms.cast.tv.media.SeekRequestData;
import com.google.android.gms.cast.tv.media.SetPlaybackRateRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionRequestData;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzm extends zza implements zzo {
    public zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannel");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzA(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(10, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzB(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(8, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzC(String str, StoreSessionRequestData storeSessionRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, storeSessionRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(23, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzD(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzG(5, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final MediaStatus zze(MediaStatus mediaStatus) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, mediaStatus);
        Parcel zzF = zzF(4, zza);
        MediaStatus mediaStatus2 = (MediaStatus) zzc.zza(zzF, MediaStatus.CREATOR);
        zzF.recycle();
        return mediaStatus2;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final MediaStatus zzf(MediaStatus mediaStatus) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, mediaStatus);
        Parcel zzF = zzF(3, zza);
        MediaStatus mediaStatus2 = (MediaStatus) zzc.zza(zzF, MediaStatus.CREATOR);
        zzF.recycle();
        return mediaStatus2;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final zzz zzg() throws RemoteException {
        Parcel zzF = zzF(24, zza());
        zzz zzzVar = (zzz) zzc.zza(zzF, zzz.CREATOR);
        zzF.recycle();
        return zzzVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final List zzh() throws RemoteException {
        Parcel zzF = zzF(2, zza());
        ArrayList zzb = zzc.zzb(zzF);
        zzF.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzi(String str, EditAudioTracksData editAudioTracksData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, editAudioTracksData);
        zzc.zzf(zza, zzeqVar);
        zzG(11, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzj(String str, EditTracksInfoData editTracksInfoData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, editTracksInfoData);
        zzc.zzf(zza, zzeqVar);
        zzG(12, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzk(String str, MediaLoadRequestData mediaLoadRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, mediaLoadRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(20, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzl(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(7, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzm(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(6, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzn(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(22, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzo(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzzVar);
        zzc.zzf(zza, zzeqVar);
        zzG(17, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzp(String str, FetchItemsRequestData fetchItemsRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, fetchItemsRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(19, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzq(String str, com.google.android.gms.cast.tv.media.zze zzeVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, zzeVar);
        zzc.zzf(zza, zzeqVar);
        zzG(18, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzr(String str, QueueInsertRequestData queueInsertRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, queueInsertRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(13, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzs(String str, QueueRemoveRequestData queueRemoveRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, queueRemoveRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(14, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzt(String str, QueueReorderRequestData queueReorderRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, queueReorderRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(15, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzu(String str, QueueUpdateRequestData queueUpdateRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, queueUpdateRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(16, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzv(String str, MediaResumeSessionRequestData mediaResumeSessionRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, mediaResumeSessionRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(21, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzw(String str, SeekRequestData seekRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, seekRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(9, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzx(String str, int i, List list, List list2, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeTypedList(list);
        zza.writeList(list2);
        zzc.zzf(zza, null);
        zzG(25, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzy(String str, SetPlaybackRateRequestData setPlaybackRateRequestData, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, setPlaybackRateRequestData);
        zzc.zzf(zza, zzeqVar);
        zzG(27, zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzo
    public final void zzz(String str, TextTrackStyle textTrackStyle, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzd(zza, textTrackStyle);
        zzc.zzf(zza, null);
        zzG(26, zza);
    }
}
