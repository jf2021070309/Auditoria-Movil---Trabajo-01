package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzav;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "DeviceStatusCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();
    @SafeParcelable.Field(getter = "getVolume", id = 2)
    private double zza;
    @SafeParcelable.Field(getter = "getMuteState", id = 3)
    private boolean zzb;
    @SafeParcelable.Field(getter = "getActiveInputState", id = 4)
    private int zzc;
    @SafeParcelable.Field(getter = "getApplicationMetadata", id = 5)
    private ApplicationMetadata zzd;
    @SafeParcelable.Field(getter = "getStandbyState", id = 6)
    private int zze;
    @SafeParcelable.Field(getter = "getEqualizerSettings", id = 7)
    private zzav zzf;
    @SafeParcelable.Field(getter = "getStepInterval", id = 8)
    private double zzg;

    public zzab() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzab)) {
            return false;
        }
        zzab zzabVar = (zzab) obj;
        if (this.zza == zzabVar.zza && this.zzb == zzabVar.zzb && this.zzc == zzabVar.zzc && CastUtils.zze(this.zzd, zzabVar.zzd) && this.zze == zzabVar.zze) {
            zzav zzavVar = this.zzf;
            if (CastUtils.zze(zzavVar, zzavVar) && this.zzg == zzabVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Double.valueOf(this.zza), Boolean.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, Integer.valueOf(this.zze), this.zzf, Double.valueOf(this.zzg));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeDouble(parcel, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final double zza() {
        return this.zzg;
    }

    public final double zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zze;
    }

    public final ApplicationMetadata zze() {
        return this.zzd;
    }

    public final zzav zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(id = 2) double d, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) ApplicationMetadata applicationMetadata, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) zzav zzavVar, @SafeParcelable.Param(id = 8) double d2) {
        this.zza = d;
        this.zzb = z;
        this.zzc = i;
        this.zzd = applicationMetadata;
        this.zze = i2;
        this.zzf = zzavVar;
        this.zzg = d2;
    }
}
