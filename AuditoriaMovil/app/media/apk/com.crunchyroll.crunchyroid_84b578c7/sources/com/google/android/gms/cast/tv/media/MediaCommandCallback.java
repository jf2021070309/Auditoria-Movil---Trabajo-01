package com.google.android.gms.cast.tv.media;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.RequestData;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.cast_tv.zzbt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaCommandCallback {
    private static final Logger zza = new Logger("MediaCommandCb");

    public static /* synthetic */ StoreSessionResponseData zza(StoreSessionRequestData storeSessionRequestData) throws Exception {
        MediaError zza2;
        StoreSessionResponseData zzb;
        com.google.android.gms.internal.cast_tv.zzu zzb2 = storeSessionRequestData.zzb();
        Integer valueOf = Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC);
        if (zzb2 != null) {
            try {
                zzbt zze = zzb2.zze();
                zza2 = zze.zza();
                zzb = zze.zzb();
            } catch (RemoteException e) {
                zza.e("Failed to default-handle store session command: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
            if (zza2 == null) {
                if (zzb != null) {
                    return zzb;
                }
                throw new MediaException(new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(storeSessionRequestData.getRequestId()).setDetailedErrorCode(valueOf).build());
            }
            zza2.setRequestId(storeSessionRequestData.getRequestId());
            throw new MediaException(zza2);
        }
        throw new MediaException(new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(storeSessionRequestData.getRequestId()).setDetailedErrorCode(valueOf).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build());
    }

    public static /* synthetic */ Void zzb(RequestData requestData) throws Exception {
        com.google.android.gms.internal.cast_tv.zzl zzlVar;
        if (requestData instanceof zzw) {
            zzlVar = ((zzw) requestData).zzc();
        } else {
            zza.e("RequestData has wrong type", new Object[0]);
            zzlVar = null;
        }
        if (zzlVar != null) {
            MediaError zza2 = zzlVar.zze().zza();
            if (zza2 == null) {
                return null;
            }
            zza.e("Default media command handling returns failure", new Object[0]);
            throw new MediaException(zza2);
        }
        zza.e("No default-handle media command handler", new Object[0]);
        throw new MediaException(new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(requestData.getRequestId()).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build());
    }

    private static Task zzc(final RequestData requestData) {
        return Tasks.call(new Callable() { // from class: com.google.android.gms.cast.tv.media.zzg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MediaCommandCallback.zzb(RequestData.this);
                return null;
            }
        });
    }

    public Task<Void> onEditAudioTracks(String str, EditAudioTracksData editAudioTracksData) {
        return zzc(editAudioTracksData);
    }

    public Task<Void> onEditTracksInfo(String str, EditTracksInfoData editTracksInfoData) {
        return zzc(editTracksInfoData);
    }

    public Task<Void> onFetchItems(String str, FetchItemsRequestData fetchItemsRequestData) {
        return zzc(fetchItemsRequestData);
    }

    public Task<Void> onPause(String str, RequestData requestData) {
        return zzc(requestData);
    }

    public Task<Void> onPlay(String str, RequestData requestData) {
        return zzc(requestData);
    }

    public Task<Void> onPlayAgain(String str, RequestData requestData) {
        return zzc(requestData);
    }

    public Task<Void> onQueueInsert(String str, QueueInsertRequestData queueInsertRequestData) {
        return zzc(queueInsertRequestData);
    }

    public Task<Void> onQueueRemove(String str, QueueRemoveRequestData queueRemoveRequestData) {
        return zzc(queueRemoveRequestData);
    }

    public Task<Void> onQueueReorder(String str, QueueReorderRequestData queueReorderRequestData) {
        return zzc(queueReorderRequestData);
    }

    public Task<Void> onQueueUpdate(String str, QueueUpdateRequestData queueUpdateRequestData) {
        return zzc(queueUpdateRequestData);
    }

    public Task<Void> onSeek(String str, SeekRequestData seekRequestData) {
        return zzc(seekRequestData);
    }

    public Task<Void> onSelectTracksByType(String str, int i, List<MediaTrack> list) {
        return Tasks.forResult(null);
    }

    public Task<Void> onSetPlaybackRate(String str, SetPlaybackRateRequestData setPlaybackRateRequestData) {
        return zzc(setPlaybackRateRequestData);
    }

    public Task<Void> onSetTextTrackStyle(String str, TextTrackStyle textTrackStyle) {
        return Tasks.forResult(null);
    }

    public Task<Void> onSkipAd(String str, RequestData requestData) {
        return zzc(requestData);
    }

    public Task<Void> onStop(String str, RequestData requestData) {
        return zzc(requestData);
    }

    @ShowFirstParty
    @KeepForSdk
    public Task<StoreSessionResponseData> onStoreSession(String str, final StoreSessionRequestData storeSessionRequestData) {
        return Tasks.call(new Callable() { // from class: com.google.android.gms.cast.tv.media.zzh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MediaCommandCallback.zza(StoreSessionRequestData.this);
            }
        });
    }

    public Task<Void> onUserAction(String str, UserActionRequestData userActionRequestData) {
        return Tasks.forException(new MediaException(new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(userActionRequestData.zzb.getRequestId()).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build()));
    }
}
