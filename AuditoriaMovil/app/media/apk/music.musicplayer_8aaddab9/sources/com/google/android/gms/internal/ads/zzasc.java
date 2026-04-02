package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzasc extends zzasa {
    public static final Parcelable.Creator<zzasc> CREATOR = new zzasb();
    public final String zza;
    public final String zzb;

    public zzasc(Parcel parcel) {
        super(parcel.readString());
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public zzasc(String str, String str2, String str3) {
        super(str);
        this.zza = null;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzasc.class == obj.getClass()) {
            zzasc zzascVar = (zzasc) obj;
            if (this.zze.equals(zzascVar.zze) && zzave.zza(this.zza, zzascVar.zza) && zzave.zza(this.zzb, zzascVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = a.x(this.zze, 527, 31);
        String str = this.zza;
        int hashCode = (x + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zze);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}
