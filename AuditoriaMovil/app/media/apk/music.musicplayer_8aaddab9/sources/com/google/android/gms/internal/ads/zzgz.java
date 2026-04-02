package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgz extends zzgu {
    public static final Object zzb = new Object();
    private final Object zze;
    private final Object zzf;

    private zzgz(zzaiq zzaiqVar, Object obj, Object obj2) {
        super(zzaiqVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static /* synthetic */ Object zzk(zzgz zzgzVar) {
        return zzgzVar.zzf;
    }

    public static zzgz zzl(zzagk zzagkVar) {
        return new zzgz(new zzha(zzagkVar), zzaip.zza, zzb);
    }

    public static zzgz zzm(zzaiq zzaiqVar, Object obj, Object obj2) {
        return new zzgz(zzaiqVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzaiq
    public final zzaip zzf(int i2, zzaip zzaipVar, long j2) {
        this.zza.zzf(i2, zzaipVar, j2);
        if (zzamq.zzc(zzaipVar.zzb, this.zze)) {
            zzaipVar.zzb = zzaip.zza;
        }
        return zzaipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzaiq
    public final zzain zzh(int i2, zzain zzainVar, boolean z) {
        this.zza.zzh(i2, zzainVar, z);
        if (zzamq.zzc(zzainVar.zzb, this.zzf) && z) {
            zzainVar.zzb = zzb;
        }
        return zzainVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzaiq
    public final int zzi(Object obj) {
        Object obj2;
        zzaiq zzaiqVar = this.zza;
        if (zzb.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzaiqVar.zzi(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzaiq
    public final Object zzj(int i2) {
        Object zzj = this.zza.zzj(i2);
        return zzamq.zzc(zzj, this.zzf) ? zzb : zzj;
    }

    public final zzgz zzn(zzaiq zzaiqVar) {
        return new zzgz(zzaiqVar, this.zze, this.zzf);
    }
}
