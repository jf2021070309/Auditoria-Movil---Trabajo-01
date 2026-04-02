package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzrz implements zzot {
    public final /* synthetic */ zzsa zza;

    public /* synthetic */ zzrz(zzsa zzsaVar, zzry zzryVar) {
        this.zza = zzsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        zzsm zzsmVar;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        zzsmVar = this.zza.zzd;
        long zzi = zzsmVar.zzi(j2);
        j3 = this.zza.zzb;
        j4 = this.zza.zzc;
        j5 = this.zza.zzb;
        j6 = this.zza.zzf;
        long j9 = ((j4 - j5) * zzi) / j6;
        j7 = this.zza.zzb;
        j8 = this.zza.zzc;
        zzou zzouVar = new zzou(j2, zzamq.zzy((j3 + j9) - 30000, j7, j8 - 1));
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        zzsm zzsmVar;
        long j2;
        zzsmVar = this.zza.zzd;
        j2 = this.zza.zzf;
        return zzsmVar.zzh(j2);
    }
}
