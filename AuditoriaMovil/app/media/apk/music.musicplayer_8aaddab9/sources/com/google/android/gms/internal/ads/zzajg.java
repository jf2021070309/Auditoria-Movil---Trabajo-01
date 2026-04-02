package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzajg implements zzaiu {
    public static final Parcelable.Creator<zzajg> CREATOR = new zzajf();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzajg(int i2, String str, String str2, String str3, boolean z, int i3) {
        boolean z2 = true;
        if (i3 != -1 && i3 <= 0) {
            z2 = false;
        }
        zzakt.zza(z2);
        this.zza = i2;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i3;
    }

    public zzajg(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzamq.zzn(parcel);
        this.zzf = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajg.class == obj.getClass()) {
            zzajg zzajgVar = (zzajg) obj;
            if (this.zza == zzajgVar.zza && zzamq.zzc(this.zzb, zzajgVar.zzb) && zzamq.zzc(this.zzc, zzajgVar.zzc) && zzamq.zzc(this.zzd, zzajgVar.zzd) && this.zze == zzajgVar.zze && this.zzf == zzajgVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.zza + 527) * 31;
        String str = this.zzb;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i2 = this.zza;
        int i3 = this.zzf;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        a.M(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        sb.append("\", bitrate=");
        sb.append(i2);
        sb.append(", metadataInterval=");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzamq.zzo(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}
