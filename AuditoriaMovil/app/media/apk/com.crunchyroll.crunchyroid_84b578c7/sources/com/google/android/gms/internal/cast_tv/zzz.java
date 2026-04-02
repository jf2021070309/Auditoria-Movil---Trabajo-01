package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "MediaTracksStatusCreator")
/* loaded from: classes3.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();
    @SafeParcelable.Field(id = 1)
    final List zza;
    @SafeParcelable.Field(id = 2)
    final List zzb;
    @SafeParcelable.Field(id = 3)
    final List zzc;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLongList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeLongList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
