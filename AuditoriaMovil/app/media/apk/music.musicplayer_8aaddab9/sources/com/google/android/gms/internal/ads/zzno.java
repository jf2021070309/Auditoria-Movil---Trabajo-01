package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzno implements zzot {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzno(long j2, long j3, int i2, int i3, boolean z) {
        long zzb;
        this.zza = j2;
        this.zzb = j3;
        this.zzc = i3 == -1 ? 1 : i3;
        this.zze = i2;
        if (j2 == -1) {
            this.zzd = -1L;
            zzb = -9223372036854775807L;
        } else {
            this.zzd = j2 - j3;
            zzb = zzb(j2, j3, i2);
        }
        this.zzf = zzb;
    }

    private static long zzb(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / i2;
    }

    public final long zza(long j2) {
        return zzb(j2, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        long j3 = this.zzd;
        if (j3 == -1) {
            zzou zzouVar = new zzou(0L, this.zzb);
            return new zzor(zzouVar, zzouVar);
        }
        int i2 = this.zze;
        long j4 = this.zzc;
        long j5 = (((i2 * j2) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = this.zzb + Math.max(j5, 0L);
        long zza = zza(max);
        zzou zzouVar2 = new zzou(zza, max);
        if (this.zzd != -1 && zza < j2) {
            long j6 = max + this.zzc;
            if (j6 < this.zza) {
                return new zzor(zzouVar2, new zzou(zza(j6), j6));
            }
        }
        return new zzor(zzouVar2, zzouVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzf;
    }
}
