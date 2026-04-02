package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzajs extends zzajx {
    public static final Parcelable.Creator<zzajs> CREATOR = new zzajr();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzajs(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = (byte[]) zzamq.zzd(parcel.createByteArray());
    }

    public zzajs(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajs.class == obj.getClass()) {
            zzajs zzajsVar = (zzajs) obj;
            if (zzamq.zzc(this.zza, zzajsVar.zza) && zzamq.zzc(this.zzb, zzajsVar.zzb) && zzamq.zzc(this.zzc, zzajsVar.zzc) && Arrays.equals(this.zzd, zzajsVar.zzd)) {
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
        return Arrays.hashCode(this.zzd) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        a.M(sb, str, ": mimeType=", str2, ", filename=");
        return a.s(sb, str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
