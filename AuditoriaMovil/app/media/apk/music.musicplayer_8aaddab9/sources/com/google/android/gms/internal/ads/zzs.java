package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzs {
    public static final zzs zza = new zzs(new zzq[0]);
    public static final zzadw<zzs> zzc = zzr.zza;
    public final int zzb;
    private final zzq[] zzd;
    private int zze;

    public zzs(zzq... zzqVarArr) {
        this.zzd = zzqVarArr;
        this.zzb = zzqVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (this.zzb == zzsVar.zzb && Arrays.equals(this.zzd, zzsVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzq zza(int i2) {
        return this.zzd[i2];
    }

    public final int zzb(zzq zzqVar) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzd[i2] == zzqVar) {
                return i2;
            }
        }
        return -1;
    }
}
