package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaQueueContainerMetadataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new zzcg();
    public static final int MEDIA_QUEUE_CONTAINER_TYPE_AUDIO_BOOK = 1;
    public static final int MEDIA_QUEUE_CONTAINER_TYPE_GENERIC = 0;
    @SafeParcelable.Field(getter = "getContainerType", id = 2)
    private int zza;
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getSections", id = 4)
    private List zzc;
    @SafeParcelable.Field(getter = "getContainerImages", id = 5)
    private List zzd;
    @SafeParcelable.Field(getter = "getContainerDuration", id = 6)
    private double zze;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final MediaQueueContainerMetadata zza = new MediaQueueContainerMetadata(null);

        public MediaQueueContainerMetadata build() {
            return new MediaQueueContainerMetadata(this.zza, null);
        }

        public Builder setContainerDuration(double d) {
            this.zza.zze = d;
            return this;
        }

        public Builder setContainerImages(List<WebImage> list) {
            MediaQueueContainerMetadata.zzd(this.zza, list);
            return this;
        }

        public Builder setContainerType(int i) {
            this.zza.zza = i;
            return this;
        }

        public Builder setSections(List<MediaMetadata> list) {
            this.zza.zzg(list);
            return this;
        }

        public Builder setTitle(String str) {
            this.zza.zzb = str;
            return this;
        }

        public final Builder zza(c cVar) {
            MediaQueueContainerMetadata.zzb(this.zza, cVar);
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MediaQueueContainerType {
    }

    private MediaQueueContainerMetadata() {
        zzh();
    }

    public static /* bridge */ /* synthetic */ void zzb(MediaQueueContainerMetadata mediaQueueContainerMetadata, c cVar) {
        char c;
        mediaQueueContainerMetadata.zzh();
        String optString = cVar.optString("containerType", "");
        int hashCode = optString.hashCode();
        if (hashCode != 6924225) {
            if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals("AUDIOBOOK_CONTAINER")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                mediaQueueContainerMetadata.zza = 1;
            }
        } else {
            mediaQueueContainerMetadata.zza = 0;
        }
        mediaQueueContainerMetadata.zzb = CastUtils.optStringOrNull(cVar, "title");
        a optJSONArray = cVar.optJSONArray("sections");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueContainerMetadata.zzc = arrayList;
            for (int i = 0; i < optJSONArray.e(); i++) {
                c j = optJSONArray.j(i);
                if (j != null) {
                    MediaMetadata mediaMetadata = new MediaMetadata();
                    mediaMetadata.zzc(j);
                    arrayList.add(mediaMetadata);
                }
            }
        }
        a optJSONArray2 = cVar.optJSONArray("containerImages");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            mediaQueueContainerMetadata.zzd = arrayList2;
            com.google.android.gms.cast.internal.media.zza.zzd(arrayList2, optJSONArray2);
        }
        mediaQueueContainerMetadata.zze = cVar.optDouble("containerDuration", mediaQueueContainerMetadata.zze);
    }

    public static /* bridge */ /* synthetic */ void zzd(MediaQueueContainerMetadata mediaQueueContainerMetadata, List list) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        mediaQueueContainerMetadata.zzd = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        if (this.zza == mediaQueueContainerMetadata.zza && TextUtils.equals(this.zzb, mediaQueueContainerMetadata.zzb) && Objects.equal(this.zzc, mediaQueueContainerMetadata.zzc) && Objects.equal(this.zzd, mediaQueueContainerMetadata.zzd) && this.zze == mediaQueueContainerMetadata.zze) {
            return true;
        }
        return false;
    }

    public double getContainerDuration() {
        return this.zze;
    }

    public List<WebImage> getContainerImages() {
        List list = this.zzd;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int getContainerType() {
        return this.zza;
    }

    public List<MediaMetadata> getSections() {
        List list = this.zzc;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getTitle() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, Double.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getContainerType());
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getSections(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getContainerImages(), false);
        SafeParcelWriter.writeDouble(parcel, 6, getContainerDuration());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            int i = this.zza;
            if (i != 0) {
                if (i == 1) {
                    cVar.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                cVar.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                cVar.put("title", this.zzb);
            }
            List list = this.zzc;
            if (list != null && !list.isEmpty()) {
                a aVar = new a();
                for (MediaMetadata mediaMetadata : this.zzc) {
                    aVar.put(mediaMetadata.zza());
                }
                cVar.put("sections", aVar);
            }
            List list2 = this.zzd;
            if (list2 != null && !list2.isEmpty()) {
                cVar.put("containerImages", com.google.android.gms.cast.internal.media.zza.zzc(this.zzd));
            }
            cVar.put("containerDuration", this.zze);
        } catch (b unused) {
        }
        return cVar;
    }

    public final void zzg(List list) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.zzc = arrayList;
    }

    @SafeParcelable.Constructor
    public MediaQueueContainerMetadata(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) List list, @SafeParcelable.Param(id = 5) List list2, @SafeParcelable.Param(id = 6) double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
        this.zze = d;
    }

    public /* synthetic */ MediaQueueContainerMetadata(zzcf zzcfVar) {
        zzh();
    }

    public /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata, zzcf zzcfVar) {
        this.zza = mediaQueueContainerMetadata.zza;
        this.zzb = mediaQueueContainerMetadata.zzb;
        this.zzc = mediaQueueContainerMetadata.zzc;
        this.zzd = mediaQueueContainerMetadata.zzd;
        this.zze = mediaQueueContainerMetadata.zze;
    }
}
