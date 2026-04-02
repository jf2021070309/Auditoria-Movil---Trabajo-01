package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgz extends zzgu {
    public static final Object zzb = new Object();
    private final Object zze;
    private final Object zzf;

    private zzgz(zzaiq zzaiqVar, Object obj, Object obj2) {
        super(zzaiqVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public final zzaip zzf(int i, zzaip zzaipVar, long j) {
        this.zza.zzf(i, zzaipVar, j);
        if (zzamq.zzc(zzaipVar.zzb, this.zze)) {
            zzaipVar.zzb = zzaip.zza;
        }
        return zzaipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzaiq
    public final zzain zzh(int i, zzain zzainVar, boolean z) {
        this.zza.zzh(i, zzainVar, z);
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
    public final Object zzj(int i) {
        Object zzj = this.zza.zzj(i);
        return zzamq.zzc(zzj, this.zzf) ? zzb : zzj;
    }

    public final zzgz zzn(zzaiq zzaiqVar) {
        return new zzgz(zzaiqVar, this.zze, this.zzf);
    }
}
