package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzq {
    public static final zzadw<zzq> zzb = zzp.zza;
    public final int zza = 1;
    private final zzafv[] zzc;
    private int zzd;

    public zzq(zzafv... zzafvVarArr) {
        this.zzc = zzafvVarArr;
        zzc(zzafvVarArr[0].zzc);
        int i = this.zzc[0].zze;
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zzc, ((zzq) obj).zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzafv zza(int i) {
        return this.zzc[i];
    }

    public final int zzb(zzafv zzafvVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzafvVar == this.zzc[i]) {
                return i;
            }
        }
        return -1;
    }
}
