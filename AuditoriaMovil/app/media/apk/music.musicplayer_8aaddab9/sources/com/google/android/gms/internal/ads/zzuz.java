package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzuz implements zzot {
    private final zzuw zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzuz(zzuw zzuwVar, int i2, long j2, long j3) {
        this.zza = zzuwVar;
        this.zzb = i2;
        this.zzc = j2;
        long j4 = (j3 - j2) / zzuwVar.zzd;
        this.zzd = j4;
        this.zze = zza(j4);
    }

    private final long zza(long j2) {
        return zzamq.zzH(j2 * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        long zzy = zzamq.zzy((this.zza.zzc * j2) / (this.zzb * 1000000), 0L, this.zzd - 1);
        long j3 = this.zzc;
        int i2 = this.zza.zzd;
        long zza = zza(zzy);
        zzou zzouVar = new zzou(zza, (i2 * zzy) + j3);
        if (zza >= j2 || zzy == this.zzd - 1) {
            return new zzor(zzouVar, zzouVar);
        }
        long j4 = zzy + 1;
        return new zzor(zzouVar, new zzou(zza(j4), (j4 * this.zza.zzd) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zze;
    }
}
