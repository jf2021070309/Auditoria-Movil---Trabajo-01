package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@ShowFirstParty
@SafeParcelable.Class(creator = "EqualizerSettingsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    @SafeParcelable.Field(getter = "getLowShelf", id = 2)
    private final zzat zza;
    @SafeParcelable.Field(getter = "getHighShelf", id = 3)
    private final zzat zzb;

    @SafeParcelable.Constructor
    public zzav(@SafeParcelable.Param(id = 2) zzat zzatVar, @SafeParcelable.Param(id = 3) zzat zzatVar2) {
        this.zza = zzatVar;
        this.zzb = zzatVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        if (CastUtils.zze(this.zza, zzavVar.zza) && CastUtils.zze(this.zzb, zzavVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzat zzatVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzatVar, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
