package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 4:
                    num2 = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 5:
                    num3 = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 6:
                    l = SafeParcelReader.readLongObject(parcel, readHeader);
                    break;
                case 7:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, MediaQueueItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new QueueInsertRequestData(bundle, num, num2, num3, l, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QueueInsertRequestData[i];
    }
}
