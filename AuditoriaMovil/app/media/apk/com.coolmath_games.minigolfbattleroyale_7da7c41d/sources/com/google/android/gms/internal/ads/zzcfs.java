package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
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
            } else if (fieldId == 4) {
                zzbdgVar = (zzbdg) SafeParcelReader.createParcelable(parcel, readHeader, zzbdg.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzcfr(str, str2, zzbdlVar, zzbdgVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcfr[] newArray(int i) {
        return new zzcfr[i];
    }
}
