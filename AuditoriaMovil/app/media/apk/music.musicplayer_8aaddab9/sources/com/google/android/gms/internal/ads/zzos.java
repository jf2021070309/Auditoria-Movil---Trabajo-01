package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzos implements zzot {
    private final long zza;
    private final zzor zzb;

    public zzos(long j2, long j3) {
        this.zza = j2;
        zzou zzouVar = j3 == 0 ? zzou.zza : new zzou(0L, j3);
        this.zzb = new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza;
    }
}
