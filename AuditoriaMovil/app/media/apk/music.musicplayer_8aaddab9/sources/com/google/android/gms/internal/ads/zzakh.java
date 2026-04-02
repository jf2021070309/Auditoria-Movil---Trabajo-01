package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzakh extends zzajx {
    public static final Parcelable.Creator<zzakh> CREATOR = new zzakg();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzakh(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzamq.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.<init>(android.os.Parcel):void");
    }

    public zzakh(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakh.class == obj.getClass()) {
            zzakh zzakhVar = (zzakh) obj;
            if (this.zzf.equals(zzakhVar.zzf) && zzamq.zzc(this.zza, zzakhVar.zza) && zzamq.zzc(this.zzb, zzakhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = a.x(this.zzf, 527, 31);
        String str = this.zza;
        int hashCode = (x + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zzb;
        return a.s(new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length()), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}
