package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqn implements zzqs {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzqn(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzadx.zzb(jArr2[jArr2.length - 1]) : j;
    }

    public static zzqn zza(long j, zzakb zzakbVar, long j2) {
        int length = zzakbVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzakbVar.zzb + zzakbVar.zzd[i3];
            j3 += zzakbVar.zzc + zzakbVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzqn(jArr, jArr2, j2);
    }

    private static Pair<Long, Long> zzd(long j, long[] jArr, long[] jArr2) {
        int zzD = zzamq.zzD(jArr, j, true, true);
        long j2 = jArr[zzD];
        long j3 = jArr2[zzD];
        int i = zzD + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j) {
        return zzadx.zzb(((Long) zzd(j, this.zza, this.zzb).second).longValue());
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
    public final zzor zzf(long j) {
        Pair<Long, Long> zzd = zzd(zzadx.zza(zzamq.zzy(j, 0L, this.zzc)), this.zzb, this.zza);
        zzou zzouVar = new zzou(zzadx.zzb(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
