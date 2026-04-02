package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzec implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readInt() <= 0) {
            return null;
        }
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            return new zzed(zzcq.zzc(bArr, zzhh.zza()));
        } catch (zzie unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzed[i];
    }
}
