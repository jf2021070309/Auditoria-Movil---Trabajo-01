package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzapk implements Comparator<zzapj>, Parcelable {
    public static final Parcelable.Creator<zzapk> CREATOR = new zzaph();
    public final int zza;
    private final zzapj[] zzb;
    private int zzc;

    public zzapk(Parcel parcel) {
        zzapj[] zzapjVarArr = (zzapj[]) parcel.createTypedArray(zzapj.CREATOR);
        this.zzb = zzapjVarArr;
        this.zza = zzapjVarArr.length;
    }

    public zzapk(List<zzapj> list) {
        this(false, (zzapj[]) list.toArray(new zzapj[list.size()]));
    }

    private zzapk(boolean z, zzapj... zzapjVarArr) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        zzapjVarArr = z ? (zzapj[]) zzapjVarArr.clone() : zzapjVarArr;
        Arrays.sort(zzapjVarArr, this);
        int i2 = 1;
        while (true) {
            int length = zzapjVarArr.length;
            if (i2 >= length) {
                this.zzb = zzapjVarArr;
                this.zza = length;
                return;
            }
            uuid = zzapjVarArr[i2 - 1].zze;
            uuid2 = zzapjVarArr[i2].zze;
            if (uuid.equals(uuid2)) {
                uuid3 = zzapjVarArr[i2].zze;
                String valueOf = String.valueOf(uuid3);
                valueOf.length();
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(valueOf));
            }
            i2++;
        }
    }

    public zzapk(zzapj... zzapjVarArr) {
        this(true, zzapjVarArr);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzapj zzapjVar, zzapj zzapjVar2) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        zzapj zzapjVar3 = zzapjVar;
        zzapj zzapjVar4 = zzapjVar2;
        UUID uuid5 = zzamx.zzb;
        uuid = zzapjVar3.zze;
        if (uuid5.equals(uuid)) {
            uuid4 = zzapjVar4.zze;
            return !uuid5.equals(uuid4) ? 1 : 0;
        }
        uuid2 = zzapjVar3.zze;
        uuid3 = zzapjVar4.zze;
        return uuid2.compareTo(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzapk.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzapk) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb);
            this.zzc = hashCode;
            return hashCode;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.zzb, 0);
    }

    public final zzapj zza(int i2) {
        return this.zzb[i2];
    }
}
