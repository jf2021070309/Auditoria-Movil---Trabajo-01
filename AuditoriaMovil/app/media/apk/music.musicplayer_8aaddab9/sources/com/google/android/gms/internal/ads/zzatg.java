package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzatg {
    public static final zzatg zza = new zzatg(new zzatf[0]);
    public final int zzb;
    private final zzatf[] zzc;
    private int zzd;

    public zzatg(zzatf... zzatfVarArr) {
        this.zzc = zzatfVarArr;
        this.zzb = zzatfVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatg.class == obj.getClass()) {
            zzatg zzatgVar = (zzatg) obj;
            if (this.zzb == zzatgVar.zzb && Arrays.equals(this.zzc, zzatgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzatf zza(int i2) {
        return this.zzc[i2];
    }

    public final int zzb(zzatf zzatfVar) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == zzatfVar) {
                return i2;
            }
        }
        return -1;
    }
}
