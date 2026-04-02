package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzfn;
import com.google.android.gms.internal.cast.zzfq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1;
    public static final long UNKNOWN_START_ABSOLUTE_TIME = -1;
    @SafeParcelable.Field(id = 9)
    String zzb;
    @SafeParcelable.Field(getter = "getContentId", id = 2)
    private String zzc;
    @SafeParcelable.Field(getter = "getStreamType", id = 3)
    private int zzd;
    @SafeParcelable.Field(getter = "getContentType", id = 4)
    private String zze;
    @SafeParcelable.Field(getter = "getMetadata", id = 5)
    private MediaMetadata zzf;
    @SafeParcelable.Field(getter = "getStreamDuration", id = 6)
    private long zzg;
    @SafeParcelable.Field(getter = "getMediaTracks", id = 7)
    private List zzh;
    @SafeParcelable.Field(getter = "getTextTrackStyle", id = 8)
    private TextTrackStyle zzi;
    @SafeParcelable.Field(getter = "getAdBreaks", id = 10)
    private List zzj;
    @SafeParcelable.Field(getter = "getAdBreakClips", id = 11)
    private List zzk;
    @SafeParcelable.Field(getter = "getEntity", id = 12)
    private String zzl;
    @SafeParcelable.Field(getter = "getVmapAdsRequest", id = 13)
    private VastAdsRequest zzm;
    @SafeParcelable.Field(getter = "getStartAbsoluteTime", id = 14)
    private long zzn;
    @SafeParcelable.Field(getter = "getAtvEntity", id = 15)
    private String zzo;
    @SafeParcelable.Field(getter = "getContentUrl", id = 16)
    private String zzp;
    @HlsSegmentFormat
    @SafeParcelable.Field(getter = "getHlsSegmentFormat", id = 17)
    private String zzq;
    @HlsVideoSegmentFormat
    @SafeParcelable.Field(getter = "getHlsVideoSegmentFormat", id = 18)
    private String zzr;
    private c zzs;
    private final Writer zzt;
    public static final long zza = CastUtils.secToMillisec(-1L);
    public static final Parcelable.Creator<MediaInfo> CREATOR = new zzby();

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private String zza;
        private String zzc;
        private MediaMetadata zzd;
        private List zzf;
        private TextTrackStyle zzg;
        private String zzh;
        private List zzi;
        private List zzj;
        private String zzk;
        private VastAdsRequest zzl;
        private String zzm;
        private String zzn;
        @HlsSegmentFormat
        private String zzo;
        @HlsVideoSegmentFormat
        private String zzp;
        private int zzb = -1;
        private long zze = -1;

        public Builder() {
        }

        public MediaInfo build() {
            return new MediaInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, -1L, this.zzm, this.zzn, this.zzo, this.zzp);
        }

        public Builder setAdBreakClips(List<AdBreakClipInfo> list) {
            this.zzj = list;
            return this;
        }

        public Builder setAdBreaks(List<AdBreakInfo> list) {
            this.zzi = list;
            return this;
        }

        public Builder setAtvEntity(String str) {
            this.zzm = str;
            return this;
        }

        public Builder setContentType(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setContentUrl(String str) {
            this.zzn = str;
            return this;
        }

        public Builder setCustomData(c cVar) {
            String cVar2;
            if (cVar == null) {
                cVar2 = null;
            } else {
                cVar2 = cVar.toString();
            }
            this.zzh = cVar2;
            return this;
        }

        public Builder setEntity(String str) {
            this.zzk = str;
            return this;
        }

        public Builder setHlsSegmentFormat(@HlsSegmentFormat String str) {
            this.zzo = str;
            return this;
        }

        public Builder setHlsVideoSegmentFormat(@HlsVideoSegmentFormat String str) {
            this.zzp = str;
            return this;
        }

        public Builder setMediaTracks(List<MediaTrack> list) {
            this.zzf = list;
            return this;
        }

        public Builder setMetadata(MediaMetadata mediaMetadata) {
            this.zzd = mediaMetadata;
            return this;
        }

        public Builder setStreamDuration(long j) {
            if (j < 0 && j != -1) {
                throw new IllegalArgumentException("Invalid stream duration");
            }
            this.zze = j;
            return this;
        }

        public Builder setStreamType(int i) {
            if (i >= -1 && i <= 2) {
                this.zzb = i;
                return this;
            }
            throw new IllegalArgumentException("invalid stream type");
        }

        public Builder setTextTrackStyle(TextTrackStyle textTrackStyle) {
            this.zzg = textTrackStyle;
            return this;
        }

        public Builder setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
            this.zzl = vastAdsRequest;
            return this;
        }

        public Builder(String str) {
            this.zza = str;
        }

        public Builder(String str, String str2) {
            this.zza = str;
            this.zzk = str2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setAdBreakClips(List<AdBreakClipInfo> list) {
            MediaInfo.this.zzk = list;
        }

        @KeepForSdk
        public void setAdBreaks(List<AdBreakInfo> list) {
            MediaInfo.this.zzj = list;
        }

        @KeepForSdk
        public void setContentId(String str) {
            MediaInfo.this.zzc = str;
        }

        @KeepForSdk
        public void setContentType(String str) {
            MediaInfo.this.zze = str;
        }

        @KeepForSdk
        public void setContentUrl(String str) {
            MediaInfo.this.zzp = str;
        }

        @KeepForSdk
        public void setCustomData(c cVar) {
            MediaInfo.this.zzs = cVar;
        }

        @KeepForSdk
        public void setEntity(String str) {
            MediaInfo.this.zzl = str;
        }

        @KeepForSdk
        public void setHlsSegmentFormat(@HlsSegmentFormat String str) {
            MediaInfo.this.zzq = str;
        }

        @KeepForSdk
        public void setHlsVideoSegmentFormat(@HlsVideoSegmentFormat String str) {
            MediaInfo.this.zzr = str;
        }

        @KeepForSdk
        public void setMediaTracks(List<MediaTrack> list) {
            MediaInfo.this.zzh = list;
        }

        @KeepForSdk
        public void setMetadata(MediaMetadata mediaMetadata) {
            MediaInfo.this.zzf = mediaMetadata;
        }

        @KeepForSdk
        public void setStartAbsoluteTime(long j) {
            if (j >= 0 || j == -1) {
                MediaInfo.this.zzn = j;
                return;
            }
            throw new IllegalArgumentException("Invalid start absolute time");
        }

        @KeepForSdk
        public void setStreamDuration(long j) {
            if (j >= 0 || j == -1) {
                MediaInfo.this.zzg = j;
                return;
            }
            throw new IllegalArgumentException("Invalid stream duration");
        }

        @KeepForSdk
        public void setStreamType(int i) {
            if (i >= -1 && i <= 2) {
                MediaInfo.this.zzd = i;
                return;
            }
            throw new IllegalArgumentException("invalid stream type");
        }

        @KeepForSdk
        public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
            MediaInfo.this.zzi = textTrackStyle;
        }

        @KeepForSdk
        public void setVmapAdsRequest(VastAdsRequest vastAdsRequest) {
            MediaInfo.this.zzm = vastAdsRequest;
        }
    }

    @SafeParcelable.Constructor
    public MediaInfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) MediaMetadata mediaMetadata, @SafeParcelable.Param(id = 6) long j, @SafeParcelable.Param(id = 7) List list, @SafeParcelable.Param(id = 8) TextTrackStyle textTrackStyle, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) List list2, @SafeParcelable.Param(id = 11) List list3, @SafeParcelable.Param(id = 12) String str4, @SafeParcelable.Param(id = 13) VastAdsRequest vastAdsRequest, @SafeParcelable.Param(id = 14) long j2, @SafeParcelable.Param(id = 15) String str5, @SafeParcelable.Param(id = 16) String str6, @HlsSegmentFormat @SafeParcelable.Param(id = 17) String str7, @SafeParcelable.Param(id = 18) @HlsVideoSegmentFormat String str8) {
        this.zzt = new Writer();
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
        this.zzf = mediaMetadata;
        this.zzg = j;
        this.zzh = list;
        this.zzi = textTrackStyle;
        this.zzb = str3;
        if (str3 != null) {
            try {
                this.zzs = new c(str3);
            } catch (b unused) {
                this.zzs = null;
                this.zzb = null;
            }
        } else {
            this.zzs = null;
        }
        this.zzj = list2;
        this.zzk = list3;
        this.zzl = str4;
        this.zzm = vastAdsRequest;
        this.zzn = j2;
        this.zzo = str5;
        this.zzp = str6;
        this.zzq = str7;
        this.zzr = str8;
        if (this.zzc == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        c cVar = this.zzs;
        if (cVar != null) {
            z = false;
        } else {
            z = true;
        }
        c cVar2 = mediaInfo.zzs;
        if (cVar2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((cVar == null || cVar2 == null || JsonUtils.areJsonValuesEquivalent(cVar, cVar2)) && CastUtils.zze(this.zzc, mediaInfo.zzc) && this.zzd == mediaInfo.zzd && CastUtils.zze(this.zze, mediaInfo.zze) && CastUtils.zze(this.zzf, mediaInfo.zzf) && this.zzg == mediaInfo.zzg && CastUtils.zze(this.zzh, mediaInfo.zzh) && CastUtils.zze(this.zzi, mediaInfo.zzi) && CastUtils.zze(this.zzj, mediaInfo.zzj) && CastUtils.zze(this.zzk, mediaInfo.zzk) && CastUtils.zze(this.zzl, mediaInfo.zzl) && CastUtils.zze(this.zzm, mediaInfo.zzm) && this.zzn == mediaInfo.zzn && CastUtils.zze(this.zzo, mediaInfo.zzo) && CastUtils.zze(this.zzp, mediaInfo.zzp) && CastUtils.zze(this.zzq, mediaInfo.zzq) && CastUtils.zze(this.zzr, mediaInfo.zzr)) {
            return true;
        }
        return false;
    }

    public List<AdBreakClipInfo> getAdBreakClips() {
        List list = this.zzk;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<AdBreakInfo> getAdBreaks() {
        List list = this.zzj;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getContentId() {
        String str = this.zzc;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getContentType() {
        return this.zze;
    }

    public String getContentUrl() {
        return this.zzp;
    }

    public c getCustomData() {
        return this.zzs;
    }

    public String getEntity() {
        return this.zzl;
    }

    @HlsSegmentFormat
    public String getHlsSegmentFormat() {
        return this.zzq;
    }

    @HlsVideoSegmentFormat
    public String getHlsVideoSegmentFormat() {
        return this.zzr;
    }

    public List<MediaTrack> getMediaTracks() {
        return this.zzh;
    }

    public MediaMetadata getMetadata() {
        return this.zzf;
    }

    public long getStartAbsoluteTime() {
        return this.zzn;
    }

    public long getStreamDuration() {
        return this.zzg;
    }

    public int getStreamType() {
        return this.zzd;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzi;
    }

    public VastAdsRequest getVmapAdsRequest() {
        return this.zzm;
    }

    @KeepForSdk
    public Writer getWriter() {
        return this.zzt;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzc, Integer.valueOf(this.zzd), this.zze, this.zzf, Long.valueOf(this.zzg), String.valueOf(this.zzs), this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzq, this.zzr);
    }

    public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zzi = textTrackStyle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String cVar;
        c cVar2 = this.zzs;
        if (cVar2 == null) {
            cVar = null;
        } else {
            cVar = cVar2.toString();
        }
        this.zzb = cVar;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getContentId(), false);
        SafeParcelWriter.writeInt(parcel, 3, getStreamType());
        SafeParcelWriter.writeString(parcel, 4, getContentType(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getMetadata(), i, false);
        SafeParcelWriter.writeLong(parcel, 6, getStreamDuration());
        SafeParcelWriter.writeTypedList(parcel, 7, getMediaTracks(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getTextTrackStyle(), i, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 10, getAdBreaks(), false);
        SafeParcelWriter.writeTypedList(parcel, 11, getAdBreakClips(), false);
        SafeParcelWriter.writeString(parcel, 12, getEntity(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, getVmapAdsRequest(), i, false);
        SafeParcelWriter.writeLong(parcel, 14, getStartAbsoluteTime());
        SafeParcelWriter.writeString(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, getContentUrl(), false);
        SafeParcelWriter.writeString(parcel, 17, getHlsSegmentFormat(), false);
        SafeParcelWriter.writeString(parcel, 18, getHlsVideoSegmentFormat(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        String str;
        c cVar = new c();
        try {
            cVar.put("contentId", this.zzc);
            cVar.putOpt("contentUrl", this.zzp);
            int i = this.zzd;
            if (i != 1) {
                if (i != 2) {
                    str = "NONE";
                } else {
                    str = "LIVE";
                }
            } else {
                str = "BUFFERED";
            }
            cVar.put("streamType", str);
            String str2 = this.zze;
            if (str2 != null) {
                cVar.put("contentType", str2);
            }
            MediaMetadata mediaMetadata = this.zzf;
            if (mediaMetadata != null) {
                cVar.put("metadata", mediaMetadata.zza());
            }
            long j = this.zzg;
            if (j <= -1) {
                cVar.put("duration", c.NULL);
            } else {
                cVar.put("duration", CastUtils.millisecToSec(j));
            }
            if (this.zzh != null) {
                a aVar = new a();
                for (MediaTrack mediaTrack : this.zzh) {
                    aVar.put(mediaTrack.zza());
                }
                cVar.put("tracks", aVar);
            }
            TextTrackStyle textTrackStyle = this.zzi;
            if (textTrackStyle != null) {
                cVar.put("textTrackStyle", textTrackStyle.zza());
            }
            c cVar2 = this.zzs;
            if (cVar2 != null) {
                cVar.put("customData", cVar2);
            }
            String str3 = this.zzl;
            if (str3 != null) {
                cVar.put("entity", str3);
            }
            if (this.zzj != null) {
                a aVar2 = new a();
                for (AdBreakInfo adBreakInfo : this.zzj) {
                    aVar2.put(adBreakInfo.zza());
                }
                cVar.put("breaks", aVar2);
            }
            if (this.zzk != null) {
                a aVar3 = new a();
                for (AdBreakClipInfo adBreakClipInfo : this.zzk) {
                    aVar3.put(adBreakClipInfo.zza());
                }
                cVar.put("breakClips", aVar3);
            }
            VastAdsRequest vastAdsRequest = this.zzm;
            if (vastAdsRequest != null) {
                cVar.put("vmapAdsRequest", vastAdsRequest.zza());
            }
            long j2 = this.zzn;
            if (j2 != -1) {
                cVar.put("startAbsoluteTime", CastUtils.millisecToSec(j2));
            }
            cVar.putOpt("atvEntity", this.zzo);
            String str4 = this.zzq;
            if (str4 != null) {
                cVar.put("hlsSegmentFormat", str4);
            }
            String str5 = this.zzr;
            if (str5 != null) {
                cVar.put("hlsVideoSegmentFormat", str5);
            }
        } catch (b unused) {
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[LOOP:0: B:5:0x0021->B:24:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176 A[LOOP:2: B:30:0x00c6->B:54:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(com.amazon.aps.iva.if0.c r26) throws com.amazon.aps.iva.if0.b {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.zzr(com.amazon.aps.iva.if0.c):void");
    }

    public MediaInfo(c cVar) throws b {
        this(cVar.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        zzfq zzfqVar;
        int i3;
        String optString = cVar.optString("streamType", "NONE");
        int i4 = 2;
        int i5 = 1;
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.zzd = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.zzd = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.zzd = 2;
            } else {
                mediaInfo.zzd = -1;
            }
        }
        mediaInfo.zze = CastUtils.optStringOrNull(cVar, "contentType");
        if (cVar.has("metadata")) {
            c jSONObject = cVar.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject.getInt("metadataType"));
            mediaInfo.zzf = mediaMetadata;
            mediaMetadata.zzc(jSONObject);
        }
        mediaInfo.zzg = -1L;
        if (mediaInfo.zzd != 2 && cVar.has("duration") && !cVar.isNull("duration")) {
            double optDouble = cVar.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                mediaInfo.zzg = CastUtils.secToMillisec(optDouble);
            }
        }
        if (cVar.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            a jSONArray = cVar.getJSONArray("tracks");
            int i6 = 0;
            while (i6 < jSONArray.e()) {
                c b = jSONArray.b(i6);
                String str = MediaTrack.ROLE_ALTERNATE;
                long j = b.getLong("trackId");
                String optString2 = b.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = i5;
                } else if ("AUDIO".equals(optString2)) {
                    i = i4;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String optStringOrNull = CastUtils.optStringOrNull(b, "trackContentId");
                String optStringOrNull2 = CastUtils.optStringOrNull(b, "trackContentType");
                String optStringOrNull3 = CastUtils.optStringOrNull(b, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String optStringOrNull4 = CastUtils.optStringOrNull(b, "language");
                if (b.has("subtype")) {
                    String string = b.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = i5;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = i4;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        if ("CHAPTERS".equals(string)) {
                            i3 = 4;
                        } else if ("METADATA".equals(string)) {
                            i3 = 5;
                        } else {
                            i2 = -1;
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = 0;
                }
                if (b.has("roles")) {
                    zzfn zzfnVar = new zzfn();
                    a jSONArray2 = b.getJSONArray("roles");
                    for (int i7 = 0; i7 < jSONArray2.e(); i7++) {
                        zzfnVar.zzb(jSONArray2.l(i7));
                    }
                    zzfqVar = zzfnVar.zzc();
                } else {
                    zzfqVar = null;
                }
                arrayList.add(new MediaTrack(j, i, optStringOrNull, optStringOrNull2, optStringOrNull3, optStringOrNull4, i2, zzfqVar, b.optJSONObject("customData")));
                i6++;
                i4 = 2;
                i5 = 1;
            }
            mediaInfo.zzh = new ArrayList(arrayList);
        } else {
            mediaInfo.zzh = null;
        }
        if (cVar.has("textTrackStyle")) {
            c jSONObject2 = cVar.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.fromJson(jSONObject2);
            mediaInfo.zzi = textTrackStyle;
        } else {
            mediaInfo.zzi = null;
        }
        zzr(cVar);
        mediaInfo.zzs = cVar.optJSONObject("customData");
        mediaInfo.zzl = CastUtils.optStringOrNull(cVar, "entity");
        mediaInfo.zzo = CastUtils.optStringOrNull(cVar, "atvEntity");
        mediaInfo.zzm = VastAdsRequest.fromJson(cVar.optJSONObject("vmapAdsRequest"));
        if (cVar.has("startAbsoluteTime") && !cVar.isNull("startAbsoluteTime")) {
            double optDouble2 = cVar.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.zzn = CastUtils.secToMillisec(optDouble2);
            }
        }
        if (cVar.has("contentUrl")) {
            mediaInfo.zzp = cVar.optString("contentUrl");
        }
        mediaInfo.zzq = CastUtils.optStringOrNull(cVar, "hlsSegmentFormat");
        mediaInfo.zzr = CastUtils.optStringOrNull(cVar, "hlsVideoSegmentFormat");
    }
}
