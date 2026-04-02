package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaiv implements Parcelable {
    public static final Parcelable.Creator<zzaiv> CREATOR = new zzait();
    private final zzaiu[] zza;

    public zzaiv(Parcel parcel) {
        this.zza = new zzaiu[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zzaiu[] zzaiuVarArr = this.zza;
            if (i2 >= zzaiuVarArr.length) {
                return;
            }
            zzaiuVarArr[i2] = (zzaiu) parcel.readParcelable(zzaiu.class.getClassLoader());
            i2++;
        }
    }

    public zzaiv(List<? extends zzaiu> list) {
        this.zza = (zzaiu[]) list.toArray(new zzaiu[0]);
    }

    public zzaiv(zzaiu... zzaiuVarArr) {
        this.zza = zzaiuVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzaiv) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.zza));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.length);
        for (zzaiu zzaiuVar : this.zza) {
            parcel.writeParcelable(zzaiuVar, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzaiu zzb(int i2) {
        return this.zza[i2];
    }

    public final zzaiv zzc(zzaiv zzaivVar) {
        return zzaivVar == null ? this : zzd(zzaivVar.zza);
    }

    public final zzaiv zzd(zzaiu... zzaiuVarArr) {
        return zzaiuVarArr.length == 0 ? this : new zzaiv((zzaiu[]) zzamq.zzg(this.zza, zzaiuVarArr));
    }
}
