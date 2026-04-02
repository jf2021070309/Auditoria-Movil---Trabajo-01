package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaInfoWriter {
    private final MediaInfo zza;

    public MediaInfoWriter(MediaInfo mediaInfo) {
        this.zza = mediaInfo;
    }

    public MediaInfo getMediaInfo() {
        return this.zza;
    }

    public MediaInfoWriter setAdBreakClips(List<AdBreakClipInfo> list) {
        this.zza.getWriter().setAdBreakClips(list);
        return this;
    }

    public MediaInfoWriter setAdBreaks(List<AdBreakInfo> list) {
        this.zza.getWriter().setAdBreaks(list);
        return this;
    }

    public MediaInfoWriter setContentId(String str) {
        if (str != null) {
            this.zza.getWriter().setContentId(str);
            return this;
        }
        throw new IllegalArgumentException("contentID cannot be null");
    }

    public MediaInfoWriter setContentType(String str) {
        this.zza.getWriter().setContentType(str);
        return this;
    }

    public MediaInfoWriter setContentUrl(String str) {
        this.zza.getWriter().setContentUrl(str);
        return this;
    }

    public MediaInfoWriter setCustomData(c cVar) {
        this.zza.getWriter().setCustomData(cVar);
        return this;
    }

    public MediaInfoWriter setEntity(String str) {
        this.zza.getWriter().setEntity(str);
        return this;
    }

    public MediaInfoWriter setMediaTracks(List<MediaTrack> list) {
        this.zza.getWriter().setMediaTracks(list);
        return this;
    }

    public MediaInfoWriter setMetadata(MediaMetadata mediaMetadata) {
        this.zza.getWriter().setMetadata(mediaMetadata);
        return this;
    }

    public MediaInfoWriter setStartAbsoluteTime(long j) {
        this.zza.getWriter().setStartAbsoluteTime(j);
        return this;
    }

    public MediaInfoWriter setStreamDuration(long j) {
        this.zza.getWriter().setStreamDuration(j);
        return this;
    }

    public MediaInfoWriter setStreamType(int i) {
        this.zza.getWriter().setStreamType(i);
        return this;
    }

    public MediaInfoWriter setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zza.getWriter().setTextTrackStyle(textTrackStyle);
        return this;
    }

    public MediaInfoWriter setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
        this.zza.getWriter().setVmapAdsRequest(vastAdsRequest);
        return this;
    }
}
