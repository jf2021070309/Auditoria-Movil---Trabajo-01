package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AdapterResponseInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzbdp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdp> CREATOR = new zzbdq();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public long zzb;
    @SafeParcelable.Field(id = 3)
    public zzbcz zzc;
    @SafeParcelable.Field(id = 4)
    public final Bundle zzd;

    @SafeParcelable.Constructor
    public zzbdp(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) zzbcz zzbczVar, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = zzbczVar;
        this.zzd = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i2, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
