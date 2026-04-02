package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "MediaLiveSeekableRangeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    @SafeParcelable.Field(getter = "getStartTime", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEndTime", id = 3)
    private final long zzc;
    @SafeParcelable.Field(getter = "isMovingWindow", id = 4)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "isLiveDone", id = 5)
    private final boolean zze;
    private static final Logger zza = new Logger("MediaLiveSeekableRange");
    public static final Parcelable.Creator<MediaLiveSeekableRange> CREATOR = new zzbz();

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private long zza;
        private long zzb;
        private boolean zzc;
        private boolean zzd;

        public MediaLiveSeekableRange build() {
            return new MediaLiveSeekableRange(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setEndTime(long j) {
            this.zzb = j;
            return this;
        }

        public Builder setIsLiveDone(boolean z) {
            this.zzd = z;
            return this;
        }

        public Builder setIsMovingWindow(boolean z) {
            this.zzc = z;
            return this;
        }

        public Builder setStartTime(long j) {
            this.zza = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public MediaLiveSeekableRange(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.zzb = Math.max(j, 0L);
        this.zzc = Math.max(j2, 0L);
        this.zzd = z;
        this.zze = z2;
    }

    public static MediaLiveSeekableRange zza(c cVar) {
        if (cVar != null && cVar.has("start") && cVar.has("end")) {
            try {
                return new MediaLiveSeekableRange(CastUtils.secToMillisec(cVar.getDouble("start")), CastUtils.secToMillisec(cVar.getDouble("end")), cVar.optBoolean("isMovingWindow"), cVar.optBoolean("isLiveDone"));
            } catch (b unused) {
                zza.e("Ignoring Malformed MediaLiveSeekableRange: ".concat(cVar.toString()), new Object[0]);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        if (this.zzb == mediaLiveSeekableRange.zzb && this.zzc == mediaLiveSeekableRange.zzc && this.zzd == mediaLiveSeekableRange.zzd && this.zze == mediaLiveSeekableRange.zze) {
            return true;
        }
        return false;
    }

    public long getEndTime() {
        return this.zzc;
    }

    public long getStartTime() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    public boolean isLiveDone() {
        return this.zze;
    }

    public boolean isMovingWindow() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getStartTime());
        SafeParcelWriter.writeLong(parcel, 3, getEndTime());
        SafeParcelWriter.writeBoolean(parcel, 4, isMovingWindow());
        SafeParcelWriter.writeBoolean(parcel, 5, isLiveDone());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zzb() {
        try {
            c cVar = new c();
            cVar.put("start", CastUtils.millisecToSec(this.zzb));
            cVar.put("end", CastUtils.millisecToSec(this.zzc));
            cVar.put("isMovingWindow", this.zzd);
            cVar.put("isLiveDone", this.zze);
            return cVar;
        } catch (b unused) {
            zza.e("Error transforming MediaLiveSeekableRange into JSONObject", new Object[0]);
            return new c();
        }
    }
}
