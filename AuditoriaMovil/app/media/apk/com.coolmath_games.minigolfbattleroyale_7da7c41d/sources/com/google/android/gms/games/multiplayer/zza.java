package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public class zza implements Parcelable.Creator<ParticipantEntity> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: zze */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ ParticipantEntity[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
