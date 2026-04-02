package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaStatusWriter {
    private final MediaStatus zza;

    public MediaStatusWriter(MediaStatus mediaStatus) {
        this.zza = mediaStatus;
    }

    public MediaInfoWriter getMediaInfoWriter() {
        MediaInfo mediaInfo = this.zza.getMediaInfo();
        if (mediaInfo != null) {
            return new MediaInfoWriter(mediaInfo);
        }
        return null;
    }

    public MediaStatus getMediaStatus() {
        return this.zza;
    }

    public MediaStatusWriter setActiveTrackIds(long[] jArr) {
        this.zza.getWriter().setActiveTrackIds(jArr);
        return this;
    }

    public MediaStatusWriter setAdBreakStatus(AdBreakStatus adBreakStatus) {
        this.zza.getWriter().setAdBreakStatus(adBreakStatus);
        return this;
    }

    public MediaStatusWriter setCurrentItemId(int i) {
        this.zza.getWriter().setCurrentItemId(i);
        return this;
    }

    public MediaStatusWriter setCustomData(c cVar) {
        this.zza.getWriter().setCustomData(cVar);
        return this;
    }

    public MediaStatusWriter setIdleReason(int i) {
        this.zza.getWriter().setIdleReason(i);
        return this;
    }

    public MediaStatusWriter setIsPlayingAd(boolean z) {
        this.zza.getWriter().setIsPlayingAd(z);
        return this;
    }

    public MediaStatusWriter setLiveSeekableRange(MediaLiveSeekableRange mediaLiveSeekableRange) {
        this.zza.getWriter().setLiveSeekableRange(mediaLiveSeekableRange);
        return this;
    }

    public MediaStatusWriter setLoadingItemId(int i) {
        this.zza.getWriter().setLoadingItemId(i);
        return this;
    }

    public MediaStatusWriter setMediaInfo(MediaInfo mediaInfo) {
        this.zza.getWriter().setMediaInfo(mediaInfo);
        return this;
    }

    public MediaStatusWriter setMuteState(boolean z) {
        this.zza.getWriter().setMute(z);
        return this;
    }

    public MediaStatusWriter setPlaybackRate(double d) {
        this.zza.getWriter().setPlaybackRate(d);
        return this;
    }

    public MediaStatusWriter setPlayerState(int i) {
        this.zza.getWriter().setPlayerState(i);
        return this;
    }

    public MediaStatusWriter setPreloadedItemId(int i) {
        this.zza.getWriter().setPreloadedItemId(i);
        return this;
    }

    public MediaStatusWriter setQueueData(MediaQueueData mediaQueueData) {
        this.zza.getWriter().setQueueData(mediaQueueData);
        return this;
    }

    public MediaStatusWriter setQueueItems(List<MediaQueueItem> list) {
        this.zza.getWriter().setQueueItems(list);
        return this;
    }

    public MediaStatusWriter setQueueRepeatMode(int i) {
        this.zza.getWriter().setQueueRepeatMode(i);
        return this;
    }

    public MediaStatusWriter setStreamPosition(long j) {
        this.zza.getWriter().setStreamPosition(j);
        return this;
    }

    public MediaStatusWriter setStreamVolume(double d) {
        this.zza.getWriter().setStreamVolume(d);
        return this;
    }

    public MediaStatusWriter setSupportedMediaCommands(long j) {
        this.zza.getWriter().setSupportedMediaCommands(j);
        return this;
    }

    public MediaStatusWriter setVideoInfo(VideoInfo videoInfo) {
        this.zza.getWriter().setVideoInfo(videoInfo);
        return this;
    }
}
