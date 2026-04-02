package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzba {
    public final String zza;
    public final zzafv zzb;
    public final zzafv zzc;
    public final int zzd;
    public final int zze;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzba(java.lang.String r3, com.google.android.gms.internal.ads.zzafv r4, com.google.android.gms.internal.ads.zzafv r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto La
            if (r7 != 0) goto Lb
            r7 = r0
        La:
            r0 = r1
        Lb:
            com.google.android.gms.internal.ads.zzakt.zza(r0)
            com.google.android.gms.internal.ads.zzakt.zzf(r3)
            r2.zza = r3
            r3 = 0
            if (r4 == 0) goto L22
            r2.zzb = r4
            if (r5 == 0) goto L21
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            return
        L21:
            throw r3
        L22:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzba.<init>(java.lang.String, com.google.android.gms.internal.ads.zzafv, com.google.android.gms.internal.ads.zzafv, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzd == zzbaVar.zzd && this.zze == zzbaVar.zze && this.zza.equals(zzbaVar.zza) && this.zzb.equals(zzbaVar.zzb) && this.zzc.equals(zzbaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
