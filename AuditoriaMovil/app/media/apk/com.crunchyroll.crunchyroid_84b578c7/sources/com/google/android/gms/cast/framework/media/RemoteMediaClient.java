package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.cast.zzed;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class RemoteMediaClient implements Cast.MessageReceivedCallback {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    private final com.google.android.gms.cast.internal.zzaq zzd;
    private final zzbf zze;
    private final MediaQueue zzf;
    private com.google.android.gms.cast.zzr zzg;
    private TaskCompletionSource zzh;
    private ParseAdsInfoCallback zzm;
    private static final Logger zza = new Logger("RemoteMediaClient");
    public static final String NAMESPACE = com.google.android.gms.cast.internal.zzaq.zzb;
    private final List zzi = new CopyOnWriteArrayList();
    private final List zzj = new CopyOnWriteArrayList();
    private final Map zzk = new ConcurrentHashMap();
    private final Map zzl = new ConcurrentHashMap();
    private final Object zzb = new Object();
    private final Handler zzc = new zzed(Looper.getMainLooper());

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void onAdBreakStatusUpdated() {
        }

        public void onMediaError(MediaError mediaError) {
        }

        public void onMetadataUpdated() {
        }

        public void onPreloadStatusUpdated() {
        }

        public void onQueueStatusUpdated() {
        }

        public void onSendingRemoteMediaRequest() {
        }

        public void onStatusUpdated() {
        }

        public void zza(String str, long j, int i, long j2, long j3) {
        }

        public void zzb(int[] iArr) {
        }

        public void zzc(int[] iArr, int i) {
        }

        public void zzd(MediaQueueItem[] mediaQueueItemArr) {
        }

        public void zze(int[] iArr) {
        }

        public void zzf(List list, List list2, int i) {
        }

        public void zzg(int[] iArr) {
        }

        public void zzh() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface Listener {
        void onAdBreakStatusUpdated();

        void onMetadataUpdated();

        void onPreloadStatusUpdated();

        void onQueueStatusUpdated();

        void onSendingRemoteMediaRequest();

        void onStatusUpdated();
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    /* loaded from: classes2.dex */
    public interface MediaChannelResult extends Result {
        c getCustomData();

        MediaError getMediaError();
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    /* loaded from: classes2.dex */
    public interface ParseAdsInfoCallback {
        List<AdBreakInfo> parseAdBreaksFromMediaStatus(MediaStatus mediaStatus);

        boolean parseIsPlayingAdFromMediaStatus(MediaStatus mediaStatus);
    }

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    /* loaded from: classes2.dex */
    public interface ProgressListener {
        void onProgressUpdated(long j, long j2);
    }

    public RemoteMediaClient(com.google.android.gms.cast.internal.zzaq zzaqVar) {
        zzbf zzbfVar = new zzbf(this);
        this.zze = zzbfVar;
        com.google.android.gms.cast.internal.zzaq zzaqVar2 = (com.google.android.gms.cast.internal.zzaq) Preconditions.checkNotNull(zzaqVar);
        this.zzd = zzaqVar2;
        zzaqVar2.zzQ(new zzbn(this, null));
        zzaqVar2.zzh(zzbfVar);
        this.zzf = new MediaQueue(this, 20, 20);
    }

    public static PendingResult zzf(int i, String str) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.setResult(new zzbg(zzbhVar, new Status(i, str)));
        return zzbhVar;
    }

    public static /* bridge */ /* synthetic */ void zzo(RemoteMediaClient remoteMediaClient) {
        Set set;
        for (zzbp zzbpVar : remoteMediaClient.zzl.values()) {
            if (remoteMediaClient.hasMediaSession() && !zzbpVar.zzi()) {
                zzbpVar.zzf();
            } else if (!remoteMediaClient.hasMediaSession() && zzbpVar.zzi()) {
                zzbpVar.zzg();
            }
            if (zzbpVar.zzi() && (remoteMediaClient.isBuffering() || remoteMediaClient.zzv() || remoteMediaClient.isPaused() || remoteMediaClient.isLoadingNextItem())) {
                set = zzbpVar.zzb;
                remoteMediaClient.zzx(set);
            }
        }
    }

    public final void zzx(Set set) {
        MediaInfo media;
        HashSet hashSet = new HashSet(set);
        if (!isPlaying() && !isPaused() && !isBuffering() && !zzv()) {
            if (isLoadingNextItem()) {
                MediaQueueItem loadingItem = getLoadingItem();
                if (loadingItem != null && (media = loadingItem.getMedia()) != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((ProgressListener) it.next()).onProgressUpdated(0L, media.getStreamDuration());
                    }
                    return;
                }
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((ProgressListener) it2.next()).onProgressUpdated(0L, 0L);
            }
            return;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            ((ProgressListener) it3.next()).onProgressUpdated(getApproximateStreamPosition(), getStreamDuration());
        }
    }

    private final boolean zzy() {
        if (this.zzg != null) {
            return true;
        }
        return false;
    }

    private static final zzbk zzz(zzbk zzbkVar) {
        try {
            zzbkVar.zzc();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2100)));
        }
        return zzbkVar;
    }

    @Deprecated
    public void addListener(Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzi.add(listener);
        }
    }

    public boolean addProgressListener(ProgressListener progressListener, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (progressListener != null && !this.zzk.containsKey(progressListener)) {
            Map map = this.zzl;
            Long valueOf = Long.valueOf(j);
            zzbp zzbpVar = (zzbp) map.get(valueOf);
            if (zzbpVar == null) {
                zzbpVar = new zzbp(this, j);
                this.zzl.put(valueOf, zzbpVar);
            }
            zzbpVar.zzd(progressListener);
            this.zzk.put(progressListener, zzbpVar);
            if (hasMediaSession()) {
                zzbpVar.zzf();
                return true;
            }
            return true;
        }
        return false;
    }

    public long getApproximateAdBreakClipPositionMs() {
        long zzj;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzj = this.zzd.zzj();
        }
        return zzj;
    }

    public long getApproximateLiveSeekableRangeEnd() {
        long zzk;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzk = this.zzd.zzk();
        }
        return zzk;
    }

    public long getApproximateLiveSeekableRangeStart() {
        long zzl;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzl = this.zzd.zzl();
        }
        return zzl;
    }

    public long getApproximateStreamPosition() {
        long zzm;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzm = this.zzd.zzm();
        }
        return zzm;
    }

    public MediaQueueItem getCurrentItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getQueueItemById(mediaStatus.getCurrentItemId());
    }

    public int getIdleReason() {
        int i;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus mediaStatus = getMediaStatus();
            if (mediaStatus != null) {
                i = mediaStatus.getIdleReason();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public MediaQueueItem getLoadingItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getQueueItemById(mediaStatus.getLoadingItemId());
    }

    public MediaInfo getMediaInfo() {
        MediaInfo zzK;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzK = this.zzd.zzK();
        }
        return zzK;
    }

    public MediaQueue getMediaQueue() {
        MediaQueue mediaQueue;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            mediaQueue = this.zzf;
        }
        return mediaQueue;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus zzL;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzL = this.zzd.zzL();
        }
        return zzL;
    }

    public String getNamespace() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzd.zze();
    }

    public int getPlayerState() {
        int i;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            MediaStatus mediaStatus = getMediaStatus();
            if (mediaStatus != null) {
                i = mediaStatus.getPlayerState();
            } else {
                i = 1;
            }
        }
        return i;
    }

    public MediaQueueItem getPreloadedItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getQueueItemById(mediaStatus.getPreloadedItemId());
    }

    public long getStreamDuration() {
        long zzo;
        synchronized (this.zzb) {
            Preconditions.checkMainThread("Must be called from the main thread.");
            zzo = this.zzd.zzo();
        }
        return zzo;
    }

    public boolean hasMediaSession() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!isBuffering() && !zzv() && !isPlaying() && !isPaused() && !isLoadingNextItem()) {
            return false;
        }
        return true;
    }

    public boolean isBuffering() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.getPlayerState() == 4) {
            return true;
        }
        return false;
    }

    public boolean isLiveStream() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaInfo mediaInfo = getMediaInfo();
        if (mediaInfo != null && mediaInfo.getStreamType() == 2) {
            return true;
        }
        return false;
    }

    public boolean isLoadingNextItem() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.getLoadingItemId() != 0) {
            return true;
        }
        return false;
    }

    public boolean isPaused() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null) {
            return false;
        }
        if (mediaStatus.getPlayerState() == 3) {
            return true;
        }
        if (!isLiveStream() || getIdleReason() != 2) {
            return false;
        }
        return true;
    }

    public boolean isPlaying() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.getPlayerState() == 2) {
            return true;
        }
        return false;
    }

    public boolean isPlayingAd() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.isPlayingAd()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo) {
        return load(mediaInfo, new MediaLoadOptions.Builder().build());
    }

    @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzd.zzO(str2);
    }

    public PendingResult<MediaChannelResult> pause() {
        return pause(null);
    }

    public PendingResult<MediaChannelResult> play() {
        return play(null);
    }

    public PendingResult<MediaChannelResult> queueAppendItem(MediaQueueItem mediaQueueItem, c cVar) throws IllegalArgumentException {
        return queueInsertItems(new MediaQueueItem[]{mediaQueueItem}, 0, cVar);
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(MediaQueueItem mediaQueueItem, int i, long j, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzah zzahVar = new zzah(this, mediaQueueItem, i, j, cVar);
        zzz(zzahVar);
        return zzahVar;
    }

    public PendingResult<MediaChannelResult> queueInsertItems(MediaQueueItem[] mediaQueueItemArr, int i, c cVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzag zzagVar = new zzag(this, mediaQueueItemArr, i, cVar);
        zzz(zzagVar);
        return zzagVar;
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(int i, long j, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaq zzaqVar = new zzaq(this, i, j, cVar);
        zzz(zzaqVar);
        return zzaqVar;
    }

    public PendingResult<MediaChannelResult> queueLoad(MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, c cVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaf zzafVar = new zzaf(this, mediaQueueItemArr, i, i2, j, cVar);
        zzz(zzafVar);
        return zzafVar;
    }

    public PendingResult<MediaChannelResult> queueMoveItemToNewIndex(int i, int i2, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzar zzarVar = new zzar(this, i, i2, cVar);
        zzz(zzarVar);
        return zzarVar;
    }

    public PendingResult<MediaChannelResult> queueNext(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzan zzanVar = new zzan(this, cVar);
        zzz(zzanVar);
        return zzanVar;
    }

    public PendingResult<MediaChannelResult> queuePrev(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzam zzamVar = new zzam(this, cVar);
        zzz(zzamVar);
        return zzamVar;
    }

    public PendingResult<MediaChannelResult> queueRemoveItem(int i, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzap zzapVar = new zzap(this, i, cVar);
        zzz(zzapVar);
        return zzapVar;
    }

    public PendingResult<MediaChannelResult> queueRemoveItems(int[] iArr, c cVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaj zzajVar = new zzaj(this, iArr, cVar);
        zzz(zzajVar);
        return zzajVar;
    }

    public PendingResult<MediaChannelResult> queueReorderItems(int[] iArr, int i, c cVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzak zzakVar = new zzak(this, iArr, i, cVar);
        zzz(zzakVar);
        return zzakVar;
    }

    public PendingResult<MediaChannelResult> queueSetRepeatMode(int i, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzao zzaoVar = new zzao(this, i, cVar);
        zzz(zzaoVar);
        return zzaoVar;
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingResult<MediaChannelResult> queueShuffle(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzal zzalVar = new zzal(this, true, cVar);
        zzz(zzalVar);
        return zzalVar;
    }

    public PendingResult<MediaChannelResult> queueUpdateItems(MediaQueueItem[] mediaQueueItemArr, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzai zzaiVar = new zzai(this, mediaQueueItemArr, cVar);
        zzz(zzaiVar);
        return zzaiVar;
    }

    public void registerCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (callback != null) {
            this.zzj.add(callback);
        }
    }

    @Deprecated
    public void removeListener(Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (listener != null) {
            this.zzi.remove(listener);
        }
    }

    public void removeProgressListener(ProgressListener progressListener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzbp zzbpVar = (zzbp) this.zzk.remove(progressListener);
        if (zzbpVar != null) {
            zzbpVar.zze(progressListener);
            if (!zzbpVar.zzh()) {
                this.zzl.remove(Long.valueOf(zzbpVar.zzb()));
                zzbpVar.zzg();
            }
        }
    }

    public PendingResult<MediaChannelResult> requestStatus() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzac zzacVar = new zzac(this);
        zzz(zzacVar);
        return zzacVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> seek(long j) {
        return seek(j, 0, null);
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(long[] jArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzad zzadVar = new zzad(this, jArr);
        zzz(zzadVar);
        return zzadVar;
    }

    public void setParseAdsInfoCallback(ParseAdsInfoCallback parseAdsInfoCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzm = parseAdsInfoCallback;
    }

    public PendingResult<MediaChannelResult> setPlaybackRate(double d) {
        return setPlaybackRate(d, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(boolean z) {
        return setStreamMute(z, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(double d) throws IllegalArgumentException {
        return setStreamVolume(d, null);
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(TextTrackStyle textTrackStyle) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzae zzaeVar = new zzae(this, textTrackStyle);
        zzz(zzaeVar);
        return zzaeVar;
    }

    public PendingResult<MediaChannelResult> skipAd() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzab zzabVar = new zzab(this);
        zzz(zzabVar);
        return zzabVar;
    }

    public PendingResult<MediaChannelResult> stop() {
        return stop(null);
    }

    public void togglePlayback() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        int playerState = getPlayerState();
        if (playerState != 4 && playerState != 2) {
            play();
        } else {
            pause();
        }
    }

    public void unregisterCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (callback != null) {
            this.zzj.remove(callback);
        }
    }

    public final int zza() {
        MediaQueueItem loadingItem;
        if (getMediaInfo() != null && hasMediaSession()) {
            if (isBuffering()) {
                return 6;
            }
            if (isPlaying()) {
                return 3;
            }
            if (isPaused()) {
                return 2;
            }
            if (isLoadingNextItem() && (loadingItem = getLoadingItem()) != null && loadingItem.getMedia() != null) {
                return 6;
            }
        }
        return 0;
    }

    public final PendingResult zzg(String str, List list) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaw zzawVar = new zzaw(this, true, str, null);
        zzz(zzawVar);
        return zzawVar;
    }

    public final PendingResult zzh(int i, int i2, int i3) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzau zzauVar = new zzau(this, true, i, i2, i3);
        zzz(zzauVar);
        return zzauVar;
    }

    public final PendingResult zzi() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzas zzasVar = new zzas(this, true);
        zzz(zzasVar);
        return zzasVar;
    }

    public final PendingResult zzj(int[] iArr) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzat zzatVar = new zzat(this, true, iArr);
        zzz(zzatVar);
        return zzatVar;
    }

    public final Task zzk(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return Tasks.forException(new com.google.android.gms.cast.internal.zzao());
        }
        this.zzh = new TaskCompletionSource();
        zza.d("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
        MediaInfo mediaInfo = getMediaInfo();
        MediaStatus mediaStatus = getMediaStatus();
        SessionState sessionState = null;
        if (mediaInfo != null && mediaStatus != null) {
            MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
            builder.setMediaInfo(mediaInfo);
            builder.setCurrentTime(getApproximateStreamPosition());
            builder.setQueueData(mediaStatus.getQueueData());
            builder.setPlaybackRate(mediaStatus.getPlaybackRate());
            builder.setActiveTrackIds(mediaStatus.getActiveTrackIds());
            builder.setCustomData(mediaStatus.getCustomData());
            MediaLoadRequestData build = builder.build();
            SessionState.Builder builder2 = new SessionState.Builder();
            builder2.setLoadRequestData(build);
            sessionState = builder2.build();
        }
        if (sessionState != null) {
            this.zzh.setResult(sessionState);
        } else {
            this.zzh.setException(new com.google.android.gms.cast.internal.zzao());
        }
        return this.zzh.getTask();
    }

    public final void zzq() {
        com.google.android.gms.cast.zzr zzrVar = this.zzg;
        if (zzrVar == null) {
            return;
        }
        zzrVar.zzi(getNamespace(), this);
        requestStatus();
    }

    public final void zzr(SessionState sessionState) {
        MediaLoadRequestData loadRequestData;
        if (sessionState != null && (loadRequestData = sessionState.getLoadRequestData()) != null) {
            zza.d("resume SessionState", new Object[0]);
            load(loadRequestData);
        }
    }

    public final void zzs(com.google.android.gms.cast.zzr zzrVar) {
        com.google.android.gms.cast.zzr zzrVar2 = this.zzg;
        if (zzrVar2 != zzrVar) {
            if (zzrVar2 != null) {
                this.zzd.zzf();
                this.zzf.zzl();
                zzrVar2.zzg(getNamespace());
                this.zze.zzc(null);
                this.zzc.removeCallbacksAndMessages(null);
            }
            this.zzg = zzrVar;
            if (zzrVar != null) {
                this.zze.zzc(zzrVar);
            }
        }
    }

    public final boolean zzt() {
        Integer indexById;
        if (!hasMediaSession()) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(getMediaStatus());
        if (mediaStatus.isMediaCommandSupported(64L)) {
            return true;
        }
        if (mediaStatus.getQueueRepeatMode() == 0 && ((indexById = mediaStatus.getIndexById(mediaStatus.getCurrentItemId())) == null || indexById.intValue() >= mediaStatus.getQueueItemCount() - 1)) {
            return false;
        }
        return true;
    }

    public final boolean zzu() {
        Integer indexById;
        if (!hasMediaSession()) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(getMediaStatus());
        if (mediaStatus.isMediaCommandSupported(128L)) {
            return true;
        }
        if (mediaStatus.getQueueRepeatMode() == 0 && ((indexById = mediaStatus.getIndexById(mediaStatus.getCurrentItemId())) == null || indexById.intValue() <= 0)) {
            return false;
        }
        return true;
    }

    public final boolean zzv() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.getPlayerState() == 5) {
            return true;
        }
        return false;
    }

    public final boolean zzw() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!isLiveStream()) {
            return true;
        }
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus != null && mediaStatus.isMediaCommandSupported(2L) && mediaStatus.getLiveSeekableRange() != null) {
            return true;
        }
        return false;
    }

    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo, MediaLoadOptions mediaLoadOptions) {
        MediaLoadRequestData.Builder builder = new MediaLoadRequestData.Builder();
        builder.setMediaInfo(mediaInfo);
        builder.setAutoplay(Boolean.valueOf(mediaLoadOptions.getAutoplay()));
        builder.setCurrentTime(mediaLoadOptions.getPlayPosition());
        builder.setPlaybackRate(mediaLoadOptions.getPlaybackRate());
        builder.setActiveTrackIds(mediaLoadOptions.getActiveTrackIds());
        builder.setCustomData(mediaLoadOptions.getCustomData());
        builder.setCredentials(mediaLoadOptions.getCredentials());
        builder.setCredentialsType(mediaLoadOptions.getCredentialsType());
        return load(builder.build());
    }

    public PendingResult<MediaChannelResult> pause(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzax zzaxVar = new zzax(this, cVar);
        zzz(zzaxVar);
        return zzaxVar;
    }

    public PendingResult<MediaChannelResult> play(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzaz zzazVar = new zzaz(this, cVar);
        zzz(zzazVar);
        return zzazVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> seek(long j, int i) {
        return seek(j, i, null);
    }

    public PendingResult<MediaChannelResult> setPlaybackRate(double d, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzbd zzbdVar = new zzbd(this, d, cVar);
        zzz(zzbdVar);
        return zzbdVar;
    }

    public PendingResult<MediaChannelResult> setStreamMute(boolean z, c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzbc zzbcVar = new zzbc(this, z, cVar);
        zzz(zzbcVar);
        return zzbcVar;
    }

    public PendingResult<MediaChannelResult> setStreamVolume(double d, c cVar) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzbb zzbbVar = new zzbb(this, d, cVar);
        zzz(zzbbVar);
        return zzbbVar;
    }

    public PendingResult<MediaChannelResult> stop(c cVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzay zzayVar = new zzay(this, cVar);
        zzz(zzayVar);
        return zzayVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> seek(long j, int i, c cVar) {
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(j);
        builder.setResumeState(i);
        builder.setCustomData(cVar);
        return seek(builder.build());
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(MediaQueueItem mediaQueueItem, int i, c cVar) {
        return queueInsertAndPlayItem(mediaQueueItem, i, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(int i, c cVar) {
        return queueJumpToItem(i, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> queueLoad(MediaQueueItem[] mediaQueueItemArr, int i, int i2, c cVar) throws IllegalArgumentException {
        return queueLoad(mediaQueueItemArr, i, i2, -1L, cVar);
    }

    public PendingResult<MediaChannelResult> seek(MediaSeekOptions mediaSeekOptions) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzba zzbaVar = new zzba(this, mediaSeekOptions);
        zzz(zzbaVar);
        return zzbaVar;
    }

    @Deprecated
    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo, boolean z) {
        MediaLoadOptions.Builder builder = new MediaLoadOptions.Builder();
        builder.setAutoplay(z);
        return load(mediaInfo, builder.build());
    }

    @Deprecated
    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo, boolean z, long j) {
        MediaLoadOptions.Builder builder = new MediaLoadOptions.Builder();
        builder.setAutoplay(z);
        builder.setPlayPosition(j);
        return load(mediaInfo, builder.build());
    }

    @Deprecated
    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo, boolean z, long j, c cVar) {
        MediaLoadOptions.Builder builder = new MediaLoadOptions.Builder();
        builder.setAutoplay(z);
        builder.setPlayPosition(j);
        builder.setCustomData(cVar);
        return load(mediaInfo, builder.build());
    }

    @Deprecated
    public PendingResult<MediaChannelResult> load(MediaInfo mediaInfo, boolean z, long j, long[] jArr, c cVar) {
        MediaLoadOptions.Builder builder = new MediaLoadOptions.Builder();
        builder.setAutoplay(z);
        builder.setPlayPosition(j);
        builder.setActiveTrackIds(jArr);
        builder.setCustomData(cVar);
        return load(mediaInfo, builder.build());
    }

    public PendingResult<MediaChannelResult> load(MediaLoadRequestData mediaLoadRequestData) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (!zzy()) {
            return zzf(17, null);
        }
        zzav zzavVar = new zzav(this, mediaLoadRequestData);
        zzz(zzavVar);
        return zzavVar;
    }
}
