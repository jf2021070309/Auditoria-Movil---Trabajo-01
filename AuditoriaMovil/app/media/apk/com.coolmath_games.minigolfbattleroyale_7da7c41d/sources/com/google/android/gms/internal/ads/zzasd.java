package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzasd implements zzatd {
    private final zzatd[] zza;

    public zzasd(zzatd[] zzatdVarArr) {
        this.zza = zzatdVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzatd zzatdVar : this.zza) {
            long zza = zzatdVar.zza();
            if (zza != Long.MIN_VALUE) {
                j = Math.min(j, zza);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j) {
        zzatd[] zzatdVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzatd zzatdVar : this.zza) {
                if (zzatdVar.zza() == zza) {
                    z |= zzatdVar.zzb(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
