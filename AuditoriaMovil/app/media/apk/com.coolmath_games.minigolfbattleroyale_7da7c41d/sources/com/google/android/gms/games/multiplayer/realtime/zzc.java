package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public class zzc implements Parcelable.Creator<RoomEntity> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: zzf */
    public RoomEntity createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ RoomEntity[] newArray(int i) {
        return new RoomEntity[i];
    }
}
