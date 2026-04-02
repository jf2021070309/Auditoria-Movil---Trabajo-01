package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzq {
    public static final zzadw<zzq> zzb = zzp.zza;
    public final int zza = 1;
    private final zzafv[] zzc;
    private int zzd;

    public zzq(zzafv... zzafvVarArr) {
        this.zzc = zzafvVarArr;
        zzc(zzafvVarArr[0].zzc);
        int i2 = zzafvVarArr[0].zze;
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzq.class == obj.getClass() && Arrays.equals(this.zzc, ((zzq) obj).zzc);
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + 527;
            this.zzd = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzafv zza(int i2) {
        return this.zzc[i2];
    }

    public final int zzb(zzafv zzafvVar) {
        for (int i2 = 0; i2 <= 0; i2++) {
            if (zzafvVar == this.zzc[i2]) {
                return i2;
            }
        }
        return -1;
    }
}
