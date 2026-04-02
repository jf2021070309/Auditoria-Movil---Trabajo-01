package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SuppressLint({"MissingRemoteException"})
@Deprecated
/* loaded from: classes2.dex */
public class RemoteMediaPlayer implements Cast.MessageReceivedCallback {
    public static final String NAMESPACE = com.google.android.gms.cast.internal.zzaq.zzb;
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final Object zza;
    private final com.google.android.gms.cast.internal.zzaq zzb;
    private final zzdm zzc;
    private OnPreloadStatusUpdatedListener zzd;
    private OnQueueStatusUpdatedListener zze;
    private OnMetadataUpdatedListener zzf;
    private OnStatusUpdatedListener zzg;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface MediaChannelResult extends Result {
        c getCustomData();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnPreloadStatusUpdatedListener {
        void onPreloadStatusUpdated();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnQueueStatusUpdatedListener {
        void onQueueStatusUpdated();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    public RemoteMediaPlayer() {
        com.google.android.gms.cast.internal.zzaq zzaqVar = new com.google.android.gms.cast.internal.zzaq(null);
        this.zza = new Object();
        this.zzb = zzaqVar;
        zzaqVar.zzQ(new zzcy(this));
        zzdm zzdmVar = new zzdm(this);
        this.zzc = zzdmVar;
        zzaqVar.zzh(zzdmVar);
    }

    public static /* bridge */ /* synthetic */ int zza(RemoteMediaPlayer remoteMediaPlayer, int i) {
        MediaStatus mediaStatus = remoteMediaPlayer.getMediaStatus();
        if (mediaStatus == null) {
            return -1;
        }
        for (int i2 = 0; i2 < mediaStatus.getQueueItemCount(); i2++) {
            MediaQueueItem queueItem = mediaStatus.getQueueItem(i2);
            if (queueItem != null && queueItem.getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ void zze(RemoteMediaPlayer remoteMediaPlayer) {
        OnMetadataUpdatedListener onMetadataUpdatedListener = remoteMediaPlayer.zzf;
        if (onMetadataUpdatedListener != null) {
            onMetadataUpdatedListener.onMetadataUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzf(RemoteMediaPlayer remoteMediaPlayer) {
        OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener = remoteMediaPlayer.zzd;
        if (onPreloadStatusUpdatedListener != null) {
            onPreloadStatusUpdatedListener.onPreloadStatusUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(RemoteMediaPlayer remoteMediaPlayer) {
        OnQueueStatusUpdatedListener onQueueStatusUpdatedListener = remoteMediaPlayer.zze;
        if (onQueueStatusUpdatedListener != null) {
            onQueueStatusUpdatedListener.onQueueStatusUpdated();
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(RemoteMediaPlayer remoteMediaPlayer) {
        OnStatusUpdatedListener onStatusUpdatedListener = remoteMediaPlayer.zzg;
        if (onStatusUpdatedListener != null) {
            onStatusUpdatedListener.onStatusUpdated();
        }
    }

    public long getApproximateStreamPosition() {
        long zzm;
        synchronized (this.zza) {
            zzm = this.zzb.zzm();
        }
        return zzm;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo zzK;
        synchronized (this.zza) {
            zzK = this.zzb.zzK();
        }
        return zzK;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus zzL;
        synchronized (this.zza) {
            zzL = this.zzb.zzL();
        }
        return zzL;
    }

    public String getNamespace() {
        return this.zzb.zze();
    }

    public long getStreamDuration() {
        long zzo;
        synchronized (this.zza) {
            zzo = this.zzb.zzo();
        }
        return zzo;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo) {
        return load(googleApiClient, mediaInfo, true, -1L, null, null);
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzb.zzO(str2);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient) {
        return pause(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient) {
        return play(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> queueAppendItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, c cVar) throws IllegalArgumentException {
        return queueInsertItems(googleApiClient, new MediaQueueItem[]{mediaQueueItem}, 0, cVar);
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, long j, c cVar) {
        return googleApiClient.execute(new zzcs(this, googleApiClient, mediaQueueItem, i, j, cVar));
    }

    public PendingResult<MediaChannelResult> queueInsertItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, c cVar) throws IllegalArgumentException {
        return googleApiClient.execute(new zzcr(this, googleApiClient, mediaQueueItemArr, i, cVar));
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, long j, c cVar) {
        return googleApiClient.execute(new zzdb(this, googleApiClient, i, j, cVar));
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, c cVar) throws IllegalArgumentException {
        return googleApiClient.execute(new zzcq(this, googleApiClient, mediaQueueItemArr, i, i2, j, cVar));
    }

    public PendingResult<MediaChannelResult> queueMoveItemToNewIndex(GoogleApiClient googleApiClient, int i, int i2, c cVar) {
        return googleApiClient.execute(new zzdc(this, googleApiClient, i, i2, cVar));
    }

    public PendingResult<MediaChannelResult> queueNext(GoogleApiClient googleApiClient, c cVar) {
        return googleApiClient.execute(new zzcx(this, googleApiClient, cVar));
    }

    public PendingResult<MediaChannelResult> queuePrev(GoogleApiClient googleApiClient, c cVar) {
        return googleApiClient.execute(new zzcw(this, googleApiClient, cVar));
    }

    public PendingResult<MediaChannelResult> queueRemoveItem(GoogleApiClient googleApiClient, int i, c cVar) {
        return googleApiClient.execute(new zzda(this, googleApiClient, i, cVar));
    }

    public PendingResult<MediaChannelResult> queueRemoveItems(GoogleApiClient googleApiClient, int[] iArr, c cVar) throws IllegalArgumentException {
        return googleApiClient.execute(new zzcu(this, googleApiClient, iArr, cVar));
    }

    public PendingResult<MediaChannelResult> queueReorderItems(GoogleApiClient googleApiClient, int[] iArr, int i, c cVar) throws IllegalArgumentException {
        return googleApiClient.execute(new zzcv(this, googleApiClient, iArr, i, cVar));
    }

    public PendingResult<MediaChannelResult> queueSetRepeatMode(GoogleApiClient googleApiClient, int i, c cVar) {
        return googleApiClient.execute(new zzcz(this, googleApiClient, i, cVar));
    }

    public PendingResult<MediaChannelResult> queueUpdateItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, c cVar) {
        return googleApiClient.execute(new zzct(this, googleApiClient, mediaQueueItemArr, cVar));
    }

    public PendingResult<MediaChannelResult> requestStatus(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzdk(this, googleApiClient));
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j) {
        return seek(googleApiClient, j, 0, null);
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(GoogleApiClient googleApiClient, long[] jArr) {
        return googleApiClient.execute(new zzco(this, googleApiClient, jArr));
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onMetadataUpdatedListener) {
        this.zzf = onMetadataUpdatedListener;
    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener) {
        this.zzd = onPreloadStatusUpdatedListener;
    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onQueueStatusUpdatedListener) {
        this.zze = onQueueStatusUpdatedListener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onStatusUpdatedListener) {
        this.zzg = onStatusUpdatedListener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z) {
        return setStreamMute(googleApiClient, z, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d) throws IllegalArgumentException {
        return setStreamVolume(googleApiClient, d, null);
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(GoogleApiClient googleApiClient, TextTrackStyle textTrackStyle) {
        return googleApiClient.execute(new zzcp(this, googleApiClient, textTrackStyle));
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient) {
        return stop(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z) {
        return load(googleApiClient, mediaInfo, z, -1L, null, null);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient, c cVar) {
        return googleApiClient.execute(new zzde(this, googleApiClient, cVar));
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient, c cVar) {
        return googleApiClient.execute(new zzdg(this, googleApiClient, cVar));
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, c cVar) {
        return queueInsertAndPlayItem(googleApiClient, mediaQueueItem, i, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, c cVar) {
        return queueJumpToItem(googleApiClient, i, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, c cVar) throws IllegalArgumentException {
        return queueLoad(googleApiClient, mediaQueueItemArr, i, i2, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i) {
        return seek(googleApiClient, j, i, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z, c cVar) {
        return googleApiClient.execute(new zzdj(this, googleApiClient, z, cVar));
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d, c cVar) throws IllegalArgumentException {
        return googleApiClient.execute(new zzdi(this, googleApiClient, d, cVar));
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient, c cVar) {
        return googleApiClient.execute(new zzdf(this, googleApiClient, cVar));
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j) {
        return load(googleApiClient, mediaInfo, z, j, null, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i, c cVar) {
        return googleApiClient.execute(new zzdh(this, googleApiClient, j, i, cVar));
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, c cVar) {
        return load(googleApiClient, mediaInfo, z, j, null, cVar);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, c cVar) {
        return googleApiClient.execute(new zzdd(this, googleApiClient, mediaInfo, z, j, jArr, cVar));
    }
}
