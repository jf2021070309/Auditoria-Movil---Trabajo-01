package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        if (obj != null && getClass() == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (this.zzb == zzsVar.zzb && Arrays.equals(this.zzd, zzsVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzq zza(int i) {
        return this.zzd[i];
    }

    public final int zzb(zzq zzqVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zzd[i] == zzqVar) {
                return i;
            }
        }
        return -1;
    }
}
