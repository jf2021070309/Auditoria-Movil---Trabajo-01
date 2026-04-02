package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzavh implements Parcelable {
    public static final Parcelable.Creator<zzavh> CREATOR = new zzavg();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final byte[] zzd;
    private int zze;

    public zzavh(int i2, int i3, int i4, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = bArr;
    }

    public zzavh(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzavh.class == obj.getClass()) {
            zzavh zzavhVar = (zzavh) obj;
            if (this.zza == zzavhVar.zza && this.zzb == zzavhVar.zzb && this.zzc == zzavhVar.zzc && Arrays.equals(this.zzd, zzavhVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzd) + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        boolean z = this.zzd != null;
        StringBuilder w = a.w(55, "ColorInfo(", i2, ", ", i3);
        w.append(", ");
        w.append(i4);
        w.append(", ");
        w.append(z);
        w.append(")");
        return w.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd != null ? 1 : 0);
        byte[] bArr = this.zzd;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
