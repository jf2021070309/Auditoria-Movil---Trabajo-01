package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzarw extends zzasa {
    public static final Parcelable.Creator<zzarw> CREATOR = new zzarv();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzarw(Parcel parcel) {
        super("APIC");
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public zzarw(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = null;
        this.zzc = 3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarw.class == obj.getClass()) {
            zzarw zzarwVar = (zzarw) obj;
            if (this.zzc == zzarwVar.zzc && zzave.zza(this.zza, zzarwVar.zza) && zzave.zza(this.zzb, zzarwVar.zzb) && Arrays.equals(this.zzd, zzarwVar.zzd)) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
