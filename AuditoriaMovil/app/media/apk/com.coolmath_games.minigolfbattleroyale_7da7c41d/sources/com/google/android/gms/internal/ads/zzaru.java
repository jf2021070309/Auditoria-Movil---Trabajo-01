package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaru implements Parcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzars();
    private final zzart[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaru(Parcel parcel) {
        this.zza = new zzart[parcel.readInt()];
        int i = 0;
        while (true) {
            zzart[] zzartVarArr = this.zza;
            if (i >= zzartVarArr.length) {
                return;
            }
            zzartVarArr[i] = (zzart) parcel.readParcelable(zzart.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzaru) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzart zzartVar : this.zza) {
            parcel.writeParcelable(zzartVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzart zzb(int i) {
        return this.zza[i];
    }

    public zzaru(List<? extends zzart> list) {
        zzart[] zzartVarArr = new zzart[list.size()];
        this.zza = zzartVarArr;
        list.toArray(zzartVarArr);
    }
}
