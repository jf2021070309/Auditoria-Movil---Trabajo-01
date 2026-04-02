package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zznf implements zzot {
    private final zzni zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zznf(zzni zzniVar, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = zzniVar;
        this.zzb = j2;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        zzou zzouVar = new zzou(j2, zznh.zza(this.zza.zza(j2), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zzb;
    }

    public final long zzh(long j2) {
        return this.zza.zza(j2);
    }
}
