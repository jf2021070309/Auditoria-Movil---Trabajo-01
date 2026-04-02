package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaInfoModifier {
    private String zza;
    private Integer zzb;
    private String zzc;
    private MediaMetadataModifier zzd = new MediaMetadataModifier();
    private Long zze;
    private List zzf;
    private TextTrackStyle zzg;
    private c zzh;
    private List zzi;
    private List zzj;
    private String zzk;
    private VastAdsRequest zzl;
    private Long zzm;
    private String zzn;

    public void clear() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        MediaMetadataModifier mediaMetadataModifier = this.zzd;
        if (mediaMetadataModifier != null) {
            mediaMetadataModifier.clear();
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = null;
        this.zzl = null;
        this.zzm = null;
        this.zzn = null;
    }

    public List<AdBreakClipInfo> getAdBreakClips() {
        return this.zzj;
    }

    public List<AdBreakInfo> getAdBreaks() {
        return this.zzi;
    }

    public String getContentId() {
        return this.zza;
    }

    public String getContentType() {
        return this.zzc;
    }

    public String getContentUrl() {
        return this.zzn;
    }

    public c getCustomData() {
        return this.zzh;
    }

    public String getEntity() {
        return this.zzk;
    }

    public List<MediaTrack> getMediaTracks() {
        return this.zzf;
    }

    public MediaMetadataModifier getMetadataModifier() {
        return this.zzd;
    }

    public Long getStartAbsoluteTime() {
        return this.zzm;
    }

    public Long getStreamDuration() {
        return this.zze;
    }

    public Integer getStreamType() {
        return this.zzb;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzg;
    }

    public VastAdsRequest getVmapAdsRequest() {
        return this.zzl;
    }

    public MediaInfoModifier setAdBreakClips(List<AdBreakClipInfo> list) {
        this.zzj = list;
        return this;
    }

    public MediaInfoModifier setAdBreaks(List<AdBreakInfo> list) {
        this.zzi = list;
        return this;
    }

    public MediaInfoModifier setContentId(String str) {
        this.zza = str;
        return this;
    }

    public MediaInfoModifier setContentType(String str) {
        this.zzc = str;
        return this;
    }

    public MediaInfoModifier setContentUrl(String str) {
        this.zzn = str;
        return this;
    }

    public MediaInfoModifier setCustomData(c cVar) {
        this.zzh = cVar;
        return this;
    }

    public void setDataFromMediaInfo(MediaInfo mediaInfo) {
        Integer num;
        Long l;
        clear();
        if (mediaInfo == null) {
            return;
        }
        this.zza = mediaInfo.getContentId();
        int streamType = mediaInfo.getStreamType();
        Long l2 = null;
        if (streamType != 0 && streamType != -1) {
            num = Integer.valueOf(streamType);
        } else {
            num = null;
        }
        this.zzb = num;
        this.zzc = mediaInfo.getContentType();
        long streamDuration = mediaInfo.getStreamDuration();
        if (streamDuration > -1) {
            l = Long.valueOf(streamDuration);
        } else {
            l = null;
        }
        this.zze = l;
        this.zzf = mediaInfo.getMediaTracks();
        this.zzg = mediaInfo.getTextTrackStyle();
        this.zzh = mediaInfo.getCustomData();
        this.zzi = mediaInfo.getAdBreaks();
        this.zzj = mediaInfo.getAdBreakClips();
        this.zzk = mediaInfo.getEntity();
        this.zzl = mediaInfo.getVmapAdsRequest();
        long startAbsoluteTime = mediaInfo.getStartAbsoluteTime();
        if (startAbsoluteTime > -1) {
            l2 = Long.valueOf(startAbsoluteTime);
        }
        this.zzm = l2;
        this.zzn = mediaInfo.getContentUrl();
        MediaMetadata metadata = mediaInfo.getMetadata();
        if (metadata != null) {
            MediaMetadataModifier mediaMetadataModifier = new MediaMetadataModifier();
            this.zzd = mediaMetadataModifier;
            mediaMetadataModifier.zzb(metadata);
        }
    }

    public MediaInfoModifier setEntity(String str) {
        this.zzk = str;
        return this;
    }

    public MediaInfoModifier setMediaTracks(List<MediaTrack> list) {
        this.zzf = list;
        return this;
    }

    public void setMetadataModifier(MediaMetadataModifier mediaMetadataModifier) {
        this.zzd = mediaMetadataModifier;
    }

    public MediaInfoModifier setStartAbsoluteTime(Long l) {
        this.zzm = l;
        return this;
    }

    public MediaInfoModifier setStreamDuration(Long l) {
        this.zze = l;
        return this;
    }

    public MediaInfoModifier setStreamType(Integer num) {
        this.zzb = num;
        return this;
    }

    public MediaInfoModifier setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zzg = textTrackStyle;
        return this;
    }

    public MediaInfoModifier setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
        this.zzl = vastAdsRequest;
        return this;
    }

    public final void zza(MediaInfo mediaInfo) {
        MediaInfoWriter mediaInfoWriter = new MediaInfoWriter(mediaInfo);
        String str = this.zza;
        if (str != null) {
            mediaInfoWriter.setContentId(str);
        }
        Integer num = this.zzb;
        if (num != null) {
            mediaInfoWriter.setStreamType(num.intValue());
        }
        String str2 = this.zzc;
        if (str2 != null) {
            mediaInfoWriter.setContentType(str2);
        }
        if (this.zzd != null) {
            if (mediaInfo.getMetadata() == null) {
                mediaInfoWriter.setMetadata(new MediaMetadata());
            }
            MediaMetadata metadata = mediaInfo.getMetadata();
            Preconditions.checkNotNull(metadata);
            Preconditions.checkNotNull(this.zzd);
            this.zzd.zza(metadata);
        }
        Long l = this.zze;
        if (l != null) {
            mediaInfoWriter.setStreamDuration(l.longValue());
        }
        List<MediaTrack> list = this.zzf;
        if (list != null) {
            mediaInfoWriter.setMediaTracks(list);
        }
        Long l2 = this.zze;
        if (l2 != null) {
            mediaInfoWriter.setStreamDuration(l2.longValue());
        }
        List<MediaTrack> list2 = this.zzf;
        if (list2 != null) {
            mediaInfoWriter.setMediaTracks(list2);
        }
        TextTrackStyle textTrackStyle = this.zzg;
        if (textTrackStyle != null) {
            mediaInfoWriter.setTextTrackStyle(textTrackStyle);
        }
        c cVar = this.zzh;
        if (cVar != null) {
            mediaInfoWriter.setCustomData(cVar);
        }
        List<AdBreakInfo> list3 = this.zzi;
        if (list3 != null) {
            mediaInfoWriter.setAdBreaks(list3);
        }
        List<AdBreakClipInfo> list4 = this.zzj;
        if (list4 != null) {
            mediaInfoWriter.setAdBreakClips(list4);
        }
        String str3 = this.zzk;
        if (str3 != null) {
            mediaInfoWriter.setEntity(str3);
        }
        VastAdsRequest vastAdsRequest = this.zzl;
        if (vastAdsRequest != null) {
            mediaInfoWriter.setVmapAdsRequest(vastAdsRequest);
        }
        Long l3 = this.zzm;
        if (l3 != null) {
            mediaInfoWriter.setStartAbsoluteTime(l3.longValue());
        }
        String str4 = this.zzn;
        if (str4 != null) {
            mediaInfoWriter.setContentUrl(str4);
        }
    }
}
