package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* loaded from: classes.dex */
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

    public /* synthetic */ zzadz(float f2, float f3, long j2, float f4, long j3, long j4, float f5, zzady zzadyVar) {
        this.zza = j3;
        this.zzb = j4;
    }

    private final void zzf() {
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long j3 = this.zzd;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.zzf;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.zzg;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.zze == j2) {
            return;
        }
        this.zze = j2;
        this.zzh = j2;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j2, long j3, float f2) {
        return (((float) j3) * 9.999871E-4f) + (((float) j2) * 0.999f);
    }

    public final void zza(zzagh zzaghVar) {
        long j2 = zzaghVar.zzb;
        this.zzc = zzadx.zzb(-9223372036854775807L);
        this.zzf = zzadx.zzb(-9223372036854775807L);
        this.zzg = zzadx.zzb(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j2) {
        this.zzd = j2;
        zzf();
    }

    public final void zzc() {
        long j2 = this.zzh;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.zzb;
        this.zzh = j3;
        long j4 = this.zzg;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.zzh = j4;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j2, long j3) {
        long zzy;
        if (this.zzc != -9223372036854775807L) {
            long j4 = j2 - j3;
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
                long j6 = (this.zzn * 3) + this.zzm;
                if (this.zzh > j6) {
                    float zzb = (float) zzadx.zzb(1000L);
                    long[] jArr = {j6, this.zze, this.zzh - (((this.zzk - 1.0f) * zzb) + ((this.zzi - 1.0f) * zzb))};
                    zzy = jArr[0];
                    for (int i2 = 1; i2 < 3; i2++) {
                        long j7 = jArr[i2];
                        if (j7 > zzy) {
                            zzy = j7;
                        }
                    }
                    this.zzh = zzy;
                } else {
                    zzy = zzamq.zzy(j2 - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j6);
                    this.zzh = zzy;
                    long j8 = this.zzg;
                    if (j8 != -9223372036854775807L && zzy > j8) {
                        this.zzh = j8;
                        zzy = j8;
                    }
                }
                long j9 = j2 - zzy;
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

    public final long zze() {
        return this.zzh;
    }
}
