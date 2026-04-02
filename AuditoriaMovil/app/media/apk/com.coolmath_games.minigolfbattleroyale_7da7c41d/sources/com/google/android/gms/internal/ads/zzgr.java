package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgr implements zziw {
    protected final zziw[] zza;

    public zzgr(zziw[] zziwVarArr) {
        this.zza = zziwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zzf(long j) {
        for (zziw zziwVar : this.zza) {
            zziwVar.zzf(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzh() {
        long j = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long zzh = zziwVar.zzh();
            if (zzh != Long.MIN_VALUE) {
                j = Math.min(j, zzh);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final long zzk() {
        long j = Long.MAX_VALUE;
        for (zziw zziwVar : this.zza) {
            long zzk = zziwVar.zzk();
            if (zzk != Long.MIN_VALUE) {
                j = Math.min(j, zzk);
            }
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final boolean zzl(long j) {
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
                boolean z3 = zzk2 != Long.MIN_VALUE && zzk2 <= j;
                if (zzk2 == zzk || z3) {
                    z |= zziwVar.zzl(j);
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
