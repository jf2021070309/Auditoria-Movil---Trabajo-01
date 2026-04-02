package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        ArrayList<Integer> arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                arrayList = SafeParcelReader.createIntegerList(parcel, readHeader);
                            }
                        } else {
                            num2 = SafeParcelReader.readIntegerObject(parcel, readHeader);
                        }
                    } else {
                        l = SafeParcelReader.readLongObject(parcel, readHeader);
                    }
                } else {
                    num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                }
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new QueueReorderRequestData(bundle, num, l, num2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QueueReorderRequestData[i];
    }
}
