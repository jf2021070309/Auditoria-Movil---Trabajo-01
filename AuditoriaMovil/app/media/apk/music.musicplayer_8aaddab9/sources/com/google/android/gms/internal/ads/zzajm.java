package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzajm extends zzajx {
    public static final Parcelable.Creator<zzajm> CREATOR = new zzajl();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajx[] zzg;

    public zzajm(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzajx[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.zzg[i3] = (zzajx) parcel.readParcelable(zzajx.class.getClassLoader());
        }
    }

    public zzajm(String str, int i2, int i3, long j2, long j3, zzajx[] zzajxVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = j3;
        this.zzg = zzajxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzajx, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajm.class == obj.getClass()) {
            zzajm zzajmVar = (zzajm) obj;
            if (this.zzb == zzajmVar.zzb && this.zzc == zzajmVar.zzc && this.zzd == zzajmVar.zzd && this.zze == zzajmVar.zze && zzamq.zzc(this.zza, zzajmVar.zza) && Arrays.equals(this.zzg, zzajmVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzajx zzajxVar : this.zzg) {
            parcel.writeParcelable(zzajxVar, 0);
        }
    }
}
