package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzha extends zzaiq {
    private final zzagk zza;

    public zzha(zzagk zzagkVar) {
        this.zza = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzaip zzf(int i, zzaip zzaipVar, long j) {
        zzaipVar.zza(zzaip.zza, this.zza, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzaipVar.zzk = true;
        return zzaipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzg() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzain zzh(int i, zzain zzainVar, boolean z) {
        zzainVar.zza(z ? 0 : null, z ? zzgz.zzb : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzainVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzi(Object obj) {
        return obj == zzgz.zzb ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final Object zzj(int i) {
        return zzgz.zzb;
    }
}
