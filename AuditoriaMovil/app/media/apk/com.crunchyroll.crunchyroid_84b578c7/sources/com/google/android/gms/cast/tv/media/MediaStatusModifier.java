package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaStatusModifier {
    private static final Logger zza = new Logger("MediaQueueManager");
    private Double zzd;
    private Integer zze;
    private Integer zzf;
    private Long zzg;
    private Integer zzi;
    private Integer zzj;
    private c zzk;
    private Boolean zzl;
    private AdBreakStatus zzm;
    private VideoInfo zzn;
    private MediaLiveSeekableRange zzo;
    private long zzp;
    private MediaInfoModifier zzb = new MediaInfoModifier();
    private final MediaTracksModifier zzc = new MediaTracksModifier(this);
    private final Map zzh = new HashMap();

    public void clear() {
        MediaInfoModifier mediaInfoModifier = this.zzb;
        if (mediaInfoModifier != null) {
            mediaInfoModifier.clear();
        }
        this.zzc.clear();
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzh.clear();
        this.zzi = null;
        this.zzj = null;
        this.zzk = null;
        this.zzl = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
    }

    public AdBreakStatus getAdBreakStatus() {
        return this.zzm;
    }

    public c getCustomData() {
        return this.zzk;
    }

    public Integer getIdleReason() {
        return this.zzf;
    }

    public MediaLiveSeekableRange getLiveSeekableRange() {
        return this.zzo;
    }

    public Integer getLoadingItemId() {
        return this.zzi;
    }

    public MediaInfoModifier getMediaInfoModifier() {
        return this.zzb;
    }

    public MediaTracksModifier getMediaTracksModifier() {
        return this.zzc;
    }

    public Double getPlaybackRate() {
        return this.zzd;
    }

    public Integer getPlayerState() {
        return this.zze;
    }

    public Integer getPreloadedItemId() {
        return this.zzj;
    }

    public Long getStreamPosition() {
        return this.zzg;
    }

    public Map<Long, Boolean> getSupportedMediaCommandOverride() {
        return this.zzh;
    }

    public VideoInfo getVideoInfo() {
        return this.zzn;
    }

    public Boolean isPlayingAd() {
        return this.zzl;
    }

    public MediaStatusModifier setAdBreakStatus(AdBreakStatus adBreakStatus) {
        this.zzm = adBreakStatus;
        return this;
    }

    public MediaStatusModifier setCustomData(c cVar) {
        this.zzk = cVar;
        return this;
    }

    public MediaStatusModifier setIdleReason(Integer num) {
        this.zzf = num;
        return this;
    }

    public MediaStatusModifier setIsPlayingAd(Boolean bool) {
        this.zzl = bool;
        return this;
    }

    public MediaStatusModifier setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
        this.zzo = mediaLiveSeekableRange;
        this.zzp = DefaultClock.getInstance().currentTimeMillis();
        return this;
    }

    public MediaStatusModifier setLoadingItemId(Integer num) {
        this.zzi = num;
        return this;
    }

    public MediaStatusModifier setMediaCommandSupported(long j, Boolean bool) {
        for (int i = 0; i < 64; i++) {
            long j2 = 1 << i;
            if ((j2 & j) != 0) {
                Map map = this.zzh;
                if (bool == null) {
                    map.remove(Long.valueOf(j2));
                } else {
                    map.put(Long.valueOf(j2), bool);
                }
            }
        }
        return this;
    }

    public void setMediaInfoModifier(MediaInfoModifier mediaInfoModifier) {
        this.zzb = mediaInfoModifier;
    }

    public MediaStatusModifier setPlaybackRate(Double d) {
        this.zzd = d;
        return this;
    }

    public MediaStatusModifier setPlayerState(Integer num) {
        this.zze = num;
        return this;
    }

    public MediaStatusModifier setPreloadedItemId(Integer num) {
        this.zzj = num;
        return this;
    }

    public MediaStatusModifier setStreamPosition(Long l) {
        this.zzg = l;
        return this;
    }

    public MediaStatusModifier setVideoInfo(VideoInfo videoInfo) {
        this.zzn = videoInfo;
        return this;
    }

    public final void zza(MediaStatus mediaStatus) {
        MediaInfo mediaInfo;
        MediaStatusWriter mediaStatusWriter = new MediaStatusWriter(mediaStatus);
        if (this.zzb != null && (mediaInfo = mediaStatus.getMediaInfo()) != null) {
            Preconditions.checkNotNull(this.zzb);
            this.zzb.zza(mediaInfo);
        }
        this.zzc.zzb(mediaStatus);
        Double d = this.zzd;
        if (d != null) {
            mediaStatusWriter.setPlaybackRate(d.doubleValue());
        }
        Integer num = this.zze;
        if (num != null) {
            mediaStatusWriter.setPlayerState(num.intValue());
        }
        Integer num2 = this.zzf;
        if (num2 != null) {
            mediaStatusWriter.setIdleReason(num2.intValue());
        }
        Long l = this.zzg;
        if (l != null) {
            mediaStatusWriter.setStreamPosition(l.longValue());
        }
        long supportedMediaCommands = mediaStatus.getSupportedMediaCommands();
        for (Map.Entry entry : this.zzh.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            if (((Boolean) entry.getValue()).booleanValue()) {
                supportedMediaCommands |= longValue;
            } else {
                supportedMediaCommands &= ~longValue;
            }
        }
        mediaStatusWriter.setSupportedMediaCommands(supportedMediaCommands);
        Integer num3 = this.zzi;
        if (num3 != null) {
            mediaStatusWriter.setLoadingItemId(num3.intValue());
        }
        Integer num4 = this.zzj;
        if (num4 != null) {
            mediaStatusWriter.setPreloadedItemId(num4.intValue());
        }
        c cVar = this.zzk;
        if (cVar != null) {
            mediaStatusWriter.setCustomData(cVar);
        }
        Boolean bool = this.zzl;
        if (bool != null) {
            mediaStatusWriter.setIsPlayingAd(bool.booleanValue());
        }
        AdBreakStatus adBreakStatus = this.zzm;
        if (adBreakStatus != null) {
            mediaStatusWriter.setAdBreakStatus(adBreakStatus);
        }
        VideoInfo videoInfo = this.zzn;
        if (videoInfo != null) {
            mediaStatusWriter.setVideoInfo(videoInfo);
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = this.zzo;
        if (mediaLiveSeekableRange != null) {
            if (mediaLiveSeekableRange.isMovingWindow()) {
                long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis() - this.zzp;
                long startTime = mediaLiveSeekableRange.getStartTime() + currentTimeMillis;
                long endTime = mediaLiveSeekableRange.getEndTime();
                if (!mediaLiveSeekableRange.isLiveDone()) {
                    endTime += currentTimeMillis;
                }
                if (startTime > endTime) {
                    startTime = endTime;
                }
                mediaLiveSeekableRange = new MediaLiveSeekableRange.Builder().setStartTime(startTime).setEndTime(endTime).setIsMovingWindow(mediaLiveSeekableRange.isMovingWindow()).setIsLiveDone(mediaLiveSeekableRange.isLiveDone()).build();
            }
            mediaStatusWriter.setLiveSeekableRange(mediaLiveSeekableRange);
        }
    }

    public final void zzb(MediaLoadRequestData mediaLoadRequestData) {
        List<MediaQueueItem> items;
        int startIndex;
        clear();
        MediaInfo mediaInfo = mediaLoadRequestData.getMediaInfo();
        MediaQueueData queueData = mediaLoadRequestData.getQueueData();
        if (mediaInfo == null && queueData != null && (items = queueData.getItems()) != null && (startIndex = queueData.getStartIndex()) >= 0 && startIndex < items.size()) {
            mediaInfo = items.get(startIndex).getMedia();
        }
        if (mediaInfo != null) {
            MediaInfoModifier mediaInfoModifier = new MediaInfoModifier();
            this.zzb = mediaInfoModifier;
            mediaInfoModifier.setDataFromMediaInfo(mediaInfo);
        } else {
            zza.e("Cannot determine the item to load. Not updating MediaStatusModifier.", new Object[0]);
        }
        this.zzc.setActiveTrackIds(mediaLoadRequestData.getActiveTrackIds());
    }
}
