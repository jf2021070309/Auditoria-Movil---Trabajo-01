package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzpw implements zzot {
    public final /* synthetic */ zzot zza;
    public final /* synthetic */ zzpx zzb;

    public zzpw(zzpx zzpxVar, zzot zzotVar) {
        this.zzb = zzpxVar;
        this.zza = zzotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final zzor zzf(long j2) {
        long j3;
        long j4;
        zzor zzf = this.zza.zzf(j2);
        zzou zzouVar = zzf.zza;
        long j5 = zzouVar.zzb;
        long j6 = zzouVar.zzc;
        j3 = this.zzb.zzb;
        zzou zzouVar2 = new zzou(j5, j3 + j6);
        zzou zzouVar3 = zzf.zzb;
        long j7 = zzouVar3.zzb;
        long j8 = zzouVar3.zzc;
        j4 = this.zzb.zzb;
        return new zzor(zzouVar2, new zzou(j7, j4 + j8));
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final long zzg() {
        return this.zza.zzg();
    }
}
