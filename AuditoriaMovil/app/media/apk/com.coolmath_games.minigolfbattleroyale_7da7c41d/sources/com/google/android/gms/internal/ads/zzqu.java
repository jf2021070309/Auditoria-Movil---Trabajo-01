package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzqu implements zzqs {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzqu(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzqu zza(long j, long j2, zzon zzonVar, zzamf zzamfVar) {
        int zzB;
        int i = zzonVar.zzg;
        int i2 = zzonVar.zzd;
        int zzv = zzamfVar.zzv();
        if ((zzv & 1) != 1 || (zzB = zzamfVar.zzB()) == 0) {
            return null;
        }
        long zzH = zzamq.zzH(zzB, i * 1000000, i2);
        if ((zzv & 6) != 6) {
            return new zzqu(j2, zzonVar.zzc, zzH, -1L, null);
        }
        long zzt = zzamfVar.zzt();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = zzamfVar.zzn();
        }
        if (j != -1) {
            long j3 = j2 + zzt;
            if (j != j3) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j);
                sb.append(", ");
                sb.append(j3);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new zzqu(j2, zzonVar.zzc, zzH, zzt, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j) {
        long j2 = j - this.zza;
        if (!zze() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzakt.zze(this.zzf);
        double d = (j2 * 256.0d) / this.zzd;
        int zzD = zzamq.zzD(jArr, (long) d, true, true);
        long zzd = zzd(zzD);
        long j3 = jArr[zzD];
        int i = zzD + 1;
        long zzd2 = zzd(i);
        long j4 = zzD == 99 ? 256L : jArr[i];
        return zzd + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (zzd2 - zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zzf != null;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        long[] jArr;
        if (!zze()) {
            zzou zzouVar = new zzou(0L, this.zza + this.zzb);
            return new zzor(zzouVar, zzouVar);
        }
        long zzy = zzamq.zzy(j, 0L, this.zzc);
        double d = (zzy * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) zzakt.zze(this.zzf))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        zzou zzouVar2 = new zzou(zzy, this.zza + zzamq.zzy(Math.round((d2 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzor(zzouVar2, zzouVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
