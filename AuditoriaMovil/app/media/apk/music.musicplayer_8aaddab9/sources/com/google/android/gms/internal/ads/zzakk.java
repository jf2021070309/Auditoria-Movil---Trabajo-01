package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzakk implements zzaiu {
    public static final Parcelable.Creator<zzakk> CREATOR = new zzaki();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzakk(Parcel parcel, zzakj zzakjVar) {
        String readString = parcel.readString();
        int i2 = zzamq.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzamq.zzd(parcel.createByteArray());
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzakk(String str, byte[] bArr, int i2, int i3) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakk.class == obj.getClass()) {
            zzakk zzakkVar = (zzakk) obj;
            if (this.zza.equals(zzakkVar.zza) && Arrays.equals(this.zzb, zzakkVar.zzb) && this.zzc == zzakkVar.zzc && this.zzd == zzakkVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + a.x(this.zza, 527, 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
    }
}
