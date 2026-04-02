package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzhs implements Runnable {
    final /* synthetic */ zzaf zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhw zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhs(zzhw zzhwVar, zzaf zzafVar, int i, long j, boolean z) {
        this.zze = zzhwVar;
        this.zza = zzafVar;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzr(this.zza);
        zzhw.zzW(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
