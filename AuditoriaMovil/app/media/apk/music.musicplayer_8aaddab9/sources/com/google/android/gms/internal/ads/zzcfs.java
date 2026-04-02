package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes.dex */
public final class zzcfs implements Parcelable.Creator<zzcfr> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcfr createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzbdl zzbdlVar = null;
        zzbdg zzbdgVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzbdlVar = (zzbdl) SafeParcelReader.createParcelable(parcel, readHeader, zzbdl.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzbdgVar = (zzbdg) SafeParcelReader.createParcelable(parcel, readHeader, zzbdg.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzcfr(str, str2, zzbdlVar, zzbdgVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcfr[] newArray(int i2) {
        return new zzcfr[i2];
    }
}
