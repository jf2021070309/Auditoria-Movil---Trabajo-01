package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzof implements zzot {
    private final zzoh zza;
    private final long zzb;

    public zzof(zzoh zzohVar, long j2) {
        this.zza = zzohVar;
        this.zzb = j2;
    }

    private final zzou zza(long j2, long j3) {
        return new zzou((j2 * 1000000) / this.zza.zze, this.zzb + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        zzakt.zze(this.zza.zzk);
        zzoh zzohVar = this.zza;
        zzog zzogVar = zzohVar.zzk;
        long[] jArr = zzogVar.zza;
        long[] jArr2 = zzogVar.zzb;
        int zzD = zzamq.zzD(jArr, zzohVar.zzb(j2), true, false);
        zzou zza = zza(zzD == -1 ? 0L : jArr[zzD], zzD != -1 ? jArr2[zzD] : 0L);
        if (zza.zzb == j2 || zzD == jArr.length - 1) {
            return new zzor(zza, zza);
        }
        int i2 = zzD + 1;
        return new zzor(zza, zza(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zza();
    }
}
