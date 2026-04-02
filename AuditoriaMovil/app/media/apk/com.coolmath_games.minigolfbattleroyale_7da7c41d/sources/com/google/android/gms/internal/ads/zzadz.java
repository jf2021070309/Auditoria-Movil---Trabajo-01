package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzadz {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzadz(float f, float f2, long j, float f3, long j2, long j3, float f4, zzady zzadyVar) {
        this.zza = j2;
        this.zzb = j3;
    }

    private final void zzf() {
        long j = this.zzc;
        if (j != -9223372036854775807L) {
            long j2 = this.zzd;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.zzf;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.zzg;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final void zza(zzagh zzaghVar) {
        long j = zzaghVar.zzb;
        this.zzc = zzadx.zzb(-9223372036854775807L);
        long j2 = zzaghVar.zzc;
        this.zzf = zzadx.zzb(-9223372036854775807L);
        long j3 = zzaghVar.zzd;
        this.zzg = zzadx.zzb(-9223372036854775807L);
        float f = zzaghVar.zze;
        this.zzj = 0.97f;
        float f2 = zzaghVar.zzf;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j) {
        this.zzd = j;
        zzf();
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = -9223372036854775807L;
    }

    public final long zze() {
        return this.zzh;
    }

    public final float zzd(long j, long j2) {
        long j3;
        if (this.zzc != -9223372036854775807L) {
            long j4 = j - j2;
            long j5 = this.zzm;
            if (j5 == -9223372036854775807L) {
                this.zzm = j4;
                this.zzn = 0L;
            } else {
                long max = Math.max(j4, zzg(j5, j4, 0.999f));
                this.zzm = max;
                this.zzn = zzg(this.zzn, Math.abs(j4 - max), 0.999f);
            }
            if (this.zzl == -9223372036854775807L || SystemClock.elapsedRealtime() - this.zzl >= 1000) {
                this.zzl = SystemClock.elapsedRealtime();
                long j6 = this.zzm + (this.zzn * 3);
                if (this.zzh > j6) {
                    float zzb = (float) zzadx.zzb(1000L);
                    long[] jArr = {j6, this.zze, this.zzh - (((this.zzk - 1.0f) * zzb) + ((this.zzi - 1.0f) * zzb))};
                    j3 = jArr[0];
                    for (int i = 1; i < 3; i++) {
                        long j7 = jArr[i];
                        if (j7 > j3) {
                            j3 = j7;
                        }
                    }
                    this.zzh = j3;
                } else {
                    long zzy = zzamq.zzy(j - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j6);
                    this.zzh = zzy;
                    long j8 = this.zzg;
                    if (j8 == -9223372036854775807L || zzy <= j8) {
                        j3 = zzy;
                    } else {
                        this.zzh = j8;
                        j3 = j8;
                    }
                }
                long j9 = j - j3;
                if (Math.abs(j9) < this.zza) {
                    this.zzk = 1.0f;
                    return 1.0f;
                }
                float zzz = zzamq.zzz((((float) j9) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
                this.zzk = zzz;
                return zzz;
            }
            return this.zzk;
        }
        return 1.0f;
    }
}
