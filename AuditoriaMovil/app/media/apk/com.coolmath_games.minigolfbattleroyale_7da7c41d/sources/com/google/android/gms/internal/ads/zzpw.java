package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzpw implements zzot {
    final /* synthetic */ zzot zza;
    final /* synthetic */ zzpx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpw(zzpx zzpxVar, zzot zzotVar) {
        this.zzb = zzpxVar;
        this.zza = zzotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j) {
        long j2;
        long j3;
        zzor zzf = this.zza.zzf(j);
        zzou zzouVar = zzf.zza;
        long j4 = zzouVar.zzb;
        long j5 = zzouVar.zzc;
        j2 = this.zzb.zzb;
        zzou zzouVar2 = new zzou(j4, j5 + j2);
        zzou zzouVar3 = zzf.zzb;
        long j6 = zzouVar3.zzb;
        long j7 = zzouVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzor(zzouVar2, new zzou(j6, j7 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zzg();
    }
}
