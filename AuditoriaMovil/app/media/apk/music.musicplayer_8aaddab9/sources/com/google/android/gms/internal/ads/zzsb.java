package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzsb implements zzsh {
    private final zzoh zza;
    private final zzog zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzsb(zzoh zzohVar, zzog zzogVar) {
        this.zza = zzohVar;
        this.zzb = zzogVar;
    }

    public final void zza(long j2) {
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final long zze(zznv zznvVar) {
        long j2 = this.zzd;
        if (j2 >= 0) {
            this.zzd = -1L;
            return -(j2 + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zzf(long j2) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzamq.zzD(jArr, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final zzot zzg() {
        zzakt.zzd(this.zzc != -1);
        return new zzof(this.zza, this.zzc);
    }
}
