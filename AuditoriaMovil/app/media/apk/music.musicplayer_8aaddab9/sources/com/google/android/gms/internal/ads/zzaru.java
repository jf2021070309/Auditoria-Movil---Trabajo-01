package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaru implements Parcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzars();
    private final zzart[] zza;

    public zzaru(Parcel parcel) {
        this.zza = new zzart[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zzart[] zzartVarArr = this.zza;
            if (i2 >= zzartVarArr.length) {
                return;
            }
            zzartVarArr[i2] = (zzart) parcel.readParcelable(zzart.class.getClassLoader());
            i2++;
        }
    }

    public zzaru(List<? extends zzart> list) {
        zzart[] zzartVarArr = new zzart[list.size()];
        this.zza = zzartVarArr;
        list.toArray(zzartVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaru.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzaru) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.length);
        for (zzart zzartVar : this.zza) {
            parcel.writeParcelable(zzartVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzart zzb(int i2) {
        return this.zza[i2];
    }
}
