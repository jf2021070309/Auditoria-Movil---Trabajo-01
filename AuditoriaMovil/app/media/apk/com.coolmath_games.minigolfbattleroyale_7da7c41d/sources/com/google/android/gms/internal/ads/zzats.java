package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzb, ((zzats) obj).zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
            this.zza = hashCode;
            return hashCode;
        }
        return i;
    }

    public final zzatk zza(int i) {
        return this.zzb[i];
    }

    public final zzatk[] zzb() {
        return (zzatk[]) this.zzb.clone();
    }
}
