package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StoreSessionResponseData storeSessionResponseData = null;
        MediaError mediaError = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    mediaError = (MediaError) SafeParcelReader.createParcelable(parcel, readHeader, MediaError.CREATOR);
                }
            } else {
                storeSessionResponseData = (StoreSessionResponseData) SafeParcelReader.createParcelable(parcel, readHeader, StoreSessionResponseData.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbt(storeSessionResponseData, mediaError);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbt[i];
    }
}
