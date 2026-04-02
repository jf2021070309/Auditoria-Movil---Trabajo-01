package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzrz implements zzot {
    final /* synthetic */ zzsa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrz(zzsa zzsaVar, zzry zzryVar) {
        this.zza = zzsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        zzsm zzsmVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzsmVar = this.zza.zzd;
        long zzi = zzsmVar.zzi(j);
        j2 = this.zza.zzb;
        j3 = this.zza.zzc;
        j4 = this.zza.zzb;
        j5 = this.zza.zzf;
        j6 = this.zza.zzb;
        j7 = this.zza.zzc;
        zzou zzouVar = new zzou(j, zzamq.zzy((-30000) + j2 + ((zzi * (j3 - j4)) / j5), j6, j7 - 1));
        return new zzor(zzouVar, zzouVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        zzsm zzsmVar;
        long j;
        zzsmVar = this.zza.zzd;
        j = this.zza.zzf;
        return zzsmVar.zzh(j);
    }
}
