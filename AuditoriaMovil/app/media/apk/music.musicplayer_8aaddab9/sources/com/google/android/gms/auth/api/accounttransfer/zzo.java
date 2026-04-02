package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        ArrayList arrayList = null;
        zzr zzrVar = null;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzt.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                i3 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(3);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzrVar = (zzr) SafeParcelReader.createParcelable(parcel, readHeader, zzr.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzn(hashSet, i2, arrayList, i3, zzrVar);
        }
        throw new SafeParcelReader.ParseException(a.R(37, "Overread allowed size end=", validateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn[] newArray(int i2) {
        return new zzn[i2];
    }
}
