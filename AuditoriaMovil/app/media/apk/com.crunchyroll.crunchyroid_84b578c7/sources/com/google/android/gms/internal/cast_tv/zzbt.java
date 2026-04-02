package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "StoreSessionResponseOrErrorCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzbu();
    @SafeParcelable.Field(getter = "getResponseData", id = 2)
    private final StoreSessionResponseData zza;
    @SafeParcelable.Field(getter = "getMediaError", id = 3)
    private final MediaError zzb;

    @SafeParcelable.Constructor
    public zzbt(@SafeParcelable.Param(id = 2) StoreSessionResponseData storeSessionResponseData, @SafeParcelable.Param(id = 3) MediaError mediaError) {
        this.zza = storeSessionResponseData;
        this.zzb = mediaError;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final MediaError zza() {
        return this.zzb;
    }

    public final StoreSessionResponseData zzb() {
        return this.zza;
    }
}
