package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zznh {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zznh(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.zza = j2;
        this.zzb = j3;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzc = j8;
        this.zzh = zza(j3, 0L, j5, j6, j7, j8);
    }

    public static long zza(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j8 = (((float) (j6 - j5)) / ((float) (j4 - j3))) * ((float) (j2 - j3));
        return zzamq.zzy(((j5 + j8) - j7) - (j8 / 20), j5, (-1) + j6);
    }

    public static /* synthetic */ void zzf(zznh zznhVar, long j2, long j3) {
        zznhVar.zzd = j2;
        zznhVar.zzf = j3;
        zznhVar.zzi();
    }

    public static /* synthetic */ void zzg(zznh zznhVar, long j2, long j3) {
        zznhVar.zze = j2;
        zznhVar.zzg = j3;
        zznhVar.zzi();
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
