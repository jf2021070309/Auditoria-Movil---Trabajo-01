package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaji extends zzajx {
    public static final Parcelable.Creator<zzaji> CREATOR = new zzajh();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaji(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzamq.zzd(parcel.createByteArray());
    }

    public zzaji(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaji.class == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.zzc == zzajiVar.zzc && zzamq.zzc(this.zza, zzajiVar.zza) && zzamq.zzc(this.zzb, zzajiVar.zzb) && Arrays.equals(this.zzd, zzajiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.zzc + 527) * 31;
        String str = this.zza;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 25, String.valueOf(str2).length(), String.valueOf(str3).length()));
        a.M(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajx, com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        zzagmVar.zzx(this.zzd, this.zzc);
    }
}
