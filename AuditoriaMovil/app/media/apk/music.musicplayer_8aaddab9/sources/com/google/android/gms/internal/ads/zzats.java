package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzats {
    private int zza;
    private final zzatk[] zzb;

    public zzats(zzatk[] zzatkVarArr, byte... bArr) {
        this.zzb = zzatkVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzats.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzats) obj).zzb);
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + 527;
            this.zza = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzatk zza(int i2) {
        return this.zzb[i2];
    }

    public final zzatk[] zzb() {
        return (zzatk[]) this.zzb.clone();
    }
}
