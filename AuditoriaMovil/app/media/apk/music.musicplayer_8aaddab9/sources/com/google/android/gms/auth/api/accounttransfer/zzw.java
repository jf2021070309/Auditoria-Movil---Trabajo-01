package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import e.a.d.a.a;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzw implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    hashSet.add(1);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    hashSet.add(2);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, readHeader, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.createParcelable(parcel, readHeader, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzv(hashSet, i2, str, i3, bArr, pendingIntent, deviceMetaData);
        }
        throw new SafeParcelReader.ParseException(a.R(37, "Overread allowed size end=", validateObjectHeader), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzv[] newArray(int i2) {
        return new zzv[i2];
    }
}
