package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzos implements zzot {
    private final long zza;
    private final zzor zzb;

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza;
    }

    public zzos(long j, long j2) {
        this.zza = j;
        zzou zzouVar = j2 == 0 ? zzou.zza : new zzou(0L, j2);
        this.zzb = new zzor(zzouVar, zzouVar);
    }
}
