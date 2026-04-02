package com.google.android.gms.internal.ads;

import android.util.Pair;
/* loaded from: classes.dex */
public final class zzqn implements zzqs {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzqn(long[] jArr, long[] jArr2, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j2 == -9223372036854775807L ? zzadx.zzb(jArr2[jArr2.length - 1]) : j2;
    }

    public static zzqn zza(long j2, zzakb zzakbVar, long j3) {
        int length = zzakbVar.zzd.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += zzakbVar.zzb + zzakbVar.zzd[i4];
            j4 += zzakbVar.zzc + zzakbVar.zze[i4];
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new zzqn(jArr, jArr2, j3);
    }

    private static Pair<Long, Long> zzd(long j2, long[] jArr, long[] jArr2) {
        double d2;
        int zzD = zzamq.zzD(jArr, j2, true, true);
        long j3 = jArr[zzD];
        long j4 = jArr2[zzD];
        int i2 = zzD + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i2];
        long j6 = jArr2[i2];
        if (j5 == j3) {
            d2 = 0.0d;
        } else {
            double d3 = j2;
            double d4 = j3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            double d5 = j5 - j3;
            Double.isNaN(d5);
            d2 = (d3 - d4) / d5;
        }
        Long valueOf = Long.valueOf(j2);
        double d6 = j6 - j4;
        Double.isNaN(d6);
        return Pair.create(valueOf, Long.valueOf(((long) (d2 * d6)) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j2) {
        return zzadx.zzb(((Long) zzd(j2, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzc() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        Pair<Long, Long> zzd = zzd(zzadx.zza(zzamq.zzy(j2, 0L, this.zzc)), this.zzb, this.zza);
        zzou zzouVar = new zzou(zzadx.zzb(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
