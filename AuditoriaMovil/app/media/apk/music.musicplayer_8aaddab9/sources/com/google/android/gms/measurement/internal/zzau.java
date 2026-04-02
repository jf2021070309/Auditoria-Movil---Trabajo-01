package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* loaded from: classes2.dex */
public final class zzau implements Parcelable.Creator<zzat> {
    public static void zza(zzat zzatVar, Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, zzatVar.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, zzatVar.zzb, i2, false);
        SafeParcelWriter.writeString(parcel, 4, zzatVar.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, zzatVar.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzat createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzar zzarVar = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzarVar = (zzar) SafeParcelReader.createParcelable(parcel, readHeader, zzar.CREATOR);
            } else if (fieldId == 4) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                j2 = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzat(str, zzarVar, str2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzat[] newArray(int i2) {
        return new zzat[i2];
    }
}
