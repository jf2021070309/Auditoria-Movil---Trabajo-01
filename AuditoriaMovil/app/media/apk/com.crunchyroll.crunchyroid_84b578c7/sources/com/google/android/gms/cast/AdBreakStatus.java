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
@SafeParcelable.Class(creator = "AdBreakStatusCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    @Deprecated
    public static final int AD_BREAK_CLIP_NOT_SKIPPABLE = -1;
    @SafeParcelable.Field(getter = "getCurrentBreakTimeInMs", id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getCurrentBreakClipTimeInMs", id = 3)
    private final long zzc;
    @SafeParcelable.Field(getter = "getBreakId", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getBreakClipId", id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getWhenSkippableInMs", id = 6)
    private final long zzf;
    private static final Logger zza = new Logger("AdBreakStatus");
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new zzc();

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private long zza;
        private long zzb;
        private String zzc;
        private String zzd;
        private long zze = -1;

        public AdBreakStatus build() {
            return new AdBreakStatus(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public Builder setBreakClipId(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setBreakId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setCurrentBreakClipTimeInMs(long j) {
            this.zzb = j;
            return this;
        }

        public Builder setCurrentBreakTimeInMs(long j) {
            this.zza = j;
            return this;
        }

        public Builder setWhenSkippableInMs(long j) {
            this.zze = j;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AdBreakStatus(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) long j3) {
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = j3;
    }

    public static AdBreakStatus zza(c cVar) {
        long j;
        if (cVar != null && cVar.has("currentBreakTime") && cVar.has("currentBreakClipTime")) {
            try {
                long secToMillisec = CastUtils.secToMillisec(cVar.getLong("currentBreakTime"));
                long secToMillisec2 = CastUtils.secToMillisec(cVar.getLong("currentBreakClipTime"));
                String optStringOrNull = CastUtils.optStringOrNull(cVar, "breakId");
                String optStringOrNull2 = CastUtils.optStringOrNull(cVar, "breakClipId");
                long optLong = cVar.optLong("whenSkippable", -1L);
                if (optLong != -1) {
                    j = CastUtils.secToMillisec(optLong);
                } else {
                    j = optLong;
                }
                return new AdBreakStatus(secToMillisec, secToMillisec2, optStringOrNull, optStringOrNull2, j);
            } catch (b e) {
                zza.e(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        if (this.zzb == adBreakStatus.zzb && this.zzc == adBreakStatus.zzc && CastUtils.zze(this.zzd, adBreakStatus.zzd) && CastUtils.zze(this.zze, adBreakStatus.zze) && this.zzf == adBreakStatus.zzf) {
            return true;
        }
        return false;
    }

    public String getBreakClipId() {
        return this.zze;
    }

    public String getBreakId() {
        return this.zzd;
    }

    public long getCurrentBreakClipTimeInMs() {
        return this.zzc;
    }

    public long getCurrentBreakTimeInMs() {
        return this.zzb;
    }

    public long getWhenSkippableInMs() {
        return this.zzf;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzd, this.zze, Long.valueOf(this.zzf));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getCurrentBreakTimeInMs());
        SafeParcelWriter.writeLong(parcel, 3, getCurrentBreakClipTimeInMs());
        SafeParcelWriter.writeString(parcel, 4, getBreakId(), false);
        SafeParcelWriter.writeString(parcel, 5, getBreakClipId(), false);
        SafeParcelWriter.writeLong(parcel, 6, getWhenSkippableInMs());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zzb() {
        c cVar = new c();
        try {
            cVar.put("currentBreakTime", CastUtils.millisecToSec(this.zzb));
            cVar.put("currentBreakClipTime", CastUtils.millisecToSec(this.zzc));
            cVar.putOpt("breakId", this.zzd);
            cVar.putOpt("breakClipId", this.zze);
            long j = this.zzf;
            if (j != -1) {
                cVar.put("whenSkippable", CastUtils.millisecToSec(j));
            }
            return cVar;
        } catch (b e) {
            zza.e(e, "Error transforming AdBreakStatus into JSONObject", new Object[0]);
            return new c();
        }
    }
}
