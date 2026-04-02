package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdx implements Parcelable {
    public static final Parcelable.Creator<zzdx> CREATOR = new zzdv();
    private final byte[] zza;

    public zzdx(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.zza;
        if (bArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(this.zza);
    }

    public /* synthetic */ zzdx(Parcel parcel, zzdw zzdwVar) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            this.zza = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        this.zza = bArr;
        parcel.readByteArray(bArr);
    }
}
