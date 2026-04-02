package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                        }
                    } else {
                        num2 = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    }
                } else {
                    i = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new FetchItemsRequestData(bundle, i, num2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FetchItemsRequestData[i];
    }
}
