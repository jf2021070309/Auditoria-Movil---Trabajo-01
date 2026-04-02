package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.cast.tv.cac.UserActionContext;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaQueueDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new zzci();
    public static final int MEDIA_QUEUE_TYPE_ALBUM = 1;
    public static final int MEDIA_QUEUE_TYPE_AUDIO_BOOK = 3;
    public static final int MEDIA_QUEUE_TYPE_GENERIC = 0;
    public static final int MEDIA_QUEUE_TYPE_LIVE_TV = 8;
    public static final int MEDIA_QUEUE_TYPE_MOVIE = 9;
    public static final int MEDIA_QUEUE_TYPE_PLAYLIST = 2;
    public static final int MEDIA_QUEUE_TYPE_PODCAST_SERIES = 5;
    public static final int MEDIA_QUEUE_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_QUEUE_TYPE_TV_SERIES = 6;
    public static final int MEDIA_QUEUE_TYPE_VIDEO_PLAYLIST = 7;
    @SafeParcelable.Field(getter = "getQueueId", id = 2)
    private String zza;
    @SafeParcelable.Field(getter = "getEntity", id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getQueueType", id = 4)
    private int zzc;
    @SafeParcelable.Field(getter = "getName", id = 5)
    private String zzd;
    @SafeParcelable.Field(getter = "getContainerMetadata", id = 6)
    private MediaQueueContainerMetadata zze;
    @SafeParcelable.Field(getter = "getRepeatMode", id = 7)
    private int zzf;
    @SafeParcelable.Field(getter = "getItems", id = 8)
    private List zzg;
    @SafeParcelable.Field(getter = "getStartIndex", id = 9)
    private int zzh;
    @SafeParcelable.Field(getter = "getStartTime", id = 10)
    private long zzi;
    @SafeParcelable.Field(getter = "getShuffle", id = 11)
    private boolean zzj;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final MediaQueueData zza;

        public Builder() {
            this.zza = new MediaQueueData(null);
        }

        public MediaQueueData build() {
            return new MediaQueueData(this.zza, null);
        }

        public Builder setContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
            this.zza.zze = mediaQueueContainerMetadata;
            return this;
        }

        public Builder setEntity(String str) {
            this.zza.zzb = str;
            return this;
        }

        public Builder setItems(List<MediaQueueItem> list) {
            MediaQueueData.zze(this.zza, list);
            return this;
        }

        public Builder setName(String str) {
            this.zza.zzd = str;
            return this;
        }

        public Builder setQueueId(String str) {
            this.zza.zza = str;
            return this;
        }

        public Builder setQueueType(int i) {
            this.zza.zzc = i;
            return this;
        }

        public Builder setRepeatMode(int i) {
            this.zza.setRepeatMode(i);
            return this;
        }

        public Builder setStartIndex(int i) {
            this.zza.zzh = i;
            return this;
        }

        public Builder setStartTime(long j) {
            this.zza.zzi = j;
            return this;
        }

        public final Builder zza(c cVar) {
            MediaQueueData.zzb(this.zza, cVar);
            return this;
        }

        @KeepForSdk
        public Builder(MediaQueueData mediaQueueData) {
            this.zza = new MediaQueueData(mediaQueueData, null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MediaQueueType {
    }

    private MediaQueueData() {
        zzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* bridge */ /* synthetic */ void zzb(MediaQueueData mediaQueueData, c cVar) {
        char c;
        c cVar2;
        mediaQueueData.zzl();
        if (cVar == null) {
            return;
        }
        mediaQueueData.zza = CastUtils.optStringOrNull(cVar, "id");
        mediaQueueData.zzb = CastUtils.optStringOrNull(cVar, "entity");
        String optString = cVar.optString("queueType");
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1632865838:
                if (optString.equals(UserActionContext.PLAYLIST)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (optString.equals(UserActionContext.ALBUM)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 73549584:
                if (optString.equals(UserActionContext.MOVIE)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mediaQueueData.zzc = 1;
                break;
            case 1:
                mediaQueueData.zzc = 2;
                break;
            case 2:
                mediaQueueData.zzc = 3;
                break;
            case 3:
                mediaQueueData.zzc = 4;
                break;
            case 4:
                mediaQueueData.zzc = 5;
                break;
            case 5:
                mediaQueueData.zzc = 6;
                break;
            case 6:
                mediaQueueData.zzc = 7;
                break;
            case 7:
                mediaQueueData.zzc = 8;
                break;
            case '\b':
                mediaQueueData.zzc = 9;
                break;
        }
        mediaQueueData.zzd = CastUtils.optStringOrNull(cVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (cVar.has("containerMetadata")) {
            cVar2 = cVar.optJSONObject("containerMetadata");
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            MediaQueueContainerMetadata.Builder builder = new MediaQueueContainerMetadata.Builder();
            builder.zza(cVar2);
            mediaQueueData.zze = builder.build();
        }
        Integer mediaRepeatModeFromString = MediaCommon.mediaRepeatModeFromString(cVar.optString("repeatMode"));
        if (mediaRepeatModeFromString != null) {
            mediaQueueData.zzf = mediaRepeatModeFromString.intValue();
        }
        a optJSONArray = cVar.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueData.zzg = arrayList;
            for (int i = 0; i < optJSONArray.e(); i++) {
                c j = optJSONArray.j(i);
                if (j != null) {
                    try {
                        arrayList.add(new MediaQueueItem(j));
                    } catch (b unused) {
                    }
                }
            }
        }
        mediaQueueData.zzh = cVar.optInt("startIndex", mediaQueueData.zzh);
        if (cVar.has("startTime")) {
            mediaQueueData.zzi = CastUtils.secToMillisec(cVar.optDouble("startTime", mediaQueueData.zzi));
        }
        mediaQueueData.zzj = cVar.optBoolean("shuffle");
    }

    public static /* bridge */ /* synthetic */ void zze(MediaQueueData mediaQueueData, List list) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        mediaQueueData.zzg = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = 0;
        this.zzd = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = 0;
        this.zzi = -1L;
        this.zzj = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        if (TextUtils.equals(this.zza, mediaQueueData.zza) && TextUtils.equals(this.zzb, mediaQueueData.zzb) && this.zzc == mediaQueueData.zzc && TextUtils.equals(this.zzd, mediaQueueData.zzd) && Objects.equal(this.zze, mediaQueueData.zze) && this.zzf == mediaQueueData.zzf && Objects.equal(this.zzg, mediaQueueData.zzg) && this.zzh == mediaQueueData.zzh && this.zzi == mediaQueueData.zzi && this.zzj == mediaQueueData.zzj) {
            return true;
        }
        return false;
    }

    public MediaQueueContainerMetadata getContainerMetadata() {
        return this.zze;
    }

    public String getEntity() {
        return this.zzb;
    }

    public List<MediaQueueItem> getItems() {
        List list = this.zzg;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getName() {
        return this.zzd;
    }

    public String getQueueId() {
        return this.zza;
    }

    public int getQueueType() {
        return this.zzc;
    }

    public int getRepeatMode() {
        return this.zzf;
    }

    public int getStartIndex() {
        return this.zzh;
    }

    public long getStartTime() {
        return this.zzi;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Long.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    @KeepForSdk
    public void setRepeatMode(int i) {
        this.zzf = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getQueueId(), false);
        SafeParcelWriter.writeString(parcel, 3, getEntity(), false);
        SafeParcelWriter.writeInt(parcel, 4, getQueueType());
        SafeParcelWriter.writeString(parcel, 5, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getContainerMetadata(), i, false);
        SafeParcelWriter.writeInt(parcel, 7, getRepeatMode());
        SafeParcelWriter.writeTypedList(parcel, 8, getItems(), false);
        SafeParcelWriter.writeInt(parcel, 9, getStartIndex());
        SafeParcelWriter.writeLong(parcel, 10, getStartTime());
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                cVar.put("id", this.zza);
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                cVar.put("entity", this.zzb);
            }
            switch (this.zzc) {
                case 1:
                    cVar.put("queueType", UserActionContext.ALBUM);
                    break;
                case 2:
                    cVar.put("queueType", UserActionContext.PLAYLIST);
                    break;
                case 3:
                    cVar.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    cVar.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    cVar.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    cVar.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    cVar.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    cVar.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    cVar.put("queueType", UserActionContext.MOVIE);
                    break;
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                cVar.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzd);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.zze;
            if (mediaQueueContainerMetadata != null) {
                cVar.put("containerMetadata", mediaQueueContainerMetadata.zza());
            }
            String zza = MediaCommon.zza(Integer.valueOf(this.zzf));
            if (zza != null) {
                cVar.put("repeatMode", zza);
            }
            List list = this.zzg;
            if (list != null && !list.isEmpty()) {
                a aVar = new a();
                for (MediaQueueItem mediaQueueItem : this.zzg) {
                    aVar.put(mediaQueueItem.toJson());
                }
                cVar.put(FirebaseAnalytics.Param.ITEMS, aVar);
            }
            cVar.put("startIndex", this.zzh);
            long j = this.zzi;
            if (j != -1) {
                cVar.put("startTime", CastUtils.millisecToSec(j));
            }
            cVar.put("shuffle", this.zzj);
        } catch (b unused) {
        }
        return cVar;
    }

    @ShowFirstParty
    public final boolean zzk() {
        return this.zzj;
    }

    public /* synthetic */ MediaQueueData(zzch zzchVar) {
        zzl();
    }

    public /* synthetic */ MediaQueueData(MediaQueueData mediaQueueData, zzch zzchVar) {
        this.zza = mediaQueueData.zza;
        this.zzb = mediaQueueData.zzb;
        this.zzc = mediaQueueData.zzc;
        this.zzd = mediaQueueData.zzd;
        this.zze = mediaQueueData.zze;
        this.zzf = mediaQueueData.zzf;
        this.zzg = mediaQueueData.zzg;
        this.zzh = mediaQueueData.zzh;
        this.zzi = mediaQueueData.zzi;
        this.zzj = mediaQueueData.zzj;
    }

    @SafeParcelable.Constructor
    public MediaQueueData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) MediaQueueContainerMetadata mediaQueueContainerMetadata, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 8) List list, @SafeParcelable.Param(id = 9) int i3, @SafeParcelable.Param(id = 10) long j, @SafeParcelable.Param(id = 11) boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = mediaQueueContainerMetadata;
        this.zzf = i2;
        this.zzg = list;
        this.zzh = i3;
        this.zzi = j;
        this.zzj = z;
    }
}
