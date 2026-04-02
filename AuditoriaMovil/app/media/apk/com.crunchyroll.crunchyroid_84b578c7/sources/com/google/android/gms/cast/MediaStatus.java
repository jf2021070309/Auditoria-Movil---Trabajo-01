package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaStatusCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final long COMMAND_DISLIKE = 32768;
    public static final long COMMAND_EDIT_TRACKS = 4096;
    public static final long COMMAND_FOLLOW = 65536;
    public static final long COMMAND_LIKE = 16384;
    public static final long COMMAND_PAUSE = 1;
    public static final long COMMAND_PLAYBACK_RATE = 8192;
    public static final long COMMAND_QUEUE_NEXT = 64;
    public static final long COMMAND_QUEUE_PREVIOUS = 128;
    public static final long COMMAND_QUEUE_REPEAT = 3072;
    public static final long COMMAND_QUEUE_REPEAT_ALL = 1024;
    public static final long COMMAND_QUEUE_REPEAT_ONE = 2048;
    public static final long COMMAND_QUEUE_SHUFFLE = 256;
    public static final long COMMAND_SEEK = 2;
    public static final long COMMAND_SET_VOLUME = 4;
    public static final long COMMAND_SKIP_AD = 512;
    @Deprecated
    public static final long COMMAND_SKIP_BACKWARD = 32;
    @Deprecated
    public static final long COMMAND_SKIP_FORWARD = 16;
    @ShowFirstParty
    @KeepForSdk
    public static final long COMMAND_STREAM_TRANSFER = 262144;
    public static final long COMMAND_TOGGLE_MUTE = 8;
    public static final long COMMAND_UNFOLLOW = 131072;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_LOADING = 5;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int REPEAT_MODE_REPEAT_ALL = 1;
    public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
    public static final int REPEAT_MODE_REPEAT_OFF = 0;
    public static final int REPEAT_MODE_REPEAT_SINGLE = 2;
    @SafeParcelable.Field(getter = "getMediaInfo", id = 2)
    MediaInfo zza;
    @SafeParcelable.Field(getter = "getMediaSessionId", id = 3)
    long zzb;
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 4)
    int zzc;
    @SafeParcelable.Field(getter = "getPlaybackRate", id = 5)
    double zzd;
    @SafeParcelable.Field(getter = "getPlayerState", id = 6)
    int zze;
    @SafeParcelable.Field(getter = "getIdleReason", id = 7)
    int zzf;
    @SafeParcelable.Field(getter = "getStreamPosition", id = 8)
    long zzg;
    @SafeParcelable.Field(id = 9)
    long zzh;
    @SafeParcelable.Field(getter = "getStreamVolume", id = 10)
    double zzi;
    @SafeParcelable.Field(getter = "isMute", id = 11)
    boolean zzj;
    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 12)
    long[] zzk;
    @SafeParcelable.Field(getter = "getLoadingItemId", id = 13)
    int zzl;
    @SafeParcelable.Field(getter = "getPreloadedItemId", id = 14)
    int zzm;
    @SafeParcelable.Field(id = 15)
    String zzn;
    c zzo;
    @SafeParcelable.Field(id = 16)
    int zzp;
    @SafeParcelable.Field(id = 17)
    final List zzq;
    @SafeParcelable.Field(getter = "isPlayingAd", id = 18)
    boolean zzr;
    @SafeParcelable.Field(getter = "getAdBreakStatus", id = 19)
    AdBreakStatus zzs;
    @SafeParcelable.Field(getter = "getVideoInfo", id = 20)
    VideoInfo zzt;
    @SafeParcelable.Field(getter = "getLiveSeekableRange", id = 21)
    MediaLiveSeekableRange zzu;
    @SafeParcelable.Field(getter = "getQueueData", id = 22)
    MediaQueueData zzv;
    boolean zzw;
    private final SparseArray zzy;
    private final Writer zzz;
    private static final Logger zzx = new Logger("MediaStatus");
    @KeepForSdk
    public static final Parcelable.Creator<MediaStatus> CREATOR = new zzcm();

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        private MediaInfo zza;
        private long zzb;
        private double zzd;
        private long zzg;
        private long zzh;
        private double zzi;
        private boolean zzj;
        private long[] zzk;
        private c zzn;
        private boolean zzq;
        private AdBreakStatus zzr;
        private VideoInfo zzs;
        private MediaLiveSeekableRange zzt;
        private MediaQueueData zzu;
        private int zzc = 0;
        private int zze = 0;
        private int zzf = 0;
        private int zzl = 0;
        private int zzm = 0;
        private int zzo = 0;
        private final List zzp = new ArrayList();

        @KeepForSdk
        public MediaStatus build() {
            MediaStatus mediaStatus = new MediaStatus(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu);
            mediaStatus.zzo = this.zzn;
            return mediaStatus;
        }

        @KeepForSdk
        public Builder setActiveTrackIds(long[] jArr) {
            this.zzk = jArr;
            return this;
        }

        @KeepForSdk
        public Builder setAdBreakStatus(AdBreakStatus adBreakStatus) {
            this.zzr = adBreakStatus;
            return this;
        }

        @KeepForSdk
        public Builder setCurrentItemId(int i) {
            this.zzc = i;
            return this;
        }

        @KeepForSdk
        public Builder setCustomData(c cVar) {
            this.zzn = cVar;
            return this;
        }

        @KeepForSdk
        public Builder setIdleReason(int i) {
            this.zzf = i;
            return this;
        }

        @KeepForSdk
        public Builder setIsMute(boolean z) {
            this.zzj = z;
            return this;
        }

        @KeepForSdk
        public Builder setIsPlayingAd(boolean z) {
            this.zzq = z;
            return this;
        }

        @KeepForSdk
        public Builder setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
            this.zzt = mediaLiveSeekableRange;
            return this;
        }

        @KeepForSdk
        public Builder setLoadingItemId(int i) {
            this.zzl = i;
            return this;
        }

        @KeepForSdk
        public Builder setMediaInfo(MediaInfo mediaInfo) {
            this.zza = mediaInfo;
            return this;
        }

        @KeepForSdk
        public Builder setMediaSessionId(long j) {
            this.zzb = j;
            return this;
        }

        @KeepForSdk
        public Builder setPlaybackRate(double d) {
            this.zzd = d;
            return this;
        }

        @KeepForSdk
        public Builder setPlayerState(int i) {
            this.zze = i;
            return this;
        }

        @KeepForSdk
        public Builder setPreloadedItemId(int i) {
            this.zzm = i;
            return this;
        }

        @KeepForSdk
        public Builder setQueueData(MediaQueueData mediaQueueData) {
            this.zzu = mediaQueueData;
            return this;
        }

        @KeepForSdk
        public Builder setQueueItems(List<MediaQueueItem> list) {
            this.zzp.clear();
            this.zzp.addAll(list);
            return this;
        }

        @KeepForSdk
        public Builder setQueueRepeatMode(int i) {
            this.zzo = i;
            return this;
        }

        @KeepForSdk
        public Builder setStreamPosition(long j) {
            this.zzg = j;
            return this;
        }

        @KeepForSdk
        public Builder setStreamVolume(double d) {
            this.zzi = d;
            return this;
        }

        @KeepForSdk
        public Builder setSupportedMediaCommands(long j) {
            this.zzh = j;
            return this;
        }

        @KeepForSdk
        public Builder setVideoInfo(VideoInfo videoInfo) {
            this.zzs = videoInfo;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setActiveTrackIds(long[] jArr) {
            MediaStatus.this.zzk = jArr;
        }

        @KeepForSdk
        public void setAdBreakStatus(AdBreakStatus adBreakStatus) {
            MediaStatus.this.zzs = adBreakStatus;
        }

        @KeepForSdk
        public void setCurrentItemId(int i) {
            MediaStatus.this.zzc = i;
        }

        @KeepForSdk
        public void setCustomData(c cVar) {
            MediaStatus mediaStatus = MediaStatus.this;
            mediaStatus.zzo = cVar;
            mediaStatus.zzn = null;
        }

        @KeepForSdk
        public void setIdleReason(int i) {
            MediaStatus.this.zzf = i;
        }

        @KeepForSdk
        public void setIsPlayingAd(boolean z) {
            MediaStatus.this.zzr = z;
        }

        @KeepForSdk
        public void setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
            MediaStatus.this.zzu = mediaLiveSeekableRange;
        }

        @KeepForSdk
        public void setLoadingItemId(int i) {
            MediaStatus.this.zzl = i;
        }

        @KeepForSdk
        public void setMediaInfo(MediaInfo mediaInfo) {
            MediaStatus.this.zza = mediaInfo;
        }

        @KeepForSdk
        public void setMute(boolean z) {
            MediaStatus.this.zzj = z;
        }

        @KeepForSdk
        public void setPlaybackRate(double d) {
            MediaStatus.this.zzd = d;
        }

        @KeepForSdk
        public void setPlayerState(int i) {
            MediaStatus.this.zze = i;
        }

        @KeepForSdk
        public void setPreloadedItemId(int i) {
            MediaStatus.this.zzm = i;
        }

        @KeepForSdk
        public void setQueueData(MediaQueueData mediaQueueData) {
            MediaStatus.this.zzv = mediaQueueData;
        }

        @KeepForSdk
        public void setQueueItems(List<MediaQueueItem> list) {
            MediaStatus.this.zze(list);
        }

        @KeepForSdk
        public void setQueueRepeatMode(int i) {
            MediaStatus.this.zzp = i;
        }

        @KeepForSdk
        public void setShuffle(boolean z) {
            MediaStatus.this.zzw = z;
        }

        @KeepForSdk
        public void setStreamPosition(long j) {
            MediaStatus.this.zzg = j;
        }

        @KeepForSdk
        public void setStreamVolume(double d) {
            MediaStatus.this.zzi = d;
        }

        @KeepForSdk
        public void setSupportedMediaCommands(long j) {
            MediaStatus.this.zzh = j;
        }

        @KeepForSdk
        public void setVideoInfo(VideoInfo videoInfo) {
            MediaStatus.this.zzt = videoInfo;
        }
    }

    @SafeParcelable.Constructor
    @SuppressLint({"NonSdkVisibleApi"})
    public MediaStatus(@SafeParcelable.Param(id = 2) MediaInfo mediaInfo, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) double d, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) double d2, @SafeParcelable.Param(id = 11) boolean z, @SafeParcelable.Param(id = 12) long[] jArr, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 15) String str, @SafeParcelable.Param(id = 16) int i6, @SafeParcelable.Param(id = 17) List list, @SafeParcelable.Param(id = 18) boolean z2, @SafeParcelable.Param(id = 19) AdBreakStatus adBreakStatus, @SafeParcelable.Param(id = 20) VideoInfo videoInfo, @SafeParcelable.Param(id = 21) MediaLiveSeekableRange mediaLiveSeekableRange, @SafeParcelable.Param(id = 22) MediaQueueData mediaQueueData) {
        this.zzq = new ArrayList();
        this.zzy = new SparseArray();
        this.zzz = new Writer();
        this.zza = mediaInfo;
        this.zzb = j;
        this.zzc = i;
        this.zzd = d;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = d2;
        this.zzj = z;
        this.zzk = jArr;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = str;
        if (str != null) {
            try {
                this.zzo = new c(str);
            } catch (b unused) {
                this.zzo = null;
                this.zzn = null;
            }
        } else {
            this.zzo = null;
        }
        this.zzp = i6;
        if (list != null && !list.isEmpty()) {
            zze(list);
        }
        this.zzr = z2;
        this.zzs = adBreakStatus;
        this.zzt = videoInfo;
        this.zzu = mediaLiveSeekableRange;
        this.zzv = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.zzk()) {
            z3 = true;
        }
        this.zzw = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(List list) {
        this.zzq.clear();
        this.zzy.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
                this.zzq.add(mediaQueueItem);
                this.zzy.put(mediaQueueItem.getItemId(), Integer.valueOf(i));
            }
        }
    }

    private static final boolean zzf(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return true;
                }
            } else if (i4 == 2) {
                return false;
            } else {
                return true;
            }
        }
        if (i3 != 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        c cVar;
        c cVar2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        if (this.zzo != null) {
            z = false;
        } else {
            z = true;
        }
        if (mediaStatus.zzo != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2 && this.zzb == mediaStatus.zzb && this.zzc == mediaStatus.zzc && this.zzd == mediaStatus.zzd && this.zze == mediaStatus.zze && this.zzf == mediaStatus.zzf && this.zzg == mediaStatus.zzg && this.zzi == mediaStatus.zzi && this.zzj == mediaStatus.zzj && this.zzl == mediaStatus.zzl && this.zzm == mediaStatus.zzm && this.zzp == mediaStatus.zzp && Arrays.equals(this.zzk, mediaStatus.zzk) && CastUtils.zze(Long.valueOf(this.zzh), Long.valueOf(mediaStatus.zzh)) && CastUtils.zze(this.zzq, mediaStatus.zzq) && CastUtils.zze(this.zza, mediaStatus.zza) && (((cVar = this.zzo) == null || (cVar2 = mediaStatus.zzo) == null || JsonUtils.areJsonValuesEquivalent(cVar, cVar2)) && this.zzr == mediaStatus.isPlayingAd() && CastUtils.zze(this.zzs, mediaStatus.zzs) && CastUtils.zze(this.zzt, mediaStatus.zzt) && CastUtils.zze(this.zzu, mediaStatus.zzu) && Objects.equal(this.zzv, mediaStatus.zzv) && this.zzw == mediaStatus.zzw)) {
            return true;
        }
        return false;
    }

    public long[] getActiveTrackIds() {
        return this.zzk;
    }

    public AdBreakStatus getAdBreakStatus() {
        return this.zzs;
    }

    public AdBreakInfo getCurrentAdBreak() {
        MediaInfo mediaInfo;
        List<AdBreakInfo> adBreaks;
        AdBreakStatus adBreakStatus = this.zzs;
        if (adBreakStatus == null) {
            return null;
        }
        String breakId = adBreakStatus.getBreakId();
        if (!TextUtils.isEmpty(breakId) && (mediaInfo = this.zza) != null && (adBreaks = mediaInfo.getAdBreaks()) != null && !adBreaks.isEmpty()) {
            for (AdBreakInfo adBreakInfo : adBreaks) {
                if (breakId.equals(adBreakInfo.getId())) {
                    return adBreakInfo;
                }
            }
        }
        return null;
    }

    public AdBreakClipInfo getCurrentAdBreakClip() {
        MediaInfo mediaInfo;
        List<AdBreakClipInfo> adBreakClips;
        AdBreakStatus adBreakStatus = this.zzs;
        if (adBreakStatus == null) {
            return null;
        }
        String breakClipId = adBreakStatus.getBreakClipId();
        if (!TextUtils.isEmpty(breakClipId) && (mediaInfo = this.zza) != null && (adBreakClips = mediaInfo.getAdBreakClips()) != null && !adBreakClips.isEmpty()) {
            for (AdBreakClipInfo adBreakClipInfo : adBreakClips) {
                if (breakClipId.equals(adBreakClipInfo.getId())) {
                    return adBreakClipInfo;
                }
            }
        }
        return null;
    }

    public int getCurrentItemId() {
        return this.zzc;
    }

    public c getCustomData() {
        return this.zzo;
    }

    public int getIdleReason() {
        return this.zzf;
    }

    public Integer getIndexById(int i) {
        return (Integer) this.zzy.get(i);
    }

    public MediaQueueItem getItemById(int i) {
        Integer num = (Integer) this.zzy.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.zzq.get(num.intValue());
    }

    public MediaQueueItem getItemByIndex(int i) {
        if (i >= 0 && i < this.zzq.size()) {
            return (MediaQueueItem) this.zzq.get(i);
        }
        return null;
    }

    public MediaLiveSeekableRange getLiveSeekableRange() {
        return this.zzu;
    }

    public int getLoadingItemId() {
        return this.zzl;
    }

    public MediaInfo getMediaInfo() {
        return this.zza;
    }

    public double getPlaybackRate() {
        return this.zzd;
    }

    public int getPlayerState() {
        return this.zze;
    }

    public int getPreloadedItemId() {
        return this.zzm;
    }

    public MediaQueueData getQueueData() {
        return this.zzv;
    }

    public MediaQueueItem getQueueItem(int i) {
        return getItemByIndex(i);
    }

    public MediaQueueItem getQueueItemById(int i) {
        return getItemById(i);
    }

    public int getQueueItemCount() {
        return this.zzq.size();
    }

    public List<MediaQueueItem> getQueueItems() {
        return this.zzq;
    }

    public int getQueueRepeatMode() {
        return this.zzp;
    }

    public long getStreamPosition() {
        return this.zzg;
    }

    public double getStreamVolume() {
        return this.zzi;
    }

    @KeepForSdk
    public long getSupportedMediaCommands() {
        return this.zzh;
    }

    public VideoInfo getVideoInfo() {
        return this.zzt;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzz;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Double.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(Arrays.hashCode(this.zzk)), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), String.valueOf(this.zzo), Integer.valueOf(this.zzp), this.zzq, Boolean.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv);
    }

    public boolean isMediaCommandSupported(long j) {
        if ((j & this.zzh) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        return this.zzj;
    }

    public boolean isPlayingAd() {
        return this.zzr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9 A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1 A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b A[Catch: b -> 0x0152, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e A[Catch: b -> 0x0152, LOOP:0: B:65:0x0138->B:67:0x013e, LOOP_END, TryCatch #0 {b -> 0x0152, blocks: (B:3:0x0006, B:17:0x002f, B:19:0x0037, B:29:0x004e, B:30:0x0053, B:36:0x00a3, B:38:0x00bc, B:39:0x00c5, B:41:0x00c9, B:42:0x00ce, B:44:0x00d2, B:45:0x00d7, B:47:0x00db, B:48:0x00e0, B:50:0x00e4, B:51:0x00ed, B:53:0x00f1, B:54:0x00fa, B:56:0x00fe, B:57:0x0107, B:59:0x010b, B:60:0x0114, B:62:0x0127, B:64:0x012d, B:65:0x0138, B:67:0x013e, B:68:0x014c, B:33:0x008b, B:35:0x0096), top: B:73:0x0006 }] */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c toJson() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.toJson():com.amazon.aps.iva.if0.c");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzo;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zzn = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMediaInfo(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, getCurrentItemId());
        SafeParcelWriter.writeDouble(parcel, 5, getPlaybackRate());
        SafeParcelWriter.writeInt(parcel, 6, getPlayerState());
        SafeParcelWriter.writeInt(parcel, 7, getIdleReason());
        SafeParcelWriter.writeLong(parcel, 8, getStreamPosition());
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeDouble(parcel, 10, getStreamVolume());
        SafeParcelWriter.writeBoolean(parcel, 11, isMute());
        SafeParcelWriter.writeLongArray(parcel, 12, getActiveTrackIds(), false);
        SafeParcelWriter.writeInt(parcel, 13, getLoadingItemId());
        SafeParcelWriter.writeInt(parcel, 14, getPreloadedItemId());
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, isPlayingAd());
        SafeParcelWriter.writeParcelable(parcel, 19, getAdBreakStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 20, getVideoInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 21, getLiveSeekableRange(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getQueueData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
        if (r13.zzk != null) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.amazon.aps.iva.if0.c r14, int r15) throws com.amazon.aps.iva.if0.b {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.zza(com.amazon.aps.iva.if0.c, int):int");
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzd() {
        int streamType;
        MediaInfo mediaInfo = this.zza;
        if (mediaInfo == null) {
            streamType = -1;
        } else {
            streamType = mediaInfo.getStreamType();
        }
        return zzf(this.zze, this.zzf, this.zzl, streamType);
    }

    @KeepForSdk
    public MediaStatus(c cVar) throws b {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        zza(cVar, 0);
    }
}
