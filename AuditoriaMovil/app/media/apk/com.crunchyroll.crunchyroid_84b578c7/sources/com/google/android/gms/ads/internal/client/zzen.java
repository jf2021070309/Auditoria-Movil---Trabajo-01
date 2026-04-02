package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
/* loaded from: classes2.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getSdkVersionLite", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getGranularVersion", id = 3)
    private final String zzc;

    public zzen() {
        this(231004600, 231004000, "22.1.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }
}
