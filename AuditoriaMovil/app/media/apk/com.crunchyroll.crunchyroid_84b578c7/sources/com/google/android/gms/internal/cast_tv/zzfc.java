package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfc implements Parcelable {
    public static final Parcelable.Creator<zzfc> CREATOR = new zzfb();
    private final zzdo zza;

    public zzfc(zzdo zzdoVar) {
        zzdoVar.getClass();
        this.zza = zzdoVar;
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

    public final zzdo zza() {
        return this.zza;
    }
}
