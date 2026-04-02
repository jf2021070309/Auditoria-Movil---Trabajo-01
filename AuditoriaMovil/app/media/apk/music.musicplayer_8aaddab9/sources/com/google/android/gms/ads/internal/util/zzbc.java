package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzfmi;
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2) {
        this.zza = str == null ? "" : str;
        this.zzb = i2;
    }

    public static zzbc zza(Throwable th) {
        zzbcz zza = zzfbm.zza(th);
        return new zzbc(zzfmi.zzc(th.getMessage()) ? zza.zzb : th.getMessage(), zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
