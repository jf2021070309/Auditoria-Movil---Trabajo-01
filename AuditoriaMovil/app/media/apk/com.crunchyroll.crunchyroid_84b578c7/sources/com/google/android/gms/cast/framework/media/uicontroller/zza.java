package com.google.android.gms.cast.framework.media.uicontroller;

import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.text.DateFormat;
import java.util.Date;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zza {
    RemoteMediaClient zza;

    private zza() {
    }

    public static zza zzf() {
        return new zza();
    }

    private final MediaMetadata zzo() {
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && (mediaInfo = this.zza.getMediaInfo()) != null) {
            return mediaInfo.getMetadata();
        }
        return null;
    }

    private static final String zzp(long j) {
        if (j >= 0) {
            return DateUtils.formatElapsedTime(j / 1000);
        }
        return "-".concat(String.valueOf(DateUtils.formatElapsedTime((-j) / 1000)));
    }

    public final int zza() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            if (remoteMediaClient2.isLiveStream() || !remoteMediaClient2.isLoadingNextItem()) {
                boolean zzw = remoteMediaClient2.zzw();
                int approximateStreamPosition = (int) (remoteMediaClient2.getApproximateStreamPosition() - zze());
                if (zzw) {
                    int zzd = zzd();
                    approximateStreamPosition = Math.min(Math.max(approximateStreamPosition, zzd), zzc());
                }
                return Math.min(Math.max(approximateStreamPosition, 0), zzb());
            }
        }
        return 0;
    }

    public final int zzb() {
        MediaInfo media;
        RemoteMediaClient remoteMediaClient = this.zza;
        long j = 1;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            if (!remoteMediaClient2.isLiveStream()) {
                if (remoteMediaClient2.isLoadingNextItem()) {
                    MediaQueueItem loadingItem = remoteMediaClient2.getLoadingItem();
                    if (loadingItem != null && (media = loadingItem.getMedia()) != null) {
                        j = Math.max(media.getStreamDuration(), 1L);
                    }
                } else {
                    j = Math.max(remoteMediaClient2.getStreamDuration(), 1L);
                }
            } else {
                Long zzi = zzi();
                if (zzi != null) {
                    j = zzi.longValue();
                } else {
                    Long zzg = zzg();
                    j = zzg != null ? zzg.longValue() : Math.max(remoteMediaClient2.getApproximateStreamPosition(), 1L);
                }
            }
        }
        return Math.max((int) (j - zze()), 1);
    }

    public final int zzc() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream()) {
            if (!this.zza.zzw()) {
                return 0;
            }
            return Math.min(Math.max((int) (((Long) Preconditions.checkNotNull(zzg())).longValue() - zze()), 0), zzb());
        }
        return zzb();
    }

    public final int zzd() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || !this.zza.isLiveStream() || !this.zza.zzw()) {
            return 0;
        }
        return Math.min(Math.max((int) (((Long) Preconditions.checkNotNull(zzh())).longValue() - zze()), 0), zzb());
    }

    public final long zze() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            Long zzj = zzj();
            if (zzj != null) {
                return zzj.longValue();
            }
            Long zzh = zzh();
            if (zzh != null) {
                return zzh.longValue();
            }
            return remoteMediaClient2.getApproximateStreamPosition();
        }
        return 0L;
    }

    public final Long zzg() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus mediaStatus;
        RemoteMediaClient remoteMediaClient2 = this.zza;
        if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession() && this.zza.isLiveStream() && this.zza.zzw() && (mediaStatus = (remoteMediaClient = this.zza).getMediaStatus()) != null && mediaStatus.getLiveSeekableRange() != null) {
            return Long.valueOf(remoteMediaClient.getApproximateLiveSeekableRangeEnd());
        }
        return null;
    }

    public final Long zzh() {
        RemoteMediaClient remoteMediaClient;
        MediaStatus mediaStatus;
        RemoteMediaClient remoteMediaClient2 = this.zza;
        if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession() && this.zza.isLiveStream() && this.zza.zzw() && (mediaStatus = (remoteMediaClient = this.zza).getMediaStatus()) != null && mediaStatus.getLiveSeekableRange() != null) {
            return Long.valueOf(remoteMediaClient.getApproximateLiveSeekableRangeStart());
        }
        return null;
    }

    public final Long zzi() {
        MediaMetadata zzo;
        Long zzj;
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream() && (zzo = zzo()) != null && zzo.containsKey(MediaMetadata.KEY_SECTION_DURATION) && (zzj = zzj()) != null) {
            return Long.valueOf(zzo.getTimeMillis(MediaMetadata.KEY_SECTION_DURATION) + zzj.longValue());
        }
        return null;
    }

    public final Long zzj() {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            MediaInfo mediaInfo = remoteMediaClient2.getMediaInfo();
            MediaMetadata zzo = zzo();
            if (mediaInfo != null && zzo != null && zzo.containsKey(MediaMetadata.KEY_SECTION_START_TIME_IN_MEDIA)) {
                if (zzo.containsKey(MediaMetadata.KEY_SECTION_DURATION) || remoteMediaClient2.zzw()) {
                    return Long.valueOf(zzo.getTimeMillis(MediaMetadata.KEY_SECTION_START_TIME_IN_MEDIA));
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final Long zzk() {
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && this.zza.isLiveStream() && (mediaInfo = this.zza.getMediaInfo()) != null && mediaInfo.getStartAbsoluteTime() != -1) {
            return Long.valueOf(mediaInfo.getStartAbsoluteTime());
        }
        return null;
    }

    public final String zzl(long j) {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            int i = 1;
            if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession() && this.zza.isLiveStream() && zzk() != null) {
                i = 2;
            }
            if (i - 1 != 0) {
                return DateFormat.getTimeInstance().format(new Date(((Long) Preconditions.checkNotNull(zzk())).longValue() + j));
            } else if (remoteMediaClient2.isLiveStream() && zzj() == null) {
                return zzp(j);
            } else {
                return zzp(j - zze());
            }
        }
        return null;
    }

    public final boolean zzm() {
        return zzn(zze() + zza());
    }

    public final boolean zzn(long j) {
        RemoteMediaClient remoteMediaClient = this.zza;
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession() || !this.zza.zzw()) {
            return false;
        }
        if ((zze() + zzc()) - j >= NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) {
            return false;
        }
        return true;
    }
}
