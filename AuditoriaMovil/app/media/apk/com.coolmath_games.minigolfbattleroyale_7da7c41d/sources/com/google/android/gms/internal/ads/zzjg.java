package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzjg {
    protected final zzq zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzafv[] zzd;
    private int zze;

    public zzjg(zzq zzqVar, int[] iArr, int i) {
        int length = iArr.length;
        zzakt.zzd(length > 0);
        if (zzqVar != null) {
            this.zza = zzqVar;
            this.zzb = length;
            this.zzd = new zzafv[length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.zzd[i2] = zzqVar.zza(iArr[i2]);
            }
            Arrays.sort(this.zzd, zzjf.zza);
            this.zzc = new int[this.zzb];
            for (int i3 = 0; i3 < this.zzb; i3++) {
                this.zzc[i3] = zzqVar.zzb(this.zzd[i3]);
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
            zzjg zzjgVar = (zzjg) obj;
            if (this.zza == zzjgVar.zza && Arrays.equals(this.zzc, zzjgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
            this.zze = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    public final zzq zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc.length;
    }

    public final zzafv zzd(int i) {
        return this.zzd[i];
    }

    public final int zze(int i) {
        return this.zzc[0];
    }
}
