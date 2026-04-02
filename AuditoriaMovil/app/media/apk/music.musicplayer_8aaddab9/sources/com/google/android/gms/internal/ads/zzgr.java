package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgr implements zziw {
    public final zziw[] zza;

    public zzgr(zziw[] zziwVarArr) {
        this.zza = zziwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzf(long j2) {
        for (zziw zziwVar : this.zza) {
            zziwVar.zzf(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long j2 = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long zzh = zziwVar.zzh();
            if (zzh != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzh);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long j2 = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long zzk = zziwVar.zzk();
            if (zzk != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzk);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j2) {
        zziw[] zziwVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzk = zzk();
            if (zzk == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zziw zziwVar : this.zza) {
                long zzk2 = zziwVar.zzk();
                boolean z3 = zzk2 != Long.MIN_VALUE && zzk2 <= j2;
                if (zzk2 == zzk || z3) {
                    z |= zziwVar.zzl(j2);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zzm() {
        for (zziw zziwVar : this.zza) {
            if (zziwVar.zzm()) {
                return true;
            }
        }
        return false;
    }
}
