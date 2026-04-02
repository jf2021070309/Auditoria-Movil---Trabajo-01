package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzakb extends zzajx {
    public static final Parcelable.Creator<zzakb> CREATOR = new zzaka();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzakb(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public zzakb(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzamq.zzd(parcel.createIntArray());
        this.zze = (int[]) zzamq.zzd(parcel.createIntArray());
    }

    @Override // com.google.android.gms.internal.ads.zzajx, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakb.class == obj.getClass()) {
            zzakb zzakbVar = (zzakb) obj;
            if (this.zza == zzakbVar.zza && this.zzb == zzakbVar.zzb && this.zzc == zzakbVar.zzc && Arrays.equals(this.zzd, zzakbVar.zzd) && Arrays.equals(this.zze, zzakbVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzd);
        return Arrays.hashCode(this.zze) + ((hashCode + ((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }
}
