package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import e.a.d.a.a;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzu implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        zzv zzvVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i2 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
            } else if (fieldId == 2) {
                zzvVar = (zzv) SafeParcelReader.createParcelable(parcel, readHeader, zzv.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(3);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(4);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str3 = SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzt(hashSet, i2, zzvVar, str, str2, str3);
        }
        throw new SafeParcelReader.ParseException(a.R(37, "Overread allowed size end=", validateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzt[] newArray(int i2) {
        return new zzt[i2];
    }
}
