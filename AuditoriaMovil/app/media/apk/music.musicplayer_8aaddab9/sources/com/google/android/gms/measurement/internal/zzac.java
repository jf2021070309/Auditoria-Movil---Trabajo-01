package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes2.dex */
public final class zzac implements Parcelable.Creator<zzab> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzab createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        zzkv zzkvVar = null;
        String str3 = null;
        zzat zzatVar = null;
        zzat zzatVar2 = null;
        zzat zzatVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzkvVar = (zzkv) SafeParcelReader.createParcelable(parcel, readHeader, zzkv.CREATOR);
                    break;
                case 5:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    zzatVar = (zzat) SafeParcelReader.createParcelable(parcel, readHeader, zzat.CREATOR);
                    break;
                case 9:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 10:
                    zzatVar2 = (zzat) SafeParcelReader.createParcelable(parcel, readHeader, zzat.CREATOR);
                    break;
                case 11:
                    j4 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    zzatVar3 = (zzat) SafeParcelReader.createParcelable(parcel, readHeader, zzat.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzab(str, str2, zzkvVar, j2, z, str3, zzatVar, j3, zzatVar2, j4, zzatVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzab[] newArray(int i2) {
        return new zzab[i2];
    }
}
