package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzey implements Parcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new zzex();
    private final zzdg zza;

    public zzey(zzdg zzdgVar) {
        zzdgVar.getClass();
        this.zza = zzdgVar;
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

    public final zzdg zza() {
        return this.zza;
    }
}
