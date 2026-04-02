package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzatk {
    protected final zzatf zza;
    protected final int[] zzb;
    private final zzanm[] zzc;
    private int zzd;

    public zzatk(zzatf zzatfVar, int... iArr) {
        if (zzatfVar != null) {
            this.zza = zzatfVar;
            this.zzc = new zzanm[1];
            for (int i = 0; i <= 0; i++) {
                this.zzc[i] = zzatfVar.zza(iArr[i]);
            }
            Arrays.sort(this.zzc, new zzati(null));
            this.zzb = new int[1];
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zzb[i2] = zzatfVar.zzb(this.zzc[i2]);
            }
            return;
        }
        throw null;
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
        int i = this.zzd;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzb);
            this.zzd = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    public final zzatf zza() {
        return this.zza;
    }

    public final int zzb() {
        int length = this.zzb.length;
        return 1;
    }

    public final zzanm zzc(int i) {
        return this.zzc[i];
    }

    public final int zzd(int i) {
        return this.zzb[0];
    }
}
