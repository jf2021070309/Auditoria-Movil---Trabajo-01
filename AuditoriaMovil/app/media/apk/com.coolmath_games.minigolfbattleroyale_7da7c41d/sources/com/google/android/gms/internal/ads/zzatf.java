package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zzb, ((zzatf) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            this.zzc = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzanm zza(int i) {
        return this.zzb[i];
    }

    public final int zzb(zzanm zzanmVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzanmVar == this.zzb[i]) {
                return i;
            }
        }
        return -1;
    }
}
