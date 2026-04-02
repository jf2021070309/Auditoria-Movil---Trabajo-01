package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzasd implements zzatd {
    private final zzatd[] zza;

    public zzasd(zzatd[] zzatdVarArr) {
        this.zza = zzatdVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final long zza() {
        long j2 = Long.MAX_VALUE;
        for (zzatd zzatdVar : this.zza) {
            long zza = zzatdVar.zza();
            if (zza != Long.MIN_VALUE) {
                j2 = Math.min(j2, zza);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzatd
    public final boolean zzb(long j2) {
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
                    z |= zzatdVar.zzb(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
