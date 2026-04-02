package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzie {
    public final int zza;
    public final boolean zzb;

    public zzie(int i2, boolean z) {
        this.zza = i2;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzie.class == obj.getClass()) {
            zzie zzieVar = (zzie) obj;
            if (this.zza == zzieVar.zza && this.zzb == zzieVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
