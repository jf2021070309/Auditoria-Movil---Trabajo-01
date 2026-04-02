package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaQueueItemWriter {
    private final MediaQueueItem zza;

    public MediaQueueItemWriter(MediaQueueItem mediaQueueItem) {
        this.zza = mediaQueueItem;
    }

    public MediaQueueItemWriter setActiveTrackIds(long[] jArr) {
        this.zza.getWriter().setActiveTrackIds(jArr);
        return this;
    }

    public MediaQueueItemWriter setAutoplay(boolean z) {
        this.zza.getWriter().setAutoplay(z);
        return this;
    }

    public MediaQueueItemWriter setCustomData(c cVar) {
        this.zza.getWriter().setCustomData(cVar);
        return this;
    }

    public MediaQueueItemWriter setItemId(int i) {
        this.zza.getWriter().setItemId(i);
        return this;
    }

    public MediaQueueItemWriter setMedia(MediaInfo mediaInfo) {
        this.zza.getWriter().setMedia(mediaInfo);
        return this;
    }

    public MediaQueueItemWriter setPlaybackDuration(double d) {
        this.zza.getWriter().setPlaybackDuration(d);
        return this;
    }

    public MediaQueueItemWriter setPreloadTime(double d) {
        this.zza.getWriter().setPreloadTime(d);
        return this;
    }

    public MediaQueueItemWriter setStartTime(double d) {
        this.zza.getWriter().setStartTime(d);
        return this;
    }
}
