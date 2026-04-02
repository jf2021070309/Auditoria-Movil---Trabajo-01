package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzcfr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfr> CREATOR = new zzcfs();
    @SafeParcelable.Field(id = 1)
    @Deprecated
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final String zzb;
    @SafeParcelable.Field(id = 3)
    @Deprecated
    public final zzbdl zzc;
    @SafeParcelable.Field(id = 4)
    public final zzbdg zzd;

    @SafeParcelable.Constructor
    public zzcfr(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzbdl zzbdlVar, @SafeParcelable.Param(id = 4) zzbdg zzbdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbdlVar;
        this.zzd = zzbdgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
