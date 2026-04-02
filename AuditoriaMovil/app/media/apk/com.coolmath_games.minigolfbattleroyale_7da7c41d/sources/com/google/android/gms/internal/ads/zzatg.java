package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        if (obj != null && getClass() == obj.getClass()) {
            zzatg zzatgVar = (zzatg) obj;
            if (this.zzb == zzatgVar.zzb && Arrays.equals(this.zzc, zzatgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzatf zza(int i) {
        return this.zzc[i];
    }

    public final int zzb(zzatf zzatfVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzc[i] == zzatfVar) {
                return i;
            }
        }
        return -1;
    }
}
