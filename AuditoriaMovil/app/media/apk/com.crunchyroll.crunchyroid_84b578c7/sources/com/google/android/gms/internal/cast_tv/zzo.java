package com.google.android.gms.internal.cast_tv;

import android.os.IInterface;
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
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public interface zzo extends IInterface {
    void zzA(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzB(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzC(String str, StoreSessionRequestData storeSessionRequestData, zzeq zzeqVar) throws RemoteException;

    void zzD(String str, String str2) throws RemoteException;

    MediaStatus zze(MediaStatus mediaStatus) throws RemoteException;

    MediaStatus zzf(MediaStatus mediaStatus) throws RemoteException;

    zzz zzg() throws RemoteException;

    List zzh() throws RemoteException;

    void zzi(String str, EditAudioTracksData editAudioTracksData, zzeq zzeqVar) throws RemoteException;

    void zzj(String str, EditTracksInfoData editTracksInfoData, zzeq zzeqVar) throws RemoteException;

    void zzk(String str, MediaLoadRequestData mediaLoadRequestData, zzeq zzeqVar) throws RemoteException;

    void zzl(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzm(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzn(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzo(String str, com.google.android.gms.cast.tv.media.zzz zzzVar, zzeq zzeqVar) throws RemoteException;

    void zzp(String str, FetchItemsRequestData fetchItemsRequestData, zzeq zzeqVar) throws RemoteException;

    void zzq(String str, com.google.android.gms.cast.tv.media.zze zzeVar, zzeq zzeqVar) throws RemoteException;

    void zzr(String str, QueueInsertRequestData queueInsertRequestData, zzeq zzeqVar) throws RemoteException;

    void zzs(String str, QueueRemoveRequestData queueRemoveRequestData, zzeq zzeqVar) throws RemoteException;

    void zzt(String str, QueueReorderRequestData queueReorderRequestData, zzeq zzeqVar) throws RemoteException;

    void zzu(String str, QueueUpdateRequestData queueUpdateRequestData, zzeq zzeqVar) throws RemoteException;

    void zzv(String str, MediaResumeSessionRequestData mediaResumeSessionRequestData, zzeq zzeqVar) throws RemoteException;

    void zzw(String str, SeekRequestData seekRequestData, zzeq zzeqVar) throws RemoteException;

    void zzx(String str, int i, List list, List list2, zzeq zzeqVar) throws RemoteException;

    void zzy(String str, SetPlaybackRateRequestData setPlaybackRateRequestData, zzeq zzeqVar) throws RemoteException;

    void zzz(String str, TextTrackStyle textTrackStyle, zzeq zzeqVar) throws RemoteException;
}
