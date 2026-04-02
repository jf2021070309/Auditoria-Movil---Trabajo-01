package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzajz extends zzajx {
    public static final Parcelable.Creator<zzajz> CREATOR = new zzajy();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajz(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public zzajz(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajz.class == obj.getClass()) {
            zzajz zzajzVar = (zzajz) obj;
            if (zzamq.zzc(this.zzb, zzajzVar.zzb) && zzamq.zzc(this.zza, zzajzVar.zza) && zzamq.zzc(this.zzc, zzajzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.zzb;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzc;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 23, String.valueOf(str2).length(), String.valueOf(str3).length()));
        a.M(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzc);
    }
}
