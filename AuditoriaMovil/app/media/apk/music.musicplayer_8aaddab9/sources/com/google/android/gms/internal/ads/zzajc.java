package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzajc implements zzaiu {
    public static final Parcelable.Creator<zzajc> CREATOR = new zzajb();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzajc(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = bArr;
    }

    public zzajc(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzamq.zzd(parcel.createByteArray());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajc.class == obj.getClass()) {
            zzajc zzajcVar = (zzajc) obj;
            if (this.zza == zzajcVar.zza && this.zzb.equals(zzajcVar.zzb) && this.zzc.equals(zzajcVar.zzc) && this.zzd == zzajcVar.zzd && this.zze == zzajcVar.zze && this.zzf == zzajcVar.zzf && this.zzg == zzajcVar.zzg && Arrays.equals(this.zzh, zzajcVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = a.x(this.zzb, (this.zza + 527) * 31, 31);
        return Arrays.hashCode(this.zzh) + ((((((((a.x(this.zzc, x, 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zzc;
        return a.t(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length()), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        zzagmVar.zzx(this.zzh, this.zza);
    }
}
