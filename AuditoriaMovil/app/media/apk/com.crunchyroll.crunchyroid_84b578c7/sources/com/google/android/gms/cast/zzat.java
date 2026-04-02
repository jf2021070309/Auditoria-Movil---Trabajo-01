package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "EqualizerBandSettingsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new zzau();
    @SafeParcelable.Field(getter = "getFrequency", id = 2)
    private final float zza;
    @SafeParcelable.Field(getter = "getQFactor", id = 3)
    private final float zzb;
    @SafeParcelable.Field(getter = "getGainDb", id = 4)
    private final float zzc;

    @SafeParcelable.Constructor
    public zzat(@SafeParcelable.Param(id = 2) float f, @SafeParcelable.Param(id = 3) float f2, @SafeParcelable.Param(id = 4) float f3) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzatVar = (zzat) obj;
        if (this.zza == zzatVar.zza && this.zzb == zzatVar.zzb && this.zzc == zzatVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zza), Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
