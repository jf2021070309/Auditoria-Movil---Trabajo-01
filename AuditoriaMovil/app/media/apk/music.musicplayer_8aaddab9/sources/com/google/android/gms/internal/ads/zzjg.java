package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class zzjg {
    public final zzq zza;
    public final int zzb;
    public final int[] zzc;
    private final zzafv[] zzd;
    private int zze;

    public zzjg(zzq zzqVar, int[] iArr, int i2) {
        int length = iArr.length;
        zzakt.zzd(length > 0);
        Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
        this.zzb = length;
        this.zzd = new zzafv[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.zzd[i3] = zzqVar.zza(iArr[i3]);
        }
        Arrays.sort(this.zzd, zzjf.zza);
        this.zzc = new int[this.zzb];
        for (int i4 = 0; i4 < this.zzb; i4++) {
            this.zzc[i4] = zzqVar.zzb(this.zzd[i4]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjg zzjgVar = (zzjg) obj;
            if (this.zza == zzjgVar.zza && Arrays.equals(this.zzc, zzjgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final zzq zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzafv zzd(int i2) {
        return this.zzd[i2];
    }

    public final int zze(int i2) {
        return this.zzc[0];
    }
}
