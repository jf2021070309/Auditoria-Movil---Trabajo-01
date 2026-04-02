package com.google.android.gms.internal.cast_tv;

import android.text.TextUtils;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzw {
    private static final Map zza;
    private static final Map zzb;
    private static final Map zzc;
    private MediaStatus zzd;
    private boolean zze;
    private AdBreakClipInfo zzf;
    private final zzca zzg;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        hashMap.put("application/ttml+xml", 1L);
        hashMap.put("text/vtt", 2L);
        hashMap.put("text/mp4", 3L);
        hashMap.put("audio/mp4", 4L);
        hashMap.put("video/mp4", 5L);
        hashMap.put("video/mp2t", 6L);
        hashMap.put("audio/webm", 7L);
        hashMap.put("video/webm", 8L);
        hashMap.put("application/x-mpegurl", 9L);
        hashMap.put("application/vnd.apple.mpegurl", 10L);
        hashMap.put("application/dash+xml", 11L);
        hashMap.put("application/vnd.ms-sstr+xml", 12L);
        hashMap.put("text/cea608", 13L);
        hashMap.put("video/ogg", 14L);
        hashMap.put("audio/aac", 15L);
        hashMap.put("audio/mp3", 16L);
        hashMap.put("audio/ogg", 17L);
        hashMap.put("audio/wav", 18L);
        hashMap.put("image/gif", 19L);
        hashMap.put("image/jpg", 20L);
        hashMap.put("image/png", 21L);
        hashMap.put("text/mp2t", 22L);
        hashMap.put("application/mp4", 23L);
        hashMap.put("audio/mpeg", 24L);
        HashMap hashMap2 = new HashMap();
        zzb = hashMap2;
        hashMap2.put(1, 1L);
        hashMap2.put(2, 2L);
        hashMap2.put(0, 3L);
        HashMap hashMap3 = new HashMap();
        zzc = hashMap3;
        hashMap3.put(MediaError.ERROR_REASON_INVALID_COMMAND, 0L);
        hashMap3.put(MediaError.ERROR_REASON_INVALID_PARAMS, 1L);
        hashMap3.put(MediaError.ERROR_REASON_INVALID_MEDIA_SESSION_ID, 2L);
        hashMap3.put(MediaError.ERROR_REASON_SKIP_LIMIT_REACHED, 3L);
        hashMap3.put(MediaError.ERROR_REASON_NOT_SUPPORTED, 4L);
        hashMap3.put(MediaError.ERROR_REASON_LANGUAGE_NOT_SUPPORTED, 5L);
        hashMap3.put(MediaError.ERROR_REASON_END_OF_QUEUE, 6L);
        hashMap3.put(MediaError.ERROR_REASON_DUPLICATE_REQUEST_ID, 7L);
        hashMap3.put(MediaError.ERROR_REASON_APP_ERROR, 8L);
        hashMap3.put(MediaError.ERROR_REASON_AUTHENTICATION_EXPIRED, 9L);
        hashMap3.put(MediaError.ERROR_REASON_PREMIUM_ACCOUNT_REQUIRED, 10L);
        hashMap3.put(MediaError.ERROR_REASON_CONCURRENT_STREAM_LIMIT, 11L);
        hashMap3.put(MediaError.ERROR_REASON_PARENTAL_CONTROL_RESTRICTED, 12L);
        hashMap3.put(MediaError.ERROR_REASON_NOT_AVAILABLE_IN_REGION, 13L);
        hashMap3.put(MediaError.ERROR_REASON_CONTENT_ALREADY_PLAYING, 14L);
        hashMap3.put("INVALID_REQUEST", 15L);
        hashMap3.put(MediaError.ERROR_REASON_GENERIC_LOAD_ERROR, 16L);
        hashMap3.put(MediaError.ERROR_REASON_VIDEO_DEVICE_REQUIRED, 17L);
        hashMap3.put(MediaError.ERROR_REASON_CONTENT_FILTERED, 18L);
    }

    public zzw(zzca zzcaVar) {
        this.zzg = zzcaVar;
    }

    private static String zzd(MediaStatus mediaStatus) {
        if (mediaStatus == null) {
            return "Cast.MediaSession.Ended";
        }
        int playerState = mediaStatus.getPlayerState();
        if (playerState != 2) {
            if (playerState != 3 && playerState != 4) {
                return "Cast.MediaSession.Ended";
            }
            return "Cast.MediaSession.Pause";
        }
        return "Cast.MediaSession.Playing";
    }

    private final void zze(String str, String str2) {
        long j;
        Map map = zza;
        if (map.containsKey(str2)) {
            j = ((Long) map.get(str2)).longValue();
        } else {
            j = 0;
        }
        this.zzg.zzd(str, j);
    }

    private final boolean zzf(MediaStatus mediaStatus) {
        MediaInfo mediaInfo;
        int i;
        MediaInfo mediaInfo2 = mediaStatus.getMediaInfo();
        MediaStatus mediaStatus2 = this.zzd;
        if (mediaStatus2 != null) {
            mediaInfo = mediaStatus2.getMediaInfo();
        } else {
            mediaInfo = null;
        }
        MediaStatus mediaStatus3 = this.zzd;
        if (mediaStatus3 != null) {
            i = mediaStatus3.getCurrentItemId();
        } else {
            i = 0;
        }
        if (mediaInfo2 == null) {
            return false;
        }
        if (mediaInfo == null) {
            return true;
        }
        Preconditions.checkNotNull(this.zzd);
        if (TextUtils.equals(mediaInfo.getContentId(), mediaInfo2.getContentId()) && TextUtils.equals(mediaInfo.getContentUrl(), mediaInfo2.getContentUrl()) && TextUtils.equals(mediaInfo.getEntity(), mediaInfo2.getEntity()) && mediaStatus.getCurrentItemId() == i) {
            return false;
        }
        return true;
    }

    public final void zza(MediaLoadRequestData mediaLoadRequestData) {
        boolean z;
        MediaQueueData queueData = mediaLoadRequestData.getQueueData();
        if (queueData != null) {
            if (queueData.getRepeatMode() == 3) {
                z = true;
            } else {
                z = false;
            }
            this.zzg.zza("Cast.CAF.Shuffle", z);
            List<MediaQueueItem> items = queueData.getItems();
            if (items != null) {
                this.zzg.zzd("Cast.CAF.QueueItems", items.size());
            }
        }
    }

    public final void zzb(MediaError mediaError) {
        int i;
        long j;
        if (TextUtils.equals(mediaError.getType(), MediaError.ERROR_TYPE_LOAD_FAILED)) {
            String reason = mediaError.getReason();
            Map map = zzc;
            if (map.containsKey(reason)) {
                j = ((Long) map.get(reason)).longValue();
            } else {
                j = 0;
            }
            this.zzg.zzd("Cast.CAF.LoadError", j);
            return;
        }
        Integer detailedErrorCode = mediaError.getDetailedErrorCode();
        if (detailedErrorCode != null) {
            i = detailedErrorCode.intValue();
        } else {
            i = MediaError.DetailedErrorCode.GENERIC;
        }
        this.zzg.zzd("Cast.CAF.Error", i);
    }

    public final void zzc(MediaStatus mediaStatus) {
        AdBreakClipInfo adBreakClipInfo;
        AdBreakClipInfo adBreakClipInfo2;
        String zzd = zzd(this.zzd);
        String zzd2 = zzd(mediaStatus);
        if (!zzd2.equals(zzd)) {
            this.zzg.zzb(zzd2);
        }
        boolean z = true;
        if (mediaStatus != null && mediaStatus.getMediaInfo() != null) {
            if (zzf(mediaStatus) || (!this.zze && mediaStatus.getPlayerState() == 2)) {
                if (zzf(mediaStatus)) {
                    this.zzg.zzb("Cast.CAF.PlayerStarted");
                }
                if (mediaStatus.getPlayerState() == 2) {
                    this.zze = true;
                    MediaInfo mediaInfo = mediaStatus.getMediaInfo();
                    Preconditions.checkNotNull(mediaInfo);
                    if (mediaInfo != null) {
                        long streamDuration = mediaInfo.getStreamDuration();
                        if (streamDuration != -1) {
                            this.zzg.zzd("Cast.MediaSession.MediaDuration", TimeUnit.MILLISECONDS.toSeconds(streamDuration));
                        }
                    }
                    if (mediaInfo != null) {
                        List<MediaTrack> mediaTracks = mediaInfo.getMediaTracks();
                        if (mediaTracks == null) {
                            this.zzg.zzd("Cast.CAF.NumSubtitles", 0L);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (MediaTrack mediaTrack : mediaTracks) {
                                if (mediaTrack.getType() == 1) {
                                    arrayList.add(mediaTrack);
                                }
                            }
                            this.zzg.zzd("Cast.CAF.NumSubtitles", arrayList.size());
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                String contentType = ((MediaTrack) arrayList.get(i)).getContentType();
                                if (contentType != null) {
                                    zze("Cast.CAF.SubtitleType", contentType);
                                }
                            }
                        }
                    }
                    if (mediaInfo != null) {
                        Long l = (Long) zzb.get(Integer.valueOf(mediaInfo.getStreamType()));
                        if (l == null) {
                            l = 0L;
                        }
                        zze("Cast.CAF.MediaMimeType", mediaInfo.getContentType());
                        this.zzg.zzd("Cast.CAF.MediaStreamType", l.longValue());
                    }
                } else {
                    this.zze = false;
                }
            }
        } else {
            this.zze = false;
        }
        if (mediaStatus != null) {
            adBreakClipInfo = mediaStatus.getCurrentAdBreakClip();
        } else {
            adBreakClipInfo = null;
        }
        if (adBreakClipInfo != null && ((adBreakClipInfo2 = this.zzf) == null || !TextUtils.equals(adBreakClipInfo.getId(), adBreakClipInfo2.getId()))) {
            Preconditions.checkNotNull(adBreakClipInfo);
            if (adBreakClipInfo.getWhenSkippableInMs() >= adBreakClipInfo.getDurationInMs()) {
                z = false;
            }
            this.zzg.zza("Cast.CAF.AdSkippable", z);
            zze("Cast.CAF.AdMimeType", adBreakClipInfo.getMimeType());
        }
        this.zzf = adBreakClipInfo;
        this.zzd = mediaStatus;
    }
}
