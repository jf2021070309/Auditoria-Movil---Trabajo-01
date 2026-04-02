package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaxl {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzaxl(long j2, String str, int i2) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaxl)) {
            zzaxl zzaxlVar = (zzaxl) obj;
            if (zzaxlVar.zza == this.zza && zzaxlVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
