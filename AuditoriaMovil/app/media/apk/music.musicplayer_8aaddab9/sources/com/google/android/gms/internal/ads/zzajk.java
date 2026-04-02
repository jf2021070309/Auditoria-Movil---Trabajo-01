package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzajk extends zzajx {
    public static final Parcelable.Creator<zzajk> CREATOR = new zzajj();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzajk(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzamq.zza
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzamq.zzd(r3)
            byte[] r3 = (byte[]) r3
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajk.<init>(android.os.Parcel):void");
    }

    public zzajk(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajk.class == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.zzf.equals(zzajkVar.zzf) && Arrays.equals(this.zza, zzajkVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza) + a.x(this.zzf, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }
}
