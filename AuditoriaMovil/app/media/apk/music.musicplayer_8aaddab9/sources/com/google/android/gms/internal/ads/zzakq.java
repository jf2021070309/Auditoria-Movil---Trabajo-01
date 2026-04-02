package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class zzakq implements zzaiu {
    public static final Parcelable.Creator<zzakq> CREATOR = new zzako();
    public final float zza;
    public final int zzb;

    public zzakq(float f2, int i2) {
        this.zza = f2;
        this.zzb = i2;
    }

    public /* synthetic */ zzakq(Parcel parcel, zzakp zzakpVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakq.class == obj.getClass()) {
            zzakq zzakqVar = (zzakq) obj;
            if (this.zza == zzakqVar.zza && this.zzb == zzakqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f2 = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}
