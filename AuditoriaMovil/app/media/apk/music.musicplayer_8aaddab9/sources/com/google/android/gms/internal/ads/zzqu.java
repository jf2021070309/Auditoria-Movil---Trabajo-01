package com.google.android.gms.internal.ads;

import android.util.Log;
/* loaded from: classes.dex */
public final class zzqu implements zzqs {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzqu(long j2, int i2, long j3, long j4, long[] jArr) {
        this.zza = j2;
        this.zzb = i2;
        this.zzc = j3;
        this.zzf = jArr;
        this.zzd = j4;
        this.zze = j4 != -1 ? j2 + j4 : -1L;
    }

    public static zzqu zza(long j2, long j3, zzon zzonVar, zzamf zzamfVar) {
        int zzB;
        int i2 = zzonVar.zzg;
        int i3 = zzonVar.zzd;
        int zzv = zzamfVar.zzv();
        if ((zzv & 1) != 1 || (zzB = zzamfVar.zzB()) == 0) {
            return null;
        }
        long zzH = zzamq.zzH(zzB, i2 * 1000000, i3);
        if ((zzv & 6) != 6) {
            return new zzqu(j3, zzonVar.zzc, zzH, -1L, null);
        }
        long zzt = zzamfVar.zzt();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzamfVar.zzn();
        }
        if (j2 != -1) {
            long j4 = j3 + zzt;
            if (j2 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j2);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new zzqu(j3, zzonVar.zzc, zzH, zzt, jArr);
    }

    private final long zzd(int i2) {
        return (this.zzc * i2) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final long zzb(long j2) {
        double d2;
        long j3 = j2 - this.zza;
        if (!zze() || j3 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzakt.zze(this.zzf);
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = this.zzd;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int zzD = zzamq.zzD(jArr, (long) d5, true, true);
        long zzd = zzd(zzD);
        long j4 = jArr[zzD];
        int i2 = zzD + 1;
        long zzd2 = zzd(i2);
        long j5 = zzD == 99 ? 256L : jArr[i2];
        if (j4 == j5) {
            d2 = 0.0d;
        } else {
            double d6 = j4;
            Double.isNaN(d6);
            double d7 = j5 - j4;
            Double.isNaN(d7);
            d2 = (d5 - d6) / d7;
        }
        double d8 = zzd2 - zzd;
        Double.isNaN(d8);
        return Math.round(d2 * d8) + zzd;
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
    public final zzor zzf(long j2) {
        long[] jArr;
        if (!zze()) {
            zzou zzouVar = new zzou(0L, this.zza + this.zzb);
            return new zzor(zzouVar, zzouVar);
        }
        long zzy = zzamq.zzy(j2, 0L, this.zzc);
        double d2 = zzy;
        Double.isNaN(d2);
        double d3 = this.zzc;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i2 = (int) d4;
                double d6 = ((long[]) zzakt.zze(this.zzf))[i2];
                double d7 = i2 == 99 ? 256.0d : jArr[i2 + 1];
                double d8 = i2;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d7 - d6) * (d4 - d8));
            }
        }
        double d9 = this.zzd;
        Double.isNaN(d9);
        zzou zzouVar2 = new zzou(zzy, this.zza + zzamq.zzy(Math.round((d5 / 256.0d) * d9), this.zzb, this.zzd - 1));
        return new zzor(zzouVar2, zzouVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzc;
    }
}
