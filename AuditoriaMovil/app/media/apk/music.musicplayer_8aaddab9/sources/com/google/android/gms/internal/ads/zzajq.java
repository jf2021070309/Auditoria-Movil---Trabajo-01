package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzajq extends zzajx {
    public static final Parcelable.Creator<zzajq> CREATOR = new zzajp();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajq(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    public zzajq(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajq.class == obj.getClass()) {
            zzajq zzajqVar = (zzajq) obj;
            if (zzamq.zzc(this.zzb, zzajqVar.zzb) && zzamq.zzc(this.zza, zzajqVar.zza) && zzamq.zzc(this.zzc, zzajqVar.zzc)) {
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
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 25, String.valueOf(str2).length(), String.valueOf(str3).length()));
        a.M(sb, str, ": language=", str2, ", description=");
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
