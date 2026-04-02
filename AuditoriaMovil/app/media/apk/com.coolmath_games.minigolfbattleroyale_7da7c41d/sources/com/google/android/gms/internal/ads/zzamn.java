package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamn {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal<Long> zzd = new ThreadLocal<>();

    public zzamn(long j) {
        zzd(0L);
    }

    public final synchronized long zza() {
        long j = this.zza;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zzb() {
        long j;
        j = this.zzc;
        return j != -9223372036854775807L ? j + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j) {
        this.zza = j;
        this.zzb = j == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return zzf((j * 1000000) / 90000);
    }

    public final synchronized long zzf(long j) {
        if (this.zzb == -9223372036854775807L) {
            long j2 = this.zza;
            if (j2 == 9223372036854775806L) {
                Long l = this.zzd.get();
                if (l == null) {
                    throw null;
                }
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }
}
