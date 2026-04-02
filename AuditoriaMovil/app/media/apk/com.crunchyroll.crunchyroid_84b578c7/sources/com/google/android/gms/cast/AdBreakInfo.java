package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "AdBreakInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new zzb();
    @SafeParcelable.Field(getter = "getPlaybackPositionInMs", id = 2)
    private final long zza;
    @SafeParcelable.Field(getter = "getId", id = 3)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDurationInMs", id = 4)
    private final long zzc;
    @SafeParcelable.Field(getter = "isWatched", id = 5)
    private final boolean zzd;
    @SafeParcelable.Field(getter = "getBreakClipIds", id = 6)
    private final String[] zze;
    @SafeParcelable.Field(getter = "isEmbedded", id = 7)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "isExpanded", id = 8)
    private final boolean zzg;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private final long zza;
        private String zzb;
        private long zzc;
        private boolean zzd;
        private boolean zze;
        private String[] zzf;
        private boolean zzg;

        public Builder(long j) {
            this.zza = j;
        }

        public AdBreakInfo build() {
            return new AdBreakInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
        }

        public Builder setBreakClipIds(String[] strArr) {
            this.zzf = strArr;
            return this;
        }

        public Builder setDurationInMs(long j) {
            this.zzc = j;
            return this;
        }

        public Builder setId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setIsEmbedded(boolean z) {
            this.zze = z;
            return this;
        }

        @KeepForSdk
        public Builder setIsExpanded(boolean z) {
            this.zzg = z;
            return this;
        }

        public Builder setIsWatched(boolean z) {
            this.zzd = z;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public AdBreakInfo(@SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) String[] strArr, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) boolean z3) {
        this.zza = j;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = z;
        this.zze = strArr;
        this.zzf = z2;
        this.zzg = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        if (CastUtils.zze(this.zzb, adBreakInfo.zzb) && this.zza == adBreakInfo.zza && this.zzc == adBreakInfo.zzc && this.zzd == adBreakInfo.zzd && Arrays.equals(this.zze, adBreakInfo.zze) && this.zzf == adBreakInfo.zzf && this.zzg == adBreakInfo.zzg) {
            return true;
        }
        return false;
    }

    public String[] getBreakClipIds() {
        return this.zze;
    }

    public long getDurationInMs() {
        return this.zzc;
    }

    public String getId() {
        return this.zzb;
    }

    public long getPlaybackPositionInMs() {
        return this.zza;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    public boolean isEmbedded() {
        return this.zzf;
    }

    @KeepForSdk
    public boolean isExpanded() {
        return this.zzg;
    }

    public boolean isWatched() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getPlaybackPositionInMs());
        SafeParcelWriter.writeString(parcel, 3, getId(), false);
        SafeParcelWriter.writeLong(parcel, 4, getDurationInMs());
        SafeParcelWriter.writeBoolean(parcel, 5, isWatched());
        SafeParcelWriter.writeStringArray(parcel, 6, getBreakClipIds(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, isEmbedded());
        SafeParcelWriter.writeBoolean(parcel, 8, isExpanded());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            cVar.put("id", this.zzb);
            cVar.put("position", CastUtils.millisecToSec(this.zza));
            cVar.put("isWatched", this.zzd);
            cVar.put("isEmbedded", this.zzf);
            cVar.put("duration", CastUtils.millisecToSec(this.zzc));
            cVar.put("expanded", this.zzg);
            if (this.zze != null) {
                a aVar = new a();
                for (String str : this.zze) {
                    aVar.put(str);
                }
                cVar.put("breakClipIds", aVar);
            }
        } catch (b unused) {
        }
        return cVar;
    }
}
