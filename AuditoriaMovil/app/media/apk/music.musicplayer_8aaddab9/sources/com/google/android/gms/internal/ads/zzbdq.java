package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes.dex */
public final class zzbdq implements Parcelable.Creator<zzbdp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbdp createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzbcz zzbczVar = null;
        Bundle bundle = null;
        long j2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                j2 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 3) {
                zzbczVar = (zzbcz) SafeParcelReader.createParcelable(parcel, readHeader, zzbcz.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbdp(str, j2, zzbczVar, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbdp[] newArray(int i2) {
        return new zzbdp[i2];
    }
}
