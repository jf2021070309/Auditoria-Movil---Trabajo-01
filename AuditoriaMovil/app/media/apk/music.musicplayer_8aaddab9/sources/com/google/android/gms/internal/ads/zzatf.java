package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzatf {
    public final int zza = 1;
    private final zzanm[] zzb;
    private int zzc;

    public zzatf(zzanm... zzanmVarArr) {
        this.zzb = zzanmVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzatf.class == obj.getClass() && Arrays.equals(this.zzb, ((zzatf) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zzc = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzanm zza(int i2) {
        return this.zzb[i2];
    }

    public final int zzb(zzanm zzanmVar) {
        for (int i2 = 0; i2 <= 0; i2++) {
            if (zzanmVar == this.zzb[i2]) {
                return i2;
            }
        }
        return -1;
    }
}
