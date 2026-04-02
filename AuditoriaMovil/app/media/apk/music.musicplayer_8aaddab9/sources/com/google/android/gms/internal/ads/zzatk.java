package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzatk {
    public final zzatf zza;
    public final int[] zzb;
    private final zzanm[] zzc;
    private int zzd;

    public zzatk(zzatf zzatfVar, int... iArr) {
        Objects.requireNonNull(zzatfVar);
        this.zza = zzatfVar;
        this.zzc = new zzanm[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.zzc[i2] = zzatfVar.zza(iArr[i2]);
        }
        Arrays.sort(this.zzc, new zzati(null));
        this.zzb = new int[1];
        for (int i3 = 0; i3 <= 0; i3++) {
            this.zzb[i3] = zzatfVar.zzb(this.zzc[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzatk zzatkVar = (zzatk) obj;
            if (this.zza == zzatkVar.zza && Arrays.equals(this.zzb, zzatkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + (System.identityHashCode(this.zza) * 31);
            this.zzd = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzatf zza() {
        return this.zza;
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzanm zzc(int i2) {
        return this.zzc[i2];
    }

    public final int zzd(int i2) {
        return this.zzb[0];
    }
}
