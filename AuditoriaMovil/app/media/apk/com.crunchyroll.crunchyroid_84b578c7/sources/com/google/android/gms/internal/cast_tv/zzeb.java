package com.google.android.gms.internal.cast_tv;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzeb implements Parcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzea();
    private final zzcl zza;

    public zzeb(zzcl zzclVar) {
        zzclVar.getClass();
        this.zza = zzclVar;
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

    public final zzcl zza() {
        return this.zza;
    }
}
