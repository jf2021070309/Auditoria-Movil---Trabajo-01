package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzeu implements Parcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new zzet();
    private final zzcz zza;

    public zzeu(zzcz zzczVar) {
        zzczVar.getClass();
        this.zza = zzczVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        byte[] zzn = this.zza.zzn();
        parcel.writeInt(zzn.length);
        parcel.writeByteArray(zzn);
    }
}
