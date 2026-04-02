package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "SimpleCommandExecutionResultCreator")
/* loaded from: classes3.dex */
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzbs();
    @SafeParcelable.Field(getter = "getMediaError", id = 1)
    private final MediaError zza;

    @SafeParcelable.Constructor
    public zzbr(@SafeParcelable.Param(id = 1) MediaError mediaError) {
        this.zza = mediaError;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final MediaError zza() {
        return this.zza;
    }
}
