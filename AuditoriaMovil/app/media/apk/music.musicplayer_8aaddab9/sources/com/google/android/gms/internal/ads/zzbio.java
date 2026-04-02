package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SearchAdRequestParcelCreator")
@SafeParcelable.Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
/* loaded from: classes.dex */
public final class zzbio extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbio> CREATOR = new zzbip();
    @SafeParcelable.Field(id = 15)
    public final String zza;

    public zzbio(SearchAdRequest searchAdRequest) {
        this.zza = searchAdRequest.getQuery();
    }

    @SafeParcelable.Constructor
    public zzbio(@SafeParcelable.Param(id = 15) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
